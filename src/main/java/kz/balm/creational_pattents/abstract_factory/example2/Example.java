package kz.balm.creational_pattents.abstract_factory.example2;

import kz.balm.creational_pattents.abstract_factory.example2.car.BasicCar;
import kz.balm.creational_pattents.abstract_factory.example2.car.Car;
import kz.balm.creational_pattents.abstract_factory.example2.car.LuxCar;
import kz.balm.creational_pattents.abstract_factory.example2.factories.BasicCarPartsFactory;
import kz.balm.creational_pattents.abstract_factory.example2.factories.CarPartsFactory;
import kz.balm.creational_pattents.abstract_factory.example2.factories.LuxCarPartsFactory;

public class Example {
    public static void main(String[] args) {
        CarPartsFactory myLuxFactory = new LuxCarPartsFactory();
        CarPartsFactory myBasicFactory = new BasicCarPartsFactory();

        Car myLuxCar = new LuxCar(myLuxFactory);
        Car myBasicCar = new BasicCar(myBasicFactory);

        System.out.println(myLuxCar);
        System.out.println(myBasicCar);
    }
}