package kz.balm.creational_pattents.abstract_factory.example3.furniture;

import kz.balm.creational_pattents.abstract_factory.example3.factories.FurnitureFactory;

public class VictorianFurniture extends Furniture{
    public VictorianFurniture(FurnitureFactory furnitureFactory) {
        name = "Victorian furniture";
        furniture.add(furnitureFactory.addChair());
        furniture.add(furnitureFactory.addSofa());
        furniture.add(furnitureFactory.addCoffeeTable());
    }
}
