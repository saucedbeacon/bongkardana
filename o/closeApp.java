package o;

import kotlin.jvm.functions.Function1;

final class closeApp implements Function1 {
    private final boolean getMin;
    private final BLEServiceUnit setMax;

    public closeApp(BLEServiceUnit bLEServiceUnit, boolean z) {
        this.setMax = bLEServiceUnit;
        this.getMin = z;
    }

    public final Object invoke(Object obj) {
        return BLEServiceUnit.setMax(this.setMax, this.getMin, (SplashEntryInfo) obj);
    }
}
