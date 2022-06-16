package kz.balm.creational_pattents.abstract_factory.example2.car;

import java.util.ArrayList;
import java.util.List;

public abstract class Car {
    String name;
    List<Object> accessories = new ArrayList<>();

    public String toString() {
        return "Model car: " + name + "\n" + accessories;
    }
}