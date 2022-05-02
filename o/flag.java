package o;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public final class flag {
    private final String length;
    private final LocusId setMin;

    public flag(@NonNull String str) {
        if (!TextUtils.isEmpty(str)) {
            this.length = str;
            if (Build.VERSION.SDK_INT >= 29) {
                this.setMin = getMin.setMax(str);
            } else {
                this.setMin = null;
            }
        } else {
            throw new IllegalArgumentException("id cannot be empty");
        }
    }

    @NonNull
    public final String getMax() {
        return this.length;
    }

    public final int hashCode() {
        String str = this.length;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        flag flag = (flag) obj;
        String str = this.length;
        if (str == null) {
            return flag.length == null;
        }
        return str.equals(flag.length);
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("LocusIdCompat[");
        sb.append(length());
        sb.append("]");
        return sb.toString();
    }

    @RequiresApi(29)
    @NonNull
    public final LocusId setMin() {
        return this.setMin;
    }

    @NonNull
    private String length() {
        int length2 = this.length.length();
        StringBuilder sb = new StringBuilder();
        sb.append(length2);
        sb.append("_chars");
        return sb.toString();
    }

    @RequiresApi(29)
    static class getMin {
        @NonNull
        static LocusId setMax(@NonNull String str) {
            return new LocusId(str);
        }
    }
}
