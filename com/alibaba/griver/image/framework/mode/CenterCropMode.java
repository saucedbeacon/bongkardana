package com.alibaba.griver.image.framework.mode;

public final class CenterCropMode extends APMode {
    public final int height;
    public final int width;

    public CenterCropMode(int i, int i2) {
        super(2);
        this.width = i;
        this.height = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CenterCropMode{width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append('}');
        return sb.toString();
    }
}
