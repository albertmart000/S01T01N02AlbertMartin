package S01T01N02Ex01AlbertMartin;

public class Smartphone extends Phone implements Camera, Watch{

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public String takePhoto() {
        return "s'està fent una foto.";
    }

    @Override
    public String ringAlarm() {
        return "Està sonant l'alarma";

    }

}

