package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.Collection;
import java.util.List;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class CapturedTypeConstructorImpl implements CapturedTypeConstructor {
    @Nullable
    private NewCapturedTypeConstructor newTypeConstructor;
    @NotNull
    private final TypeProjection projection;

    @Nullable
    public final Void getDeclarationDescriptor() {
        return null;
    }

    public final boolean isDenotable() {
        return false;
    }

    public CapturedTypeConstructorImpl(@NotNull TypeProjection typeProjection) {
        Intrinsics.checkNotNullParameter(typeProjection, "projection");
        this.projection = typeProjection;
        boolean z = getProjection().getProjectionKind() != Variance.INVARIANT;
        if (_Assertions.ENABLED && !z) {
            throw new AssertionError(Intrinsics.stringPlus("Only nontrivial projections can be captured, not: ", getProjection()));
        }
    }

    @NotNull
    public final TypeProjection getProjection() {
        return this.projection;
    }

    @Nullable
    public final NewCapturedTypeConstructor getNewTypeConstructor() {
        return this.newTypeConstructor;
    }

    public final void setNewTypeConstructor(@Nullable NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this.newTypeConstructor = newCapturedTypeConstructor;
    }

    @NotNull
    public final List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.emptyList();
    }

    @NotNull
    public final Collection<KotlinType> getSupertypes() {
        KotlinType kotlinType;
        if (getProjection().getProjectionKind() == Variance.OUT_VARIANCE) {
            kotlinType = getProjection().getType();
        } else {
            kotlinType = getBuiltIns().getNullableAnyType();
        }
        Intrinsics.checkNotNullExpressionValue(kotlinType, "if (projection.projectionKind == Variance.OUT_VARIANCE)\n            projection.type\n        else\n            builtIns.nullableAnyType");
        return CollectionsKt.listOf(kotlinType);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CapturedTypeConstructor(");
        sb.append(getProjection());
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public final KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = getProjection().getType().getConstructor().getBuiltIns();
        Intrinsics.checkNotNullExpressionValue(builtIns, "projection.type.constructor.builtIns");
        return builtIns;
    }

    @NotNull
    public final CapturedTypeConstructorImpl refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        TypeProjection refine = getProjection().refine(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(refine, "projection.refine(kotlinTypeRefiner)");
        return new CapturedTypeConstructorImpl(refine);
    }
}
