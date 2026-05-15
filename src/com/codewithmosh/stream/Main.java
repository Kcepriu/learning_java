package com.codewithmosh.stream;

import java.util.List;

public class Main {
    static void main() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 15)
        );

        movies.stream().filter(movie -> {
            System.out.println("filtered "+movie.getName());
            return movie.getRate() > 10;
        }).forEach(movie -> System.out.println(movie.getName()));


        



    }
}
