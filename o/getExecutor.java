package o;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

public final class getExecutor {
    private static volatile boolean getMax = false;
    private static volatile boolean getMin = false;
    public static boolean setMax = false;

    public static boolean setMin(Context context) {
        if (!setMax) {
            return setMax((AccessibilityManager) context.getSystemService("accessibility"));
        }
        if (!getMin) {
            getMin((AccessibilityManager) context.getSystemService("accessibility"));
        }
        return getMax;
    }

    public static boolean setMax(AccessibilityManager accessibilityManager) {
        if (!setMax) {
            return Boolean.getBoolean("is_accessibility_enabled") || getMax(accessibilityManager);
        }
        if (!getMin) {
            getMin(accessibilityManager);
        }
        return getMax;
    }

    private static synchronized void getMin(AccessibilityManager accessibilityManager) {
        boolean z;
        synchronized (getExecutor.class) {
            if (!Boolean.getBoolean("is_accessibility_enabled")) {
                if (!getMax(accessibilityManager)) {
                    z = false;
                    getMax = z;
                    getMin = true;
                }
            }
            z = true;
            getMax = z;
            getMin = true;
        }
    }

    public static synchronized void setMax() {
        synchronized (getExecutor.class) {
            getMin = false;
        }
    }

    private static boolean getMax(AccessibilityManager accessibilityManager) {
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return false;
        }
        if (!setMax) {
            return accessibilityManager.isTouchExplorationEnabled();
        }
        if (accessibilityManager.isTouchExplorationEnabled() || length(accessibilityManager)) {
            return true;
        }
        return false;
    }

    private static boolean length(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        if (enabledAccessibilityServiceList == null) {
            return false;
        }
        for (AccessibilityServiceInfo next : enabledAccessibilityServiceList) {
            if ((next.eventTypes & 32768) == 32768 && (toInclusive.getMin(next) & 1) == 1) {
                return true;
            }
        }
        return false;
    }
}
