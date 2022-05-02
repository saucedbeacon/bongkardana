package o;

public class onAgreementClick {
    private String action;
    private String controlName;
    private boolean focus;
    private String pageName;
    private String text;
    private double touchX;
    private double touchY;

    public onAgreementClick() {
    }

    public onAgreementClick(String str, String str2, String str3, String str4, boolean z, double d, double d2) {
        this.pageName = str;
        this.action = str2;
        this.controlName = str3;
        this.text = str4;
        this.focus = z;
        this.touchX = d;
        this.touchY = d2;
    }

    public String getPageName() {
        return this.pageName;
    }

    public void setPageName(String str) {
        this.pageName = str;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public String getControlName() {
        return this.controlName;
    }

    public void setControlName(String str) {
        this.controlName = str;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String str) {
        this.text = str;
    }

    public boolean isFocus() {
        return this.focus;
    }

    public void setFocus(boolean z) {
        this.focus = z;
    }

    public double getTouchX() {
        return this.touchX;
    }

    public void setTouchX(double d) {
        this.touchX = d;
    }

    public double getTouchY() {
        return this.touchY;
    }

    public void setTouchY(double d) {
        this.touchY = d;
    }
}
