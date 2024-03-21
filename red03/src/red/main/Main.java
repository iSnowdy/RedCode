package red.main;

import red.dominio.Device3;
import red.dominio.Network;
import red.dominio.SecuritySystem;

public class Main {
    public static void main(String[] args) {
        Device3 TV = new Device3(100, "TV");
        Device3 Oven = new Device3(200, "Oven");
        Device3 PC = new Device3(150, "PC");

        System.out.println(TV);

        System.out.println("----------");

        Network network = new Network(300);
        network.addDevice(TV);
        network.addDevice(Oven);
        network.addDevice(PC);

        TV.setStatus(true);
        Oven.setStatus(true);
        PC.setStatus(true);

        network.getCurrentConsumption();
        network.amountOfDevices();
        network.isStable();

        SecuritySystem security = new SecuritySystem(network);

        security.doSomething();
    }
}