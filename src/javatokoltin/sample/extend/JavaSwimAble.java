package javatokoltin.sample.extend;

public interface JavaSwimAble {

    default void act() {
        System.out.println("swim");
    }
}
