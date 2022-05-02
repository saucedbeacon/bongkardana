package o;

import android.util.Pair;

final class getBooleanValue implements RedDotDrawable {
    private final String getMax;
    private final boolean getMin;
    private final String length;
    private final String setMax;
    private final getData setMin;

    public getBooleanValue(getData getdata, String str, String str2, String str3, boolean z) {
        this.setMin = getdata;
        this.length = str;
        this.setMax = str2;
        this.getMax = str3;
        this.getMin = z;
    }

    public final Object apply(Object obj) {
        return this.setMin.lambda$generateLinkEntityData$14(this.length, this.setMax, this.getMax, this.getMin, (Pair) obj);
    }
}
