package com.codewithmosh.stream;

import java.util.Comparator;
import java.util.List;

public class _Reducers {
    static void main() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 15),
                new Movie("d", 10)
        );

        System.out.println("1. Count");
        System.out.println(movies.stream().count());


        System.out.println("2. Any Match");
        var result1= movies.stream().anyMatch(m -> m.getRate()>10);
        System.out.println(result1);

        System.out.println("3. All Match");
        var result2= movies.stream().allMatch(m -> m.getRate()>10);
        System.out.println(result2);

        result2= movies.stream().allMatch(m -> m.getRate()>9);
        System.out.println(result2);

        System.out.println("4. None Match");
        result2= movies.stream().noneMatch(m -> m.getRate()>15);
        System.out.println(result2);

        System.out.println("5. Find first");
        var result3 = movies.stream().findFirst().get();
        System.out.println(result3);

        System.out.println("6. Find Any");
        result3 = movies.stream().findAny().get();
        System.out.println(result3);


        System.out.println("7. MAx/Min");
        var rate = movies.stream().max(Comparator.comparing(Movie::getRate)).get();
        System.out.println(rate);

        rate = movies.stream().min(Comparator.comparing(Movie::getRate)).get();
        System.out.println(rate);






    }
}
