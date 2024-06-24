package org.geunskoo.rentcompany;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentCompany {

    private final List<Car> cars = new ArrayList<>();

    public static RentCompany create() {
        return new RentCompany();
    }

    public String generateReport() {
        return cars.stream().map(Car::getChargeQuantityForReport)
                .collect(Collectors.joining("\n")) + "\n";
    }

    public void addCar(Car car) {
        cars.add(car);
    }
}
