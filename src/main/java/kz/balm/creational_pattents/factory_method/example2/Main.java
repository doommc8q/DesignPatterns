package kz.balm.creational_pattents.factory_method.example2;

import kz.balm.creational_pattents.factory_method.example2.Logistic.AirLogistics;
import kz.balm.creational_pattents.factory_method.example2.Logistic.Logistics;
import kz.balm.creational_pattents.factory_method.example2.Logistic.RoadLogistics;
import kz.balm.creational_pattents.factory_method.example2.Logistic.SeaLogistics;
import kz.balm.creational_pattents.factory_method.example2.Transport.Transport;

public class Main {
    public static void main(String[] args) {
        Logistics seaLogistics = new SeaLogistics();
        Logistics roadLogistics = new RoadLogistics();
        Logistics airLogistics = new AirLogistics();

        Transport ship = seaLogistics.planDelivery();
        Transport truck = roadLogistics.planDelivery();
        Transport airplane= airLogistics.planDelivery();

        ship.deliver();
        truck.deliver();
        airplane.deliver();
    }
}
