package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class ensurePreDrawListener {
    public Class<?> getMax;
    public Class<?> getMin;
    public Class<?> setMin;

    public ensurePreDrawListener() {
    }

    public ensurePreDrawListener(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        this.setMin = cls;
        this.getMin = cls2;
        this.getMax = cls3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiClassKey{first=");
        sb.append(this.setMin);
        sb.append(", second=");
        sb.append(this.getMin);
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ensurePreDrawListener ensurepredrawlistener = (ensurePreDrawListener) obj;
        return this.setMin.equals(ensurepredrawlistener.setMin) && this.getMin.equals(ensurepredrawlistener.getMin) && getDependents.setMin(this.getMax, ensurepredrawlistener.getMax);
    }

    public final int hashCode() {
        int hashCode = ((this.setMin.hashCode() * 31) + this.getMin.hashCode()) * 31;
        Class<?> cls = this.getMax;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }
}
