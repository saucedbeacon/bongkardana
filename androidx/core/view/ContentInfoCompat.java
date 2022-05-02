package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;

public final class ContentInfoCompat {
    @Nullable
    final Uri getMax;
    final int getMin;
    @Nullable
    final Bundle length;
    @NonNull
    final ClipData setMax;
    final int setMin;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Source {
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    static String setMax(int i) {
        if (i == 0) {
            return "SOURCE_APP";
        }
        if (i == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i != 2) {
            return i != 3 ? String.valueOf(i) : "SOURCE_DRAG_AND_DROP";
        }
        return "SOURCE_INPUT_METHOD";
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    static String getMax(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    ContentInfoCompat(setMin setmin) {
        ClipData clipData = setmin.setMin;
        if (clipData != null) {
            this.setMax = clipData;
            int i = setmin.getMin;
            if (i < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{"source", 0, 3}));
            } else if (i <= 3) {
                this.setMin = i;
                int i2 = setmin.getMax;
                if ((i2 & 1) == i2) {
                    this.getMin = i2;
                    this.getMax = setmin.length;
                    this.length = setmin.setMax;
                    return;
                }
                StringBuilder sb = new StringBuilder("Requested flags 0x");
                sb.append(Integer.toHexString(i2));
                sb.append(", but only 0x");
                sb.append(Integer.toHexString(1));
                sb.append(" are allowed");
                throw new IllegalArgumentException(sb.toString());
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{"source", 0, 3}));
            }
        } else {
            throw null;
        }
    }

    @NonNull
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
        sb.append(this.setMax.getDescription());
        sb.append(", source=");
        sb.append(setMax(this.setMin));
        sb.append(", flags=");
        sb.append(getMax(this.getMin));
        String str2 = "";
        if (this.getMax == null) {
            str = str2;
        } else {
            StringBuilder sb2 = new StringBuilder(", hasLinkUri(");
            sb2.append(this.getMax.toString().length());
            sb2.append(")");
            str = sb2.toString();
        }
        sb.append(str);
        if (this.length != null) {
            str2 = ", hasExtras";
        }
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    @NonNull
    public final ClipData getMax() {
        return this.setMax;
    }

    public final int getMin() {
        return this.setMin;
    }

    public final int length() {
        return this.getMin;
    }

    public static final class setMin {
        int getMax;
        int getMin;
        @Nullable
        Uri length;
        @Nullable
        Bundle setMax;
        @NonNull
        ClipData setMin;

        public setMin(@NonNull ClipData clipData, int i) {
            this.setMin = clipData;
            this.getMin = i;
        }

        @NonNull
        public final setMin setMax(int i) {
            this.getMax = i;
            return this;
        }

        @NonNull
        public final setMin length(@Nullable Uri uri) {
            this.length = uri;
            return this;
        }

        @NonNull
        public final setMin length(@Nullable Bundle bundle) {
            this.setMax = bundle;
            return this;
        }

        @NonNull
        public final ContentInfoCompat length() {
            return new ContentInfoCompat(this);
        }
    }
}
