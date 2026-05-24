package com.codewithmosh.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    static void main() {
//        ArrayList<Customer>  customers = new ArrayList<>();
        Map<Integer, Customer> map = new HashMap<>();

        var customer1 =new Customer("Nina", 50);
        var customer2 = new Customer("Alla", 70);
        var customer3 = new Customer("Olga", 30);

        map.put(customer1.getAge(), customer1);
        map.put(customer2.getAge(), customer2);
        map.put(customer3.getAge(), customer3);

        //get
        System.out.println(map);
        System.out.println(map.get(30));

        //getOrDefault
        var result = map.getOrDefault(300, customer1);
        System.out.println(result);

        //containsKey
        var exist = map.containsKey(10);
        System.out.println(exist);

        //replace
        map.replace(30, new Customer("Inna", 10));
        System.out.println(map);

        //forEach
        System.out.println("forEach");
        map.forEach((key, value) -> System.out.println(key+ ": "+value));


        //keySet
        System.out.println("keySet");
        for (var key: map.keySet()) {
            System.out.println(key+": "+map.get(key) );
        }

        //entrySet
        System.out.println("entrySet");
        for (var entry: map.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey()+": "+entry.getValue() );
        }

        //values
        System.out.println("values");
        for (var value: map.values()) {
            System.out.println(value);

        }

    }
}
