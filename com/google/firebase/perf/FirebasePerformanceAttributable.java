package com.google.firebase.perf;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

public interface FirebasePerformanceAttributable {
    public static final int MAX_ATTRIBUTE_KEY_LENGTH = 40;
    public static final int MAX_ATTRIBUTE_VALUE_LENGTH = 100;
    public static final int MAX_TRACE_CUSTOM_ATTRIBUTES = 5;
    public static final int MAX_TRACE_NAME_LENGTH = 100;

    @Nullable
    String getAttribute(@NonNull String str);

    @NonNull
    Map<String, String> getAttributes();

    void putAttribute(@NonNull String str, @NonNull String str2);

    void removeAttribute(@NonNull String str);
}
