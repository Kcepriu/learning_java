package com.codewithmosh.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    static void main() {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");

        //1. Print
        for (var elem : collection) {
            System.out.println(elem);
        }

        System.out.println(collection);

        collection.forEach(System.out::println);

        //2. Fill Collection
        Collection<String> collectionNew = new ArrayList<>();
        Collections.addAll(collectionNew, "e", "f", "g");
        System.out.println(collectionNew);

        //2.1 Fill Collection
        Collection<String> other = new ArrayList<>();
        other.addAll(collection);
        System.out.println(other);

        //2.2 Fill Collection
        Collection<String> other1 = new ArrayList<>(collection);
        System.out.println(other1);


        //?? equals collections
        System.out.println(collection == other);      //false
        System.out.println(collection.equals(other)); //true

        //3. Size collection
        System.out.println(collectionNew.size());

        //4. Remove element
        collectionNew.remove("f");
        System.out.println(collectionNew);

        //5. Clear collection
        collectionNew.clear();

        //6. isEmpty()
        System.out.println(collectionNew.isEmpty());

        //7. contains
        var containsA = collection.contains("a");
        System.out.println(containsA);

        //8. To Array
        var arr1 = collection.toArray();                // Object[]
        var arr2 = collection.toArray(new String[0] ); //  String[]
        System.out.println(Arrays.toString(arr2));

    }
}
