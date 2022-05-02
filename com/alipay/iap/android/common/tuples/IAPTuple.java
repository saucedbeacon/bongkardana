package com.alipay.iap.android.common.tuples;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class IAPTuple implements Iterable<Object>, Serializable, Comparable<IAPTuple> {
    private static final long serialVersionUID = 5431085632328343101L;
    private final Object[] valueArray;
    private final List<Object> valueList;

    public abstract int getSize();

    @Deprecated
    protected IAPTuple(int i, Object... objArr) {
        this.valueArray = objArr;
        this.valueList = Arrays.asList(objArr);
    }

    protected IAPTuple(Object... objArr) {
        this.valueArray = objArr;
        this.valueList = Arrays.asList(objArr);
    }

    public final Object getValue(int i) {
        if (i < getSize()) {
            return this.valueArray[i];
        }
        StringBuilder sb = new StringBuilder("Cannot retrieve position ");
        sb.append(i);
        sb.append(" in ");
        sb.append(getClass().getSimpleName());
        sb.append(". Positions for this class start with 0 and end with ");
        sb.append(getSize() - 1);
        throw new IllegalArgumentException(sb.toString());
    }

    public final Iterator<Object> iterator() {
        return this.valueList.iterator();
    }

    public final String toString() {
        return this.valueList.toString();
    }

    public final boolean contains(Object obj) {
        for (Object next : this.valueList) {
            if (next == null) {
                if (obj == null) {
                    return true;
                }
            } else if (next.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean containsAll(Object... objArr) {
        if (objArr != null) {
            for (Object contains : objArr) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException("Values array cannot be null");
    }

    public final int indexOf(Object obj) {
        int i = 0;
        for (Object next : this.valueList) {
            if (next == null) {
                if (obj == null) {
                    return i;
                }
            } else if (next.equals(obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        for (int size = getSize() - 1; size >= 0; size--) {
            Object obj2 = this.valueList.get(size);
            if (obj2 == null) {
                if (obj == null) {
                    return size;
                }
            } else if (obj2.equals(obj)) {
                return size;
            }
        }
        return -1;
    }

    public final List<Object> toList() {
        return Collections.unmodifiableList(new ArrayList(this.valueList));
    }

    public final Object[] toArray() {
        return (Object[]) this.valueArray.clone();
    }

    public final int hashCode() {
        int i;
        List<Object> list = this.valueList;
        if (list == null) {
            i = 0;
        } else {
            i = list.hashCode();
        }
        return i + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.valueList.equals(((IAPTuple) obj).valueList);
        }
        return false;
    }

    public int compareTo(IAPTuple iAPTuple) {
        int length = this.valueArray.length;
        Object[] objArr = iAPTuple.valueArray;
        int length2 = objArr.length;
        int i = 0;
        while (i < length && i < length2) {
            int compareTo = ((Comparable) this.valueArray[i]).compareTo((Comparable) objArr[i]);
            if (compareTo != 0) {
                return compareTo;
            }
            i++;
        }
        return Integer.valueOf(length).compareTo(Integer.valueOf(length2));
    }
}
