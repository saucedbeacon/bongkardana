package o;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "T", "Params", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
final class APWebChromeClient$Mean$Arithmetic<T> implements RedDotManager<Throwable> {
    final /* synthetic */ APWebChromeClient getMin;
    final /* synthetic */ Function1 setMax;

    APWebChromeClient$Mean$Arithmetic(APWebChromeClient aPWebChromeClient, Function1 function1) {
        this.getMin = aPWebChromeClient;
        this.setMax = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        Throwable th = (Throwable) obj;
        String unused = this.getMin.getSubclassPath();
        Function1 function1 = this.setMax;
        Intrinsics.checkNotNullExpressionValue(th, "it");
        function1.invoke(th);
        this.getMin.dispose();
    }
}
