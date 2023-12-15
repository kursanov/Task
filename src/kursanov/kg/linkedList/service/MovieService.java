package kursanov.kg.linkedList.service;



import kursanov.kg.linkedList.models.Actor;
import kursanov.kg.linkedList.models.Movie;

import java.util.LinkedList;
import java.util.List;

public interface MovieService {


    List<Movie> getAllMovies(LinkedList<Movie> getAllMovies);


    String findMovieByNameOrPartName (String movieName);

    String findMovieByActorName(String actorName, LinkedList<Movie> findByMovieActorName);

    Movie findMovieByYear(int year);

    void findMovieByProducer(String producerName,LinkedList<Movie> findByProducerName );

    void findMovieByGenre(String genre,LinkedList<Movie> findByMovieGenre);

    void findMovieByRole(String role, LinkedList<Actor> findByMovieRole, LinkedList<Movie> findByMovieRoles);




}
