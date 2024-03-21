package red.dominio;

public class Device {
    private boolean status;
    private final int consumption; // We assume that the consumption of a device won't change over time

    public Device(int consumption) { // Now we do have a constructor
        this.consumption = consumption; // This will allow the declaration of consumption as final
    }

    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) { // We've joined the turnOn and turnOff methods in one using a boolean as input
        this.status = status;
    }

    public int getConsumption() {
        return consumption;
    }
    public int getCurrentConsumption() { // Only if the device is turned on, it will consume energy
        if (status) {
            return consumption;
        }
        return 0;
    }
}