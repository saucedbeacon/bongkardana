package o;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
final class requiredHeightForButtons implements RedDotManager {
    private final /* synthetic */ Function1 function;

    requiredHeightForButtons(Function1 function1) {
        this.function = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkNotNullExpressionValue(this.function.invoke(obj), "invoke(...)");
    }
}
