public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Иван", "Иванович", "Петров", 1985);
        person1.printName();

        Person person2 = new Person("Мария", "Сергеевна", "Коржавина", 1987);
        person2.printName();
        person2.setFirstName("Олег");
        person2.printName();

        System.out.println(person2.toString() + ", " + person2.getAge() + " г.р.");

    }

}
