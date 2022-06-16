package kz.balm.creational_pattents.abstract_factory.example1.factories;

import kz.balm.creational_pattents.abstract_factory.example1.buttorns.Button;
import kz.balm.creational_pattents.abstract_factory.example1.buttorns.MacOSButton;
import kz.balm.creational_pattents.abstract_factory.example1.checkboxes.Checkbox;
import kz.balm.creational_pattents.abstract_factory.example1.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
