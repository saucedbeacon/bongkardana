package o;

import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;

public final class setSupportProgressBarVisibility {

    @Deprecated
    public interface setMax {
        @Deprecated
        void getMax(boolean z);
    }

    @Deprecated
    public static abstract class setMin implements setMax {
    }

    @Deprecated
    public static boolean getMin(AccessibilityManager accessibilityManager, setMax setmax) {
        if (setmax == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new length(setmax));
    }

    @Deprecated
    public static boolean getMax(AccessibilityManager accessibilityManager, setMax setmax) {
        if (setmax == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new length(setmax));
    }

    static class length implements AccessibilityManager.AccessibilityStateChangeListener {
        setMax getMax;

        length(@NonNull setMax setmax) {
            this.getMax = setmax;
        }

        public int hashCode() {
            return this.getMax.hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof length)) {
                return false;
            }
            return this.getMax.equals(((length) obj).getMax);
        }

        public void onAccessibilityStateChanged(boolean z) {
            this.getMax.getMax(z);
        }
    }
}
