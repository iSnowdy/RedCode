package red.dominio;

public class SecuritySystemOG {
    // We can not instance classes that are abstract (meaning we can't do 'new ...')
    // It will have at least one class that will only be the header (class name). Without a body.
    // This class without a body will be able to do something thanks to a child class that will extend the
    // abstract class


    private Network network; // Although it could be protected as well

    public SecuritySystemOG(Network network) {
        // Our security system will overview a power network. So its
        // constructor must receive as data input the network itself
        this.network = network;
    }

    // This method will simply shut down the first device it founds if we are over the maximum power

    public boolean doSomething () {
        System.out.println("Initializing the network's Security System");

        for (Device4 device : network.getDevices()) { // New method in network
            if (network.isStable()) {
                System.out.println("All gucci. Go on");
                break;
            }
            System.out.println("The " + device.getDeviceName() + " will shut down due to lack of power supply");
            device.setStatus(false);
        }



        return network.isStable();
    }
}
