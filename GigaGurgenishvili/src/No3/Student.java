package No3;

import java.time.LocalDate;

public class Student
{
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String university;


    public Student(String firstName, String lastName, LocalDate birthDate, String university)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.university = university;
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

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int Age()
    {
        LocalDate age = LocalDate.now();

        age = age.minusYears(birthDate.getYear());

        if(age.getMonthValue() < birthDate.getMonthValue())
        {
            return age.getYear() - 1;
        }
        if(age.getMonthValue() == birthDate.getMonthValue())
        {
            if(age.getDayOfMonth() > birthDate.getDayOfMonth())
            {
                return age.getYear() - 1;
            }
        }
        return age.getYear();
    }

    public String getInfo()
    {
        return firstName + " " + lastName + " " + birthDate.toString() + " " + university;
    }

    public static void main(String[] args)
    {
        Student a = new Student("Giga", "Gurgenishvili", LocalDate.of(1996, 2, 23), "Sangu");

        System.out.println("Info: " + a.getInfo());
        System.out.println("Age: " + a.Age());
    }
}
