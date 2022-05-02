package o;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

@RequiresApi(19)
public final class getTransition implements getTargetPosition {
    private static final Bitmap.Config[] getMax = {Bitmap.Config.RGB_565};
    private static final Bitmap.Config[] getMin;
    private static final Bitmap.Config[] length = {Bitmap.Config.ALPHA_8};
    private static final Bitmap.Config[] setMax;
    private static final Bitmap.Config[] setMin = {Bitmap.Config.ARGB_4444};
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> isInside = new HashMap();
    private final getMax toFloatRange = new getMax();
    private final getEndState<setMax, Bitmap> toIntRange = new getEndState<>();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        setMax = configArr;
        getMin = configArr;
    }

    public final void length(Bitmap bitmap) {
        setMax length2 = this.toFloatRange.length(getDependents.getMin(bitmap), bitmap.getConfig());
        this.toIntRange.setMin(length2, bitmap);
        NavigableMap<Integer, Integer> max = getMax(bitmap.getConfig());
        Integer num = (Integer) max.get(Integer.valueOf(length2.getMax));
        Integer valueOf = Integer.valueOf(length2.getMax);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        max.put(valueOf, Integer.valueOf(i));
    }

    @Nullable
    public final Bitmap setMax(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int min = getDependents.setMin(i, i2, config);
        setMax length2 = this.toFloatRange.length(min, config);
        int i3 = 0;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i4 = AnonymousClass5.length[config.ordinal()];
            if (i4 == 1) {
                configArr = setMax;
            } else if (i4 == 2) {
                configArr = getMax;
            } else if (i4 != 3) {
                configArr = i4 != 4 ? new Bitmap.Config[]{config} : length;
            } else {
                configArr = setMin;
            }
        } else {
            configArr = getMin;
        }
        int length3 = configArr.length;
        while (true) {
            if (i3 >= length3) {
                break;
            }
            Bitmap.Config config2 = configArr[i3];
            Integer ceilingKey = getMax(config2).ceilingKey(Integer.valueOf(min));
            if (ceilingKey == null || ceilingKey.intValue() > min * 8) {
                i3++;
            } else if (ceilingKey.intValue() != min || (config2 != null ? !config2.equals(config) : config != null)) {
                getMax getmax = this.toFloatRange;
                if (getmax.setMax.size() < 20) {
                    getmax.setMax.offer(length2);
                }
                length2 = this.toFloatRange.length(ceilingKey.intValue(), config2);
            }
        }
        Bitmap min2 = this.toIntRange.getMin(length2);
        if (min2 != null) {
            setMax(Integer.valueOf(length2.getMax), min2);
            min2.reconfigure(i, i2, config);
        }
        return min2;
    }

    @Nullable
    public final Bitmap length() {
        Bitmap max = this.toIntRange.setMax();
        if (max != null) {
            setMax(Integer.valueOf(getDependents.getMin(max)), max);
        }
        return max;
    }

    private void setMax(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> max = getMax(bitmap.getConfig());
        Integer num2 = (Integer) max.get(num);
        if (num2 == null) {
            StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
            sb.append(num);
            sb.append(", removed: ");
            sb.append(getMin(getDependents.getMin(bitmap), bitmap.getConfig()));
            sb.append(", this: ");
            sb.append(this);
            throw new NullPointerException(sb.toString());
        } else if (num2.intValue() == 1) {
            max.remove(num);
        } else {
            max.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    private NavigableMap<Integer, Integer> getMax(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.isInside.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.isInside.put(config, treeMap);
        return treeMap;
    }

    public final String setMin(Bitmap bitmap) {
        return getMin(getDependents.getMin(bitmap), bitmap.getConfig());
    }

    public final String getMax(int i, int i2, Bitmap.Config config) {
        return getMin(getDependents.setMin(i, i2, config), config);
    }

    public final int getMax(Bitmap bitmap) {
        return getDependents.getMin(bitmap);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SizeConfigStrategy{groupedMap=");
        sb.append(this.toIntRange);
        sb.append(", sortedSizes=(");
        for (Map.Entry next : this.isInside.entrySet()) {
            sb.append(next.getKey());
            sb.append('[');
            sb.append(next.getValue());
            sb.append("], ");
        }
        if (!this.isInside.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    @VisibleForTesting
    static class getMax extends getConstraintSetIds<setMax> {
        getMax() {
        }

        public final setMax length(int i, Bitmap.Config config) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(660882708, oncanceled);
                onCancelLoad.getMin(660882708, oncanceled);
            }
            setInteractionEnabled setinteractionenabled = (setInteractionEnabled) this.setMax.poll();
            if (setinteractionenabled == null) {
                setinteractionenabled = getMin();
            }
            setMax setmax = (setMax) setinteractionenabled;
            setmax.getMax = i;
            setmax.length = config;
            return setmax;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ setInteractionEnabled getMin() {
            return new setMax(this);
        }
    }

    @VisibleForTesting
    static final class setMax implements setInteractionEnabled {
        int getMax;
        Bitmap.Config length;
        private final getMax setMin;

        public setMax(getMax getmax) {
            this.setMin = getmax;
        }

        public final void getMax() {
            getMax getmax = this.setMin;
            if (getmax.setMax.size() < 20) {
                getmax.setMax.offer(this);
            }
        }

        public final String toString() {
            return getTransition.getMin(this.getMax, this.length);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof setMax) {
                setMax setmax = (setMax) obj;
                if (this.getMax != setmax.getMax || !getDependents.setMin(this.length, setmax.length)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i = this.getMax * 31;
            Bitmap.Config config = this.length;
            return i + (config != null ? config.hashCode() : 0);
        }
    }

    static String getMin(int i, Bitmap.Config config) {
        StringBuilder sb = new StringBuilder("[");
        sb.append(i);
        sb.append("](");
        sb.append(config);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: o.getTransition$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] length;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                length = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getTransition.AnonymousClass5.<clinit>():void");
        }
    }
}
