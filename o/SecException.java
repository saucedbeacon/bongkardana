package o;

import io.reactivex.annotations.NonNull;
import java.util.concurrent.TimeUnit;

public final class SecException<T> {
    public final long getMax;
    final TimeUnit getMin;
    public final T setMin;

    public SecException(@NonNull T t, long j, @NonNull TimeUnit timeUnit) {
        this.setMin = t;
        this.getMax = j;
        this.getMin = (TimeUnit) setRefreshAnimation.getMax(timeUnit, "unit is null");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SecException) {
            SecException secException = (SecException) obj;
            if (!setRefreshAnimation.getMin(this.setMin, secException.setMin) || this.getMax != secException.getMax || !setRefreshAnimation.getMin(this.getMin, secException.getMin)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        T t = this.setMin;
        int hashCode = t != null ? t.hashCode() : 0;
        long j = this.getMax;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 31)))) * 31) + this.getMin.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timed[time=");
        sb.append(this.getMax);
        sb.append(", unit=");
        sb.append(this.getMin);
        sb.append(", value=");
        sb.append(this.setMin);
        sb.append("]");
        return sb.toString();
    }
}
