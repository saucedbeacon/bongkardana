package o;

import kotlin.jvm.functions.Function1;

final class openApp implements Function1 {
    private final BLEServiceUnit setMax;

    public openApp(BLEServiceUnit bLEServiceUnit) {
        this.setMax = bLEServiceUnit;
    }

    public final Object invoke(Object obj) {
        return this.setMax.create.setMax((String) obj);
    }
}
