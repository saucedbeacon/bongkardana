package o;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class onNestedScrollAccepted {
    private static long getMin;
    private static Method length;

    @SuppressLint({"NewApi"})
    public static boolean setMax() {
        try {
            if (length == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return length();
    }

    private static boolean length() {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (length == null) {
                    getMin = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                    length = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
                }
                return ((Boolean) length.invoke((Object) null, new Object[]{Long.valueOf(getMin)})).booleanValue();
            } catch (Exception e) {
                if (e instanceof InvocationTargetException) {
                    Throwable cause = e.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    }
                    throw new RuntimeException(cause);
                }
            }
        }
        return false;
    }
}
