package web.service;

import model.Car;

import java.util.List;

public interface CarService {
    List<Car> listOfCars(Integer count);
}
