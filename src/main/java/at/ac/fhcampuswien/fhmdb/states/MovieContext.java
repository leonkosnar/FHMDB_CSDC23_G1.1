package at.ac.fhcampuswien.fhmdb.states;

import at.ac.fhcampuswien.fhmdb.models.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieContext {
    private List<Movie> movies;
    private SortState currentState;

    public MovieContext(List<Movie> movies){
        this.movies = new ArrayList<>(movies);
        this.currentState = new DefaultState(movies);
    }
    public void setState(SortState state){
        this.currentState = state;
    }

}
