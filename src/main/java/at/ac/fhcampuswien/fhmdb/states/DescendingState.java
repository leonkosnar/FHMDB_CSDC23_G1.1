package at.ac.fhcampuswien.fhmdb.states;

import at.ac.fhcampuswien.fhmdb.models.Movie;

import java.util.Comparator;
import java.util.List;

public class DescendingState implements SortState{
    private List<Movie> movies;
    public DescendingState(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public List<Movie> sort(List<Movie> movies) {
        movies.sort(Comparator.comparing(Movie::getTitle).reversed());
        return movies;
    }

    @Override
    public SortState toggle() {
        return new AscendingState(movies);
    }
}
