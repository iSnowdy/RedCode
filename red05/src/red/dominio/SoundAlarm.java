package red.dominio;

public class SoundAlarm implements Alarm {

    @Override
    public void activate() {
        System.out.println("Brrrr brrr brr");
    }
}
