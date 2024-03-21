package red.dominio;

import java.util.ArrayList;
import java.util.List;

public class Red {
    private final List<Device> devices; // final is the means to say that we have a certain number of devices
    private final int maxPower;

    public Red (int maxPower) {
        this.devices = new ArrayList<Device>();
        // We set up a property to store methods from the "Device" class. We still don't have any kind of data in there
        // It is just the structure that the List is going to have. Just like a mold.
        // So using the List we will be able to know everything about "Aparato". The consumption, if its on or off ...
        this.maxPower = maxPower;
    }

    // This way we will add devices to the ArrayList. But we must call the "Device" class so then the constructor
    // can create the ArrayList
    public void addDevice(Device device) {
        devices.add(device); // OOP encapsulation term - we make it so adding devices is only done via addDevice
    }
    // We count how many devices are in our list
    public int amountOfDevices() {
        return devices.size();
    }

    /* The other getCurrentConsumption we had in "Device" only returned the value of individual devices. But we need to
     somehow know the total amount. Like this we will go through every device we have connected, meaning in our List,
     and add its consumption value calling "Device" to a new int that will be the summ of them./*
     */
    public int getCurrentConsumption() {
        int currentConsumption = 0;

        for (Device device : devices) currentConsumption += device.getCurrentConsumption();

        return currentConsumption;
    }
    // We are also told that every network of energy has a certain max power input
    public boolean isStable() {
        return getCurrentConsumption() <= maxPower;
    }
}