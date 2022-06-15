package kz.balm.creational_pattents.factory_method.example2.Transport;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Ship deliver");
    }
}
