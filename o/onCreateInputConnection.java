package o;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

public interface onCreateInputConnection {
    @SuppressLint({"SyntheticAccessor"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final length.setMin getMin = new length.setMin((byte) 0);
    @SuppressLint({"SyntheticAccessor"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final length.getMin setMin = new length.getMin((byte) 0);

    public static abstract class length {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        length() {
        }

        public static final class setMin extends length {
            @NonNull
            public final String toString() {
                return "SUCCESS";
            }

            /* synthetic */ setMin(byte b) {
                this();
            }

            private setMin() {
            }
        }

        public static final class getMin extends length {
            @NonNull
            public final String toString() {
                return "IN_PROGRESS";
            }

            /* synthetic */ getMin(byte b) {
                this();
            }

            private getMin() {
            }
        }

        public static final class getMax extends length {
            public final Throwable length;

            public getMax(@NonNull Throwable th) {
                this.length = th;
            }

            @NonNull
            public final String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.length.getMessage()});
            }
        }
    }
}
