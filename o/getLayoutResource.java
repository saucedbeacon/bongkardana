package o;

import java.util.concurrent.TimeUnit;

public final class getLayoutResource {
    public static final getLayoutResource setMax;
    public static final getLayoutResource setMin;
    private final boolean FastBitmap$CoordinateSystem;
    private final boolean IsOverlapping;
    private final int equals;
    public final int getMax;
    public final int getMin;
    private final boolean isInside;
    public final int length;
    private final boolean toDoubleRange;
    String toFloatRange;
    private final boolean toIntRange;
    private final boolean toString;
    private final boolean values;

    public static final class getMin {
        boolean IsOverlapping;
        int getMax = -1;
        int getMin = -1;
        boolean length;
        int setMax = -1;
        boolean setMin;
        boolean toFloatRange;
    }

    private /* synthetic */ getLayoutResource(getMin getmin, byte b) {
        this(getmin);
    }

    static {
        getMin getmin = new getMin();
        getmin.setMin = true;
        setMax = new getLayoutResource(getmin, (byte) 0);
        getMin getmin2 = new getMin();
        getmin2.toFloatRange = true;
        long seconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        getmin2.setMax = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
        setMin = new getLayoutResource(getmin2, (byte) 0);
    }

    private getLayoutResource(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, String str) {
        this.toIntRange = z;
        this.IsOverlapping = z2;
        this.getMin = i;
        this.equals = i2;
        this.isInside = z3;
        this.FastBitmap$CoordinateSystem = z4;
        this.toString = z5;
        this.getMax = i3;
        this.length = i4;
        this.values = z6;
        this.toDoubleRange = z7;
        this.toFloatRange = str;
    }

    private getLayoutResource(getMin getmin) {
        this.toIntRange = getmin.setMin;
        this.IsOverlapping = getmin.length;
        this.getMin = getmin.getMax;
        this.equals = -1;
        this.isInside = false;
        this.FastBitmap$CoordinateSystem = false;
        this.toString = false;
        this.getMax = getmin.setMax;
        this.length = getmin.getMin;
        this.values = getmin.toFloatRange;
        this.toDoubleRange = getmin.IsOverlapping;
    }

    public final boolean setMax() {
        return this.toIntRange;
    }

    public final boolean getMin() {
        return this.IsOverlapping;
    }

    public final boolean setMin() {
        return this.isInside;
    }

    public final boolean length() {
        return this.FastBitmap$CoordinateSystem;
    }

    public final boolean getMax() {
        return this.toString;
    }

    public final boolean isInside() {
        return this.values;
    }

