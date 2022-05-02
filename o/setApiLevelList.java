package o;

import io.reactivex.annotations.NonNull;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
final class setApiLevelList implements RedDotDrawable {
    private final /* synthetic */ Function1 getMax;

    setApiLevelList(Function1 function1) {
        this.getMax = function1;
    }

    public final /* synthetic */ Object apply(@NonNull Object obj) {
        return this.getMax.invoke(obj);
    }
}
