package kz.balm.creational_pattents.abstract_factory.example3.chair;

public class VictorianChair implements Chair{
    @Override
    public String hasLegs() {
        return "Yes";
    }

    @Override
    public String sitOn() {
        return "Yes";
    }

    @Override
    public String toString() {
        return "ModernChair{" +
                "hasLegs " + hasLegs() + ", " +
                "sitOn " + sitOn() +
                "}";
    }
}
