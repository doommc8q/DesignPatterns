package kz.balm.creational_pattents.abstract_factory.example1.app;

import kz.balm.creational_pattents.abstract_factory.example1.buttorns.Button;
import kz.balm.creational_pattents.abstract_factory.example1.checkboxes.Checkbox;
import kz.balm.creational_pattents.abstract_factory.example1.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
