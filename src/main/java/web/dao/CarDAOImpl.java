package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.*;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDAO {
    private List<Car> cars;
    {
        cars = new ArrayList<>(5);

        cars.add(new Car("VAZ", "2114", 2013));
        cars.add(new Car("GAZ", "3302", 2010));
        cars.add(new Car("ZAZ", "965", 1963));
        cars.add(new Car("Reno", "Logan", 2015));
        cars.add(new Car("Toyota", "Corolla", 2001));
    }

    public List<Car> getAllCars() {
        return cars;
    }

    public List<Car> getSomeCars (int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
