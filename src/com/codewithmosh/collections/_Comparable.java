package com.codewithmosh.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class _Comparable {
    static void main() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Nina", 50));
        customers.add(new Customer("Alla", 70));
        customers.add(new Customer("Olga", 30));

        System.out.println(customers);

        Collections.sort(customers);

        System.out.println(customers);

        Collections.sort(customers, (a,b) -> a.getAge()-b.getAge());

        System.out.println(customers);




    }
}
