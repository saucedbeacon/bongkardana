package com.facebook.stetho.common;

import java.util.ArrayList;

public final class ArrayListAccumulator<E> extends ArrayList<E> implements Accumulator<E> {
    public final void store(E e) {
        add(e);
    }
}
