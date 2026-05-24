package com.codewithmosh.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    static void main() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(1,"!");
        System.out.println(list);

        list.set(0, "+");
        System.out.println(list);

        System.out.println(list.get(0));
        //System.out.println(list[0]); // ERR

        list.remove("+");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        System.out.println(list.indexOf("c"));

        list.add("b");
        list.add("c");
        System.out.println(list.lastIndexOf("c"));

        var newList = list.subList(1,3);
        System.out.println(list);
        System.out.println(newList);






    }
}
