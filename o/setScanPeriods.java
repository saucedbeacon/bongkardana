package o;

import io.reactivex.annotations.NonNull;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
final class setScanPeriods implements getChildren {
    private final /* synthetic */ Function1 getMin;

    setScanPeriods(Function1 function1) {
        this.getMin = function1;
    }

    public final /* synthetic */ boolean test(@NonNull Object obj) {
        Object invoke = this.getMin.invoke(obj);
        Intrinsics.checkNotNullExpressionValue(invoke, "invoke(...)");
        return ((Boolean) invoke).booleanValue();
    }
}
