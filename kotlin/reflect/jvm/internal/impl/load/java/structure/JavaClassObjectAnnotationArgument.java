package kotlin.reflect.jvm.internal.impl.load.java.structure;

import org.jetbrains.annotations.NotNull;

public interface JavaClassObjectAnnotationArgument extends JavaAnnotationArgument {
    @NotNull
    JavaType getReferencedType();
}
