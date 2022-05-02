package o;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final class setScope implements RedDotManager {
    private final /* synthetic */ Function1 getMin;

    public setScope(Function1 function1) {
        this.getMin = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkNotNullExpressionValue(this.getMin.invoke(obj), "invoke(...)");
    }
}
