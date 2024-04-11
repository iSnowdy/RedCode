package red.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SecuritySystemCompare extends SecuritySystem {

    public SecuritySystemCompare(Network network) {
        super(network);
    }

    @Override
    protected List<Device3> getDevicesSystem() {
        List<Device3> devices = new ArrayList<>(network.getDevices());
        Collections.sort(devices, new Comparator<Device3>() {
            @Override
            public int compare(Device3 device1, Device3 device2) {
                return device1.getConsumption() - device2.getConsumption();
            }
        });
        return devices;
    }
}
