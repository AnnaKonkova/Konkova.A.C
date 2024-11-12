package abstractFactory;

import abstractFactory.app.Application;
import abstractFactory.factories.ApplianceFactory;
import abstractFactory.factories.LG.LGApplianceFactory;
import abstractFactory.factories.samsung.SamsungApplianceFactory;

public class Demo {
    private static Application configureApplication() {
        Application app;
        ApplianceFactory factory;
        String firmName = System.getProperty("os.name").toLowerCase();
        if (firmName.contains("LG")) {
            factory = new LGApplianceFactory();
        } else {
            factory = new SamsungApplianceFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.actions();
    }
}