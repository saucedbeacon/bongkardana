package com.alibaba.griver.image.framework.mode;

public final class SpecificCropMode extends APMode {
    public final int height;
    public final int width;
    public final int x;
    public final int y;

    public SpecificCropMode(int i, int i2, int i3, int i4) {
        super(3);
        this.x = i;
        this.y = i2;
        this.width = i3;
        this.height = i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpecificCropMode{x=");
        sb.append(this.x);
        sb.append(", y=");
        sb.append(this.y);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append('}');
        return sb.toString();
    }
}
