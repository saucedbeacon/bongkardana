package o;

final class putJsonValue implements RedDotDrawable {
    private final String getMax;
    private final String getMin;
    private final String setMax;
    private final getData setMin;

    public putJsonValue(getData getdata, String str, String str2, String str3) {
        this.setMin = getdata;
        this.getMin = str;
        this.getMax = str2;
        this.setMax = str3;
    }

    public final Object apply(Object obj) {
        return this.setMin.lambda$generateTransferQrDeepLink$1(this.getMin, this.getMax, this.setMax, (Boolean) obj);
    }
}
