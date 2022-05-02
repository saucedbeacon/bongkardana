package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

public final class ValueParameterData {
    private final boolean hasDefaultValue;
    @NotNull
    private final KotlinType type;

    public ValueParameterData(@NotNull KotlinType kotlinType, boolean z) {
        Intrinsics.checkNotNullParameter(kotlinType, "type");
        this.type = kotlinType;
        this.hasDefaultValue = z;
    }

    public final boolean getHasDefaultValue() {
        return this.hasDefaultValue;
    }

    @NotNull
    public final KotlinType getType() {
        return this.type;
    }
}
