package kz.balm.creational_pattents.abstract_factory.example1.buttorns;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}