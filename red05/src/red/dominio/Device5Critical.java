package red.dominio;

public class Device5Critical extends Device5 {
    public Device5Critical(int consumption, String name) {
        super(consumption, name);
    }

    @Override
    public void turnOffRequest (){
        System.out.println("Critical Device. Petition denied\n" + this.toString());
    }
}
