package o;

import kotlin.jvm.functions.Function1;

final class getBridgeInterceptor implements Function1 {
    private final GriverParams getMin;

    public getBridgeInterceptor(GriverParams griverParams) {
        this.getMin = griverParams;
    }

    public final Object invoke(Object obj) {
        return GriverParams.setMin(this.getMin, (Throwable) obj);
    }
}
