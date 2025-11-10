package javatokoltin.sample;

public class JavaPerson {

    private final String name;
    private int age;

    public JavaPerson(String name, int age) {
        validate(age);
        this.name = name;
        this.age = age;
    }

    private void validate(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException(
                    String.format("나이는 %d일 수 없습니다.", age));
        }
    }

    public boolean isAdult() {
        return this.age >= 20;
    }

    public JavaPerson(String name) {
        this.name = name;
        this.age = 1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
