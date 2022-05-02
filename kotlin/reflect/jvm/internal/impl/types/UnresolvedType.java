package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

public final class UnresolvedType extends ErrorType {
    @NotNull
    private final String presentableName;

    @NotNull
    public final UnresolvedType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @NotNull
    public final String getPresentableName() {
        return this.presentableName;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UnresolvedType(@NotNull String str, @NotNull TypeConstructor typeConstructor, @NotNull MemberScope memberScope, @NotNull List<? extends TypeProjection> list, boolean z) {
        super(typeConstructor, memberScope, list, z, (String) null, 16, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "presentableName");
        Intrinsics.checkNotNullParameter(typeConstructor, "constructor");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        Intrinsics.checkNotNullParameter(list, "arguments");
        this.presentableName = str;
    }

    @NotNull
    public final SimpleType makeNullableAsSpecified(boolean z) {
        return new UnresolvedType(getPresentableName(), getConstructor(), getMemberScope(), getArguments(), z);
    }
}
