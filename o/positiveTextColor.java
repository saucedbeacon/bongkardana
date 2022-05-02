package o;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final class positiveTextColor implements Ignore.setMin {
    private final /* synthetic */ Function1 length;

    public positiveTextColor(Function1 function1) {
        this.length = function1;
    }

    public final /* synthetic */ void length(int i) {
        Intrinsics.checkNotNullExpressionValue(this.length.invoke(Integer.valueOf(i)), "invoke(...)");
    }
}
