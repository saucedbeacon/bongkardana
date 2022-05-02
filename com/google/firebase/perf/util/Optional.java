package com.google.firebase.perf.util;

import java.util.NoSuchElementException;

public final class Optional<T> {
    private final T value;

    private Optional() {
        this.value = null;
    }

    private Optional(T t) {
        if (t != null) {
            this.value = t;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }

    public static <T> Optional<T> absent() {
        return new Optional<>();
    }

    public static <T> Optional<T> of(T t) {
        return new Optional<>(t);
    }

    public static <T> Optional<T> fromNullable(T t) {
        return t == null ? absent() : of(t);
    }

    public final T get() {
        T t = this.value;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean isAvailable() {
        return this.value != null;
    }
}
