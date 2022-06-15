package kz.balm.creational_pattents.factory_method.example2.Logistic;

import kz.balm.creational_pattents.factory_method.example2.Transport.Ship;
import kz.balm.creational_pattents.factory_method.example2.Transport.Transport;

public class SeaLogistics implements Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
