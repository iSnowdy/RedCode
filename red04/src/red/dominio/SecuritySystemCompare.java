package red.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SecuritySystemCompare extends SecuritySystem {

    public SecuritySystemCompare(Network network, Alarm alarm) {
        super(network, alarm);
    }

    @Override
    protected List<Device4> getDevicesSystem() {
        List<Device4> devices = new ArrayList<>(network.getDevices());
        Collections.sort(devices, new Comparator<Device4>() {
            @Override
            public int compare(Device4 device1, Device4 device2) {
                return device1.getConsumption() - device2.getConsumption();
            }
        });
        return devices;
    }
}
