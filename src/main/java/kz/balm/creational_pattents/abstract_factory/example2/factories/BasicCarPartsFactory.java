package kz.balm.creational_pattents.abstract_factory.example2.factories;

import kz.balm.creational_pattents.abstract_factory.example2.*;
import kz.balm.creational_pattents.abstract_factory.example2.gps.GPS;
import kz.balm.creational_pattents.abstract_factory.example2.salon.BasicCarSalon;
import kz.balm.creational_pattents.abstract_factory.example2.salon.CarSalon;
import kz.balm.creational_pattents.abstract_factory.example2.wheel.BasicSteeringWheel;
import kz.balm.creational_pattents.abstract_factory.example2.wheel.SteeringWheel;

public class BasicCarPartsFactory implements CarPartsFactory {
    public CarSalon addCarSalon() {
        return new BasicCarSalon();
    }

    public SteeringWheel addSteeringWheel() {
        return new BasicSteeringWheel();
    }

    public GPS addGPS() {
        return null;
    }
}

