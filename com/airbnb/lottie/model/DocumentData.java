package com.airbnb.lottie.model;

import androidx.annotation.ColorInt;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class DocumentData {
    @ColorInt
    public final int IsOverlapping;
    public final float equals;
    public final Justification getMax;
    public final String getMin;
    public final boolean hashCode;
    public final float isInside;
    public final float length;
    public final int setMax;
    public final String setMin;
    public final float toFloatRange;
    @ColorInt
    public final int toIntRange;

    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f, Justification justification, int i, float f2, float f3, @ColorInt int i2, @ColorInt int i3, float f4, boolean z) {
        this.setMin = str;
        this.getMin = str2;
        this.length = f;
        this.getMax = justification;
        this.setMax = i;
        this.equals = f2;
        this.toFloatRange = f3;
        this.IsOverlapping = i2;
        this.toIntRange = i3;
        this.isInside = f4;
        this.hashCode = z;
    }

    public final int hashCode() {
        int hashCode2 = (((((int) (((float) (((this.setMin.hashCode() * 31) + this.getMin.hashCode()) * 31)) + this.length)) * 31) + this.getMax.ordinal()) * 31) + this.setMax;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(this.equals);
        return (((hashCode2 * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.IsOverlapping;
    }
}
