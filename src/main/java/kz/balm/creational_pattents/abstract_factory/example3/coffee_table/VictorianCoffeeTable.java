package kz.balm.creational_pattents.abstract_factory.example3.coffee_table;

public class VictorianCoffeeTable implements CoffeeTable{
    @Override
    public String hasLegs() {
        return "Yes";
    }

    @Override
    public String sitOn() {
        return "No";
    }

    @Override
    public String toString() {
        return "ModernChair{" +
                "hasLegs " + hasLegs() + ", " +
                "sitOn " + sitOn() +
                "}";
    }
}
