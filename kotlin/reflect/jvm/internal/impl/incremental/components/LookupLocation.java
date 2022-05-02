package kotlin.reflect.jvm.internal.impl.incremental.components;

import org.jetbrains.annotations.Nullable;

public interface LookupLocation {
    @Nullable
    LocationInfo getLocation();
}
