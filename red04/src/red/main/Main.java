package red.main;

import red.dominio.*;

public class Main {
    public static void main(String[] args) {
        Device4 TV = new Device4(100, "TV");
        Device4 Heater = new Device4Critical(1000, "Heater");
        Device4 Oven = new Device4(200, "Oven");
        Device4 PC = new Device4(150, "PC");

        System.out.println(TV);
        System.out.println(Heater);

        System.out.println("--------------------");

        Network network = new Network(300);
        network.addDevice(TV);
        network.addDevice(Heater);
        network.addDevice(Oven);
        network.addDevice(PC);

        TV.setStatus(true);
        Oven.setStatus(true);
        PC.setStatus(true);
        Heater.setStatus(true);

        System.out.println("The current consumption of this network is: " + network.getCurrentConsumption());
        System.out.println("How many devices do we have on this network? " + network.amountOfDevices());
        System.out.println("Is this network stable? " + network.isStable());


        System.out.println("--------------------");
        System.out.println("Basic Abstract Security System");

        SecuritySystem secSystem = new SecSystemBasic(network, new Alarm());
        secSystem.actualStatus();

        System.out.println("Final state:\n" + network);

        /*
        System.out.println("--------------------");
        System.out.println("Comparison Abstract Security System");

        SecuritySystem secSystemComparison = new SecuritySystemCompare(network);
        secSystemComparison.actualStatus();

         */
    }
}