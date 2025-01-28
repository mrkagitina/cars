package web.service;

import model.Car;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImpl;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private CarDao carDao ;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> listOfCars(Integer count){
        return carDao.listOfCars(count);
    }
}
