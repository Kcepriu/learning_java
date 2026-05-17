package com.codewithmosh.stream;

import java.util.Comparator;
import java.util.List;

public class Sorting {
    static void main() {

        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("a", 35),
                new Movie("b", 35)
        );

        System.out.println("sorted inner");
        movies.stream().
                sorted().
                forEach(System.out::println);

        System.out.println("sorted Comparator");
        movies.stream().
                sorted((a,b)-> a.getName().compareTo(b.getName())).
                forEach(System.out::println);

        System.out.println("sorted Comparator +");
        movies.stream().
                sorted(Comparator.comparing(Movie::getName)).
                forEach(System.out::println);

        System.out.println("reverse sorted Comparator");
        movies.stream().
                sorted(Comparator.comparing(Movie::getName).reversed().
                                thenComparing(Movie::getRate).reversed()).
                forEach(System.out::println);


        System.out.println("Distinct");
        movies.stream().
                map(Movie::getRate).
                distinct().
                forEach(System.out::println);


    }
}
