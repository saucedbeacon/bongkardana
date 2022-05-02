package com.alipay.mobile.security.bio.config.bean;

public class AlertConfig {
    private String leftButtonText;
    private String message;
    private int returnCode;
    private String rightButtonText;
    private String title;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getLeftButtonText() {
        return this.leftButtonText;
    }

    public void setLeftButtonText(String str) {
        this.leftButtonText = str;
    }

    public String getRightButtonText() {
        return this.rightButtonText;
    }

    public void setRightButtonText(String str) {
        this.rightButtonText = str;
    }

    public int getReturnCode() {
        return this.returnCode;
    }

    public void setReturnCode(int i) {
        this.returnCode = i;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AlertConfig{title='");
        sb.append(this.title);
        sb.append('\'');
        sb.append(", message='");
        sb.append(this.message);
        sb.append('\'');
        sb.append(", leftButtonText='");
        sb.append(this.leftButtonText);
        sb.append('\'');
        sb.append(", rightButtonText='");
        sb.append(this.rightButtonText);
        sb.append('\'');
        sb.append(", returnCode=");
        sb.append(this.returnCode);
        sb.append('}');
        return sb.toString();
    }
}
