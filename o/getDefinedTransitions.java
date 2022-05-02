package o;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class getDefinedTransitions implements setOnHide {
    private final getEndState<setMin, Object> getMax;
    private final Map<Class<?>, NavigableMap<Integer, Integer>> getMin;
    private final setMax length;
    private final Map<Class<?>, setOnShow<?>> setMax;
    private final int setMin;
    private int toFloatRange;

    @VisibleForTesting
    public getDefinedTransitions() {
        this.getMax = new getEndState<>();
        this.length = new setMax();
        this.getMin = new HashMap();
        this.setMax = new HashMap();
        this.setMin = 4194304;
    }

    public getDefinedTransitions(int i) {
        this.getMax = new getEndState<>();
        this.length = new setMax();
        this.getMin = new HashMap();
        this.setMax = new HashMap();
        this.setMin = i;
    }

    public final synchronized <T> void setMin(T t) {
        Class<?> cls = t.getClass();
        setOnShow<?> max = setMax(cls);
        int min = max.getMin(t);
        int max2 = max.setMax() * min;
        if (setMax(max2)) {
            setMax setmax = this.length;
            setInteractionEnabled setinteractionenabled = (setInteractionEnabled) setmax.setMax.poll();
            if (setinteractionenabled == null) {
                setinteractionenabled = setmax.getMin();
            }
            setMin setmin = (setMin) setinteractionenabled;
            setmin.length = min;
            setmin.setMax = cls;
            this.getMax.setMin(setmin, t);
            NavigableMap<Integer, Integer> min2 = getMin(cls);
            Integer num = (Integer) min2.get(Integer.valueOf(setmin.length));
            Integer valueOf = Integer.valueOf(setmin.length);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            min2.put(valueOf, Integer.valueOf(i));
            this.toFloatRange += max2;
            length(this.setMin);
        }
    }

    public final synchronized <T> T getMax(Class<T> cls) {
        setMin setmin;
        setMax setmax = this.length;
        setInteractionEnabled setinteractionenabled = (setInteractionEnabled) setmax.setMax.poll();
        if (setinteractionenabled == null) {
            setinteractionenabled = setmax.getMin();
        }
        setmin = (setMin) setinteractionenabled;
        setmin.length = 8;
        setmin.setMax = cls;
        return getMax(setmin, cls);
    }

    public final synchronized <T> T length(int i, Class<T> cls) {
        setMin setmin;
        Integer ceilingKey = getMin(cls).ceilingKey(Integer.valueOf(i));
        if (getMax(i, ceilingKey)) {
            setMax setmax = this.length;
            int intValue = ceilingKey.intValue();
            setInteractionEnabled setinteractionenabled = (setInteractionEnabled) setmax.setMax.poll();
            if (setinteractionenabled == null) {
                setinteractionenabled = setmax.getMin();
            }
            setmin = (setMin) setinteractionenabled;
            setmin.length = intValue;
            setmin.setMax = cls;
        } else {
            setMax setmax2 = this.length;
            setInteractionEnabled setinteractionenabled2 = (setInteractionEnabled) setmax2.setMax.poll();
            if (setinteractionenabled2 == null) {
                setinteractionenabled2 = setmax2.getMin();
            }
            setmin = (setMin) setinteractionenabled2;
            setmin.length = i;
            setmin.setMax = cls;
        }
        return getMax(setmin, cls);
    }

    private <T> T getMax(setMin setmin, Class<T> cls) {
        setOnShow<T> max = setMax(cls);
        T min = this.getMax.getMin(setmin);
        if (min != null) {
            this.toFloatRange -= max.getMin(min) * max.setMax();
            getMin(max.getMin(min), cls);
        }
        if (min != null) {
            return min;
        }
        if (Log.isLoggable(max.getMin(), 2)) {
            max.getMin();
        }
        return max.length(setmin.length);
    }

    private boolean setMax(int i) {
        return i <= this.setMin / 2;
    }

    private boolean getMax(int i, Integer num) {
        if (num != null) {
            return getMin() || num.intValue() <= i * 8;
        }
        return false;
    }

    private boolean getMin() {
        int i = this.toFloatRange;
        return i == 0 || this.setMin / i >= 2;
    }

    public final synchronized void setMax() {
        length(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void setMin(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            r0 = 40
            if (r2 < r0) goto L_0x000c
            r1.setMax()     // Catch:{ all -> 0x000a }
            monitor-exit(r1)
            return
        L_0x000a:
            r2 = move-exception
            goto L_0x001d
        L_0x000c:
            r0 = 20
            if (r2 >= r0) goto L_0x0014
            r0 = 15
            if (r2 != r0) goto L_0x001b
        L_0x0014:
            int r2 = r1.setMin     // Catch:{ all -> 0x000a }
            int r2 = r2 / 2
            r1.length(r2)     // Catch:{ all -> 0x000a }
        L_0x001b:
            monitor-exit(r1)
            return
        L_0x001d:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDefinedTransitions.setMin(int):void");
    }

    private void length(int i) {
        while (this.toFloatRange > i) {
            Object max = this.getMax.setMax();
            if (max != null) {
                setOnShow<?> max2 = setMax(max.getClass());
                this.toFloatRange -= max2.getMin(max) * max2.setMax();
                getMin(max2.getMin(max), max.getClass());
                if (Log.isLoggable(max2.getMin(), 2)) {
                    max2.getMin();
                }
            } else {
                throw new NullPointerException("Argument must not be null");
            }
        }
    }

    private void getMin(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> min = getMin(cls);
        Integer num = (Integer) min.get(Integer.valueOf(i));
        if (num == null) {
            StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
            sb.append(i);
            sb.append(", this: ");
            sb.append(this);
            throw new NullPointerException(sb.toString());
        } else if (num.intValue() == 1) {
            min.remove(Integer.valueOf(i));
        } else {
            min.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    private NavigableMap<Integer, Integer> getMin(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.getMin.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.getMin.put(cls, treeMap);
        return treeMap;
    }

    private <T> setOnShow<T> setMax(Class<T> cls) {
        setOnShow<T> setonshow = this.setMax.get(cls);
        if (setonshow == null) {
            if (cls.equals(int[].class)) {
                setonshow = new setTransitionDuration();
            } else if (cls.equals(byte[].class)) {
                setonshow = new updateState();
            } else {
                StringBuilder sb = new StringBuilder("No array pool found for: ");
                sb.append(cls.getSimpleName());
                throw new IllegalArgumentException(sb.toString());
            }
            this.setMax.put(cls, setonshow);
        }
        return setonshow;
    }

    static final class setMax extends getConstraintSetIds<setMin> {
        setMax() {
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ setInteractionEnabled getMin() {
            return new setMin(this);
        }
    }

    static final class setMin implements setInteractionEnabled {
        private final setMax getMin;
        int length;
        Class<?> setMax;

        setMin(setMax setmax) {
            this.getMin = setmax;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof setMin) {
                setMin setmin = (setMin) obj;
                if (this.length == setmin.length && this.setMax == setmin.setMax) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Key{size=");
            sb.append(this.length);
            sb.append("array=");
            sb.append(this.setMax);
            sb.append('}');
            return sb.toString();
        }

        public final void getMax() {
            setMax setmax = this.getMin;
            if (setmax.setMax.size() < 20) {
                setmax.setMax.offer(this);
            }
        }

        public final int hashCode() {
            int i = this.length * 31;
            Class<?> cls = this.setMax;
            return i + (cls != null ? cls.hashCode() : 0);
        }
    }
}
