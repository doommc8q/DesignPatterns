package kz.balm.creational_pattents.abstract_factory.example2.factories;


import kz.balm.creational_pattents.abstract_factory.example2.gps.GPS;
import kz.balm.creational_pattents.abstract_factory.example2.salon.CarSalon;
import kz.balm.creational_pattents.abstract_factory.example2.wheel.SteeringWheel;

public interface CarPartsFactory {
    CarSalon addCarSalon();

    SteeringWheel addSteeringWheel();

    GPS addGPS();
}
