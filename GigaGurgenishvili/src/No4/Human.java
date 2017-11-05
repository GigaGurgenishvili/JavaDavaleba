package No4;

import java.time.LocalDate;

public class Human {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Car car;

    public Human(String firstName, String lastName, LocalDate birthDate, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.car = car;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String toString()
    {
        return firstName + " " + lastName + " has a " + car.getColor() + " " + car.getFirmName() +  " " + car.getModel();
    }
}
