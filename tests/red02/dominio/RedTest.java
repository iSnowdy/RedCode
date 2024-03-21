package red02.dominio;
import org.junit.jupiter.api.Test;
import red.dominio.Device;
import red.dominio.Red;

import static org.junit.jupiter.api.Assertions.*;

public class RedTest {
    @Test
    void testTurnOn() {
        Device device = new Device(100);
        device.setStatus(true);
        assertTrue(device.isStatus());
    }
    @Test
    void testTurnOff() {
        Device device = new Device(100);
        device.setStatus(false);
        assertFalse(device.isStatus());
    }
    // Although we previously tested "Aparato" we have modified the class and added more methods and a constructor
    // so we must test it again

    // Now will test the network itself

    @Test
    void testAddDevice() {
        Red network = new Red(1000);
        Device TV = new Device(100);
        network.addDevice(TV);
        assertEquals(1, network.amountOfDevices());
    }
    @Test
    void testGetCurrentConsumption() {
        Device device = new Device(100);
        Red network = new Red(1000);
        network.addDevice(device);
        device.setStatus(true); // It must be on so it has consumption
        assertEquals(100, network.getCurrentConsumption());
        assertTrue(network.isStable()); // If the max is 1000 and we are using 100, it must be True (it is stable)
    }
}