    public final String toString() {
        String str;
        String str2 = this.toFloatRange;
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        if (this.toIntRange) {
            sb.append("no-cache, ");
        }
        if (this.IsOverlapping) {
            sb.append("no-store, ");
        }
        if (this.getMin != -1) {
            sb.append("max-age=");
            sb.append(this.getMin);
            sb.append(", ");
        }
        if (this.equals != -1) {
            sb.append("s-maxage=");
            sb.append(this.equals);
            sb.append(", ");
        }
        if (this.isInside) {
            sb.append("private, ");
        }
        if (this.FastBitmap$CoordinateSystem) {
            sb.append("public, ");
        }
        if (this.toString) {
            sb.append("must-revalidate, ");
        }
        if (this.getMax != -1) {
            sb.append("max-stale=");
            sb.append(this.getMax);
            sb.append(", ");
        }
        if (this.length != -1) {
            sb.append("min-fresh=");
            sb.append(this.length);
            sb.append(", ");
        }
        if (this.values) {
            sb.append("only-if-cached, ");
        }
        if (this.toDoubleRange) {
            sb.append("no-transform, ");
        }
        if (sb.length() == 0) {
            str = "";
        } else {
            sb.delete(sb.length() - 2, sb.length());
            str = sb.toString();
        }
        this.toFloatRange = str;
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o.getLayoutResource getMin(o.setCardElevation r24) {
        /*
            r0 = r24
            java.lang.String[] r1 = r0.setMin
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
        L_0x001a:
            if (r6 >= r1) goto L_0x0188
            java.lang.String[] r2 = r0.setMin
            int r21 = r6 * 2
            r2 = r2[r21]
            java.lang.String[] r4 = r0.setMin
            int r21 = r21 + 1
            r4 = r4[r21]
            java.lang.String r5 = "Cache-Control"
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0035
            if (r8 == 0) goto L_0x0033
            goto L_0x003d
        L_0x0033:
            r8 = r4
            goto L_0x003e
        L_0x0035:
            java.lang.String r5 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 == 0) goto L_0x017c
        L_0x003d:
            r7 = 0
        L_0x003e:
            r2 = 0
        L_0x003f:
            int r5 = r4.length()
            if (r2 >= r5) goto L_0x017c
            r5 = r2
        L_0x0046:
            int r3 = r4.length()
            if (r5 >= r3) goto L_0x005e
            char r3 = r4.charAt(r5)
            java.lang.String r0 = "=,;"
            int r0 = r0.indexOf(r3)
            r3 = -1
            if (r0 != r3) goto L_0x005e
            int r5 = r5 + 1
            r0 = r24
            goto L_0x0046
        L_0x005e:
            java.lang.String r0 = r4.substring(r2, r5)
            java.lang.String r0 = r0.trim()
            int r2 = r4.length()
            if (r5 == r2) goto L_0x00ee
            char r2 = r4.charAt(r5)
            r3 = 44
            if (r2 == r3) goto L_0x00ee
            char r2 = r4.charAt(r5)
            r3 = 59
            if (r2 != r3) goto L_0x007e
            goto L_0x00ee
        L_0x007e:
            int r5 = r5 + 1
            int r2 = r4.length()
            if (r5 >= r2) goto L_0x0093
            char r2 = r4.charAt(r5)
            r3 = 32
            if (r2 == r3) goto L_0x007e
            r3 = 9
            if (r2 != r3) goto L_0x0093
            goto L_0x007e
        L_0x0093:
            int r2 = r4.length()
            if (r5 >= r2) goto L_0x00c7
            char r2 = r4.charAt(r5)
            r3 = 34
            if (r2 != r3) goto L_0x00c7
            int r5 = r5 + 1
            r2 = r5
        L_0x00a4:
            int r3 = r4.length()
            if (r2 >= r3) goto L_0x00be
            char r3 = r4.charAt(r2)
            r22 = r1
            java.lang.String r1 = "\""
            int r1 = r1.indexOf(r3)
            r3 = -1
            if (r1 != r3) goto L_0x00c0
            int r2 = r2 + 1
            r1 = r22
            goto L_0x00a4
        L_0x00be:
            r22 = r1
        L_0x00c0:
            java.lang.String r1 = r4.substring(r5, r2)
            int r2 = r2 + 1
            goto L_0x00f4
        L_0x00c7:
            r22 = r1
            r1 = r5
        L_0x00ca:
            int r2 = r4.length()
            if (r1 >= r2) goto L_0x00e0
            char r2 = r4.charAt(r1)
            java.lang.String r3 = ",;"
            int r2 = r3.indexOf(r2)
            r3 = -1
            if (r2 != r3) goto L_0x00e0
            int r1 = r1 + 1
            goto L_0x00ca
        L_0x00e0:
            java.lang.String r2 = r4.substring(r5, r1)
            java.lang.String r2 = r2.trim()
            r23 = r2
            r2 = r1
            r1 = r23
            goto L_0x00f4
        L_0x00ee:
            r22 = r1
            int r5 = r5 + 1
            r2 = r5
            r1 = 0
        L_0x00f4:
            java.lang.String r3 = "no-cache"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0103
            r9 = 1
        L_0x00fd:
            r0 = r24
            r1 = r22
            goto L_0x003f
        L_0x0103:
            java.lang.String r3 = "no-store"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x010d
            r10 = 1
            goto L_0x00fd
        L_0x010d:
            java.lang.String r3 = "max-age"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x011b
            r3 = -1
            int r11 = o.onCancelNotification.setMin(r1, r3)
            goto L_0x00fd
        L_0x011b:
            r3 = -1
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 == 0) goto L_0x0129
            int r12 = o.onCancelNotification.setMin(r1, r3)
            goto L_0x00fd
        L_0x0129:
            java.lang.String r3 = "private"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0133
            r13 = 1
            goto L_0x00fd
        L_0x0133:
            java.lang.String r3 = "public"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x013d
            r14 = 1
            goto L_0x00fd
        L_0x013d:
            java.lang.String r3 = "must-revalidate"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0147
            r15 = 1
            goto L_0x00fd
        L_0x0147:
            java.lang.String r3 = "max-stale"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0157
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r16 = o.onCancelNotification.setMin(r1, r0)
            goto L_0x00fd
        L_0x0157:
            java.lang.String r3 = "min-fresh"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0165
            r3 = -1
            int r17 = o.onCancelNotification.setMin(r1, r3)
            goto L_0x00fd
        L_0x0165:
            r3 = -1
            java.lang.String r1 = "only-if-cached"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L_0x0171
            r18 = 1
            goto L_0x00fd
        L_0x0171:
            java.lang.String r1 = "no-transform"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00fd
            r19 = 1
            goto L_0x00fd
        L_0x017c:
            r22 = r1
            r3 = -1
            int r6 = r6 + 1
            r5 = 1
            r0 = r24
            r1 = r22
            goto L_0x001a
        L_0x0188:
            if (r7 != 0) goto L_0x018d
            r20 = 0
            goto L_0x018f
        L_0x018d:
            r20 = r8
        L_0x018f:
            o.getLayoutResource r0 = new o.getLayoutResource
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getLayoutResource.getMin(o.setCardElevation):o.getLayoutResource");
    }
}
