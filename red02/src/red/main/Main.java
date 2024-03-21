package red.main;

import red.dominio.Device;
import red.dominio.Red;

public class Main {
    public static void main(String[] args) {

        Device TV = new Device(200);
        Device Oven = new Device(400);
        Red network = new Red(200);
        network.addDevice(TV);
        network.addDevice(Oven);
        TV.setStatus(true);
        Oven.setStatus(true);

        System.out.println("Is the TV on? (" + TV.isStatus() + ") If so, what is its consumption? " + TV.getConsumption());
        System.out.println("What is the current total consumption? " + network.getCurrentConsumption());
        System.out.println("How many devices do we have in our network? " + network.amountOfDevices());
        System.out.println("Is the network stable? " + network.isStable());

        System.out.println("--------");

        Oven.setStatus(false);

        System.out.println("And now, what is the current total consumption? " + network.getCurrentConsumption());
        System.out.println("Now that we have one less device on, is the network stable? " + network.isStable());

        System.out.println("--------");

    }
}