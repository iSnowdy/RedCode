package red.dominio;

public class Device4Critical extends Device4 {
    public Device4Critical (int consumption, String name) {
        super(consumption, name);
    }

    @Override
    public void turnOffRequest (){
        System.out.println("Critical Device. Petition denied\n" + this.toString());
    }
}
