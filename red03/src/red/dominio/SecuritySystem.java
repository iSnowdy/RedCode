package red.dominio;

public class SecuritySystem {
    private Network network; // Although it could be protected as well

    public SecuritySystem (Network network) {
        // Our security system will overview a power network. So its
        // constructor must receive as data input the network itself
        this.network = network;
    }

    // This method will simply shut down the first device it founds if we are over the maximum power

    public boolean doSomething () {
        System.out.println("Initializing the network's Security System");

        for (Device3 device : network.getDevices()) { // New method in network
            if (network.isStable()) {
                System.out.println("All gucci. Go on");
                break;
            }
            System.out.println("The device " + device + " will shut down due to lack of power supply");
            device.setStatus(false);
        }
        return network.isStable();
    }
}
