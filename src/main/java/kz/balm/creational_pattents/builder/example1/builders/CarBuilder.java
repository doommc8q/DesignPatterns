package kz.balm.creational_pattents.builder.example1.builders;

import kz.balm.creational_pattents.builder.example1.cars.Car;
import kz.balm.creational_pattents.builder.example1.cars.CarType;
import kz.balm.creational_pattents.builder.example1.components.Engine;
import kz.balm.creational_pattents.builder.example1.components.GPSNavigator;
import kz.balm.creational_pattents.builder.example1.components.Transmission;
import kz.balm.creational_pattents.builder.example1.components.TripComputer;

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}