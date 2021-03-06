import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {

    private String firstName;
    private String middleName;
    private String lastName;
    private int age;

    public Person(String firstName, String middleName, String lastName, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }

    public void printName() {
        System.out.println("Имя: " + firstName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() >= 2) {
            this.firstName = firstName;
        }
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfBirth() {
        Calendar dt = new GregorianCalendar();
        int year = dt.get(Calendar.YEAR);
        return (year - age);
    }

    @Override
    public String toString() {
        return "ФИО: " + firstName + " " + middleName + " " + lastName;
    }
}
