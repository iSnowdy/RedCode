package red.dominio;

public class MinDeviceCrit extends Device5Critical {

    private final int minConsumption;
    private int currentConsumption;

    public MinDeviceCrit(int consumption, String name, int minConsumption) {
        super(consumption, name);
        this.minConsumption = minConsumption;
    }

    @Override
    public void turnOffRequest() {
        if (getEncendido()) {
            currentConsumption = minConsumption;
            System.out.println("Low energy mode ON " + toString());
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Current consumption is: " + currentConsumption;
    }

    public boolean getEncendido() {
        return currentConsumption > 0;
    }

    @Override
    public int getCurrentConsumption() {
        return currentConsumption;
    }
}
