package com.codewithmosh.stream;

public class Movie implements Comparable<Movie> {
    private String name;
    private Integer rate;
    private Genre genre;

    public Movie(String name, Integer rate) {
        this.name = name;
        this.rate = rate;
        this.genre = Genre.ACTION;
    }

    public Movie(String name, Integer rate, Genre genre) {
        this.name = name;
        this.rate = rate;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }


    public Integer getRate() {
        return rate;
    }

    public Genre getGenre() {
        return genre;
    }

    public String toString() {
        return "{" + name + ": " + rate + "}";
    }


    @Override
    public int compareTo(Movie other) {
        return rate - other.getRate();
    }
}
