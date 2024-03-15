package red.main;
import red.dominio.Aparato;

public class Main {
    public static void main(String[] args) {
        Aparato TV = new Aparato();
        TV.setTurnOn();
        System.out.println("Is this working? " + TV.getTurnOn());
        TV.setTurnOff();
        System.out.println("And now? " + TV.getTurnOn());

        // This could be a way to test the "Aparato" class. But if we want to follow the TDD method,
        // there's another way
        // We would first use JUNIT and then come here and run the code using main
    }
}