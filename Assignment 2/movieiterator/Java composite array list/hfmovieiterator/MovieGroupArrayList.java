package hfmovieiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MovieGroupArrayList implements MovieGroup {

    private List<Movie> allMovies = new ArrayList<>();
    private String groupName;
    private String groupDescription;

    private Iterator<Movie> iterator;

    public MovieGroupArrayList(String groupName, String groupDescription) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }

    @Override
    public void add(Movie movie) {
        allMovies.add(movie);
    }

    @Override
    public void remove(int index) {
        allMovies.remove(index);
    }

    @Override
    public void update(Movie movie, int index) {
        allMovies.set(index, movie);
    }

    @Override
    public int size() {
        return allMovies.size();
    }

    @Override
    public boolean isEmpty() {
        return size() <= 0;
    }

    @Override
    public String getGroupName() {
        return groupName;
    }

    @Override
    public String getGroupDescription() {
        return groupDescription;
    }

    @Override
    public String toString() {
        return "MovieGroupArrayList{" +
                "allMovies=" + allMovies +
                ", groupName='" + groupName + '\'' +
                ", groupDescription='" + groupDescription + '\'' +
                '}';
    }

    @Override
    public Iterator<Movie> createIterator(){
        return allMovies.iterator();
    }

    @Override
    public List<Movie> getAllMovies() {
        return allMovies;
    }
}
