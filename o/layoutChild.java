package o;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

public final class layoutChild implements setPivotY {
    private final Object setMax;

    public layoutChild(@NonNull Object obj) {
        if (obj != null) {
            this.setMax = obj;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ObjectKey{object=");
        sb.append(this.setMax);
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof layoutChild) {
            return this.setMax.equals(((layoutChild) obj).setMax);
        }
        return false;
    }

    public final int hashCode() {
        return this.setMax.hashCode();
    }

    public final void setMax(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.setMax.toString().getBytes(setMin));
    }
}
