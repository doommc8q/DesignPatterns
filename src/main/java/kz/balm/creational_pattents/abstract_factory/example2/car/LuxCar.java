package kz.balm.creational_pattents.abstract_factory.example2.car;

import kz.balm.creational_pattents.abstract_factory.example2.factories.CarPartsFactory;

public class LuxCar extends Car {
    public LuxCar(CarPartsFactory carPartsFactory) {
        name = "Luxury Car";
        accessories.add(carPartsFactory.addCarSalon());
        accessories.add(carPartsFactory.addSteeringWheel());
        accessories.add(carPartsFactory.addGPS());
    }
}