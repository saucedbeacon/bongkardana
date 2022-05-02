package kotlin.reflect.jvm.internal.impl.load.java.structure;

import org.jetbrains.annotations.NotNull;

public interface JavaArrayType extends JavaType {
    @NotNull
    JavaType getComponentType();
}
