package o;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class AlertDialogLayout {
    public final Set<getMax> setMin = new HashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.setMin.equals(((AlertDialogLayout) obj).setMin);
    }

    public final int hashCode() {
        return this.setMin.hashCode();
    }

    public static final class getMax {
        private final boolean getMin;
        @NonNull
        public final Uri setMax;

        public getMax(@NonNull Uri uri, boolean z) {
            this.setMax = uri;
            this.getMin = z;
        }

        public final boolean getMax() {
            return this.getMin;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                getMax getmax = (getMax) obj;
                return this.getMin == getmax.getMin && this.setMax.equals(getmax.setMax);
            }
        }

        public final int hashCode() {
            return (this.setMax.hashCode() * 31) + (this.getMin ? 1 : 0);
        }
    }
}
