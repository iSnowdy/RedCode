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
    protected List<Device5> getDevicesSystem() {
        List<Device5> devices = new ArrayList<>(network.getDevices());
        Collections.sort(devices, new Comparator<Device5>() {
            @Override
            public int compare(Device5 device1, Device5 device2) {
                return device1.getConsumption() - device2.getConsumption();
            }
        });
        return devices;
    }
}
