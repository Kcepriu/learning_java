package com.codewithmosh.stream;

import java.util.List;

public class Filtrering {
    static void main() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 15)
        );

        System.out.println("limit");
        movies.stream().
                limit(2).
                forEach(System.out::println);

        System.out.println("skip");
        movies.stream().
                skip(2).
                forEach(System.out::println);

        System.out.println("filter");
        movies.stream().filter(movie -> {
            System.out.println("filtered "+movie.getName());
            return movie.getRate() > 10;
        }).forEach(movie -> System.out.println(movie.getName()));

        System.out.println("take While");
        movies.stream().
                takeWhile(m -> m.getRate()<20).
                forEach(System.out::println);


        System.out.println("drop While");
        movies.stream().
                dropWhile(m -> m.getRate()<20).
                forEach(System.out::println);


        System.out.println("peek");
        movies.stream().
                filter(movie -> movie.getRate() > 10).
                peek(m -> System.out.println("Filtering: "+m)).
                map(Movie::getName).
                peek(name -> System.out.println("Map: "+name)).
                forEach(System.out::println);


    }
}
