package kz.balm.creational_pattents.abstract_factory.example3.factories;

import kz.balm.creational_pattents.abstract_factory.example3.chair.Chair;
import kz.balm.creational_pattents.abstract_factory.example3.chair.VictorianChair;
import kz.balm.creational_pattents.abstract_factory.example3.coffee_table.CoffeeTable;
import kz.balm.creational_pattents.abstract_factory.example3.coffee_table.VictorianCoffeeTable;
import kz.balm.creational_pattents.abstract_factory.example3.sofa.Sofa;
import kz.balm.creational_pattents.abstract_factory.example3.sofa.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair addChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable addCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public Sofa addSofa() {
        return new VictorianSofa();
    }
}
