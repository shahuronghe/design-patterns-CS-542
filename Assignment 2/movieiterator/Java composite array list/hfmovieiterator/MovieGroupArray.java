package hfmovieiterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MovieGroupArray implements MovieGroup {

    private String groupName;
    private String groupDescription;
    private int MAX_SIZE = 10;
    private int curSize = 0;

    private Movie[] allMovies;

    public MovieGroupArray(String groupName, String groupDescription, int MAX_SIZE) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;
        this.MAX_SIZE = MAX_SIZE;
        allMovies = new Movie[MAX_SIZE];
    }

    public MovieGroupArray(String groupName, String groupDescription) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;
        allMovies = new Movie[MAX_SIZE];
    }

    @Override
    public void add(Movie movie) {
        if(curSize < MAX_SIZE){
            allMovies[curSize] = movie;
            curSize++;
        }else{
            // create new 1.5x array
            Movie[] allMovieTempArr = new Movie[MAX_SIZE + MAX_SIZE/2];
            for(int i=0;i<MAX_SIZE;i++){
                allMovieTempArr[i] = allMovies[i];
            }
            allMovies = allMovieTempArr;
            MAX_SIZE += MAX_SIZE/2;
            allMovies[curSize] = movie;
            curSize++;
            // copy previous array to new array
            // provide reference of new array to allMovies
        }
    }

    @Override
    public void remove(int index) {
        allMovies[index] = null;

        // shift back the array
        shiftArrayTill(index);
    }

    @Override
    public void update(Movie movie, int index) {
        allMovies[index] = movie;
    }

    @Override
    public int size() {
        return curSize;
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

    private void shiftArrayTill(int index){
        for(int i=index; i<MAX_SIZE-1; i++){
            allMovies[i] = allMovies[i+1];
        }
        allMovies[MAX_SIZE-1] = null;
    }

    @Override
    public String toString() {
        return "MovieGroupArray{" +
                "groupName='" + groupName + '\'' +
                ", groupDescription='" + groupDescription + '\'' +
                ", allMovies=" + Arrays.toString(allMovies) +
                '}';
    }

    @Override
    public Iterator<Movie> createIterator(){
        return Arrays.stream(allMovies)
                .filter(e -> e!=null)
                .iterator();
    }

    @Override
    public List<Movie> getAllMovies() {
        List<Movie> movies = new ArrayList<>();
        for(Movie movie : allMovies){
            if(movie != null){
                movies.add(movie);
            }
        }
        return movies;
    }
}
