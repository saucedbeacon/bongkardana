package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

final class NotNullSimpleType extends DelegatingSimpleTypeImpl {
    public final boolean isMarkedNullable() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotNullSimpleType(@NotNull SimpleType simpleType) {
        super(simpleType);
        Intrinsics.checkNotNullParameter(simpleType, "delegate");
    }

    @NotNull
    public final NotNullSimpleType replaceDelegate(@NotNull SimpleType simpleType) {
        Intrinsics.checkNotNullParameter(simpleType, "delegate");
        return new NotNullSimpleType(simpleType);
    }
}
