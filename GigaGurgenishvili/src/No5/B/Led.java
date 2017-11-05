package No5.B;

public class Led implements LightBulb {

    private Integer voltage;
    private String brand;

    public Led() {
        this.voltage = 10;
        this.brand = "TurkishLed";
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
