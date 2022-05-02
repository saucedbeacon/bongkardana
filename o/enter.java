package o;

final class enter implements RedDotDrawable {
    private final String getMax;
    private final String getMin;
    private final String length;
    private final getData setMax;
    private final String setMin;

    public enter(getData getdata, String str, String str2, String str3, String str4) {
        this.setMax = getdata;
        this.setMin = str;
        this.getMin = str2;
        this.length = str3;
        this.getMax = str4;
    }

    public final Object apply(Object obj) {
        return this.setMax.lambda$generateSplitBillDeepLink$10(this.setMin, this.getMin, this.length, this.getMax, (Boolean) obj);
    }
}
