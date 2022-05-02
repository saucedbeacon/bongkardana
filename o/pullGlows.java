package o;

import android.graphics.Rect;
import androidx.annotation.NonNull;

public final class pullGlows {
    @NonNull
    public static Rect setMax(@NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent, @NonNull predictiveItemAnimationsEnabled predictiveitemanimationsenabled) {
        int i;
        int i2 = shoulddeferaccessibilityevent.getMax;
        int i3 = shoulddeferaccessibilityevent.getMin;
        int i4 = 0;
        if (predictiveitemanimationsenabled.setMax(shoulddeferaccessibilityevent)) {
            return new Rect(0, 0, i2, i3);
        }
        predictiveItemAnimationsEnabled max = predictiveItemAnimationsEnabled.setMax(i2, i3);
        if (((float) max.setMin) / ((float) max.getMax) > ((float) predictiveitemanimationsenabled.setMin) / ((float) predictiveitemanimationsenabled.getMax)) {
            int round = Math.round(((float) i3) * (((float) predictiveitemanimationsenabled.setMin) / ((float) predictiveitemanimationsenabled.getMax)));
            i2 = round;
            i4 = Math.round(((float) (i2 - round)) / 2.0f);
            i = 0;
        } else {
            int round2 = Math.round(((float) i2) / (((float) predictiveitemanimationsenabled.setMin) / ((float) predictiveitemanimationsenabled.getMax)));
            i = Math.round(((float) (i3 - round2)) / 2.0f);
            i3 = round2;
        }
        return new Rect(i4, i, i2 + i4, i3 + i);
    }
}
