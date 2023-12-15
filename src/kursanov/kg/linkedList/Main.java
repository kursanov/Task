package kursanov.kg.linkedList;



import kursanov.kg.linkedList.db.DataBase;
import kursanov.kg.linkedList.id.GeneratedId;
import kursanov.kg.linkedList.models.Actor;
import kursanov.kg.linkedList.models.Movie;
import kursanov.kg.linkedList.models.Producer;
import kursanov.kg.linkedList.service.serviceImpl.MoviesServiceImpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Producer samat = new Producer("Samat", "Amanov");
        Producer dibala = new Producer("Dibala", "Jyrakov");
        Producer mbappe = new Producer("Mbappe", "Karre");
        Producer benzema = new Producer("Benzema", "Balle");
        Producer romnaldo = new Producer("Cristiano", "Ronaldo");


        Actor mederSabyrov = new Actor(GeneratedId.actorId, "Meder Sabyrov", "Mederbek");
        Actor kalygulUrmatov = new Actor(GeneratedId.actorId, "Kalygul Urmatov", "Kolia");
        LinkedList<Actor> fromAkKeme = new LinkedList<>(List.of(mederSabyrov, kalygulUrmatov));

        Actor aliAbdiev = new Actor(GeneratedId.actorId, "Ali Abdiev", "Allash");
        Actor nurgazyBaev = new Actor(GeneratedId.actorId, "Nurgazy Baev", "Nurik");
        LinkedList<Actor> fromManas = new LinkedList<>(List.of(aliAbdiev, nurgazyBaev));

        Actor nurlanNasip = new Actor(GeneratedId.actorId, "Nurlan Nasip", "Nuke");
        Actor tumarSaparov = new Actor(GeneratedId.actorId, "Tumar Saparov", "Tuma");
        LinkedList<Actor> fromMeniMenenOynochu = new LinkedList<>(List.of(nurlanNasip, tumarSaparov));

        Actor bakirGazy = new Actor(GeneratedId.actorId, "Bakir Gazy", "Baha");
        Actor sadyrJaparov = new Actor(GeneratedId.actorId, "Sadyr Japariv", "Sake");
        LinkedList<Actor> fromSuperKudalar = new LinkedList<>(List.of(bakirGazy, sadyrJaparov));

        Actor azamatBaimatov = new Actor(GeneratedId.actorId, "Azamat Baimatov", "Yari");
        Actor kadyrMyrzaev = new Actor(GeneratedId.actorId, "Kadyr Myrzaev", "Kake");
        LinkedList<Actor> fromOsobnyak = new LinkedList<>(List.of(azamatBaimatov, kadyrMyrzaev));

        Movie osobnyak = new Movie(GeneratedId.movieId,"Особняк",2023,"Комедия",benzema,fromOsobnyak);
        Movie superKudalar = new Movie(GeneratedId.movieId,"Супер кудалар",2023,"Исторический",dibala,fromSuperKudalar);
        Movie meniMenenOinochu = new Movie(GeneratedId.movieId,"Мени менен ойночу", 2021,"Ужас фильм",samat,fromMeniMenenOynochu);
        Movie manas = new Movie(GeneratedId.movieId,"Манас",2024,"Исторический",romnaldo,fromManas);
        Movie akKeme = new Movie(GeneratedId.movieId,"Ак кеме", 2019,"c",mbappe,fromAkKeme);
        Actor actor = new Actor();
        Movie movie = new Movie();
        DataBase.actors.addAll(Set.of(mederSabyrov,kalygulUrmatov,aliAbdiev,nurgazyBaev,nurlanNasip,tumarSaparov,bakirGazy,sadyrJaparov,azamatBaimatov,kadyrMyrzaev));
        DataBase.movies.addAll(Set.of(osobnyak,superKudalar,meniMenenOinochu,manas,akKeme));
        MoviesServiceImpl moviesService = new MoviesServiceImpl();



//      --------------------------------------------------------------------------------------------
        //Бул жерде GetAllMovies методу иштейт!
//        Collections.sort(DataBase.movies); // Бул жерде болсо sortByMovieName методу иштейт азыр бул -from A to Z | -from Z to A кылуу учун мовинин акыркы методун иштетиниз!
//        Collections.sort(DataBase.movies); // Бул жерде sortByYear методу иштеп атат -Ascending  жана  Descending кинонун жылына карай сорттоп атат. муну да Movie класстан регилировка кыласыз!
//        Collections.sort(DataBase.movies);// Бул жерде sortByProducer методу продюсердин атына карай сорттоп жатат!
//        System.out.println(moviesService.getAllMovies(DataBase.movies));
//        -----------------------------------------------------------------------------------------
//        Бул жерде findMovieByNameOrPartName методу иштеп атат!
//        System.out.println(moviesService.findMovieByNameOrPartName("Мени менен ойночу"));
//        ------------------------------------------------------------------------------------------
//        Бул жерде болсо findMovieByActorName методу иштеп атат!
//        System.out.println(moviesService.findMovieByActorName("Tumar Saparov",DataBase.movies));
//        _--------------------------------------------------------------------------------------------
//        Бул жерде findMovieByYear методу иштеп атат!
//        System.out.println(moviesService.findMovieByYear(2024));
//        -----------------------------------------------------------------------------------------------
//        Бул жерде findMovieByProducer методу иштеп атат!
//        moviesService.findMovieByProducer("Samat", DataBase.movies);
//        ----------------------------------------------------------------------------------------------
//        Бул жерде findMovieByGenre методу иштеп атат!
//        moviesService.findMovieByGenre("Исторический",DataBase.movies);
//        ------------------------------------------------------------------------------------------------
//        Бул жерде findMovieByRole методу иштеп  атат!
//        moviesService.findMovieByRole("Baha",DataBase.actors,DataBase.movies);
//        --------------------------------------------------------------------------------------------------






































    }
}
