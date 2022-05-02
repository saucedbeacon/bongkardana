package o;

import android.annotation.NonNull;
import android.os.Handler;
import android.os.Message;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final class attributeId implements Handler.Callback {
    private final /* synthetic */ Function1 setMax;

    public attributeId(Function1 function1) {
        this.setMax = function1;
    }

    public final /* synthetic */ boolean handleMessage(@NonNull Message message) {
        Intrinsics.checkNotNullParameter(message, "p0");
        Object invoke = this.setMax.invoke(message);
        Intrinsics.checkNotNullExpressionValue(invoke, "invoke(...)");
        return ((Boolean) invoke).booleanValue();
    }
}
