package red.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SecuritySystemCompare extends SecuritySystem {

    public SecuritySystemCompare(Network network) {
        super(network);
    }

    @Override
    protected List<Device3> getDevicesSystem() {
        List<Device3> devices = new ArrayList<>(network.getDevices());
        // Para proteger la cantidad de aparatos se hace una copia defensiva
        Collections.sort(devices, new Comparator<Device3>() {
            // Como queremos ordenar objetos, hemos de utilizar algo que nos permita comparar objetos
            // .sort por sí mismo no puede ordenadar objetos; sólo enteros etc
            @Override // Comparator siempre se ha de hacer Override porque de por sí solo no contiene objetos
            public int compare(Device3 device1, Device3 device2) { // Comparamos los 2 objetos creados a partir de Device
                return device1.getConsumption() - device2.getConsumption(); // El criterio de comparación es este
            }
        });

        return devices;
    }
}
