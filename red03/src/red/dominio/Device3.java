package red.dominio;

public class Device3 {
    private boolean status;
    private final int consumption;
    private final String name;

    public Device3(int consumption, String name) {
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

    @Override
    public String toString() {
        return "Device name " + name + ".\nIt has a consumption of: "
                + consumption + "\nIs it on? (" + status + ")";
    }
}