package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import java.util.Arrays;

public final class RelativeCornerSize implements CornerSize {
    private final float percent;

    public RelativeCornerSize(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.percent = f;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getRelativePercent() {
        return this.percent;
    }

    public final float getCornerSize(@NonNull RectF rectF) {
        return this.percent * rectF.height();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RelativeCornerSize) && this.percent == ((RelativeCornerSize) obj).percent;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.percent)});
    }
}
