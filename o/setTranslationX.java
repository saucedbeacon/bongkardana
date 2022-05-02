package o;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;

public final class setTranslationX<T> {
    private static final getMax<Object> setMin = new getMax<Object>() {
        public final void length(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    };
    public final T getMax;
    private final String getMin;
    final getMax<T> length;
    private volatile byte[] setMax;

    public interface getMax<T> {
        void length(@NonNull byte[] bArr, @NonNull T t, @NonNull MessageDigest messageDigest);
    }

    @NonNull
    public static <T> setTranslationX<T> getMax(@NonNull String str) {
        return new setTranslationX<>(str, (Object) null, setMin);
    }

    @NonNull
    public static <T> setTranslationX<T> setMin(@NonNull String str, @NonNull T t) {
        return new setTranslationX<>(str, t, setMin);
    }

    @NonNull
    public static <T> setTranslationX<T> setMax(@NonNull String str, @Nullable T t, @NonNull getMax<T> getmax) {
        return new setTranslationX<>(str, t, getmax);
    }

    private setTranslationX(@NonNull String str, @Nullable T t, @NonNull getMax<T> getmax) {
        if (!TextUtils.isEmpty(str)) {
            this.getMin = str;
            this.getMax = t;
            if (getmax != null) {
                this.length = getmax;
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final byte[] setMax() {
        if (this.setMax == null) {
            this.setMax = this.getMin.getBytes(setPivotY.setMin);
        }
        return this.setMax;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof setTranslationX) {
            return this.getMin.equals(((setTranslationX) obj).getMin);
        }
        return false;
    }

    public final int hashCode() {
        return this.getMin.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Option{key='");
        sb.append(this.getMin);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
