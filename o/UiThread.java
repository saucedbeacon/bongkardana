package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

final class UiThread implements VisibleForTesting {
    private static final Locale getMax = new Locale(startH5OpenAuth.KEY_EN, "XA");
    private static final Locale getMin = new Locale("ar", "XB");
    private static final Locale[] setMax = new Locale[0];
    private static final Locale toFloatRange = TransitionRes.getMin("en-Latn");
    private final Locale[] length;
    @NonNull
    private final String setMin;

    @Nullable
    public final Object getMin() {
        return null;
    }

    public final Locale setMin(int i) {
        if (i < 0) {
            return null;
        }
        Locale[] localeArr = this.length;
        if (i < localeArr.length) {
            return localeArr[i];
        }
        return null;
    }

    public final int length() {
        return this.length.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiThread)) {
            return false;
        }
        Locale[] localeArr = ((UiThread) obj).length;
        if (this.length.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.length;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    public final int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.length;
            if (i2 >= localeArr.length) {
                return i;
            }
            i = (i * 31) + localeArr[i2].hashCode();
            i2++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.length;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.length.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }

    public final String setMin() {
        return this.setMin;
    }

    UiThread(@NonNull Locale... localeArr) {
        if (localeArr.length == 0) {
            this.length = setMax;
            this.setMin = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < localeArr.length) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    setMax(sb, locale2);
                    if (i < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
                i++;
            } else {
                StringBuilder sb2 = new StringBuilder("list[");
                sb2.append(i);
                sb2.append("] is null");
                throw new NullPointerException(sb2.toString());
            }
        }
        this.length = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
        this.setMin = sb.toString();
    }

    @VisibleForTesting
    static void setMax(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }
}
