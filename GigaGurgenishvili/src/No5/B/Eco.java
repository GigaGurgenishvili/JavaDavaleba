package No5.B;

public class Eco implements LightBulb {

    private Integer voltage;
    private String brand;

    public Eco() {
        this.voltage = 5;
        this.brand = "GermanEco";
    }

    @Override
    public Integer getVolate() {
        return voltage;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return brand + " has voltage: " + voltage;
    }
}
