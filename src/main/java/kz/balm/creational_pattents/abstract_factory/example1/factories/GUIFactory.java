package kz.balm.creational_pattents.abstract_factory.example1.factories;

import kz.balm.creational_pattents.abstract_factory.example1.buttorns.Button;
import kz.balm.creational_pattents.abstract_factory.example1.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
