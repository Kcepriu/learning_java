package com.codewithmosh.collections;

import java.util.*;

public class SetDemo {
    static void main() {
        Set<String> set = new HashSet<>();
        set.add("c");
        set.add("a");
        set.add("b");
        set.add("a");

        System.out.println(set);
        Set<String> set1 = new HashSet<>(Arrays.asList("b", "c", "d"));

        System.out.println(set1);


        ArrayList<String> collection = new ArrayList<>();
        Collections.addAll(collection, "Alla", "Olga", "Dasha", "Alla");
        Set<String> set3 = new HashSet<>(collection);

        System.out.println(set3);


        //Union
        set.addAll(set1); //[a, b, c, d]
        System.out.println(set);

        set = new HashSet<>(Arrays.asList("a", "b", "c"));

        //Intersection
        set.retainAll(set1);  //[b, c]
        System.out.println(set);

        set = new HashSet<>(Arrays.asList("a", "b", "c"));

        //Difference
        set.removeAll(set1);  //[a]
        System.out.println(set);





    }
}
