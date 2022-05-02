package o;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class onLayoutChild<T> implements layoutChildWithAnchor<T> {
    private final int getMax;
    @Nullable
    private getResolvedLayoutParams getMin;
    private final int setMax;

    public final void getMin() {
    }

    public final void getMin(@Nullable Drawable drawable) {
    }

    public final void length(@Nullable Drawable drawable) {
    }

    public final void setMax() {
    }

    public final void setMax(@NonNull getDesiredAnchoredChildRectWithoutConstraints getdesiredanchoredchildrectwithoutconstraints) {
    }

    public final void setMin() {
    }

    public onLayoutChild() {
        this((byte) 0);
    }

    private onLayoutChild(byte b) {
        if (getDependents.length(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.setMax = Integer.MIN_VALUE;
            this.getMax = Integer.MIN_VALUE;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
    }

    public final void getMin(@NonNull getDesiredAnchoredChildRectWithoutConstraints getdesiredanchoredchildrectwithoutconstraints) {
        getdesiredanchoredchildrectwithoutconstraints.getMax(this.setMax, this.getMax);
    }

    public final void setMin(@Nullable getResolvedLayoutParams getresolvedlayoutparams) {
        this.getMin = getresolvedlayoutparams;
    }

    @Nullable
    public final getResolvedLayoutParams getMax() {
        return this.getMin;
    }
}
