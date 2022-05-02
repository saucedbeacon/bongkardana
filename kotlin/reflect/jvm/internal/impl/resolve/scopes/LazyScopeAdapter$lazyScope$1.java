package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

final class LazyScopeAdapter$lazyScope$1 extends Lambda implements Function0<MemberScope> {
    final /* synthetic */ Function0<MemberScope> $getScope;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyScopeAdapter$lazyScope$1(Function0<? extends MemberScope> function0) {
        super(0);
        this.$getScope = function0;
    }

    @NotNull
    public final MemberScope invoke() {
        MemberScope invoke = this.$getScope.invoke();
        return invoke instanceof AbstractScopeAdapter ? ((AbstractScopeAdapter) invoke).getActualScope() : invoke;
    }
}
