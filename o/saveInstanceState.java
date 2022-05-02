package o;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final class saveInstanceState implements Runnable {
    private final /* synthetic */ Function0 getMax;

    public saveInstanceState(Function0 function0) {
        this.getMax = function0;
    }

    public final /* synthetic */ void run() {
        Intrinsics.checkNotNullExpressionValue(this.getMax.invoke(), "invoke(...)");
    }
}
