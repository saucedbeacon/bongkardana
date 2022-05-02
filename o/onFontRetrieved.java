package o;

import com.facebook.yoga.YogaEdge;

public final class onFontRetrieved {
    private static final int[] getMin = {1, 2, 4, 8, 16, 32, 64, 128, 256};
    boolean getMax;
    final float[] length = {1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f};
    private final float setMax = 0.0f;
    int setMin = 0;

    public final boolean setMin(YogaEdge yogaEdge, float f) {
        boolean z = false;
        if (getMin(this.length[yogaEdge.intValue()], f)) {
            return false;
        }
        this.length[yogaEdge.intValue()] = f;
        if (clampViewPositionHorizontal.length(f)) {
            this.setMin = (getMin[yogaEdge.intValue()] ^ -1) & this.setMin;
        } else {
            this.setMin = getMin[yogaEdge.intValue()] | this.setMin;
        }
        if (!((this.setMin & getMin[YogaEdge.ALL.intValue()]) == 0 && (this.setMin & getMin[YogaEdge.VERTICAL.intValue()]) == 0 && (this.setMin & getMin[YogaEdge.HORIZONTAL.intValue()]) == 0)) {
            z = true;
        }
        this.getMax = z;
        return true;
    }

    public final float length(YogaEdge yogaEdge) {
        float f = (yogaEdge == YogaEdge.START || yogaEdge == YogaEdge.END) ? 1.0E21f : 0.0f;
        int i = this.setMin;
        if (i == 0) {
            return f;
        }
        if ((i & getMin[yogaEdge.intValue()]) != 0) {
            return this.length[yogaEdge.intValue()];
        }
        if (this.getMax) {
            YogaEdge yogaEdge2 = (yogaEdge == YogaEdge.TOP || yogaEdge == YogaEdge.BOTTOM) ? YogaEdge.VERTICAL : YogaEdge.HORIZONTAL;
            if ((this.setMin & getMin[yogaEdge2.intValue()]) != 0) {
                return this.length[yogaEdge2.intValue()];
            }
            if ((this.setMin & getMin[YogaEdge.ALL.intValue()]) != 0) {
                return this.length[YogaEdge.ALL.intValue()];
            }
        }
        return f;
    }

    private static boolean getMin(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) && Float.isNaN(f2) : Math.abs(f2 - f) < 1.0E-5f;
    }
}
