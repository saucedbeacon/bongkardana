package o;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
final class setFillScreen implements Runnable {
    private final /* synthetic */ Function0 setMax;

    setFillScreen(Function0 function0) {
        this.setMax = function0;
    }

    public final /* synthetic */ void run() {
        Intrinsics.checkNotNullExpressionValue(this.setMax.invoke(), "invoke(...)");
    }
}
