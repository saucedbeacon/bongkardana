package o;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;

public final class predictiveItemAnimationsEnabled implements Comparable<predictiveItemAnimationsEnabled> {
    @VisibleForTesting
    static final HashMap<String, predictiveItemAnimationsEnabled> getMin = new HashMap<>(16);
    public final int getMax;
    public final int setMin;

    public final /* synthetic */ int compareTo(@NonNull Object obj) {
        predictiveItemAnimationsEnabled predictiveitemanimationsenabled = (predictiveItemAnimationsEnabled) obj;
        if (equals(predictiveitemanimationsenabled)) {
            return 0;
        }
        return (((float) this.setMin) / ((float) this.getMax)) - (((float) predictiveitemanimationsenabled.setMin) / ((float) predictiveitemanimationsenabled.getMax)) > 0.0f ? 1 : -1;
    }

    @NonNull
    public static predictiveItemAnimationsEnabled setMin(@NonNull String str) {
        String[] split = str.split(":");
        if (split.length == 2) {
            return setMax(Integer.valueOf(split[0]).intValue(), Integer.valueOf(split[1]).intValue());
        }
        throw new NumberFormatException("Illegal AspectRatio string. Must be x:y");
    }

    private predictiveItemAnimationsEnabled(int i, int i2) {
        this.setMin = i;
        this.getMax = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof predictiveItemAnimationsEnabled) {
            predictiveItemAnimationsEnabled predictiveitemanimationsenabled = (predictiveItemAnimationsEnabled) obj;
            return this.setMin == predictiveitemanimationsenabled.setMin && this.getMax == predictiveitemanimationsenabled.getMax;
        }
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.setMin);
        sb.append(":");
        sb.append(this.getMax);
        return sb.toString();
    }

    public final int hashCode() {
        int i = this.getMax;
        int i2 = this.setMin;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    @NonNull
    public final predictiveItemAnimationsEnabled getMin() {
        return setMax(this.getMax, this.setMin);
    }

    @NonNull
    public static predictiveItemAnimationsEnabled length(@NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent) {
        return setMax(shoulddeferaccessibilityevent.getMax, shoulddeferaccessibilityevent.getMin);
    }

    @NonNull
    public static predictiveItemAnimationsEnabled setMax(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        while (i4 != 0) {
            int i5 = i3 % i4;
            i3 = i4;
            i4 = i5;
        }
        int i6 = i / i3;
        int i7 = i2 / i3;
        StringBuilder sb = new StringBuilder();
        sb.append(i6);
        sb.append(":");
        sb.append(i7);
        String obj = sb.toString();
        predictiveItemAnimationsEnabled predictiveitemanimationsenabled = getMin.get(obj);
        if (predictiveitemanimationsenabled != null) {
            return predictiveitemanimationsenabled;
        }
        predictiveItemAnimationsEnabled predictiveitemanimationsenabled2 = new predictiveItemAnimationsEnabled(i6, i7);
        getMin.put(obj, predictiveitemanimationsenabled2);
        return predictiveitemanimationsenabled2;
    }

    public final boolean setMax(@NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent) {
        return Math.abs((((float) this.setMin) / ((float) this.getMax)) - (((float) shoulddeferaccessibilityevent.getMax) / ((float) shoulddeferaccessibilityevent.getMin))) <= 5.0E-4f;
    }
}
