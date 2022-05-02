package com.alipay.zoloz.toyger.face;

public class LivenessAction {
    public static String ACTION_BLINK = "ZisaBlinkLiveness";
    public static String ACTION_HEAD = "HeadMove";
    public static String ACTION_MOUSE_OPEN = "MouthOpen";
    public int index = -1;
    public String name;
    public int orientation = -1;
    public float[] threshold;
    public int timeout = 30000;

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public float[] getThreshold() {
        return this.threshold;
    }

    public void setThreshold(float[] fArr) {
        this.threshold = fArr;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public void setOrientation(int i) {
        this.orientation = i;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public void setTimeout(int i) {
        this.timeout = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LivenessAction{index=");
        sb.append(this.index);
        sb.append(", name='");
        sb.append(this.name);
        sb.append('\'');
        sb.append(", threshold='");
        sb.append(this.threshold);
        sb.append('\'');
        sb.append(", orientation='");
        sb.append(this.orientation);
        sb.append('\'');
        sb.append(", timeout='");
        sb.append(this.timeout);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
