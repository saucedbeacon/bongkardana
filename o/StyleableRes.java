package o;

import android.os.Build;
import android.os.Trace;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;

@Deprecated
public final class StyleableRes {
    private static long getMax;
    private static Method getMin;
    private static Method length;
    private static Method setMax;
    private static Method setMin;

    static {
        if (Build.VERSION.SDK_INT >= 18 && Build.VERSION.SDK_INT < 29) {
            try {
                getMax = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                setMin = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
                getMin = Trace.class.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, String.class, Integer.TYPE});
                length = Trace.class.getMethod("asyncTraceEnd", new Class[]{Long.TYPE, String.class, Integer.TYPE});
                setMax = Trace.class.getMethod("traceCounter", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            } catch (Exception unused) {
            }
        }
    }

    public static void setMax(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void getMin() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
