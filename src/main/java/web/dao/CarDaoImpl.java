package web.dao;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(2012, "bmw", "black"));
        cars.add(new Car(2000, "toyota", "white"));
        cars.add(new Car(2023, "mercedes", "red"));
        cars.add(new Car(1999, "opel", "blue"));
        cars.add(new Car(2016, "renault", "yellow"));
    }

    @Override
    public List<Car> listOfCars(Integer count) {
        if (count == null) {
            return cars;
        }
        return cars.stream()
                .limit(count)
                .toList();
    }
}
