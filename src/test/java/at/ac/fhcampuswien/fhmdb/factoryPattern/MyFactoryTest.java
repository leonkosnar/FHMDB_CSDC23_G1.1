package at.ac.fhcampuswien.fhmdb.factoryPattern;

import at.ac.fhcampuswien.fhmdb.controllers.MainController;
import at.ac.fhcampuswien.fhmdb.controllers.MovieListController;
import at.ac.fhcampuswien.fhmdb.controllers.WatchlistController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyFactoryTest {

    @Test
    public void testMainControllerSingleton() {
        MyFactory factory = MyFactory.getInstance();
        MainController instance1 = (MainController) factory.call(MainController.class);
        MainController instance2 = (MainController) factory.call(MainController.class);

        assertNotNull(instance1);
        assertNotNull(instance2);
        assertSame(instance1, instance2);
    }

    @Test
    public void testMovieListControllerSingleton() {
        MyFactory factory = MyFactory.getInstance();
        MovieListController instance1 = (MovieListController) factory.call(MovieListController.class);
        MovieListController instance2 = (MovieListController) factory.call(MovieListController.class);

        assertNotNull(instance1);
        assertNotNull(instance2);
        assertSame(instance1, instance2);
    }

    @Test
    public void testWatchlistControllerSingleton() {
        MyFactory factory = MyFactory.getInstance();
        WatchlistController instance1 = (WatchlistController) factory.call(WatchlistController.class);
        WatchlistController instance2 = (WatchlistController) factory.call(WatchlistController.class);

        assertNotNull(instance1);
        assertNotNull(instance2);
        assertSame(instance1, instance2);
    }
}