package o;

public final class Helper implements convertSpToPx {
    private double IsOverlapping;
    private String getMax;
    private String getMin;
    private boolean length;
    private String setMax;
    private String setMin;
    private double toFloatRange;

    public Helper(String str) {
        this.getMin = str;
    }

    public Helper(String str, String str2, String str3, boolean z) {
        this.setMin = str;
        this.getMin = str2;
        this.setMax = str3;
        this.length = z;
    }

    public Helper(String str, String str2, String str3, String str4) {
        this.setMin = str;
        this.getMin = str2;
        this.setMax = str3;
        this.getMax = str4;
    }

    public Helper(String str, String str2, String str3, double d, double d2) {
        this.setMin = str;
        this.getMin = str2;
        this.setMax = str3;
        this.IsOverlapping = d;
        this.toFloatRange = d2;
    }

    public Helper(String str, String str2, String str3) {
        this.setMin = str;
        this.getMin = str2;
        this.setMax = str3;
    }

    public final void length() {
        onAgreementClick onagreementclick = new onAgreementClick();
        onagreementclick.setPageName(this.setMin);
        onagreementclick.setAction(this.getMin);
        onagreementclick.setControlName(this.setMax);
        onagreementclick.setFocus(this.length);
        onagreementclick.setText(this.getMax);
        onagreementclick.setTouchX(this.IsOverlapping);
        onagreementclick.setTouchY(this.toFloatRange);
        onRelease.track(onagreementclick);
    }
}
