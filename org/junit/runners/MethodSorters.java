package org.junit.runners;

import java.lang.reflect.Method;
import java.util.Comparator;
import o.QwertyKeyboard;

public enum MethodSorters {
    NAME_ASCENDING(QwertyKeyboard.QwertType.setMin),
    JVM((String) null),
    DEFAULT(QwertyKeyboard.QwertType.setMax);
    
    private final Comparator<Method> comparator;

    private MethodSorters(Comparator<Method> comparator2) {
        this.comparator = comparator2;
    }

    public final Comparator<Method> getComparator() {
        return this.comparator;
    }
}
