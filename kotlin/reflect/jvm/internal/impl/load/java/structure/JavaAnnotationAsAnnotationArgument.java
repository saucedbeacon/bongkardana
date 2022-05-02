package kotlin.reflect.jvm.internal.impl.load.java.structure;

import org.jetbrains.annotations.NotNull;

public interface JavaAnnotationAsAnnotationArgument extends JavaAnnotationArgument {
    @NotNull
    JavaAnnotation getAnnotation();
}
