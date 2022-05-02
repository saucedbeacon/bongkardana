package o;

import java.lang.reflect.Array;
import java.util.Iterator;

public final class onTouchDown implements Iterator<Object> {
    private int getMax = 0;
    private final Object length;

    public onTouchDown(Object obj) {
        if (obj.getClass().isArray()) {
            this.length = obj;
            return;
        }
        throw new IllegalArgumentException("not an array");
    }

    public final boolean hasNext() {
        return this.getMax < Array.getLength(this.length);
    }

    public final Object next() {
        Object obj = this.length;
        int i = this.getMax;
        this.getMax = i + 1;
        return Array.get(obj, i);
    }

    public final void remove() {
        throw new UnsupportedOperationException("cannot remove items from an array");
    }
}
