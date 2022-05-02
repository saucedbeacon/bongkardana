package o;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Params", "it", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 4, 2})
final class APWebChromeClient$Grayscale$Algorithm<T> implements RedDotManager<T> {
    final /* synthetic */ Function1 setMin;

    APWebChromeClient$Grayscale$Algorithm(Function1 function1) {
        this.setMin = function1;
    }

    public final void accept(T t) {
        this.setMin.invoke(t);
    }
}
