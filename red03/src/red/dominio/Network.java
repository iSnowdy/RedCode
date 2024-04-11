package red.dominio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Network {
    private final List<Device3> devices;
    private final int maxPower;

    public Network(int maxPower) {
        this.devices = new ArrayList<Device3>();
        this.maxPower = maxPower;
    }

    public void addDevice(Device3 device) {
        devices.add(device);
    }
    public int amountOfDevices() {
        return devices.size();
    }

    public int getCurrentConsumption() {
        int currentConsumption = 0;

        for (Device3 device : devices) currentConsumption += device.getCurrentConsumption();

        return currentConsumption;
    }
    public boolean isStable() {
        return getCurrentConsumption() <= maxPower;
    }

    public Collection<Device3> getDevices() {
        return devices;
    }
}