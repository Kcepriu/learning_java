package com.codewithmosh.stream;

import java.util.List;
import java.util.Optional;

public class _Reducer {
    static void main() {

        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 15),
                new Movie("d", 10)
        );

        System.out.println("1. reduce");
        var result = movies.stream().
                map(Movie::getRate).
                reduce(0, Integer::sum); //(a, b) -> a+b

        System.out.println(result);

        System.out.println("1. reduce - optional");
        Optional<Integer> result1 =  movies.stream().
                map(Movie::getRate).
                reduce( Integer::sum);

        System.out.println(result1.orElse(0));

    }
}
