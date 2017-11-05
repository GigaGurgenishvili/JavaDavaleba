package No4;

import java.time.LocalDate;

public class Car {
    private String firmName;
    private String model;
    private LocalDate createDate;
    private String color;

    public Car(String firmName, String model, LocalDate createDate, String color)
    {
        this.firmName = firmName;
        this.model = model;
        this.createDate = createDate;
        this.color = color;
    }

    public Car(String firmName, String model, String color)
    {
        this.firmName = firmName;
        this.model = model;
        this.color = color;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
