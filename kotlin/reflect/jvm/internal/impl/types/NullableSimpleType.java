package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

final class NullableSimpleType extends DelegatingSimpleTypeImpl {
    public final boolean isMarkedNullable() {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NullableSimpleType(@NotNull SimpleType simpleType) {
        super(simpleType);
        Intrinsics.checkNotNullParameter(simpleType, "delegate");
    }

    @NotNull
    public final NullableSimpleType replaceDelegate(@NotNull SimpleType simpleType) {
        Intrinsics.checkNotNullParameter(simpleType, "delegate");
        return new NullableSimpleType(simpleType);
    }
}
