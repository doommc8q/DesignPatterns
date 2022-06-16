package kz.balm.creational_pattents.abstract_factory.example3.furniture;

import java.util.ArrayList;
import java.util.List;

public abstract class Furniture {
    String name;
    List<Object> furniture = new ArrayList<>();

    @Override
    public String toString() {
        return
                name + ", furniture=" + furniture;
    }
}
