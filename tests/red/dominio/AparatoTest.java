package red.dominio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AparatoTest {
    @Test
    void testTurnOn() {
        Aparato device = new Aparato();
        device.setTurnOn();
        assertEquals(true, device.getTurnOn());
        // assertTrue(device.getTurnOn());
    }
    @Test
    void testTurnOff() {
        Aparato device = new Aparato();
        device.setTurnOff();
        assertEquals(false, device.getTurnOn());
        // assertFalse(device.getTurnOn());
    }
}