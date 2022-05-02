package o;

import androidx.annotation.Nullable;
import com.facebook.litho.ComponentsLogger;
import java.util.Map;
import javax.annotation.CheckReturnValue;

public final class ViewCompat$FocusRelativeDirection {
    @CheckReturnValue
    @Nullable
    public static startNestedScroll setMax(ensureProcessorRunningLocked ensureprocessorrunninglocked, ComponentsLogger componentsLogger, startNestedScroll startnestedscroll) {
        Map<String, String> length;
        if (ensureprocessorrunninglocked.setMax == null) {
            return null;
        }
        if (ensureprocessorrunninglocked.toDoubleRange == null || (length = componentsLogger.length()) == null) {
            return startnestedscroll;
        }
        for (Map.Entry next : length.entrySet()) {
            next.getKey();
            next.getValue();
        }
        return startnestedscroll;
    }

    @Nullable
    public static String getMax(isStopped isstopped, ComponentsLogger componentsLogger) {
        Map<String, String> length;
        ensureProcessorRunningLocked ensureprocessorrunninglocked = isstopped.FastBitmap$CoordinateSystem;
        if (ensureprocessorrunninglocked == null || ensureprocessorrunninglocked.toDoubleRange == null || (length = componentsLogger.length()) == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(length.size() * 16);
        for (Map.Entry next : length.entrySet()) {
            sb.append((String) next.getKey());
            sb.append(':');
            sb.append((String) next.getValue());
            sb.append(':');
        }
        return sb.toString();
    }
}
