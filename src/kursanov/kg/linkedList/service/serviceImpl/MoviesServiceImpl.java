package kursanov.kg.linkedList.service.serviceImpl;



import kursanov.kg.linkedList.db.DataBase;
import kursanov.kg.linkedList.models.Actor;
import kursanov.kg.linkedList.models.Movie;
import kursanov.kg.linkedList.service.MovieService;

import java.util.LinkedList;
import java.util.List;

public class MoviesServiceImpl implements MovieService {


    @Override
    public List<Movie> getAllMovies(LinkedList<Movie> getAllMovies) {
            return DataBase.movies;
    }

    public String findMovieByNameOrPartName(String movieName){
        for (Movie movie: DataBase.movies) {
            if (movie.getName().equalsIgnoreCase(movieName)){
                return movie.toString();
            }

        }
        return null;
    }

    @Override
    public String findMovieByActorName(String actorName, LinkedList<Movie> linkedListFromMovies) {
        for (int i = 0; i < linkedListFromMovies.size(); i++) {
            for (int i1 = 0; i1 < linkedListFromMovies.get(i).getActors().size(); i1++) {
                if (actorName.equalsIgnoreCase(linkedListFromMovies.get(i).getActors().get(i1).getFullName())){
                    return linkedListFromMovies.get(i).toString();
                }
            }
        }
        return "null";
    }

    @Override
    public Movie findMovieByYear(int year) {
        for (Movie movie:DataBase.movies) {
            if (movie.getYear() == year){
               return movie;

            }
        }



        return null ;

    }

    @Override
    public void findMovieByProducer(String producerName,LinkedList<Movie> linkedListFromMovies ) {
        LinkedList<Movie> list = new LinkedList<>();
        for (Movie movie : linkedListFromMovies) {
            if (movie.getProducer().getFirstName().toLowerCase().contains(producerName.toLowerCase())){
                 list.add(movie);
            }
        }
        System.out.println(list);

    }

    @Override
    public void findMovieByGenre(String genre,LinkedList<Movie> linkedListFromMovies) {
        LinkedList<Movie> list = new LinkedList<>();
        for (Movie movie: linkedListFromMovies){
            if (movie.getGenre().toLowerCase().contains(genre.toLowerCase())){
                list.add(movie);
            }
        }
        System.out.println(list);

    }

    @Override
    public void findMovieByRole(String role, LinkedList<Actor> linkedListFromActors, LinkedList<Movie> linkedListFromMovies) {
        for (Movie movie: linkedListFromMovies) {
            for (Actor actor : movie.getActors()) {
                if (actor.getRole().contains(role)){
                    System.out.println(movie);
                }
            }
        }



    }
}
