package kz.balm.creational_pattents.abstract_factory.example1.factories;

import kz.balm.creational_pattents.abstract_factory.example1.buttorns.Button;
import kz.balm.creational_pattents.abstract_factory.example1.buttorns.WindowsButton;
import kz.balm.creational_pattents.abstract_factory.example1.checkboxes.Checkbox;
import kz.balm.creational_pattents.abstract_factory.example1.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}