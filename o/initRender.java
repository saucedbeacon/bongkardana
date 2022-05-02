package o;

final class initRender implements RedDotDrawable {
    private final boolean getMax;
    private final getData getMin;
    private final String length;
    private final String setMax;
    private final String setMin;

    public initRender(getData getdata, String str, String str2, String str3, boolean z) {
        this.getMin = getdata;
        this.length = str;
        this.setMin = str2;
        this.setMax = str3;
        this.getMax = z;
    }

    public final Object apply(Object obj) {
        return this.getMin.lambda$generateProfileQrDeepLink$3(this.length, this.setMin, this.setMax, this.getMax, (Boolean) obj);
    }
}
