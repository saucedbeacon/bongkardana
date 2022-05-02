package o;

final class httpRequest implements RedDotDrawable {
    private final addDownload getMax;
    private final String getMin;
    private final String length;
    private final String setMax;

    public httpRequest(addDownload adddownload, String str, String str2, String str3) {
        this.getMax = adddownload;
        this.getMin = str;
        this.length = str2;
        this.setMax = str3;
    }

    public final Object apply(Object obj) {
        return this.getMax.lambda$sendRiskEvent$1(this.getMin, this.length, this.setMax, (Boolean) obj);
    }
}
