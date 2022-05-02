package o;

import androidx.annotation.Nullable;
import com.facebook.litho.LayoutOutput;
import o.PlaybackStateCompat;

public final class performAccessibilityAction {
    @Nullable
    public PlaybackStateCompat.ShuffleMode<Integer> length;
    @Nullable
    public PlaybackStateCompat.ShuffleMode<Integer> setMax;

    public performAccessibilityAction() {
        if (!keyToDirection.values) {
            this.setMax = new PlaybackStateCompat.ShuffleMode<>(8);
            this.length = new PlaybackStateCompat.ShuffleMode<>(8);
        }
    }

    public final void length(LayoutOutput layoutOutput, int i, int i2, long j, boolean z) {
        int i3 = 2;
        if (this.setMax == null) {
            this.setMax = new PlaybackStateCompat.ShuffleMode<>(2);
        }
        long min = getMin(layoutOutput, i, i2);
        int i4 = (j <= 0 || ((int) ((j >> 18) & 255)) != i) ? -1 : ((int) j) & 65535;
        int intValue = this.setMax.getMax(min, 0).intValue();
        if (i4 < intValue) {
            i4 = intValue + 1;
            i3 = 0;
        } else if (z) {
            i3 = 1;
        }
        layoutOutput.toDoubleRange = i3;
        if (i4 < 0 || i4 > 65535) {
            throw new IllegalArgumentException("Sequence must be non-negative and no greater than 65535 actual sequence ".concat(String.valueOf(i4)));
        }
        layoutOutput.getMax = ((long) i4) | min;
        this.setMax.setMax(min, Integer.valueOf(i4 + 1));
    }

    private static long getMin(LayoutOutput layoutOutput, int i, int i2) {
        if (i < 0 || i > 255) {
            throw new IllegalArgumentException("Level must be non-negative and no greater than 255 actual level ".concat(String.valueOf(i)));
        }
        return (((long) i) << 18) | 0 | ((layoutOutput.getMin != null ? (long) layoutOutput.getMin.invokeSuspend : 0) << 26) | (((long) i2) << 16);
    }
}
