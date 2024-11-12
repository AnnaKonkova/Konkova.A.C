package abstractFactory;

import abstractFactory.factories.ApplianceFactory;
import abstractFactory.factories.LG.LGApplianceFactory;
import abstractFactory.factories.samsung.SamsungApplianceFactory;
import abstractFactory.interfaces.Microwave;
import abstractFactory.interfaces.Refrigerator;
import abstractFactory.interfaces.WashingMachine;

public class Main {
    public static void main(String[] args) {
        ApplianceFactory lgFactory = new LGApplianceFactory();
        Refrigerator lgFridge = lgFactory.createRefrigerator();
        WashingMachine lgWashingMachine = lgFactory.createWashingMachine();
        Microwave lgMicrowave = lgFactory.createMicrowave();

        lgFridge.cool();
        lgWashingMachine.wash();
        lgMicrowave.heat();

        System.out.println();

        ApplianceFactory samsungFactory = new SamsungApplianceFactory();
        Refrigerator samsungFridge = samsungFactory.createRefrigerator();
        WashingMachine samsungWashingMachine = samsungFactory.createWashingMachine();
        Microwave samsungMicrowave = samsungFactory.createMicrowave();

        samsungFridge.cool();
        samsungWashingMachine.wash();
        samsungMicrowave.heat();
    }
}