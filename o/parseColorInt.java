package o;

import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
final class parseColorInt implements Callable {
    private final /* synthetic */ Function0 getMin;

    parseColorInt(Function0 function0) {
        this.getMin = function0;
    }

    public final /* synthetic */ Object call() {
        return this.getMin.invoke();
    }
}
