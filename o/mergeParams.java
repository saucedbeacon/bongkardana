package o;

import io.reactivex.annotations.NonNull;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
final class mergeParams implements RedDotDrawable {
    private final /* synthetic */ Function1 getMin;

    mergeParams(Function1 function1) {
        this.getMin = function1;
    }

    public final /* synthetic */ Object apply(@NonNull Object obj) {
        return this.getMin.invoke(obj);
    }
}
