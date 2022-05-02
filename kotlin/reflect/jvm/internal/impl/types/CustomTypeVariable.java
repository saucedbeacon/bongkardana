package kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;

public interface CustomTypeVariable {
    boolean isTypeVariable();

    @NotNull
    KotlinType substitutionResult(@NotNull KotlinType kotlinType);
}
