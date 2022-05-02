package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

public final class StarProjectionForAbsentTypeParameter extends TypeProjectionBase {
    @NotNull
    private final KotlinType nullableAnyType;

    public final boolean isStarProjection() {
        return true;
    }

    public StarProjectionForAbsentTypeParameter(@NotNull KotlinBuiltIns kotlinBuiltIns) {
        Intrinsics.checkNotNullParameter(kotlinBuiltIns, "kotlinBuiltIns");
        SimpleType nullableAnyType2 = kotlinBuiltIns.getNullableAnyType();
        Intrinsics.checkNotNullExpressionValue(nullableAnyType2, "kotlinBuiltIns.nullableAnyType");
        this.nullableAnyType = nullableAnyType2;
    }

    @NotNull
    public final Variance getProjectionKind() {
        return Variance.OUT_VARIANCE;
    }

    @NotNull
    public final KotlinType getType() {
        return this.nullableAnyType;
    }

    @NotNull
    public final TypeProjection refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}
