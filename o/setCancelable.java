package o;

import android.os.Build;
import android.view.DisplayCutout;
import id.dana.danah5.DanaH5;
import kotlin.Metadata;

public final class setCancelable {
    private final Object length;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class core {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DanaH5.H5Requirement.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[DanaH5.H5Requirement.UPDATE_OS.ordinal()] = 1;
            $EnumSwitchMapping$0[DanaH5.H5Requirement.UPDATE_APP.ordinal()] = 2;
            $EnumSwitchMapping$0[DanaH5.H5Requirement.NOTHING.ordinal()] = 3;
        }
    }

    private setCancelable(Object obj) {
        this.length = obj;
    }

    public final int getMax() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.length).getSafeInsetTop();
        }
        return 0;
    }

    public final int length() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.length).getSafeInsetBottom();
        }
        return 0;
    }

    public final int setMin() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.length).getSafeInsetLeft();
        }
        return 0;
    }

    public final int getMin() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.length).getSafeInsetRight();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return setNegativeButtonIcon.getMax(this.length, ((setCancelable) obj).length);
    }

    public final int hashCode() {
        Object obj = this.length;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayCutoutCompat{");
        sb.append(this.length);
        sb.append("}");
        return sb.toString();
    }

    public static setCancelable getMin(Object obj) {
        if (obj == null) {
            return null;
        }
        return new setCancelable(obj);
    }
}
