package red.dominio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Network {
    private final List<Device3> device3s;
    private final int maxPower;

    public Network(int maxPower) {
        this.device3s = new ArrayList<Device3>();
        this.maxPower = maxPower;
    }

    public void addDevice(Device3 device3) {
        device3s.add(device3);
    }
    public int amountOfDevices() {
        return device3s.size();
    }

    public int getCurrentConsumption() {
        int currentConsumption = 0;

        for (Device3 device3 : device3s) currentConsumption += device3.getCurrentConsumption();

        return currentConsumption;
    }
    public boolean isStable() {
        return getCurrentConsumption() <= maxPower;
    }

    public Collection<Device3> getDevices() {
        return device3s;
    }
}