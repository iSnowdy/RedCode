package red.dominio;

import java.util.List;

public abstract class SecuritySystem {
    // We can not instance classes that are abstract (meaning we can't do 'new ...')
    // It will have at least one class that will only be the header (class name). Without a body.
    // This class without a body will be able to do something thanks to a child class that will extend the
    // abstract class

    protected Network network;

    public SecuritySystem (Network network) {
        this.network = network;
    }

    public boolean actualStatus () {
        System.out.println("Initializing the network's Security System");

        for (Device3 device : network.getDevices()) { // New method in network
            if (network.isStable()) {
                System.out.println("All gucci. Go on");
                break;
            }
            System.out.println("The " + device.getDeviceName() + " will shut down due to lack of power supply");
            device.setStatus(false);
        }
        return network.isStable();
    }

    protected abstract List<Device3> getDevicesSystem();
}
