package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;

final class AnnotatedSimpleType extends DelegatingSimpleTypeImpl {
    @NotNull
    private final Annotations annotations;

    @NotNull
    public final Annotations getAnnotations() {
        return this.annotations;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnnotatedSimpleType(@NotNull SimpleType simpleType, @NotNull Annotations annotations2) {
        super(simpleType);
        Intrinsics.checkNotNullParameter(simpleType, "delegate");
        Intrinsics.checkNotNullParameter(annotations2, "annotations");
        this.annotations = annotations2;
    }

    @NotNull
    public final AnnotatedSimpleType replaceDelegate(@NotNull SimpleType simpleType) {
        Intrinsics.checkNotNullParameter(simpleType, "delegate");
        return new AnnotatedSimpleType(simpleType, getAnnotations());
    }
}
