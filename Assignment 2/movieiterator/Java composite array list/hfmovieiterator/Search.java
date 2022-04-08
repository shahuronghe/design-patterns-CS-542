package hfmovieiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class Search {

    public static List<Movie> searchByMovieName(String movieName, Iterator<Movie> iterator){
        List<Movie> movies = new ArrayList<>();
        while(iterator.hasNext()){
            Movie movie = iterator.next();
            if(movie.getName().toLowerCase().contains(movieName.toLowerCase())){
                movies.add(movie);
            }
        }
        return movies;
    }

    public static List<Movie> searchByGenre(String genre ,Iterator<Movie> iterator){
        List<Movie> movies = new ArrayList<>();
        while(iterator.hasNext()){
            Movie movie = iterator.next();
            if(movie.getGenre().toLowerCase().contains(genre.toLowerCase())){
                movies.add(movie);
            }
        }
        return movies;
    }

    public static List<Movie> searchByRating(float rating, Iterator<Movie> iterator){
        List<Movie> movies = new ArrayList<>();
        while(iterator.hasNext()){
            Movie movie = iterator.next();
            if((int)movie.getRating() == (int) rating){
                movies.add(movie);
            }
        }
        return movies;
    }

    public static List<Movie> searchByYear(int year, Iterator<Movie> iterator){
        List<Movie> movies = new ArrayList<>();
        while(iterator.hasNext()){
            Movie movie = iterator.next();
            if(movie.getYear() == year){
                movies.add(movie);
            }
        }
        return movies;
    }

    public static List<Movie> searchByCast(String name, Iterator<Movie> iterator){
        List<Movie> movies = new ArrayList<>();
        while(iterator.hasNext()){
            Movie movie = iterator.next();
            if(movie.getCast().toLowerCase().contains(name.toLowerCase())){
                movies.add(movie);
            }
        }
        return movies;
    }
}
