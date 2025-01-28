package web.service;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> listOfCars(Integer count){
        return carDao.listOfCars(count);
    }
}
