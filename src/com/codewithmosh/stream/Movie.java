package com.codewithmosh.stream;

public class Movie implements Comparable<Movie> {
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
    public String toString() {
        return "{"+name+": "+rate+"}";
    }


    @Override
    public int compareTo(Movie other) {
        return rate - other.getRate();
    }
}
