public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Иван", "Иванович", "Петров", 25);
        person1.printName();

        Person person2 = new Person("Мария", "Сергеевна", "Коржавина", 34);
        person2.printName();

        person1.setFirstName("Олег");
        person1.printName();

        System.out.println(person2 + ", " + person2.getYearOfBirth() + " г.р.");
    }
}
