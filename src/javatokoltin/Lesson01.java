package javatokoltin;

public class Lesson01 {
    public static void main(String[] args) {

        long num1 = 10L;
        final long num2 = 10L;

        Long num3 = 1_000L;
        Person person = new Person("hun");

    }

    static public class Person {
        final String name;
        public Person(String name) {
            this.name = name;
        }
    }
}
