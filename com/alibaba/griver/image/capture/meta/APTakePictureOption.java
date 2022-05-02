package com.alibaba.griver.image.capture.meta;

public class APTakePictureOption {
    public static final int TYPE_BITMAP = 2;
    public static final int TYPE_DATA = 1;
    public static final int TYPE_PATH = 0;

    /* renamed from: a  reason: collision with root package name */
    private int f10457a = 100;
    private boolean b = false;
    private int c = 0;
    private float d = -1.0f;
    public boolean saveToPrivateDir = false;

    public int getDataType() {
        return this.c;
    }

    public void setDataType(int i) {
        if (i < 0 || i > 2) {
            this.c = 0;
        } else {
            this.c = i;
        }
    }

    public int getQuality() {
        return this.f10457a;
    }

    public void setQuality(int i) {
        if (i <= 0 || i >= 100) {
            i = 100;
        }
        this.f10457a = i;
    }

    public boolean isKeepPreview() {
        return this.b;
    }

    public void setKeepPreview(boolean z) {
        this.b = z;
    }

    public float getAspectRatio() {
        return this.d;
    }

    public void setAspectRatio(float f) {
        this.d = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("APTakePictureOption{saveToPrivateDir=");
        sb.append(this.saveToPrivateDir);
        sb.append(", mQuality=");
        sb.append(this.f10457a);
        sb.append('}');
        return sb.toString();
    }
}
