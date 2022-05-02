package o;

import android.util.Pair;

final class getJsonArrayValue implements RedDotDrawable {
    private final getData getMax;
    private final Pair getMin;
    private final String length;
    private final String setMax;
    private final String setMin;

    public getJsonArrayValue(getData getdata, String str, Pair pair, String str2, String str3) {
        this.getMax = getdata;
        this.setMin = str;
        this.getMin = pair;
        this.length = str2;
        this.setMax = str3;
    }

    public final Object apply(Object obj) {
        return this.getMax.lambda$getSplitBillQrDeepLink$11(this.setMin, this.getMin, this.length, this.setMax, (String) obj);
    }
}
