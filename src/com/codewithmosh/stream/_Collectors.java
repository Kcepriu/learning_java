package com.codewithmosh.stream;

import java.util.List;
import java.util.stream.Collectors;

public class _Collectors {
    static void main() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 15)
        );

        //1. Convert to list
        List<Movie> result = movies.stream().filter( m -> m.getRate() > 10).collect(Collectors.toList());
        System.out.println(result);

        //2. Convert to MAP
        var result_map = movies.stream().
                filter( m -> m.getRate() > 10).
                collect(Collectors.toMap(Movie::getName, m -> m));
        System.out.println(result_map);


        //3. summingInt
        var result_3 = movies.stream().
                filter( m -> m.getRate() > 10).
                collect(Collectors.summingInt(Movie::getRate));
        System.out.println(result_3);

        //4. summarizingInt
        var result_4 = movies.stream().
                filter( m -> m.getRate() > 10).
                collect(Collectors.summarizingInt(Movie::getRate));
        System.out.println(result_4);


        //5. Concatinate
        var result_5 = movies.stream().
                filter( m -> m.getRate() > 10).
                map(Movie::getName).
                collect(Collectors.joining(", "));
        System.out.println(result_5);



    }
}
