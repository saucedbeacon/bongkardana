package o;

import android.os.Build;
import android.util.Pair;

public final class findOneVisibleChild<F, S> extends Pair<F, S> {
    public findOneVisibleChild(F f, S s) {
        super(f, s);
    }

    public final boolean equals(Object obj) {
        if (Build.VERSION.SDK_INT > 16) {
            return super.equals(obj);
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        if (pair.first == this.first || (pair.first != null && pair.first.equals(this.first))) {
            if (pair.second == this.second) {
                return true;
            }
            if (pair.second == null || !pair.second.equals(this.second)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (Build.VERSION.SDK_INT > 16) {
            return super.hashCode();
        }
        int i = 0;
        int hashCode = this.first == null ? 0 : this.first.hashCode();
        if (this.second != null) {
            i = this.second.hashCode();
        }
        return hashCode ^ i;
    }
}
