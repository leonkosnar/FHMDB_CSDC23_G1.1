package at.ac.fhcampuswien.fhmdb.states;

import at.ac.fhcampuswien.fhmdb.models.Movie;

import java.util.Comparator;
import java.util.List;

public class AscendingState implements SortState{

    private List<Movie> movies;

    public AscendingState(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public List<Movie> sort(List<Movie> movies) {

        movies.sort(Comparator.comparing(Movie::getTitle));

        return movies;
    }

    @Override
    public SortState toggle() {
        return new DescendingState(movies);
    }
}
