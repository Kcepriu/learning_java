package com.codewithmosh.stream;

import java.util.List;

public class Main {
    static void main() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 15)
        );

        System.out.println("");
        System.out.println("Map");
        movies.stream().map(Movie::getName).forEach(System.out::println);


    }
}
