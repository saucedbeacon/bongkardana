package o;

import kotlin.jvm.functions.Function1;
import o.getPlatformCallback;

final class setStrokeWidth implements Function1 {
    private final getPlatformCallback.getMin length;
    private final getPlatformCallback setMax;

    public setStrokeWidth(getPlatformCallback getplatformcallback, getPlatformCallback.getMin getmin) {
        this.setMax = getplatformcallback;
        this.length = getmin;
    }

    public final Object invoke(Object obj) {
        return this.length.setMax(getPlatformCallback.setMin((String) obj));
    }
}
