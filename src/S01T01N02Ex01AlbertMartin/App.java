package S01T01N02Ex01AlbertMartin;

public class App {

    public static void main(String[] args) {

        //Creem un objecte Smartphone-
        Smartphone smartphone = new Smartphone("Nokia","3310");

        //Cridem als metodes creats a les interfícies i al mètode creat a la Classe Phone.
        System.out.println("Des del smartphone " + smartphone.getBrand() +
                " " + smartphone.getModel() + " " + smartphone.call("(98) 765 43 21."));

        System.out.println("Des del smartphone " + smartphone.getBrand() +
                " " + smartphone.getModel() + " " + smartphone.takePhoto());

        System.out.println(smartphone.ringAlarm() + " del smartphone " +
                smartphone.getBrand() + " " + smartphone.getModel() + "." );
    }

}