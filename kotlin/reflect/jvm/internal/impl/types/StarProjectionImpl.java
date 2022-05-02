package kotlin.reflect.jvm.internal.impl.types;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

public final class StarProjectionImpl extends TypeProjectionBase {
    @NotNull
    private final Lazy _type$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new StarProjectionImpl$_type$2(this));
    /* access modifiers changed from: private */
    @NotNull
    public final TypeParameterDescriptor typeParameter;

    public final boolean isStarProjection() {
        return true;
    }

    public StarProjectionImpl(@NotNull TypeParameterDescriptor typeParameterDescriptor) {
        Intrinsics.checkNotNullParameter(typeParameterDescriptor, "typeParameter");
        this.typeParameter = typeParameterDescriptor;
    }

    @NotNull
    public final Variance getProjectionKind() {
        return Variance.OUT_VARIANCE;
    }

    private final KotlinType get_type() {
        return (KotlinType) this._type$delegate.getValue();
    }

    @NotNull
    public final KotlinType getType() {
        return get_type();
    }

    @NotNull
    public final TypeProjection refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}
