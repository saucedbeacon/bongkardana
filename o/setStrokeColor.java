package o;

import kotlin.jvm.functions.Function1;
import o.getPlatformCallback;

final class setStrokeColor implements Function1 {
    private final getPlatformCallback length;
    private final getPlatformCallback.getMin setMin;

    public setStrokeColor(getPlatformCallback getplatformcallback, getPlatformCallback.getMin getmin) {
        this.length = getplatformcallback;
        this.setMin = getmin;
    }

    public final Object invoke(Object obj) {
        return getPlatformCallback.setMin(this.length, this.setMin);
    }
}
