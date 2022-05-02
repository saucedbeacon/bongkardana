package o;

import android.util.Pair;

final class putLongValue implements RedDotDrawable {
    private final setPageId getMax;
    private final boolean getMin;
    private final String length;
    private final Pair setMax;
    private final String setMin;

    public putLongValue(setPageId setpageid, Pair pair, String str, String str2, boolean z) {
        this.getMax = setpageid;
        this.setMax = pair;
        this.length = str;
        this.setMin = str2;
        this.getMin = z;
    }

    public final Object apply(Object obj) {
        return this.getMax.generateProfileQrDeepLink((String) obj, (String) this.setMax.first, (String) this.setMax.second, this.length, this.setMin, this.getMin);
    }
}
