package com.alibaba.ariver.app.api.service.font;

public class FontSizeSetting {

    /* renamed from: a  reason: collision with root package name */
    private int f9956a;
    private float b;

    public FontSizeSetting(int i, float f) {
        this.f9956a = i;
        this.b = f;
    }

    public float getScale() {
        return this.b;
    }

    public int getLevel() {
        return this.f9956a;
    }

    public String toString() {
        return String.format("fontSize\t fontScale=%d,level=%d", new Object[]{Float.valueOf(this.b), Integer.valueOf(this.f9956a)});
    }
}
