package hfmovieiterator;



import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.stream.Collectors;

public class CompositeIterator implements Iterator<Movie>, Cloneable {
    private Stack<MovieGroup> composites = new Stack<>();

	private Stack<Iterator<Movie>> iteratorStack = new Stack<>();

    private CompositeIterator(Stack<Iterator<Movie>> stack) {
        this.iteratorStack = stack;
    }

    public CompositeIterator() {
    }

    @Override
	    public boolean hasNext() {
        if (iteratorStack.empty()) {
            return false;
        } else {
            Iterator<Movie> iterator = iteratorStack.peek();
            if (!iterator.hasNext()) {
                iteratorStack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

	@Override
    public Movie next() {
        if (hasNext()) {
            Iterator<Movie> iterator = iteratorStack.peek();
            Movie movie = iterator.next();
            return movie;
        } else {
            return null;
        }
    }

    @Override
    protected CompositeIterator clone() throws CloneNotSupportedException {
        Stack<Iterator<Movie>> tempStack = new Stack<>();
        for(MovieGroup movieGroup : composites){
            tempStack.push(movieGroup.createIterator());
        }
        return new CompositeIterator(tempStack);
    }

    public void add(MovieGroup movieGroup){
        composites.add(movieGroup);
        addIterator(movieGroup.createIterator());
    }

    private void addIterator(Iterator<Movie> iterator){
		this.iteratorStack.push(iterator);
	}

    public void printMovieGroup(){
        System.out.println("**********************************************-MOVIES-**********************************************");
        for(MovieGroup movieGroup : composites){

            System.out.println("Group Name : "+movieGroup.getGroupName());
            System.out.println("Group Description : "+movieGroup.getGroupDescription());
            System.out.println();
            for(Movie movie : movieGroup.getAllMovies()){
                System.out.println(movie);
            }
            System.out.println("-----------------------------------------------------------------------------\n");
        }
    }
}
