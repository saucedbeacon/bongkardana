package o;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import androidx.annotation.NonNull;

public final class toInclusive {
    public static int getMin(@NonNull AccessibilityServiceInfo accessibilityServiceInfo) {
        if (Build.VERSION.SDK_INT >= 18) {
            return accessibilityServiceInfo.getCapabilities();
        }
        return accessibilityServiceInfo.getCanRetrieveWindowContent() ? 1 : 0;
    }
}
