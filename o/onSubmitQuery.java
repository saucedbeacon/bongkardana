package o;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class onSubmitQuery<T> {
    @Nullable
    public T getMin;
    @Nullable
    public T length;

    public final boolean equals(Object obj) {
        if (!(obj instanceof setNegativeButton)) {
            return false;
        }
        setNegativeButton setnegativebutton = (setNegativeButton) obj;
        if (!setMax(setnegativebutton.setMax, this.length) || !setMax(setnegativebutton.getMin, this.getMin)) {
            return false;
        }
        return true;
    }

    private static boolean setMax(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public final int hashCode() {
        T t = this.length;
        int i = 0;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.getMin;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(String.valueOf(this.length));
        sb.append(" ");
        sb.append(String.valueOf(this.getMin));
        sb.append("}");
        return sb.toString();
    }
}
