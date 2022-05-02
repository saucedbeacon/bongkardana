package o;

import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public final class translateHandshake {
    public static final translateHandshake length;
    public static final translateHandshake setMax;
    private final boolean FastBitmap$CoordinateSystem;
    private final int IsOverlapping;
    private final boolean equals;
    public final int getMax;
    public final int getMin;
    private final boolean hashCode;
    @Nullable
    String isInside;
    public final int setMin;
    private final boolean toDoubleRange;
    private final boolean toFloatRange;
    private final boolean toIntRange;
    private final boolean toString;
    private final boolean values;

    public static final class setMin {
        boolean IsOverlapping;
        boolean equals;
        int getMax = -1;
        public boolean getMin;
        int length = -1;
        int setMax = -1;
        boolean setMin;
        boolean toIntRange;
    }

    static {
        setMin setmin = new setMin();
        setmin.setMin = true;
        length = new translateHandshake(setmin);
        setMin setmin2 = new setMin();
        setmin2.equals = true;
        long seconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        setmin2.setMax = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
        setMax = new translateHandshake(setmin2);
    }

    private translateHandshake(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, @Nullable String str) {
        this.equals = z;
        this.toFloatRange = z2;
        this.setMin = i;
        this.IsOverlapping = i2;
        this.toIntRange = z3;
        this.toString = z4;
        this.FastBitmap$CoordinateSystem = z5;
        this.getMin = i3;
        this.getMax = i4;
        this.values = z6;
        this.toDoubleRange = z7;
        this.hashCode = z8;
        this.isInside = str;
    }

    public translateHandshake(setMin setmin) {
        this.equals = setmin.setMin;
        this.toFloatRange = setmin.getMin;
        this.setMin = setmin.getMax;
        this.IsOverlapping = -1;
        this.toIntRange = false;
        this.toString = false;
        this.FastBitmap$CoordinateSystem = false;
        this.getMin = setmin.setMax;
        this.getMax = setmin.length;
        this.values = setmin.equals;
        this.toDoubleRange = setmin.toIntRange;
        this.hashCode = setmin.IsOverlapping;
    }

    public final boolean getMax() {
        return this.equals;
    }

    public final boolean length() {
        return this.toFloatRange;
    }

    public final boolean setMax() {
        return this.toIntRange;
    }

    public final boolean setMin() {
        return this.toString;
    }

    public final boolean getMin() {
        return this.FastBitmap$CoordinateSystem;
    }

    public final boolean equals() {
        return this.values;
    }

    public final String toString() {
        String str;
        String str2 = this.isInside;
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        if (this.equals) {
            sb.append("no-cache, ");
        }
        if (this.toFloatRange) {
            sb.append("no-store, ");
        }
        if (this.setMin != -1) {
            sb.append("max-age=");
            sb.append(this.setMin);
            sb.append(", ");
        }
        if (this.IsOverlapping != -1) {
            sb.append("s-maxage=");
            sb.append(this.IsOverlapping);
            sb.append(", ");
        }
        if (this.toIntRange) {
            sb.append("private, ");
        }
        if (this.toString) {
            sb.append("public, ");
        }
        if (this.FastBitmap$CoordinateSystem) {
            sb.append("must-revalidate, ");
        }
        if (this.getMin != -1) {
            sb.append("max-stale=");
            sb.append(this.getMin);
            sb.append(", ");
        }
        if (this.getMax != -1) {
            sb.append("min-fresh=");
            sb.append(this.getMax);
            sb.append(", ");
        }
        if (this.values) {
            sb.append("only-if-cached, ");
        }
        if (this.toDoubleRange) {
            sb.append("no-transform, ");
        }
        if (this.hashCode) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            str = "";
        } else {
            sb.delete(sb.length() - 2, sb.length());
            str = sb.toString();
        }
        this.isInside = str;
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o.translateHandshake length(o.Draft_75 r23) {
        /*
            r0 = r23
            java.lang.String[] r1 = r0.length
            int r1 = r1.length
            int r1 = r1 / 2
            r5 = 1
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x001c:
            if (r6 >= r1) goto L_0x0145
            java.lang.String[] r2 = r0.length
            int r22 = r6 * 2
            r2 = r2[r22]
            java.lang.String[] r4 = r0.length
            int r22 = r22 + 1
            r4 = r4[r22]
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0037
            if (r8 == 0) goto L_0x0035
            goto L_0x003f
        L_0x0035:
            r8 = r4
            goto L_0x0040
        L_0x0037:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x013d
        L_0x003f:
            r7 = 0
        L_0x0040:
            r2 = 0
        L_0x0041:
            int r3 = r4.length()
            if (r2 >= r3) goto L_0x013d
            java.lang.String r3 = "=,;"
            int r3 = o.ClientHandshake.getMin(r4, r2, r3)
            java.lang.String r2 = r4.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r5 = r4.length()
            if (r3 == r5) goto L_0x009f
            char r5 = r4.charAt(r3)
            r0 = 44
            if (r5 == r0) goto L_0x009f
            char r0 = r4.charAt(r3)
            r5 = 59
            if (r0 != r5) goto L_0x006c
            goto L_0x009f
        L_0x006c:
            int r3 = r3 + 1
            int r0 = o.ClientHandshake.setMax(r4, r3)
            int r3 = r4.length()
            if (r0 >= r3) goto L_0x008f
            char r3 = r4.charAt(r0)
            r5 = 34
            if (r3 != r5) goto L_0x008f
            int r0 = r0 + 1
            java.lang.String r3 = "\""
            int r3 = o.ClientHandshake.getMin(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x00a3
        L_0x008f:
            r5 = 1
            java.lang.String r3 = ",;"
            int r3 = o.ClientHandshake.getMin(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            java.lang.String r0 = r0.trim()
            goto L_0x00a3
        L_0x009f:
            r5 = 1
            int r3 = r3 + 1
            r0 = 0
        L_0x00a3:
            java.lang.String r5 = "no-cache"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00b1
            r5 = 1
            r9 = 1
        L_0x00ad:
            r0 = r23
            r2 = r3
            goto L_0x0041
        L_0x00b1:
            java.lang.String r5 = "no-store"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00bc
            r5 = 1
            r10 = 1
            goto L_0x00ad
        L_0x00bc:
            java.lang.String r5 = "max-age"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00cb
            r5 = -1
            int r11 = o.ClientHandshake.getMin(r0, r5)
        L_0x00c9:
            r5 = 1
            goto L_0x00ad
        L_0x00cb:
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00d9
            r5 = -1
            int r12 = o.ClientHandshake.getMin(r0, r5)
            goto L_0x00c9
        L_0x00d9:
            java.lang.String r5 = "private"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00e4
            r5 = 1
            r13 = 1
            goto L_0x00ad
        L_0x00e4:
            java.lang.String r5 = "public"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00ef
            r5 = 1
            r14 = 1
            goto L_0x00ad
        L_0x00ef:
            java.lang.String r5 = "must-revalidate"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00fa
            r5 = 1
            r15 = 1
            goto L_0x00ad
        L_0x00fa:
            java.lang.String r5 = "max-stale"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x010a
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r16 = o.ClientHandshake.getMin(r0, r2)
            goto L_0x00c9
        L_0x010a:
            java.lang.String r5 = "min-fresh"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0118
            r5 = -1
            int r17 = o.ClientHandshake.getMin(r0, r5)
            goto L_0x00c9
        L_0x0118:
            r5 = -1
            java.lang.String r0 = "only-if-cached"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0125
            r5 = 1
            r18 = 1
            goto L_0x00ad
        L_0x0125:
            java.lang.String r0 = "no-transform"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0132
            r5 = 1
            r19 = 1
            goto L_0x00ad
        L_0x0132:
            java.lang.String r0 = "immutable"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x00c9
            r20 = 1
            goto L_0x00c9
        L_0x013d:
            r5 = -1
            int r6 = r6 + 1
            r5 = 1
            r0 = r23
            goto L_0x001c
        L_0x0145:
            if (r7 != 0) goto L_0x014a
            r21 = 0
            goto L_0x014c
        L_0x014a:
            r21 = r8
        L_0x014c:
            o.translateHandshake r0 = new o.translateHandshake
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.translateHandshake.length(o.Draft_75):o.translateHandshake");
    }
}
