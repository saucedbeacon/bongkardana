package com.alipay.mobile.security.bio.config.bean;

import java.util.Arrays;

public class Threshold {
    private float[] DragonflyLiveness;
    private float[] GeminiLiveness;

    public float[] getGeminiLiveness() {
        return this.GeminiLiveness;
    }

    public void setGeminiLiveness(float[] fArr) {
        this.GeminiLiveness = fArr;
    }

    public float[] getDragonflyLiveness() {
        return this.DragonflyLiveness;
    }

    public void setDragonflyLiveness(float[] fArr) {
        this.DragonflyLiveness = fArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Threshold{GeminiLiveness=");
        sb.append(Arrays.toString(this.GeminiLiveness));
        sb.append(", DragonflyLiveness=");
        sb.append(Arrays.toString(this.DragonflyLiveness));
        sb.append('}');
        return sb.toString();
    }
}
