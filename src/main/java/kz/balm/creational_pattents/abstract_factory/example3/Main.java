package kz.balm.creational_pattents.abstract_factory.example3;

import kz.balm.creational_pattents.abstract_factory.example3.factories.FurnitureFactory;
import kz.balm.creational_pattents.abstract_factory.example3.factories.ModernFurnitureFactory;
import kz.balm.creational_pattents.abstract_factory.example3.factories.VictorianFurnitureFactory;
import kz.balm.creational_pattents.abstract_factory.example3.furniture.Furniture;
import kz.balm.creational_pattents.abstract_factory.example3.furniture.ModernFurniture;
import kz.balm.creational_pattents.abstract_factory.example3.furniture.VictorianFurniture;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
        FurnitureFactory victorianFurnitureFactory = new VictorianFurnitureFactory();

        Furniture victorianFurniture = new VictorianFurniture(victorianFurnitureFactory);
        Furniture modernFurniture = new ModernFurniture(modernFurnitureFactory);

        System.out.println(victorianFurniture);
        System.out.println(modernFurniture);
    }
}
