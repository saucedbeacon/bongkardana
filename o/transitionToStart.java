package o;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

public final class transitionToStart implements setPivotY {
    private final setPivotY getMin;
    private final setPivotY length;

    public transitionToStart(setPivotY setpivoty, setPivotY setpivoty2) {
        this.getMin = setpivoty;
        this.length = setpivoty2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof transitionToStart) {
            transitionToStart transitiontostart = (transitionToStart) obj;
            if (!this.getMin.equals(transitiontostart.getMin) || !this.length.equals(transitiontostart.length)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.getMin.hashCode() * 31) + this.length.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataCacheKey{sourceKey=");
        sb.append(this.getMin);
        sb.append(", signature=");
        sb.append(this.length);
        sb.append('}');
        return sb.toString();
    }

    public final void setMax(@NonNull MessageDigest messageDigest) {
        this.getMin.setMax(messageDigest);
        this.length.setMax(messageDigest);
    }
}
