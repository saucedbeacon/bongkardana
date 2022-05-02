package o;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

public final class setTitle {
    private static final Locale getMin = new Locale("", "");

    public static int setMax(@Nullable Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(getMin)) {
            return 0;
        }
        String min = setHasDecor.getMin(locale);
        if (min == null) {
            return getMax(locale);
        }
        return (min.equalsIgnoreCase("Arab") || min.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }

    private static int getMax(@NonNull Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }
}
