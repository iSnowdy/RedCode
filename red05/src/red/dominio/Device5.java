package red.dominio;

public class Device5 {
    private boolean status;
    private final int consumption;
    private final String name;

    public Device5(int consumption, String name) {
        this.consumption = consumption;
        this.name = name;
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
    public int getCurrentConsumption() {
        if (status) {
            return consumption;
        }
        return 0;
    }

    public String getDeviceName () {
        return name;
    }

    @Override
    public String toString() {
        return name + " has a consumption of: "
                + consumption + "\nIs it on? (" + status + ") \n";
    }

    public void turnOffRequest () {
        System.out.println("Turn off request has been accepted\n");
        status = false;
    }
}