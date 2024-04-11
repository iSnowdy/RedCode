package red.dominio;
import java.util.*;

public class SecSystemBasic extends SecuritySystem{

    public SecSystemBasic (Network network) {
        super(network);
    }

    @Override
    protected List<Device3> getDevicesSystem() {
        return new ArrayList<>(network.getDevices());
    }
}
