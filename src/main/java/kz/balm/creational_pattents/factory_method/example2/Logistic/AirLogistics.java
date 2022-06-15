package kz.balm.creational_pattents.factory_method.example2.Logistic;

import kz.balm.creational_pattents.factory_method.example2.Transport.Airplane;
import kz.balm.creational_pattents.factory_method.example2.Transport.Transport;

public class AirLogistics implements Logistics{
    @Override
    public Transport createTransport() {
        return new Airplane();
    }
}
