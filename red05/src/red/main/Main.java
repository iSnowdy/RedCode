package red.main;

import red.dominio.*;

public class Main {
    public static void main(String[] args) {
        Device5 TV = new Device5(35, "TV");
        Device5 PC = new Device5(30, "PC");

        TV.setStatus(true);
        PC.setStatus(true);

        System.out.println("--------------------");

        Network network = new Network(40);
        network.addDevice(TV);
        network.addDevice(PC);

        System.out.println("The current consumption of this network is: " + network.getCurrentConsumption());
        System.out.println("How many devices do we have on this network? " + network.amountOfDevices());
        System.out.println("Is this network stable? " + network.isStable());

        System.out.println("--------------------");
        System.out.println("Comparison Abstract Security System");

        SecuritySystem comparisonSystem = new SecuritySystemCompare(network, new SoundAlarm());
        comparisonSystem.actualStatus();

        System.out.println("--------------------");

        System.out.println("Is the network stable? " + network.isStable());
        System.out.println("Final status: " + network);


    }
}