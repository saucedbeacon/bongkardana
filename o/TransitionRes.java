package o;

import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.Size;
import java.util.Locale;

public final class TransitionRes {
    private static final TransitionRes getMin = setMin(new Locale[0]);
    private VisibleForTesting setMax;

    private TransitionRes(VisibleForTesting visibleForTesting) {
        this.setMax = visibleForTesting;
    }

    @RequiresApi(24)
    @NonNull
    public static TransitionRes getMax(@NonNull LocaleList localeList) {
        return new TransitionRes(new otherwise(localeList));
    }

    @NonNull
    public static TransitionRes setMin(@NonNull Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return getMax(new LocaleList(localeArr));
        }
        return new TransitionRes(new UiThread(localeArr));
    }

    public final Locale getMin(int i) {
        return this.setMax.setMin(i);
    }

    @IntRange(from = 0)
    public final int setMax() {
        return this.setMax.length();
    }

    @NonNull
    public final String getMin() {
        return this.setMax.setMin();
    }

    @NonNull
    public static TransitionRes length() {
        return getMin;
    }

    @NonNull
    public static TransitionRes setMax(@Nullable String str) {
        Locale locale;
        if (str == null || str.isEmpty()) {
            return length();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            if (Build.VERSION.SDK_INT >= 21) {
                locale = Locale.forLanguageTag(split[i]);
            } else {
                locale = getMin(split[i]);
            }
            localeArr[i] = locale;
        }
        return setMin(localeArr);
    }

    static Locale getMin(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains("_")) {
            return new Locale(str);
        } else {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        StringBuilder sb = new StringBuilder("Can not parse language tag: [");
        sb.append(str);
        sb.append("]");
        throw new IllegalArgumentException(sb.toString());
    }

    @Size(min = 1)
    @NonNull
    public static TransitionRes setMin() {
        if (Build.VERSION.SDK_INT >= 24) {
            return getMax(LocaleList.getAdjustedDefault());
        }
        return setMin(Locale.getDefault());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof TransitionRes) && this.setMax.equals(((TransitionRes) obj).setMax);
    }

    public final int hashCode() {
        return this.setMax.hashCode();
    }

    public final String toString() {
        return this.setMax.toString();
    }
}
