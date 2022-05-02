package kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;

public interface TypeWithEnhancement {
    @NotNull
    KotlinType getEnhancement();

    @NotNull
    UnwrappedType getOrigin();
}
