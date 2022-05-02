package o;

import io.reactivex.annotations.NonNull;
import io.reactivex.internal.util.NotificationLite;

public final class getFavorite<T> {
    static final getFavorite<Object> setMin = new getFavorite<>((Object) null);
    public final Object setMax;

    private getFavorite(Object obj) {
        this.setMax = obj;
    }

    public final boolean getMin() {
        return this.setMax == null;
    }

    public final boolean setMin() {
        return NotificationLite.isError(this.setMax);
    }

    public final boolean getMax() {
        Object obj = this.setMax;
        return obj != null && !NotificationLite.isError(obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof getFavorite) {
            return setRefreshAnimation.getMin(this.setMax, ((getFavorite) obj).setMax);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.setMax;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.setMax;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (NotificationLite.isError(obj)) {
            StringBuilder sb = new StringBuilder("OnErrorNotification[");
            sb.append(NotificationLite.getError(obj));
            sb.append("]");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("OnNextNotification[");
        sb2.append(this.setMax);
        sb2.append("]");
        return sb2.toString();
    }

    @NonNull
    public static <T> getFavorite<T> getMax(@NonNull T t) {
        setRefreshAnimation.getMax(t, "value is null");
        return new getFavorite<>(t);
    }

    @NonNull
    public static <T> getFavorite<T> length(@NonNull Throwable th) {
        setRefreshAnimation.getMax(th, "error is null");
        return new getFavorite<>(NotificationLite.error(th));
    }

    @NonNull
    public static <T> getFavorite<T> setMax() {
        return setMin;
    }
}
