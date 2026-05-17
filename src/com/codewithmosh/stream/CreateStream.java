package com.codewithmosh.stream;

import java.util.stream.Stream;

public class CreateStream {
    static void main() {
        System.out.println("Create Stream");
        //1.
        var stream = Stream.generate(Math::random);
        stream.limit(3).forEach(System.out::println);

        //2.
        Stream.iterate(1, n -> n + 1).
                limit(10).
                forEach(System.out::println);


    }
}
