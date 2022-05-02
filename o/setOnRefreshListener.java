package o;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
final class setOnRefreshListener implements View.OnClickListener {
    private final /* synthetic */ Function1 getMax;

    setOnRefreshListener(Function1 function1) {
        this.getMax = function1;
    }

    public final /* synthetic */ void onClick(View view) {
        Intrinsics.checkNotNullExpressionValue(this.getMax.invoke(view), "invoke(...)");
    }
}
