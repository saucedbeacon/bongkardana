package com.alibaba.griver.image.framework.mode;

public final class APCenterCropMode extends APMode {
    public final int height;
    public final int width;

    public APCenterCropMode(int i, int i2) {
        super(2);
        this.width = i;
        this.height = i2;
    }
}
