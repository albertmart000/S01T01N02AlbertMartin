package S01T01N02Ex01AlbertMartin;

public class Phone {

    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String call (String phoneNumber){
        return "s'està trucant al telèfon " + phoneNumber;
    }
}
