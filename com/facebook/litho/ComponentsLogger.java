package com.facebook.litho;

import androidx.annotation.Nullable;
import java.util.Map;
import java.util.Set;
import o.startNestedScroll;

public interface ComponentsLogger {

    public enum LogLevel {
        WARNING,
        ERROR,
        FATAL
    }

    startNestedScroll getMax();

    Set<String> getMin();

    @Nullable
    Map<String, String> length();

    boolean setMax();

    Set<String> setMin();
}
