package Task3;

public class task3 {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 18);
        System.out.println("person1 is"+person1);

        Person person2 = new Person();
        person2.setName("Bob");
        person2.setAge(20);
        System.out.println("person2 is"+person2);

        Person person3 = new Person(person1);
        System.out.println("person3 is"+person3);

        person3.setName("Charlie");
        person3.setAge(22);
        System.out.println("person3 is"+person3);
        System.out.println("person1 is"+person1);
    }
}
