package o;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.GriverManifest;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final class CopyUrlShareItem implements GriverManifest.AnonymousClass16.getMin {
    private final /* synthetic */ Function1 length;

    public CopyUrlShareItem(Function1 function1) {
        this.length = function1;
    }

    public final /* synthetic */ void setMax(boolean z) {
        Intrinsics.checkNotNullExpressionValue(this.length.invoke(Boolean.valueOf(z)), "invoke(...)");
    }
}
