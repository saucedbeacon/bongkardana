package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.Experimental;
import o.RequiresApi;
import o.UseExperimental;
import o.XmlRes;

public class FontsContractCompat {

    public static class FontRequestCallback {

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Retention(RetentionPolicy.SOURCE)
        public @interface FontRequestFailReason {
        }

        public void getMin(int i) {
        }

        public void length(Typeface typeface) {
        }
    }

    @Nullable
    public static Typeface getMin(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull setMin[] setminArr) {
        return RequiresApi.getMax(context, cancellationSignal, setminArr, 0);
    }

    @NonNull
    public static length setMax(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull UseExperimental useExperimental) throws PackageManager.NameNotFoundException {
        return Experimental.getMin(context, useExperimental, cancellationSignal);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Typeface setMin(@NonNull Context context, @NonNull UseExperimental useExperimental, int i, boolean z, @IntRange(from = 0) int i2, @NonNull Handler handler, @NonNull FontRequestCallback fontRequestCallback) {
        XmlRes xmlRes = new XmlRes(fontRequestCallback, handler);
        if (z) {
            return Experimental.Level.setMin(context, useExperimental, xmlRes, i, i2);
        }
        return Experimental.Level.setMin(context, useExperimental, i, xmlRes);
    }

    public static class setMin {
        private final int getMax;
        private final Uri getMin;
        private final boolean length;
        private final int setMax;
        private final int setMin;

        @Deprecated
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public setMin(@NonNull Uri uri, @IntRange(from = 0) int i, @IntRange(from = 1, to = 1000) int i2, boolean z, int i3) {
            if (uri != null) {
                this.getMin = uri;
                this.getMax = i;
                this.setMax = i2;
                this.length = z;
                this.setMin = i3;
                return;
            }
            throw null;
        }

        public static setMin setMax(@NonNull Uri uri, @IntRange(from = 0) int i, @IntRange(from = 1, to = 1000) int i2, boolean z, int i3) {
            return new setMin(uri, i, i2, z, i3);
        }

        @NonNull
        public Uri setMax() {
            return this.getMin;
        }

        @IntRange(from = 0)
        public int length() {
            return this.getMax;
        }

        @IntRange(from = 1, to = 1000)
        public int getMin() {
            return this.setMax;
        }

        public boolean getMax() {
            return this.length;
        }

        public int setMin() {
            return this.setMin;
        }
    }

    public static class length {
        private final setMin[] getMin;
        private final int setMax;

        @Deprecated
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public length(int i, @Nullable setMin[] setminArr) {
            this.setMax = i;
            this.getMin = setminArr;
        }

        public int setMin() {
            return this.setMax;
        }

        public setMin[] length() {
            return this.getMin;
        }

        public static length setMax(int i, @Nullable setMin[] setminArr) {
            return new length(i, setminArr);
        }
    }
}
