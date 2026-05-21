package com.codewithmosh.stream;

import java.util.List;
import java.util.stream.Collectors;

public class _Grouping {
    static void main() {
        var movies = List.of(
                new Movie("a", 10, Genre.THRILLER),
                new Movie("b", 20, Genre.ACTION),
                new Movie("c", 15, Genre.COMEDY),
                new Movie("d", 15, Genre.ACTION)
        );

        //1. Grouping simple
        var result = movies.stream().collect(Collectors.groupingBy(Movie::getGenre));
        System.out.println(result);


        //2. Grouping counting
        var result_2 = movies.stream().
                collect(Collectors.groupingBy(
                        Movie::getGenre,
                        Collectors.counting()));
        System.out.println(result_2);


        //3. Grouping Join
        var result_3 = movies.stream().
                collect(Collectors.groupingBy(
                        Movie::getGenre,
                        Collectors.mapping(
                                Movie::getName,
                                Collectors.joining(", "))));
        System.out.println(result_3);

        //4. Grouping partition
        var result_4 = movies.stream().
                collect(Collectors.partitioningBy(m -> m.getRate() > 10));
        System.out.println(result_4);

        //5. Grouping partition + join
        var result_5 = movies.stream().
                collect(Collectors.partitioningBy(
                        m -> m.getRate() > 10,
                        Collectors.mapping(
                                Movie::getName,
                                Collectors.joining(", "))));

        System.out.println(result_5);


    }

}
