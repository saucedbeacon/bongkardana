package o;

import android.graphics.Insets;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public final class PluralsRes {
    @NonNull
    public static final PluralsRes setMax = new PluralsRes(0, 0, 0, 0);
    public final int getMax;
    public final int getMin;
    public final int length;
    public final int setMin;

    private PluralsRes(int i, int i2, int i3, int i4) {
        this.setMin = i;
        this.length = i2;
        this.getMin = i3;
        this.getMax = i4;
    }

    @NonNull
    public static PluralsRes setMax(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return setMax;
        }
        return new PluralsRes(i, i2, i3, i4);
    }

    @NonNull
    public static PluralsRes setMin(@NonNull Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return setMax;
        }
        return new PluralsRes(i, i2, i3, i4);
    }

    @NonNull
    public static PluralsRes length(@NonNull PluralsRes pluralsRes, @NonNull PluralsRes pluralsRes2) {
        int max = Math.max(pluralsRes.setMin, pluralsRes2.setMin);
        int max2 = Math.max(pluralsRes.length, pluralsRes2.length);
        int max3 = Math.max(pluralsRes.getMin, pluralsRes2.getMin);
        int max4 = Math.max(pluralsRes.getMax, pluralsRes2.getMax);
        if (max == 0 && max2 == 0 && max3 == 0 && max4 == 0) {
            return setMax;
        }
        return new PluralsRes(max, max2, max3, max4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluralsRes pluralsRes = (PluralsRes) obj;
        return this.getMax == pluralsRes.getMax && this.setMin == pluralsRes.setMin && this.getMin == pluralsRes.getMin && this.length == pluralsRes.length;
    }

    public final int hashCode() {
        return (((((this.setMin * 31) + this.length) * 31) + this.getMin) * 31) + this.getMax;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.setMin);
        sb.append(", top=");
        sb.append(this.length);
        sb.append(", right=");
        sb.append(this.getMin);
        sb.append(", bottom=");
        sb.append(this.getMax);
        sb.append('}');
        return sb.toString();
    }

    @RequiresApi(api = 29)
    @NonNull
    public static PluralsRes getMin(@NonNull Insets insets) {
        int i = insets.left;
        int i2 = insets.top;
        int i3 = insets.right;
        int i4 = insets.bottom;
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return setMax;
        }
        return new PluralsRes(i, i2, i3, i4);
    }
}
