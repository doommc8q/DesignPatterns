package kz.balm.creational_pattents.abstract_factory.example3.factories;

import kz.balm.creational_pattents.abstract_factory.example3.chair.Chair;
import kz.balm.creational_pattents.abstract_factory.example3.coffee_table.CoffeeTable;
import kz.balm.creational_pattents.abstract_factory.example3.sofa.Sofa;

public interface FurnitureFactory {
    Chair addChair();
    CoffeeTable addCoffeeTable();
    Sofa addSofa();
}
