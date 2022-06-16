package kz.balm.creational_pattents.abstract_factory.example2.factories;

import kz.balm.creational_pattents.abstract_factory.example2.*;
import kz.balm.creational_pattents.abstract_factory.example2.gps.CarGPS;
import kz.balm.creational_pattents.abstract_factory.example2.gps.GPS;
import kz.balm.creational_pattents.abstract_factory.example2.salon.CarSalon;
import kz.balm.creational_pattents.abstract_factory.example2.salon.LeatherCarSalon;
import kz.balm.creational_pattents.abstract_factory.example2.wheel.HeatedSteeringWheel;
import kz.balm.creational_pattents.abstract_factory.example2.wheel.SteeringWheel;

public class LuxCarPartsFactory implements CarPartsFactory {
    public CarSalon addCarSalon() {
        return new LeatherCarSalon();
    }

    public SteeringWheel addSteeringWheel() {
        return new HeatedSteeringWheel();
    }

    public GPS addGPS() {
        return new CarGPS();
    }
}