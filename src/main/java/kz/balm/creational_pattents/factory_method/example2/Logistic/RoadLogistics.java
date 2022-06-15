package kz.balm.creational_pattents.factory_method.example2.Logistic;

import kz.balm.creational_pattents.factory_method.example2.Transport.Transport;
import kz.balm.creational_pattents.factory_method.example2.Transport.Truck;

public class RoadLogistics implements Logistics{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
