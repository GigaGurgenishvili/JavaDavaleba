package No4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {
        Human a = new Human("Giga", "Gurgenishvili", LocalDate.of(1996, 2, 23), new Car("BMW", "M3", LocalDate.of(2000, 1, 8), "Silver"));

        System.out.println(a.toString());
    }
}
