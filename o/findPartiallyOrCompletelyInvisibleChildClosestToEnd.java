package o;

import android.R;
import android.content.Context;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

public abstract class findPartiallyOrCompletelyInvisibleChildClosestToEnd implements findFirstVisibleChildClosestToEnd {
    private final Map<String, Integer> getMax = new HashMap();
    private final Context getMin;
    private final SparseArray<String> setMax = new SparseArray<>();

    /* access modifiers changed from: protected */
    public abstract Class<?> getMin();

    /* access modifiers changed from: protected */
    public abstract String length();

    public static class setMin extends findPartiallyOrCompletelyInvisibleChildClosestToEnd {
        private final String setMax;

        public setMin(String str, Context context) {
            super(context);
            this.setMax = str;
            setMax();
        }

        /* access modifiers changed from: protected */
        public final Class<?> getMin() {
            return R.id.class;
        }

        /* access modifiers changed from: protected */
        public final String length() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.setMax);
            sb.append(".R$id");
            return sb.toString();
        }
    }

    public static class getMin extends findPartiallyOrCompletelyInvisibleChildClosestToEnd {
        private final String getMax;

        protected getMin(String str, Context context) {
            super(context);
            this.getMax = str;
            setMax();
        }

        /* access modifiers changed from: protected */
        public final Class<?> getMin() {
            return R.drawable.class;
        }

        /* access modifiers changed from: protected */
        public final String length() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.getMax);
            sb.append(".R$drawable");
            return sb.toString();
        }
    }

    protected findPartiallyOrCompletelyInvisibleChildClosestToEnd(Context context) {
        this.getMin = context;
    }

    public final boolean length(String str) {
        return this.getMax.containsKey(str);
    }

    public final int getMax(String str) {
        return this.getMax.get(str).intValue();
    }

    public final String setMax(int i) {
        return this.setMax.get(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        o.findOnePartiallyOrCompletelyInvisibleChild.values();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0043 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void length(java.lang.Class<?> r5, java.lang.String r6, java.util.Map<java.lang.String, java.lang.Integer> r7) {
        /*
            java.lang.reflect.Field[] r5 = r5.getFields()     // Catch:{ IllegalAccessException -> 0x004a }
            r0 = 0
        L_0x0005:
            int r1 = r5.length     // Catch:{ IllegalAccessException -> 0x004a }
            if (r0 >= r1) goto L_0x0049
            r1 = r5[r0]     // Catch:{ IllegalAccessException -> 0x004a }
            int r2 = r1.getModifiers()     // Catch:{ IllegalAccessException -> 0x004a }
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)     // Catch:{ IllegalAccessException -> 0x004a }
            if (r2 == 0) goto L_0x0046
            java.lang.Class r2 = r1.getType()     // Catch:{ IllegalAccessException -> 0x004a }
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ IllegalAccessException -> 0x004a }
            if (r2 != r3) goto L_0x0046
            java.lang.String r2 = r1.getName()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0043 }
            r3 = 0
            int r1 = r1.getInt(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0043 }
            if (r6 == 0) goto L_0x003b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0043 }
            r3.<init>()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0043 }
            r3.append(r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0043 }
            java.lang.String r4 = ":"
            r3.append(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0043 }
            r3.append(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0043 }
            java.lang.String r2 = r3.toString()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0043 }
        L_0x003b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0043 }
            r7.put(r2, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0043 }
            goto L_0x0046
        L_0x0043:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ IllegalAccessException -> 0x004a }
        L_0x0046:
            int r0 = r0 + 1
            goto L_0x0005
        L_0x0049:
            return
        L_0x004a:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.findPartiallyOrCompletelyInvisibleChildClosestToEnd.length(java.lang.Class, java.lang.String, java.util.Map):void");
    }

    /* access modifiers changed from: protected */
    public final void setMax() {
        this.getMax.clear();
        this.setMax.clear();
        length(getMin(), "android", this.getMax);
        try {
            length(Class.forName(length()), (String) null, this.getMax);
        } catch (ClassNotFoundException unused) {
            findOnePartiallyOrCompletelyInvisibleChild.isInside();
            findOnePartiallyOrCompletelyInvisibleChild.IsOverlapping();
        }
        for (Map.Entry next : this.getMax.entrySet()) {
            this.setMax.put(((Integer) next.getValue()).intValue(), next.getKey());
        }
    }
}
