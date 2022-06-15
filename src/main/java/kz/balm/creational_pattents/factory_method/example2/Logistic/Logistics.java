package kz.balm.creational_pattents.factory_method.example2.Logistic;

import kz.balm.creational_pattents.factory_method.example2.Transport.Transport;

public interface Logistics{
    default Transport planDelivery(){
        return createTransport();
    }

    Transport createTransport();
}
