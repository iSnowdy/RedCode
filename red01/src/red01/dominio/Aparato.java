package red01.dominio;

public class Aparato {
    private boolean turnOn;
    // true: turned on ~ false: turned off
    // Now that we have a property in the code, we have to implement their SETs and GETs
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