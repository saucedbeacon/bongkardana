package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import org.jetbrains.annotations.NotNull;

public interface NameResolver {
    @NotNull
    String getQualifiedClassName(int i);

    @NotNull
    String getString(int i);

    boolean isLocalClassName(int i);
}
