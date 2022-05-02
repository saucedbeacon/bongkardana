package o;

import android.util.Pair;

final class putBooleanValue implements RedDotDrawable {
    private final getData getMax;
    private final boolean getMin;
    private final Pair length;
    private final String setMax;
    private final String setMin;

    public putBooleanValue(getData getdata, Pair pair, String str, String str2, boolean z) {
        this.getMax = getdata;
        this.length = pair;
        this.setMin = str;
        this.setMax = str2;
        this.getMin = z;
    }

    public final Object apply(Object obj) {
        return this.getMax.lambda$getProfileQrDeepLink$16(this.length, this.setMin, this.setMax, this.getMin, (setPageId) obj);
    }
}
