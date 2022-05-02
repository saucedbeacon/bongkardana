package io.reactivex.internal.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import o.RedDotDrawable;

public enum ArrayListSupplier implements Callable<List<Object>>, RedDotDrawable<Object, List<Object>> {
    INSTANCE;

    public static <T> Callable<List<T>> asCallable() {
        return INSTANCE;
    }

    public static <T, O> RedDotDrawable<O, List<T>> asFunction() {
        return INSTANCE;
    }

    public final List<Object> call() throws Exception {
        return new ArrayList();
    }

    public final List<Object> apply(Object obj) throws Exception {
        return new ArrayList();
    }
}
