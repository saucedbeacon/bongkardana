package o;

import java.util.AbstractList;
import java.util.RandomAccess;

final class drawVerticalDivider<T> extends AbstractList<T> implements RandomAccess {
    private final T[] getMax;

    drawVerticalDivider(T[] tArr) {
        this.getMax = tArr;
    }

    public final T get(int i) {
        return this.getMax[i];
    }

    public final int size() {
        return this.getMax.length;
    }

    public final boolean contains(Object obj) {
        for (T t : this.getMax) {
            if (t == obj) {
                return true;
            }
        }
        return false;
    }
}
