package com.codewithmosh;

import com.codewithmosh.generic.GenericList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var list = new GenericList<String>();

        list.add("a");
        list.add("b");
        list.add("c");

        for (var item: list) {
            System.out.println(item);
        }
//        while(6){
//            System.out.println(6);
//        };
//        Scanner console = new Scanner(System.in);
//        console.nextInt()

    }


}