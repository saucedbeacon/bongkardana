package o;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import id.dana.R;
import o.WheelView;

public final class FileBridgeExtension {
    @DrawableRes
    public final int IsOverlapping;
    @DrawableRes
    public final int getMax;
    @DrawableRes
    public final int getMin;
    @ColorRes
    public final int length;
    @DrawableRes
    public final int setMax;
    @DrawableRes
    public final int setMin;
    @ColorRes
    public final int toIntRange;

    /* synthetic */ FileBridgeExtension(int i, int i2, int i3, int i4, int i5, int i6, int i7, byte b) {
        this(i, i2, i3, i4, i5, i6, i7);
    }

    private FileBridgeExtension(@DrawableRes int i, @DrawableRes int i2, @DrawableRes int i3, @DrawableRes int i4, @ColorRes int i5, @ColorRes int i6, @DrawableRes int i7) {
        this.IsOverlapping = i;
        this.setMin = i2;
        this.getMin = i3;
        this.setMax = i4;
        this.toIntRange = i5;
        if (i6 == 0) {
            this.length = i5;
        } else {
            this.length = i6;
        }
        this.getMax = i7;
    }

    public static getMin setMin() {
        getMin getmin = new getMin((byte) 0);
        getmin.toIntRange = R.drawable.bg_default_vertical;
        getmin.getMax = R.drawable.bg_default_horizontal;
        getmin.length = WheelView.OnWheelViewListener.getMin() ? R.drawable.logo_other_bank_in : R.drawable.logo_other_bank;
        getmin.setMin = R.color.f18662131099751;
        getmin.setMax = R.color.f24052131100344;
        return getmin;
    }

    public static class getMin {
        @DrawableRes
        public int getMax;
        @DrawableRes
        public int getMin;
        @DrawableRes
        public int length;
        @ColorRes
        int setMax;
        @ColorRes
        public int setMin;
        @DrawableRes
        int toFloatRange;
        @DrawableRes
        public int toIntRange;

        public /* synthetic */ getMin(byte b) {
            this();
        }

        private getMin() {
        }

        public final FileBridgeExtension setMax() {
            return new FileBridgeExtension(this.toIntRange, this.getMax, this.length, this.getMin, this.setMin, this.setMax, this.toFloatRange, (byte) 0);
        }
    }
}
