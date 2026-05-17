package com.codewithmosh.stream;

import java.util.Collection;
import java.util.List;
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
        //3.
        System.out.println("flat Map");

        var stream3 = Stream.of(List.of(1,2,3), List.of(5,6,7));
        stream3.forEach(System.out::println);
        //[1, 2, 3]
        //[5, 6, 7]

        stream3 = Stream.of(List.of(1,2,3), List.of(5,6,7));
        stream3.flatMap(list -> list.stream()).
                forEach(System.out::println);
        // 1 2 3 4 5 6 7
        //stream3.flatMap(Collection::stream)

        //4.





    }
}
