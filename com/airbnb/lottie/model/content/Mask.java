package com.airbnb.lottie.model.content;

import o.onCloseClicked;
import o.onItemClicked;

public final class Mask {
    public final onItemClicked getMax;
    private final boolean getMin;
    public final MaskMode length;
    public final onCloseClicked setMin;

    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, onItemClicked onitemclicked, onCloseClicked oncloseclicked, boolean z) {
        this.length = maskMode;
        this.getMax = onitemclicked;
        this.setMin = oncloseclicked;
        this.getMin = z;
    }

    public final boolean getMin() {
        return this.getMin;
    }
}
