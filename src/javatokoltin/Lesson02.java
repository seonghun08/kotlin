package javatokoltin;

public class Lesson02 {
    public static void main(String[] args) {
        Lesson02 main = new Lesson02();
        String s1 = "Aaa";
        String s2 = "Baa";

        System.out.println(main.startsWithA1(s1));
        System.out.println(main.startsWithA1(s2));
        System.out.println(main.startsWithA2(s1));
        System.out.println(main.startsWithA2(s2));
        System.out.println(main.startsWithA3(s1));
        System.out.println(main.startsWithA3(s2));
    }

    public boolean startsWithA1(String s) {
        if (s == null) {
            throw new IllegalArgumentException("null");
        }
        return s.startsWith("A");
    }

    public Boolean startsWithA2(String s) {
        if (s == null) {
            return null;
        }
        return s.startsWith("A");
    }

    public boolean startsWithA3(String s) {
        if (s == null) {
            return false;
        }
        return s.startsWith("A");
    }
}
