package kz.balm.creational_pattents.abstract_factory.example3.factories;

import kz.balm.creational_pattents.abstract_factory.example3.chair.Chair;
import kz.balm.creational_pattents.abstract_factory.example3.chair.ModernChair;
import kz.balm.creational_pattents.abstract_factory.example3.coffee_table.CoffeeTable;
import kz.balm.creational_pattents.abstract_factory.example3.coffee_table.ModernCoffeeTable;
import kz.balm.creational_pattents.abstract_factory.example3.sofa.ModernSofa;
import kz.balm.creational_pattents.abstract_factory.example3.sofa.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair addChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable addCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa addSofa() {
        return new ModernSofa();
    }


}
