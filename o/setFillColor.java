package o;

import kotlin.jvm.functions.Function1;
import o.getPlatformCallback;

final class setFillColor implements Function1 {
    private final getPlatformCallback setMax;
    private final getPlatformCallback.setMax setMin;

    public setFillColor(getPlatformCallback getplatformcallback, getPlatformCallback.setMax setmax) {
        this.setMax = getplatformcallback;
        this.setMin = setmax;
    }

    public final Object invoke(Object obj) {
        return getPlatformCallback.setMin(this.setMax, this.setMin, (Throwable) obj);
    }
}
