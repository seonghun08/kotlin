package javatokoltin.sample;

import org.jetbrains.annotations.NotNull;

public record Person(String name, int age) {

    public Person(@NotNull String name) {
        this(name, 20);
    }

    @Override
    @NotNull // <-> @Nullable
    public String name() {
        return name;
    }
}
