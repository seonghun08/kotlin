package javatokoltin.sample.extend;

public interface JavaFlyable {

    void fly();

    default void act() {
        System.out.println("fly");
    }
}
