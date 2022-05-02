package o;

import android.content.Context;
import com.mixpanel.android.mpmetrics.InAppNotification;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

final class recycleChildren {
    private static final Set<Integer> toFloatRange = new HashSet();
    private final setMin IsOverlapping;
    private final calculateTimeForScrolling equals;
    private final List<InAppNotification> getMax = new LinkedList();
    final String getMin;
    private Set<String> hashCode;
    private final List<InAppNotification> isInside;
    Boolean length;
    private String setMax = null;
    private final Set<Integer> setMin;
    private JSONArray toIntRange;
    private Context toString;

    public interface setMin {
        void getMin();
    }

    public recycleChildren(Context context, String str, setMin setmin, calculateTimeForScrolling calculatetimeforscrolling, HashSet<Integer> hashSet) {
        this.toString = context;
        this.getMin = str;
        this.IsOverlapping = setmin;
        this.equals = calculatetimeforscrolling;
        this.setMin = new HashSet(hashSet);
        this.isInside = new LinkedList();
        this.toIntRange = null;
        this.hashCode = new HashSet();
    }

    public final synchronized void getMax(String str) {
        if (this.setMax == null || !this.setMax.equals(str)) {
            this.getMax.clear();
        }
        this.setMax = str;
    }

    public final synchronized String length() {
        return this.setMax;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        o.findOnePartiallyOrCompletelyInvisibleChild.values();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        o.findOnePartiallyOrCompletelyInvisibleChild.values();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00b9, code lost:
        continue;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x008b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00b6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0116 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void getMax(java.util.List<com.mixpanel.android.mpmetrics.InAppNotification> r9, java.util.List<com.mixpanel.android.mpmetrics.InAppNotification> r10, org.json.JSONArray r11, org.json.JSONArray r12, boolean r13, org.json.JSONArray r14) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r12.length()     // Catch:{ all -> 0x012f }
            o.calculateTimeForScrolling r1 = r8.equals     // Catch:{ all -> 0x012f }
            r1.getMin(r11)     // Catch:{ all -> 0x012f }
            java.util.Iterator r11 = r9.iterator()     // Catch:{ all -> 0x012f }
            r1 = 0
            r2 = 0
        L_0x0010:
            boolean r3 = r11.hasNext()     // Catch:{ all -> 0x012f }
            r4 = 1
            if (r3 == 0) goto L_0x003d
            java.lang.Object r3 = r11.next()     // Catch:{ all -> 0x012f }
            com.mixpanel.android.mpmetrics.InAppNotification r3 = (com.mixpanel.android.mpmetrics.InAppNotification) r3     // Catch:{ all -> 0x012f }
            int r5 = r3.setMin()     // Catch:{ all -> 0x012f }
            java.util.Set<java.lang.Integer> r6 = r8.setMin     // Catch:{ all -> 0x012f }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x012f }
            boolean r6 = r6.contains(r7)     // Catch:{ all -> 0x012f }
            if (r6 != 0) goto L_0x0010
            java.util.Set<java.lang.Integer> r2 = r8.setMin     // Catch:{ all -> 0x012f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x012f }
            r2.add(r5)     // Catch:{ all -> 0x012f }
            java.util.List<com.mixpanel.android.mpmetrics.InAppNotification> r2 = r8.getMax     // Catch:{ all -> 0x012f }
            r2.add(r3)     // Catch:{ all -> 0x012f }
            r2 = 1
            goto L_0x0010
        L_0x003d:
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x012f }
        L_0x0041:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x012f }
            if (r11 == 0) goto L_0x006d
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x012f }
            com.mixpanel.android.mpmetrics.InAppNotification r11 = (com.mixpanel.android.mpmetrics.InAppNotification) r11     // Catch:{ all -> 0x012f }
            int r3 = r11.setMin()     // Catch:{ all -> 0x012f }
            java.util.Set<java.lang.Integer> r5 = r8.setMin     // Catch:{ all -> 0x012f }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x012f }
            boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x012f }
            if (r5 != 0) goto L_0x0041
            java.util.Set<java.lang.Integer> r2 = r8.setMin     // Catch:{ all -> 0x012f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x012f }
            r2.add(r3)     // Catch:{ all -> 0x012f }
            java.util.List<com.mixpanel.android.mpmetrics.InAppNotification> r2 = r8.isInside     // Catch:{ all -> 0x012f }
            r2.add(r11)     // Catch:{ all -> 0x012f }
            r2 = 1
            goto L_0x0041
        L_0x006d:
            r8.toIntRange = r12     // Catch:{ all -> 0x012f }
            r10 = 0
        L_0x0070:
            if (r10 >= r0) goto L_0x0091
            org.json.JSONObject r11 = r12.getJSONObject(r10)     // Catch:{ JSONException -> 0x008b }
            java.util.Set<java.lang.Integer> r3 = toFloatRange     // Catch:{ JSONException -> 0x008b }
            java.lang.String r5 = "id"
            int r11 = r11.getInt(r5)     // Catch:{ JSONException -> 0x008b }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ JSONException -> 0x008b }
            boolean r11 = r3.contains(r11)     // Catch:{ JSONException -> 0x008b }
            if (r11 != 0) goto L_0x008e
            r10 = 1
            r2 = 1
            goto L_0x0092
        L_0x008b:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x012f }
        L_0x008e:
            int r10 = r10 + 1
            goto L_0x0070
        L_0x0091:
            r10 = 0
        L_0x0092:
            if (r10 == 0) goto L_0x00bc
            org.json.JSONArray r10 = r8.toIntRange     // Catch:{ all -> 0x012f }
            if (r10 == 0) goto L_0x00bc
            java.util.Set<java.lang.Integer> r10 = toFloatRange     // Catch:{ all -> 0x012f }
            r10.clear()     // Catch:{ all -> 0x012f }
            r10 = 0
        L_0x009e:
            if (r10 >= r0) goto L_0x00bc
            org.json.JSONArray r11 = r8.toIntRange     // Catch:{ JSONException -> 0x00b6 }
            org.json.JSONObject r11 = r11.getJSONObject(r10)     // Catch:{ JSONException -> 0x00b6 }
            java.util.Set<java.lang.Integer> r3 = toFloatRange     // Catch:{ JSONException -> 0x00b6 }
            java.lang.String r5 = "id"
            int r11 = r11.getInt(r5)     // Catch:{ JSONException -> 0x00b6 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ JSONException -> 0x00b6 }
            r3.add(r11)     // Catch:{ JSONException -> 0x00b6 }
            goto L_0x00b9
        L_0x00b6:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x012f }
        L_0x00b9:
            int r10 = r10 + 1
            goto L_0x009e
        L_0x00bc:
            if (r0 != 0) goto L_0x00d3
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ all -> 0x012f }
            r10.<init>()     // Catch:{ all -> 0x012f }
            r8.toIntRange = r10     // Catch:{ all -> 0x012f }
            java.util.Set<java.lang.Integer> r10 = toFloatRange     // Catch:{ all -> 0x012f }
            int r10 = r10.size()     // Catch:{ all -> 0x012f }
            if (r10 <= 0) goto L_0x00d3
            java.util.Set<java.lang.Integer> r10 = toFloatRange     // Catch:{ all -> 0x012f }
            r10.clear()     // Catch:{ all -> 0x012f }
            r2 = 1
        L_0x00d3:
            o.calculateTimeForScrolling r10 = r8.equals     // Catch:{ all -> 0x012f }
            org.json.JSONArray r11 = r8.toIntRange     // Catch:{ all -> 0x012f }
            r10.getMax(r11)     // Catch:{ all -> 0x012f }
            java.lang.Boolean r10 = r8.length     // Catch:{ all -> 0x012f }
            if (r10 != 0) goto L_0x00eb
            if (r13 != 0) goto L_0x00eb
            android.content.Context r10 = r8.toString     // Catch:{ all -> 0x012f }
            com.mixpanel.android.mpmetrics.MPDbAdapter r10 = com.mixpanel.android.mpmetrics.MPDbAdapter.setMax(r10)     // Catch:{ all -> 0x012f }
            java.lang.String r11 = r8.getMin     // Catch:{ all -> 0x012f }
            r10.setMin(r11)     // Catch:{ all -> 0x012f }
        L_0x00eb:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x012f }
            r8.length = r10     // Catch:{ all -> 0x012f }
            if (r14 == 0) goto L_0x0119
            java.util.HashSet r10 = new java.util.HashSet     // Catch:{ JSONException -> 0x0116 }
            r10.<init>()     // Catch:{ JSONException -> 0x0116 }
        L_0x00f8:
            int r11 = r14.length()     // Catch:{ JSONException -> 0x0116 }
            if (r1 >= r11) goto L_0x0108
            java.lang.String r11 = r14.getString(r1)     // Catch:{ JSONException -> 0x0116 }
            r10.add(r11)     // Catch:{ JSONException -> 0x0116 }
            int r1 = r1 + 1
            goto L_0x00f8
        L_0x0108:
            java.util.Set<java.lang.String> r11 = r8.hashCode     // Catch:{ JSONException -> 0x0116 }
            boolean r11 = r11.equals(r10)     // Catch:{ JSONException -> 0x0116 }
            if (r11 != 0) goto L_0x0113
            r8.hashCode = r10     // Catch:{ JSONException -> 0x0116 }
            goto L_0x0114
        L_0x0113:
            r4 = r2
        L_0x0114:
            r2 = r4
            goto L_0x0119
        L_0x0116:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x012f }
        L_0x0119:
            r9.size()     // Catch:{ all -> 0x012f }
            r12.length()     // Catch:{ all -> 0x012f }
            o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ all -> 0x012f }
            if (r2 == 0) goto L_0x012d
            o.recycleChildren$setMin r9 = r8.IsOverlapping     // Catch:{ all -> 0x012f }
            if (r9 == 0) goto L_0x012d
            o.recycleChildren$setMin r9 = r8.IsOverlapping     // Catch:{ all -> 0x012f }
            r9.getMin()     // Catch:{ all -> 0x012f }
        L_0x012d:
            monitor-exit(r8)
            return
        L_0x012f:
            r9 = move-exception
            monitor-exit(r8)
            goto L_0x0133
        L_0x0132:
            throw r9
        L_0x0133:
            goto L_0x0132
        */
        throw new UnsupportedOperationException("Method not decompiled: o.recycleChildren.getMax(java.util.List, java.util.List, org.json.JSONArray, org.json.JSONArray, boolean, org.json.JSONArray):void");
    }

    public final synchronized JSONArray setMin() {
        return this.toIntRange;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.mixpanel.android.mpmetrics.InAppNotification getMax(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.List<com.mixpanel.android.mpmetrics.InAppNotification> r0 = r2.getMax     // Catch:{ all -> 0x0025 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x000f
            o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ all -> 0x0025 }
            r3 = 0
            monitor-exit(r2)
            return r3
        L_0x000f:
            java.util.List<com.mixpanel.android.mpmetrics.InAppNotification> r0 = r2.getMax     // Catch:{ all -> 0x0025 }
            r1 = 0
            java.lang.Object r0 = r0.remove(r1)     // Catch:{ all -> 0x0025 }
            com.mixpanel.android.mpmetrics.InAppNotification r0 = (com.mixpanel.android.mpmetrics.InAppNotification) r0     // Catch:{ all -> 0x0025 }
            if (r3 == 0) goto L_0x0020
            java.util.List<com.mixpanel.android.mpmetrics.InAppNotification> r3 = r2.getMax     // Catch:{ all -> 0x0025 }
            r3.add(r0)     // Catch:{ all -> 0x0025 }
            goto L_0x0023
        L_0x0020:
            o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r2)
            return r0
        L_0x0025:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.recycleChildren.getMax(boolean):com.mixpanel.android.mpmetrics.InAppNotification");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.mixpanel.android.mpmetrics.InAppNotification setMax(o.setInitialPrefetchItemCount.getMax r5, boolean r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.List<com.mixpanel.android.mpmetrics.InAppNotification> r0 = r4.isInside     // Catch:{ all -> 0x0040 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0040 }
            r1 = 0
            if (r0 == 0) goto L_0x000f
            o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ all -> 0x0040 }
            monitor-exit(r4)
            return r1
        L_0x000f:
            r0 = 0
        L_0x0010:
            java.util.List<com.mixpanel.android.mpmetrics.InAppNotification> r2 = r4.isInside     // Catch:{ all -> 0x0040 }
            int r2 = r2.size()     // Catch:{ all -> 0x0040 }
            if (r0 >= r2) goto L_0x003e
            java.util.List<com.mixpanel.android.mpmetrics.InAppNotification> r2 = r4.isInside     // Catch:{ all -> 0x0040 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x0040 }
            com.mixpanel.android.mpmetrics.InAppNotification r2 = (com.mixpanel.android.mpmetrics.InAppNotification) r2     // Catch:{ all -> 0x0040 }
            boolean r3 = r2.getMax(r5)     // Catch:{ all -> 0x0040 }
            if (r3 == 0) goto L_0x0035
            if (r6 != 0) goto L_0x0033
            java.util.List<com.mixpanel.android.mpmetrics.InAppNotification> r5 = r4.isInside     // Catch:{ all -> 0x0040 }
            r5.remove(r0)     // Catch:{ all -> 0x0040 }
            r2.setMin()     // Catch:{ all -> 0x0040 }
            o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ all -> 0x0040 }
        L_0x0033:
            monitor-exit(r4)
            return r2
        L_0x0035:
            r2.setMin()     // Catch:{ all -> 0x0040 }
            o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ all -> 0x0040 }
            int r0 = r0 + 1
            goto L_0x0010
        L_0x003e:
            monitor-exit(r4)
            return r1
        L_0x0040:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x0044
        L_0x0043:
            throw r5
        L_0x0044:
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: o.recycleChildren.setMax(o.setInitialPrefetchItemCount$getMax, boolean):com.mixpanel.android.mpmetrics.InAppNotification");
    }

    public final synchronized Set<String> setMax() {
        return this.hashCode;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void setMax(com.mixpanel.android.mpmetrics.InAppNotification r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = o.shouldMeasureTwice.getMin     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x0017
            boolean r0 = r2.getMin()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0012
            java.util.List<com.mixpanel.android.mpmetrics.InAppNotification> r0 = r1.isInside     // Catch:{ all -> 0x0019 }
            r0.add(r2)     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)
            return
        L_0x0012:
            java.util.List<com.mixpanel.android.mpmetrics.InAppNotification> r0 = r1.getMax     // Catch:{ all -> 0x0019 }
            r0.add(r2)     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.recycleChildren.setMax(com.mixpanel.android.mpmetrics.InAppNotification):void");
    }

    public final boolean getMax() {
        Boolean bool = this.length;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }
}
