package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import org.jetbrains.annotations.NotNull;

public interface Annotated {
    @NotNull
    Annotations getAnnotations();
}
