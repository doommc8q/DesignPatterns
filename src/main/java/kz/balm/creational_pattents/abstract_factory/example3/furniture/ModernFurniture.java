package kz.balm.creational_pattents.abstract_factory.example3.furniture;

import kz.balm.creational_pattents.abstract_factory.example3.factories.FurnitureFactory;

public class ModernFurniture extends Furniture {
    public ModernFurniture(FurnitureFactory furnitureFactory) {
        name = "Modern furniture";
        furniture.add(furnitureFactory.addChair());
        furniture.add(furnitureFactory.addSofa());
        furniture.add(furnitureFactory.addCoffeeTable());
    }
}
