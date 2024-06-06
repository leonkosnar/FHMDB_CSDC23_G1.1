package at.ac.fhcampuswien.fhmdb.factoryPattern;

import javafx.util.Callback;

import java.util.HashMap;
import java.util.Map;

public class MyFactory implements Callback<Class<?>, Object> {

    private static MyFactory instance;
    private final Map<Class<?>, Object> controllerInstances;

    private MyFactory() {
        controllerInstances = new HashMap<>();
    }

    public static MyFactory getInstance() {
        if (instance == null) {
            instance = new MyFactory();
        }
        return instance;
    }

    @Override
    public Object call(Class<?> aClass) {
        if (!controllerInstances.containsKey(aClass)) {
            try {
                Object controllerInstance = aClass.getDeclaredConstructor().newInstance();
                controllerInstances.put(aClass, controllerInstance);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return controllerInstances.get(aClass);
    }
}
