package androidx.core.text.util;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Comparator;

public final class LinkifyCompat {
    private static final String[] getMax = new String[0];
    private static final Comparator<getMax> setMin = new Comparator<getMax>() {
        /* renamed from: getMin */
        public int compare(getMax getmax, getMax getmax2) {
            if (getmax.setMin < getmax2.setMin) {
                return -1;
            }
            if (getmax.setMin > getmax2.setMin || getmax.length < getmax2.length) {
                return 1;
            }
            if (getmax.length > getmax2.length) {
                return -1;
            }
            return 0;
        }
    };

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface LinkifyMask {
    }

    static class getMax {
        int length;
        int setMin;

        getMax() {
        }
    }
}
