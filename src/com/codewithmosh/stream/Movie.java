package com.codewithmosh.stream;

public class Movie {
    private String name;
    private Integer rate;

    public Movie(String name, Integer rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }


    public Integer getRate() {
        return rate;
    }
}
