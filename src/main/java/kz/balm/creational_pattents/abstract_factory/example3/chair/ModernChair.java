package kz.balm.creational_pattents.abstract_factory.example3.chair;

public class ModernChair implements Chair {
    @Override
    public String hasLegs() {
        return "No";
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
