package o;

import android.icu.util.ULocale;
import android.os.Build;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public final class setHasDecor {
    private static Method length;
    private static Method setMax;

    static {
        if (Build.VERSION.SDK_INT < 21) {
            try {
                Class<?> cls = Class.forName("libcore.icu.ICU");
                if (cls != null) {
                    setMax = cls.getMethod("getScript", new Class[]{String.class});
                    length = cls.getMethod("addLikelySubtags", new Class[]{String.class});
                }
            } catch (Exception unused) {
                setMax = null;
                length = null;
            }
        } else if (Build.VERSION.SDK_INT < 24) {
            try {
                length = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    @Nullable
    public static String getMin(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return ((Locale) length.invoke((Object) null, new Object[]{locale})).getScript();
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return locale.getScript();
            }
        } else {
            String max = getMax(locale);
            if (max != null) {
                return setMin(max);
            }
            return null;
        }
    }

    private static String setMin(String str) {
        try {
            if (setMax != null) {
                return (String) setMax.invoke((Object) null, new Object[]{str});
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }

    private static String getMax(Locale locale) {
        String obj = locale.toString();
        try {
            if (length != null) {
                return (String) length.invoke((Object) null, new Object[]{obj});
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return obj;
    }
}
