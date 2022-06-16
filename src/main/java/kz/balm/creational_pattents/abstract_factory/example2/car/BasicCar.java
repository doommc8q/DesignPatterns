package kz.balm.creational_pattents.abstract_factory.example2.car;

import kz.balm.creational_pattents.abstract_factory.example2.factories.CarPartsFactory;

public class BasicCar extends Car {
    public BasicCar(CarPartsFactory carPartsFactory) {
        name = "Basic Car";
        accessories.add(carPartsFactory.addCarSalon());
        accessories.add(carPartsFactory.addSteeringWheel());
    }
}

