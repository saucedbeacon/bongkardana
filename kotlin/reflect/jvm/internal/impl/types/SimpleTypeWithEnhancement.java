package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

public final class SimpleTypeWithEnhancement extends DelegatingSimpleType implements TypeWithEnhancement {
    @NotNull
    private final SimpleType delegate;
    @NotNull
    private final KotlinType enhancement;

    /* access modifiers changed from: protected */
    @NotNull
    public final SimpleType getDelegate() {
        return this.delegate;
    }

    @NotNull
    public final KotlinType getEnhancement() {
        return this.enhancement;
    }

    public SimpleTypeWithEnhancement(@NotNull SimpleType simpleType, @NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(simpleType, "delegate");
        Intrinsics.checkNotNullParameter(kotlinType, "enhancement");
        this.delegate = simpleType;
        this.enhancement = kotlinType;
    }

    @NotNull
    public final UnwrappedType getOrigin() {
        return getDelegate();
    }

    @NotNull
    public final SimpleType replaceAnnotations(@NotNull Annotations annotations) {
        Intrinsics.checkNotNullParameter(annotations, "newAnnotations");
        return (SimpleType) TypeWithEnhancementKt.wrapEnhancement(getOrigin().replaceAnnotations(annotations), getEnhancement());
    }

    @NotNull
    public final SimpleType makeNullableAsSpecified(boolean z) {
        return (SimpleType) TypeWithEnhancementKt.wrapEnhancement(getOrigin().makeNullableAsSpecified(z), getEnhancement().unwrap().makeNullableAsSpecified(z));
    }

    @NotNull
    public final SimpleTypeWithEnhancement replaceDelegate(@NotNull SimpleType simpleType) {
        Intrinsics.checkNotNullParameter(simpleType, "delegate");
        return new SimpleTypeWithEnhancement(simpleType, getEnhancement());
    }

    @NotNull
    public final SimpleTypeWithEnhancement refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new SimpleTypeWithEnhancement((SimpleType) kotlinTypeRefiner.refineType(getDelegate()), kotlinTypeRefiner.refineType(getEnhancement()));
    }
}
