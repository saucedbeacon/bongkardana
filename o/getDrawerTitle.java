package o;

import com.github.mikephil.charting.data.BarEntry;

public class getDrawerTitle extends dispatchOnDrawerClosed<EmojiAppCompatEditText> {
    public float getMax = 0.85f;

    public final void setMax(float f, float f2, float f3) {
        BarEntry barEntry;
        if (this.toFloatRange.size() > 1) {
            int ICustomTabsCallback = ((EmojiAppCompatEditText) FastBitmap$CoordinateSystem()).ICustomTabsCallback();
            float f4 = f2 / 2.0f;
            float f5 = f3 / 2.0f;
            float f6 = this.getMax / 2.0f;
            float size = (((float) this.toFloatRange.size()) * (this.getMax + f3)) + f2;
            for (int i = 0; i < ICustomTabsCallback; i++) {
                float f7 = f + f4;
                for (EmojiAppCompatEditText emojiAppCompatEditText : this.toFloatRange) {
                    float f8 = f7 + f5 + f6;
                    if (i < emojiAppCompatEditText.ICustomTabsCallback() && (barEntry = (BarEntry) emojiAppCompatEditText.toIntRange(i)) != null) {
                        barEntry.getMax(f8);
                    }
                    f7 = f8 + f6 + f5;
                }
                float f9 = f7 + f4;
                float f10 = size - (f9 - f);
                if (f10 > 0.0f || f10 < 0.0f) {
                    f9 += f10;
                }
                f = f9;
            }
            length();
            return;
        }
        throw new RuntimeException("BarData needs to hold at least 2 BarDataSets to allow grouping.");
    }
}
