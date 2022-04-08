package hfmovieiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface MovieGroup {
    void add(Movie movie);
    void remove(int index);
    void update(Movie movie, int index);
    int size();
    boolean isEmpty();
    String getGroupName();
    String getGroupDescription();
    Iterator<Movie> createIterator();
    List<Movie> getAllMovies();
}
