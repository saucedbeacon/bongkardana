package o;

import androidx.annotation.NonNull;

public class shouldDeferAccessibilityEvent implements Comparable<shouldDeferAccessibilityEvent> {
    public final int getMax;
    public final int getMin;

    public /* bridge */ /* synthetic */ int compareTo(@NonNull Object obj) {
        shouldDeferAccessibilityEvent shoulddeferaccessibilityevent = (shouldDeferAccessibilityEvent) obj;
        return (this.getMax * this.getMin) - (shoulddeferaccessibilityevent.getMax * shoulddeferaccessibilityevent.getMin);
    }

    public shouldDeferAccessibilityEvent(int i, int i2) {
        this.getMax = i;
        this.getMin = i2;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof shouldDeferAccessibilityEvent) {
            shouldDeferAccessibilityEvent shoulddeferaccessibilityevent = (shouldDeferAccessibilityEvent) obj;
            return this.getMax == shoulddeferaccessibilityevent.getMax && this.getMin == shoulddeferaccessibilityevent.getMin;
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getMax);
        sb.append("x");
        sb.append(this.getMin);
        return sb.toString();
    }

    public int hashCode() {
        int i = this.getMin;
        int i2 = this.getMax;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }
}
