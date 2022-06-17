package kz.balm.creational_pattents.builder.example1.builders;

import kz.balm.creational_pattents.builder.example1.cars.CarType;
import kz.balm.creational_pattents.builder.example1.components.Engine;
import kz.balm.creational_pattents.builder.example1.components.GPSNavigator;
import kz.balm.creational_pattents.builder.example1.components.Transmission;
import kz.balm.creational_pattents.builder.example1.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
