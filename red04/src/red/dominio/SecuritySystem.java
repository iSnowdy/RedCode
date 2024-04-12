package red.dominio;

import java.util.List;

public abstract class SecuritySystem {
    // We can not instance classes that are abstract (meaning we can't do 'new ...')
    // It will have at least one class that will only be the header (class name). Without a body.
    // This class without a body will be able to do something thanks to a child class that will extend the
    // abstract class

    protected Network network;
    protected Alarm alarm;

    public SecuritySystem (Network network, Alarm alarm) {
        this.network = network;
        this.alarm = alarm;
    }

    public boolean actualStatus () {
        System.out.println("Initializing the network's Security System");

        for (Device4 device : network.getDevices()) { // New method in network
            if (network.isStable()) {
                System.out.println("All gucci. Go on");
                break;
            }
            System.out.println("The " + device.getDeviceName() + " will shut down due to lack of power supply");
            device.turnOffRequest();
        }

        boolean networkStatus = network.isStable();
        if (!networkStatus) alarm.activeAlarm();

        return network.isStable();
    }

    protected abstract List<Device4> getDevicesSystem();
}
