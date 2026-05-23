package com.codewithmosh.collections;

public class _Iterator {
    static void main() {
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        for (var it:list) {
            System.out.println(it);
        }

    }


}
