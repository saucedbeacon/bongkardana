package o;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.litho.Transition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import o.setPositiveButtonIcon;

public final class onScrollChanged {
    @Nullable
    private static final setPositiveButtonIcon.setMax<List<Object>> getMin;
    @Nullable
    private static final setPositiveButtonIcon.setMax<Map<String, List<Object>>> isInside;
    @Nullable
    private static final setPositiveButtonIcon.setMax<Map<String, Object>> toFloatRange;
    @GuardedBy("this")
    @Nullable
    private Map<String, List<Transition>> IsOverlapping;
    @GuardedBy("this")
    Map<String, List<Object>> getMax;
    @GuardedBy("this")
    public Map<String, Object> length;
    @GuardedBy("this")
    public HashSet<String> setMax;
    @GuardedBy("this")
    Map<String, List<Object>> setMin;

    static {
        if (keyToDirection.b) {
            getMin = new setPositiveButtonIcon.setMax<>(10);
            isInside = new setPositiveButtonIcon.setMax<>(10);
            toFloatRange = new setPositiveButtonIcon.setMax<>(10);
            return;
        }
        getMin = null;
        isInside = null;
        toFloatRange = null;
    }

    @Nullable
    public static onScrollChanged setMin(@Nullable onScrollChanged onscrollchanged) {
        if (keyToDirection.b) {
            return NotificationCompatSideChannelService.setMax(onscrollchanged);
        }
        return null;
    }

    public final void setMax(onScrollChanged onscrollchanged, boolean z) {
        Map<String, List<Object>> map;
        if (z) {
            map = onscrollchanged.length();
        } else {
            map = onscrollchanged.getMin();
        }
        setMax(map);
        setMax(onscrollchanged);
        getMax(onscrollchanged.setMax());
        length(onscrollchanged.setMin());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r0.hasNext() == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r1 = r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2 = r6.setMin.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r2 == null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        r3 = r7.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r2.size() != r3.size()) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r6.setMin.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        r2.clear();
        getMin.getMin(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0054, code lost:
        r2.removeAll(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r0 = r7.keySet().iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setMax(java.util.Map<java.lang.String, java.util.List<java.lang.Object>> r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            if (r7 == 0) goto L_0x005c
            java.util.Map<java.lang.String, java.util.List<java.lang.Object>> r0 = r6.setMin     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x005c
            java.util.Map<java.lang.String, java.util.List<java.lang.Object>> r0 = r6.setMin     // Catch:{ all -> 0x005e }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0010
            goto L_0x005c
        L_0x0010:
            monitor-exit(r6)
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005b
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            monitor-enter(r6)
            java.util.Map<java.lang.String, java.util.List<java.lang.Object>> r2 = r6.setMin     // Catch:{ all -> 0x0058 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0058 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x0058 }
            monitor-exit(r6)     // Catch:{ all -> 0x0058 }
            if (r2 == 0) goto L_0x0019
            java.lang.Object r3 = r7.get(r1)
            java.util.List r3 = (java.util.List) r3
            int r4 = r2.size()
            int r5 = r3.size()
            if (r4 != r5) goto L_0x0054
            monitor-enter(r6)
            java.util.Map<java.lang.String, java.util.List<java.lang.Object>> r3 = r6.setMin     // Catch:{ all -> 0x0051 }
            r3.remove(r1)     // Catch:{ all -> 0x0051 }
            monitor-exit(r6)     // Catch:{ all -> 0x0051 }
            r2.clear()
            o.setPositiveButtonIcon$setMax<java.util.List<java.lang.Object>> r1 = getMin
            r1.getMin(r2)
            goto L_0x0019
        L_0x0051:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x0054:
            r2.removeAll(r3)
            goto L_0x0019
        L_0x0058:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x005b:
            return
        L_0x005c:
            monitor-exit(r6)     // Catch:{ all -> 0x005e }
            return
        L_0x005e:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x0062
        L_0x0061:
            throw r7
        L_0x0062:
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onScrollChanged.setMax(java.util.Map):void");
    }

    static List<Object> getMax(List<Object> list) {
        int i;
        List<Object> max = getMin.getMax();
        if (max == null) {
            if (list == null) {
                i = 4;
            } else {
                i = list.size();
            }
            max = new ArrayList<>(i);
        }
        if (list != null) {
            max.addAll(list);
        }
        return max;
    }

    /* access modifiers changed from: package-private */
    public final synchronized Map<String, Object> setMax() {
        return this.length;
    }

    public final synchronized Map<String, List<Object>> getMin() {
        return this.setMin;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final synchronized Map<String, List<Transition>> setMin() {
        return this.IsOverlapping;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final synchronized Map<String, List<Object>> length() {
        return this.getMax;
    }

    @Nullable
    public final synchronized void getMin(List<Transition> list, @Nullable String str) {
        if (this.IsOverlapping != null) {
            for (List next : this.IsOverlapping.values()) {
                int size = next.size();
                for (int i = 0; i < size; i++) {
                    computeVerticalScrollRange.getMin((Transition) next.get(i), list, str);
                }
            }
            this.IsOverlapping = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void getMax(Map<String, Object> map) {
        if (map != null && !map.isEmpty()) {
            synchronized (this) {
                isInside();
                this.length.clear();
                this.length.putAll(map);
            }
        }
    }

    private static void setMax(onScrollChanged onscrollchanged) {
        Map<String, Object> map;
        HashSet<String> hashSet = onscrollchanged.setMax;
        ArrayList<String> arrayList = new ArrayList<>();
        if (hashSet != null && (map = onscrollchanged.length) != null) {
            arrayList.addAll(map.keySet());
            for (String str : arrayList) {
                if (!hashSet.contains(str)) {
                    onscrollchanged.length.remove(str);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void length(@Nullable Map<String, List<Transition>> map) {
        if (map != null && !map.isEmpty()) {
            synchronized (this) {
                IsOverlapping();
                this.IsOverlapping.putAll(map);
            }
        }
    }

    private synchronized void isInside() {
        if (this.length == null) {
            Map<String, Object> max = toFloatRange.getMax();
            this.length = max;
            if (max == null) {
                this.length = new HashMap(4);
            }
        }
    }

    private synchronized void IsOverlapping() {
        if (this.IsOverlapping == null) {
            this.IsOverlapping = new HashMap();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void getMax() {
        if (this.setMin == null) {
            Map<String, List<Object>> max = isInside.getMax();
            this.setMin = max;
            if (max == null) {
                this.setMin = new HashMap(4);
            }
        }
        if (this.getMax == null) {
            Map<String, List<Object>> max2 = isInside.getMax();
            this.getMax = max2;
            if (max2 == null) {
                this.getMax = new HashMap(4);
            }
        }
    }
}
