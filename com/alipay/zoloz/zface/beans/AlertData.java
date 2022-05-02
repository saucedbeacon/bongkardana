package com.alipay.zoloz.zface.beans;

public class AlertData {
    public int errorCode;
    public String leftBtnText;
    public String rightBtnText;
    public String scene;
    public String subCode;
    public String subMsg;
    public String subTitle;
    public String title;
    public int type;

    public String toString() {
        StringBuilder sb = new StringBuilder("AlertData{type=");
        sb.append(this.type);
        sb.append(", title='");
        sb.append(this.title);
        sb.append('\'');
        sb.append(", subTitle='");
        sb.append(this.subTitle);
        sb.append('\'');
        sb.append(", leftBtnText='");
        sb.append(this.leftBtnText);
        sb.append('\'');
        sb.append(", rightBtnText='");
        sb.append(this.rightBtnText);
        sb.append('\'');
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append(", subCode='");
        sb.append(this.subCode);
        sb.append('\'');
        sb.append(", subMsg='");
        sb.append(this.subMsg);
        sb.append('\'');
        sb.append(", scene='");
        sb.append(this.scene);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
