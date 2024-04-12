package red.dominio;
import java.util.*;

public class SecSystemBasic extends SecuritySystem{

    public SecSystemBasic (Network network, Alarm alarm) {
        super(network, alarm);
    }

    @Override
    protected List<Device4> getDevicesSystem() {
        return new ArrayList<>(network.getDevices());
    }
}
