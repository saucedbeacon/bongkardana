package o;

import kotlin.jvm.functions.Function1;

final class clearValues implements Function1 {
    private final getTargets length;
    private final String setMax;

    public clearValues(getTargets gettargets, String str) {
        this.length = gettargets;
        this.setMax = str;
    }

    public final Object invoke(Object obj) {
        return getTargets.setMin(this.length, this.setMax, (Boolean) obj);
    }
}
