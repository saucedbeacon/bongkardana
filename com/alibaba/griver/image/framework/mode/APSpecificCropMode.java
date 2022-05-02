package com.alibaba.griver.image.framework.mode;

public final class APSpecificCropMode extends APMode {
    public final int height;
    public final int width;
    public final int x;
    public final int y;

    public APSpecificCropMode(int i, int i2, int i3, int i4) {
        super(3);
        this.x = i;
        this.y = i2;
        this.width = i3;
        this.height = i4;
    }
}
