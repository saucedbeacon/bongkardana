package kotlin.reflect.jvm.internal.impl.load.java.structure;

import org.jetbrains.annotations.Nullable;

public interface JavaLiteralAnnotationArgument extends JavaAnnotationArgument {
    @Nullable
    Object getValue();
}
