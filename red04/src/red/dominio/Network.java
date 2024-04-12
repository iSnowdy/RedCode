package red.dominio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Network {
    private final List<Device4> devices;
    private final int maxPower;

    public Network(int maxPower) {
        this.devices = new ArrayList<Device4>();
        this.maxPower = maxPower;
    }

    public void addDevice(Device4 device) {
        devices.add(device);
    }
    public int amountOfDevices() {
        return devices.size();
    }

    public int getCurrentConsumption() {
        int currentConsumption = 0;

        for (Device4 device : devices) currentConsumption += device.getCurrentConsumption();

        return currentConsumption;
    }
    public boolean isStable() {
        return getCurrentConsumption() <= maxPower;
    }

    public Collection<Device4> getDevices() {
        return devices;
    }

    @Override
    public String toString() {
        return "Network Devices = " + devices;
    }
}