package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.model.StubTypeMarker;
import org.jetbrains.annotations.NotNull;

public final class StubType extends AbstractStubType implements StubTypeMarker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StubType(@NotNull TypeConstructor typeConstructor, boolean z, @NotNull TypeConstructor typeConstructor2, @NotNull MemberScope memberScope) {
        super(typeConstructor, z, typeConstructor2, memberScope);
        Intrinsics.checkNotNullParameter(typeConstructor, "originalTypeVariable");
        Intrinsics.checkNotNullParameter(typeConstructor2, "constructor");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
    }

    @NotNull
    public final AbstractStubType materialize(boolean z) {
        return new StubType(getOriginalTypeVariable(), z, getConstructor(), getMemberScope());
    }
}
