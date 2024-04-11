package red.main;

import red.dominio.*;

public class Main {
    public static void main(String[] args) {
        Device3 TV = new Device3(100, "TV");
        Device3 Oven = new Device3(200, "Oven");
        Device3 PC = new Device3(150, "PC");

        System.out.println(TV);

        System.out.println("--------------------");

        Network network = new Network(300);
        network.addDevice(TV);
        network.addDevice(Oven);
        network.addDevice(PC);

        TV.setStatus(true);
        Oven.setStatus(true);
        PC.setStatus(true);

        System.out.println("The current consumption of this network is: " + network.getCurrentConsumption());
        System.out.println("How many devices do we have on this network? " + network.amountOfDevices());
        System.out.println("Is this network stable? " + network.isStable());

        /*
        System.out.println("--------------------");
        System.out.println("Non abstract Securiy System");

        SecuritySystemOG security = new SecuritySystemOG(network);
        security.doSomething();
        */


        System.out.println("--------------------");
        System.out.println("Basic Abstract Security System");

        SecuritySystem secSystem = new SecSystemBasic(network);
        secSystem.actualStatus();


        /*
        System.out.println("--------------------");
        System.out.println("Comparison Abstract Security System");

        SecuritySystem secSystemComparison = new SecuritySystemCompare(network);
        secSystemComparison.actualStatus();

         */
    }
}