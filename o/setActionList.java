package o;

import kotlin.jvm.functions.Function1;

final class setActionList implements Function1 {
    private final GriverParams setMax;

    public setActionList(GriverParams griverParams) {
        this.setMax = griverParams;
    }

    public final Object invoke(Object obj) {
        return GriverParams.length(this.setMax, (Throwable) obj);
    }
}
