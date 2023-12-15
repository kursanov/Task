package kursanov.kg.linkedList.models;

import java.util.LinkedList;

public class Movie implements Comparable<Movie>{

    private int id;
    private String name;

    private int year;

    private String genre;


    private  Producer producer;

    LinkedList<Actor> actors;

    public Movie() {
    }

    public Movie(int id, String name, int year, String genre, Producer producer, LinkedList<Actor> actors) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.producer = producer;
        this.actors = actors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Producer getProducer() {
        return producer;
    }

    public LinkedList<Actor> getActors() {
        return actors;
    }

    public void setActors(LinkedList<Actor> actors) {
        this.actors = actors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\n Movie{" +
                "id='" + id + '\n' +
                "name='" + name + '\n' +
                ", year=" + year + '\n' +
                ", genre='" + genre + '\n' +
                ", producer=" + producer + '\n' +
                ", actors=" + actors + '\n' +
                '}';
    }



    //    Бул метод Ascending
//    @Override
//    public int compareTo(Movie movie) {
//        return movie.year - this.year ;
//    }



//    Бул метод Descending
//    @Override
//    public int compareTo(Movie movie) {
//        return movie.year - this.year ;
//    }



//   Бул метод -from A to Z
//    @Override
//    public int compareTo(Movie movie) {
//        return this.name.compareTo(movie.getName());
//    }


//    -from Z to A
//    @Override
//    public int compareTo(Movie movie) {
//        return movie.name.compareTo(this.name);
//    }


        @Override
    public int compareTo(Movie movie) {
        return this.producer.getFirstName().compareTo(movie.producer.getFirstName());
    }


}
