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
        Device device = new Device(100);
        Red network = new Red(1000);
        network.addDevice(device);
        assertEquals(1, network.amountOfDevices());
    }
    @Test
    void testGetCurrentConsumption() {
        Device device = new Device(100);
        Red network = new Red(1000);
        network.addDevice(device);
        device.setStatus(true); // It must be on so it has any consumption
        assertEquals(100, network.getCurrentConsumption());
    }
}