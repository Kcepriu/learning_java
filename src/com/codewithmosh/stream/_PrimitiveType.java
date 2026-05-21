package com.codewithmosh.stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _PrimitiveType {
    static void main() {
        //1.
        var result_1 = IntStream.of(1, 2, 3);
        System.out.println("//1.");
        result_1.forEach(System.out::println);
//                collect(Collectors.mapping(
//                        e -> e.toString(),
//                        Collectors.joining(", ")));

//        System.out.println(res_1);


        //2.
        var result_2 = IntStream.rangeClosed(1, 5);
        System.out.println("//2.");
        result_2.forEach(System.out::println);

        //2.
        var result_3 = IntStream.range(1, 5);
        System.out.println("//3.");
        result_3.forEach(System.out::println);

    }
}
