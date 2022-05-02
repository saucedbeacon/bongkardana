package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

abstract class setTargetPosition<T> {
    private static final Comparator<? super Map.Entry<Integer, ?>> COMPARATOR = new Comparator<Map.Entry<Integer, ?>>() {
        public final int compare(Map.Entry<Integer, ?> entry, Map.Entry<Integer, ?> entry2) {
            return entry.getKey().compareTo(entry2.getKey());
        }
    };
    private static final float RATIO_THRESHOLD = 0.75f;
    private static final int SIZE_THRESHOLD = 64;
    List<T> values;

    private static boolean isCompact(int i, int i2) {
        return i2 <= 64 || ((float) i) / ((float) i2) > 0.75f;
    }

    public abstract boolean containsKey(int i);

    public abstract T get(int i);

    public static <T> setTargetPosition<T> of(Map<Integer, T> map) {
        int maxTag = maxTag(map);
        if (isCompact(map.size(), maxTag)) {
            return getMin.compactTagMapOf(map, maxTag);
        }
        return getMax.sparseTagMapOf(map);
    }

    private static <T> int maxTag(Map<Integer, T> map) {
        int i = -1;
        for (Integer intValue : map.keySet()) {
            int intValue2 = intValue.intValue();
            if (intValue2 > i) {
                i = intValue2;
            }
        }
        return i;
    }

    private static <T> List<T> sortedValues(Map<Integer, T> map) {
        TreeSet treeSet = new TreeSet(COMPARATOR);
        treeSet.addAll(map.entrySet());
        ArrayList arrayList = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }

    protected setTargetPosition(Map<Integer, T> map) {
        this.values = sortedValues(map);
    }

    public Collection<T> values() {
        return this.values;
    }

    static final class getMin<T> extends setTargetPosition<T> {
        Object[] elementsByTag;
        int maxTag = -1;

        public static <T> getMin<T> compactTagMapOf(Map<Integer, T> map, int i) {
            return new getMin<>(map, i);
        }

        private getMin(Map<Integer, T> map, int i) {
            super(map);
            this.maxTag = i;
            this.elementsByTag = new Object[(i + 1)];
            for (Map.Entry next : map.entrySet()) {
                Integer num = (Integer) next.getKey();
                if (num.intValue() > 0) {
                    this.elementsByTag[num.intValue()] = next.getValue();
                } else {
                    throw new IllegalArgumentException("Input map key is negative or zero");
                }
            }
        }

        public final T get(int i) {
            if (i > this.maxTag) {
                return null;
            }
            return this.elementsByTag[i];
        }

        public final boolean containsKey(int i) {
            if (i <= this.maxTag && this.elementsByTag[i] != null) {
                return true;
            }
            return false;
        }
    }

    static final class getMax<T> extends setTargetPosition<T> {
        Map<Integer, T> map;

        public static <T> getMax<T> sparseTagMapOf(Map<Integer, T> map2) {
            return new getMax<>(map2);
        }

        private getMax(Map<Integer, T> map2) {
            super(map2);
            this.map = map2;
        }

        public final T get(int i) {
            return this.map.get(Integer.valueOf(i));
        }

        public final boolean containsKey(int i) {
            return this.map.containsKey(Integer.valueOf(i));
        }
    }
}
