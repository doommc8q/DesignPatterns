package kz.balm.creational_pattents.abstract_factory.example1;

import kz.balm.creational_pattents.abstract_factory.example1.app.Application;
import kz.balm.creational_pattents.abstract_factory.example1.factories.GUIFactory;
import kz.balm.creational_pattents.abstract_factory.example1.factories.MacOSFactory;
import kz.balm.creational_pattents.abstract_factory.example1.factories.WindowsFactory;

public class Demo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
