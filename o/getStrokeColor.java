package o;

import kotlin.jvm.functions.Function1;
import o.getPlatformCallback;

final class getStrokeColor implements Function1 {
    private final getPlatformCallback getMin;
    private final getPlatformCallback.setMin length;

    public getStrokeColor(getPlatformCallback getplatformcallback, getPlatformCallback.setMin setmin) {
        this.getMin = getplatformcallback;
        this.length = setmin;
    }

    public final Object invoke(Object obj) {
        return getPlatformCallback.setMin(this.getMin, this.length, (Throwable) obj);
    }
}
