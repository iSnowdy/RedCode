package red.dominio;

public class Aparato {
    private boolean turnOn; // It is set as private so external methods can't change it. Only through the Set/Get from here
    // true: turned on ~ false: turned off
    // Now that we have a property in the code, we have to implement their SETs and GETs
    // It should have a constructor. We didn't add it on purpose
    public boolean getTurnOn() {
        return turnOn;
    }
    public void setTurnOn() {
        this.turnOn = true;
    }
    public void setTurnOff() {
        this.turnOn = false;
    }
}