import sample.Person;

public class Lesson03 {
    public static void main(String[] args) {

    }

    // public static void printAgeIfPerson(Object o) {
    //     if (o instanceof Person) {
    //         Person person = (Person) o;
    //         System.out.println(person.name());
    //     }
    // }

    public static void printAgeIfPerson(Object o) {
        if (o instanceof Person(_, int age)) {
            System.out.println(age);
        }
    }

    public static boolean printAgeIsNotPerson(Object o) {
        return !(o instanceof Person(_, _));
    }

    public static String printToFormat(Object o) {
        if (o instanceof Person(String name, int age)) {
            return String.format("사람의 이름은 %s, 나이는 %d세 입니다.", name, age);
        }
        return null;
    }

    public static String printToBuilder(Object o) {
        if (o instanceof Person(String name, int age)) {
            StringBuilder sb = new StringBuilder();
            sb.append("사람의 이름은 ").append(name).append(", ");
            sb.append("나이는 ").append(name).append("세 입니다.");
            return sb.toString();
        }
        return null;
    }
}
