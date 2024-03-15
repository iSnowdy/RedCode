package red01.dominio;

import java.util.ArrayList;
import java.util.List;

public class Red {
    private final List<Aparato> devices; // final is the means to say that we have a certain number of devices
    private final int maxPower;

    public Red (int maxPower) {
        this.devices = new ArrayList<Aparato>();
        // We set up a property to store methods from the "Aparato" class. We still don't have any kind of data in there
        // It is just the structure that the List is going to have. Just like a mold.
        this.maxPower = maxPower;
    }

    // This way we will add devices to the ArrayList. But we must call the "Aparato" class so then the constructor
    // can create the ArrayList
    public void addDevice(Aparato device) {
        devices.add(device);
    }
    // We count how many devices are in our list
    public int amountOfDevices() {
        return devices.size();
    }

    /* The other getCurrentConsumption we had in "Aparato" only returned the value of individual devices. But we need to
     somehow know the total amount. Like this we will go through every device we have connected, meaning in our List,
     and add its consumption value calling "Aparato" to a new int that will be the summ of them./*
     */
    public int getCurrentConsumption() {
        int currentConsumption = 0;

        for (Aparato device : devices) {
            currentConsumption += device.getCurrentConsumption();
        }
        return currentConsumption;
    }
    // We are also told that every network of energy has a certain max power input
    public boolean isStable() {
        return getCurrentConsumption() <= maxPower;
    }
}
