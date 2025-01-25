package web.service;

import model.Car;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImpl;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    CarDao carDao = new CarDaoImpl();

    public List<Car> listOfCars(Integer count){
        return carDao.listOfCars(count);
    }
}
