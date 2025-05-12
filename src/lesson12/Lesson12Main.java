package lesson12;

public class Lesson12Main {
    public static void main(String[] args) {
        Person person = Person.Factory.newBaby("hello");
        System.out.println(person);
    }
}
