package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarDAO {
    private final  List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Nissan", 2, 1990));
        cars.add(new Car("Volvo", 3, 1980));
        cars.add(new Car("BMW", 4, 1970));
        cars.add(new Car("Mercedes", 1, 2000));
        cars.add(new Car("Lada", 6, 2012));
    }

    public List<Car> returnAmountOfCars(int amount) {
        return cars.stream()
                .limit(amount)
                .collect(Collectors.toList());

    }

//    public List<Car> getCars() {
//        return cars;
//    }
}
