package o;

import androidx.annotation.NonNull;

public class setNegativeButton<F, S> {
    public final S getMin;
    public final F setMax;

    public setNegativeButton(F f, S s) {
        this.setMax = f;
        this.getMin = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof setNegativeButton)) {
            return false;
        }
        setNegativeButton setnegativebutton = (setNegativeButton) obj;
        if (!setNegativeButtonIcon.getMax(setnegativebutton.setMax, this.setMax) || !setNegativeButtonIcon.getMax(setnegativebutton.getMin, this.getMin)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        F f = this.setMax;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.getMin;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(this.setMax);
        sb.append(" ");
        sb.append(this.getMin);
        sb.append("}");
        return sb.toString();
    }

    @NonNull
    public static <A, B> setNegativeButton<A, B> getMax(A a2, B b) {
        return new setNegativeButton<>(a2, b);
    }
}
