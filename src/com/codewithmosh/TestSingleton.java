package com.codewithmosh;

public class TestSingleton {
    private static TestSingleton instance;

    public TestSingleton TestSingleton() {

        if (TestSingleton.instance == null) {
            TestSingleton.instance = new TestSingleton();
        }

        System.out.println("Create object");

        return instance;
    }

    public void run() {
        System.out.println(TestSingleton.instance);
    }


}
