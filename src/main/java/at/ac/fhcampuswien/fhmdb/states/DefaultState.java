package at.ac.fhcampuswien.fhmdb.states;

import at.ac.fhcampuswien.fhmdb.models.Movie;

import java.util.List;

public class DefaultState implements SortState{
    private List<Movie> movies;

    public DefaultState(List<Movie> result) {
    }

    @Override
    public List<Movie> sort(List<Movie> movies) {
        return movies;
    }

    @Override
    public SortState toggle() {
        return new AscendingState(movies);
    }
}
