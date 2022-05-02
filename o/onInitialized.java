package o;

import io.reactivex.annotations.NonNull;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
final class onInitialized implements RedDotDrawable {
    private final /* synthetic */ Function1 setMax;

    onInitialized(Function1 function1) {
        this.setMax = function1;
    }

    public final /* synthetic */ Object apply(@NonNull Object obj) {
        return this.setMax.invoke(obj);
    }
}
