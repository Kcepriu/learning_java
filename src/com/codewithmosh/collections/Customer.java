package com.codewithmosh.collections;

public class Customer implements Comparable<Customer> {
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Customer  other) {
        return name.compareTo(other.name);
    }


    @Override
    public String toString() {
        return "{" +
                "name:'" + name + '\'' +
                "age:'" + age + '\'' +
                '}';
    }
}
