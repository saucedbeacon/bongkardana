package o;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.NonNull;

public class startSupportActionMode {
    private final AccessibilityRecord setMin;

    @Deprecated
    public startSupportActionMode(Object obj) {
        this.setMin = (AccessibilityRecord) obj;
    }

    public static void length(@NonNull AccessibilityRecord accessibilityRecord, View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            accessibilityRecord.setSource(view, i);
        }
    }

    @Deprecated
    public void setMin(int i) {
        this.setMin.setFromIndex(i);
    }

    @Deprecated
    public void length(int i) {
        this.setMin.setToIndex(i);
    }

    public static void getMin(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }

    public static void length(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.setMin;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof startSupportActionMode)) {
            return false;
        }
        startSupportActionMode startsupportactionmode = (startSupportActionMode) obj;
        AccessibilityRecord accessibilityRecord = this.setMin;
        if (accessibilityRecord == null) {
            if (startsupportactionmode.setMin != null) {
                return false;
            }
        } else if (!accessibilityRecord.equals(startsupportactionmode.setMin)) {
            return false;
        }
        return true;
    }
}
