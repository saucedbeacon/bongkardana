package o;

import kotlin.jvm.functions.Function1;

final class GriverParam implements Function1 {
    private final GriverParams length;

    public GriverParam(GriverParams griverParams) {
        this.length = griverParams;
    }

    public final Object invoke(Object obj) {
        return GriverParams.setMax(this.length, (Throwable) obj);
    }
}
