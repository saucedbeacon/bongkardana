package o;

import com.github.mikephil.charting.data.BarEntry;

public final class setDrawerListener extends setChildInsets {
    public setDrawerListener(int i, int i2, boolean z) {
        super(i, i2, z);
    }

    public final void setMax(EmojiAppCompatEditText emojiAppCompatEditText) {
        float f;
        float f2;
        float f3;
        float f4;
        float ICustomTabsCallback = ((float) emojiAppCompatEditText.ICustomTabsCallback()) * this.setMin;
        float f5 = this.values / 2.0f;
        for (int i = 0; ((float) i) < ICustomTabsCallback; i++) {
            BarEntry barEntry = (BarEntry) emojiAppCompatEditText.toIntRange(i);
            if (barEntry != null) {
                float length = barEntry.length();
                float min = barEntry.getMin();
                float[] fArr = barEntry.setMin;
                if (!this.toIntRange || fArr == null) {
                    float f6 = length - f5;
                    float f7 = length + f5;
                    if (this.IsOverlapping) {
                        f = min >= 0.0f ? min : 0.0f;
                        if (min > 0.0f) {
                            min = 0.0f;
                        }
                    } else {
                        float f8 = min >= 0.0f ? min : 0.0f;
                        if (min > 0.0f) {
                            min = 0.0f;
                        }
                        float f9 = min;
                        min = f8;
                        f = f9;
                    }
                    if (min > 0.0f) {
                        min *= this.getMin;
                    } else {
                        f *= this.getMin;
                    }
                    getMin(f, f7, min, f6);
                } else {
                    float f10 = -barEntry.length;
                    int i2 = 0;
                    float f11 = 0.0f;
                    while (i2 < fArr.length) {
                        float f12 = fArr[i2];
                        if (f12 >= 0.0f) {
                            f2 = f12 + f11;
                            f3 = f10;
                            f10 = f11;
                            f11 = f2;
                        } else {
                            f2 = Math.abs(f12) + f10;
                            f3 = Math.abs(f12) + f10;
                        }
                        float f13 = length - f5;
                        float f14 = length + f5;
                        if (this.IsOverlapping) {
                            f4 = f10 >= f2 ? f10 : f2;
                            if (f10 > f2) {
                                f10 = f2;
                            }
                        } else {
                            float f15 = f10 >= f2 ? f10 : f2;
                            if (f10 > f2) {
                                f10 = f2;
                            }
                            float f16 = f10;
                            f10 = f15;
                            f4 = f16;
                        }
                        getMin(f4 * this.getMin, f14, f10 * this.getMin, f13);
                        i2++;
                        f10 = f3;
                    }
                }
            }
        }
        getMin();
    }
}
