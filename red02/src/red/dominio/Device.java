package red.dominio;

public class Device {
    private boolean status;
    private final int consumption;

    public Device(int consumption) {
        this.consumption = consumption;
    }

    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
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