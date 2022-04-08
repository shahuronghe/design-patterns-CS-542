package hfmovieiterator;


import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class Movie {
    private String name;
    private String description;
    private String genre;
    private float rating;
    private int year;
    private String cast;

    public Movie(String name, String description, String genre, float rating, int year, String cast) {
        this.name = name;
        this.description = description;
        this.genre = genre;
        this.rating = rating;
        this.year = year;
        this.cast = cast;
    }
    public Movie(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        return "\n"+getName().toUpperCase()+"\n"+getRating()+" - "+getGenre()+" - " + getYear()+"\n"+getCast()+ "\n" + getDescription();
    }

}
