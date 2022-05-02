package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public final class fromOpcode {
    private static final Pattern equals = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    private static final Pattern getMax = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern length = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern setMin = Pattern.compile("(\\d{2,4})[^\\d]*");
    private final boolean FastBitmap$CoordinateSystem;
    private final long IsOverlapping;
    public final String getMin;
    private final boolean isInside;
    public final String setMax;
    private final boolean toDoubleRange;
    private final String toFloatRange;
    private final String toIntRange;
    private final boolean toString;

    private fromOpcode(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.getMin = str;
        this.setMax = str2;
        this.IsOverlapping = j;
        this.toFloatRange = str3;
        this.toIntRange = str4;
        this.isInside = z;
        this.FastBitmap$CoordinateSystem = z2;
        this.toDoubleRange = z3;
        this.toString = z4;
    }

    private static boolean setMax(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (!str.endsWith(str2) || str.charAt((str.length() - str2.length()) - 1) != '.' || initCloseCode.setMax(str)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x025a, code lost:
        if (r0 > com.alipay.imobile.network.quake.transport.HttpDate.MAX_DATE) goto L_0x0262;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x028f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0290  */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static o.fromOpcode setMax(long r28, o.Draft_76 r30, java.lang.String r31) {
        /*
            r0 = r31
            java.lang.String r1 = "."
            int r2 = r31.length()
            r3 = 59
            r4 = 0
            int r5 = o.initCloseCode.getMax(r0, r4, r2, r3)
            r6 = 61
            int r7 = o.initCloseCode.getMax(r0, r4, r5, r6)
            r8 = 0
            if (r7 != r5) goto L_0x0019
            return r8
        L_0x0019:
            java.lang.String r10 = o.initCloseCode.getMax((java.lang.String) r0, (int) r4, (int) r7)
            boolean r9 = r10.isEmpty()
            if (r9 != 0) goto L_0x02b9
            int r9 = o.initCloseCode.length((java.lang.String) r10)
            r11 = -1
            if (r9 == r11) goto L_0x002c
            goto L_0x02b9
        L_0x002c:
            r9 = 1
            int r7 = r7 + r9
            java.lang.String r7 = o.initCloseCode.getMax((java.lang.String) r0, (int) r7, (int) r5)
            int r12 = o.initCloseCode.length((java.lang.String) r7)
            if (r12 == r11) goto L_0x0039
            return r8
        L_0x0039:
            int r5 = r5 + r9
            r22 = r8
            r16 = 0
            r17 = 0
            r18 = 1
            r19 = 0
            r20 = -1
            r23 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
        L_0x004b:
            if (r5 >= r2) goto L_0x022a
            int r14 = o.initCloseCode.getMax(r0, r5, r2, r3)
            int r15 = o.initCloseCode.getMax(r0, r5, r14, r6)
            java.lang.String r5 = o.initCloseCode.getMax((java.lang.String) r0, (int) r5, (int) r15)
            if (r15 >= r14) goto L_0x0062
            int r15 = r15 + 1
            java.lang.String r15 = o.initCloseCode.getMax((java.lang.String) r0, (int) r15, (int) r14)
            goto L_0x0064
        L_0x0062:
            java.lang.String r15 = ""
        L_0x0064:
            java.lang.String r6 = "expires"
            boolean r6 = r5.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x01b8
            int r5 = r15.length()     // Catch:{ IllegalArgumentException -> 0x01b5 }
            int r6 = getMax(r15, r4, r5, r4)     // Catch:{ IllegalArgumentException -> 0x01b5 }
            java.util.regex.Pattern r12 = equals     // Catch:{ IllegalArgumentException -> 0x01b5 }
            java.util.regex.Matcher r12 = r12.matcher(r15)     // Catch:{ IllegalArgumentException -> 0x01b5 }
            r3 = -1
            r4 = -1
            r13 = -1
            r25 = -1
            r26 = -1
            r27 = -1
        L_0x0083:
            if (r6 >= r5) goto L_0x0121
            int r11 = r6 + 1
            int r11 = getMax(r15, r11, r5, r9)     // Catch:{ IllegalArgumentException -> 0x01b5 }
            r12.region(r6, r11)     // Catch:{ IllegalArgumentException -> 0x01b5 }
            r6 = -1
            if (r3 != r6) goto L_0x00ba
            java.util.regex.Pattern r6 = equals     // Catch:{ IllegalArgumentException -> 0x01b5 }
            java.util.regex.Matcher r6 = r12.usePattern(r6)     // Catch:{ IllegalArgumentException -> 0x01b5 }
            boolean r6 = r6.matches()     // Catch:{ IllegalArgumentException -> 0x01b5 }
            if (r6 == 0) goto L_0x00ba
            java.lang.String r3 = r12.group(r9)     // Catch:{ IllegalArgumentException -> 0x01b5 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ IllegalArgumentException -> 0x01b5 }
            r6 = 2
            java.lang.String r6 = r12.group(r6)     // Catch:{ IllegalArgumentException -> 0x01b5 }
            int r26 = java.lang.Integer.parseInt(r6)     // Catch:{ IllegalArgumentException -> 0x01b5 }
            r6 = 3
            java.lang.String r6 = r12.group(r6)     // Catch:{ IllegalArgumentException -> 0x01b5 }
            int r27 = java.lang.Integer.parseInt(r6)     // Catch:{ IllegalArgumentException -> 0x01b5 }
            r6 = r25
            goto L_0x0114
        L_0x00ba:
            r6 = r25
            r9 = -1
            if (r6 != r9) goto L_0x00d6
            java.util.regex.Pattern r9 = length     // Catch:{ IllegalArgumentException -> 0x01b5 }
            java.util.regex.Matcher r9 = r12.usePattern(r9)     // Catch:{ IllegalArgumentException -> 0x01b5 }
            boolean r9 = r9.matches()     // Catch:{ IllegalArgumentException -> 0x01b5 }
            if (r9 == 0) goto L_0x00d5
            r9 = 1
            java.lang.String r6 = r12.group(r9)     // Catch:{ IllegalArgumentException -> 0x01b5 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ IllegalArgumentException -> 0x01b5 }
            goto L_0x0114
        L_0x00d5:
            r9 = -1
        L_0x00d6:
            if (r4 != r9) goto L_0x00fd
            java.util.regex.Pattern r9 = getMax     // Catch:{ IllegalArgumentException -> 0x01b5 }
            java.util.regex.Matcher r9 = r12.usePattern(r9)     // Catch:{ IllegalArgumentException -> 0x01b5 }
            boolean r9 = r9.matches()     // Catch:{ IllegalArgumentException -> 0x01b5 }
            if (r9 == 0) goto L_0x00fc
            r9 = 1
            java.lang.String r4 = r12.group(r9)     // Catch:{ IllegalArgumentException -> 0x01b5 }
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x01b5 }
            java.lang.String r4 = r4.toLowerCase(r9)     // Catch:{ IllegalArgumentException -> 0x01b5 }
            java.util.regex.Pattern r9 = getMax     // Catch:{ IllegalArgumentException -> 0x01b5 }
            java.lang.String r9 = r9.pattern()     // Catch:{ IllegalArgumentException -> 0x01b5 }
            int r4 = r9.indexOf(r4)     // Catch:{ IllegalArgumentException -> 0x01b5 }
            int r4 = r4 / 4
            goto L_0x0114
        L_0x00fc:
            r9 = -1
        L_0x00fd:
            if (r13 != r9) goto L_0x0114
            java.util.regex.Pattern r9 = setMin     // Catch:{ IllegalArgumentException -> 0x01b5 }
            java.util.regex.Matcher r9 = r12.usePattern(r9)     // Catch:{ IllegalArgumentException -> 0x01b5 }
            boolean r9 = r9.matches()     // Catch:{ IllegalArgumentException -> 0x01b5 }
            if (r9 == 0) goto L_0x0114
            r9 = 1
            java.lang.String r13 = r12.group(r9)     // Catch:{ IllegalArgumentException -> 0x01b5 }
            int r13 = java.lang.Integer.parseInt(r13)     // Catch:{ IllegalArgumentException -> 0x01b5 }
        L_0x0114:
            int r11 = r11 + 1
            r9 = 0
            int r11 = getMax(r15, r11, r5, r9)     // Catch:{ IllegalArgumentException -> 0x01b5 }
            r25 = r6
            r6 = r11
            r9 = 1
            goto L_0x0083
        L_0x0121:
            r6 = r25
            r5 = 70
            if (r13 < r5) goto L_0x012d
            r5 = 99
            if (r13 > r5) goto L_0x012d
            int r13 = r13 + 1900
        L_0x012d:
            if (r13 < 0) goto L_0x0135
            r5 = 69
            if (r13 > r5) goto L_0x0135
            int r13 = r13 + 2000
        L_0x0135:
            r5 = 1601(0x641, float:2.243E-42)
            if (r13 < r5) goto L_0x01ad
            r9 = -1
            if (r4 == r9) goto L_0x01a5
            if (r6 <= 0) goto L_0x019d
            r5 = 31
            if (r6 > r5) goto L_0x019d
            if (r3 < 0) goto L_0x0195
            r5 = 23
            if (r3 > r5) goto L_0x0195
            r11 = r26
            r12 = 59
            if (r11 < 0) goto L_0x018f
            if (r11 > r12) goto L_0x018f
            r5 = r27
            if (r5 < 0) goto L_0x0189
            if (r5 > r12) goto L_0x0189
            java.util.GregorianCalendar r15 = new java.util.GregorianCalendar     // Catch:{ IllegalArgumentException -> 0x01fc }
            java.util.TimeZone r9 = o.initCloseCode.IsOverlapping     // Catch:{ IllegalArgumentException -> 0x01fc }
            r15.<init>(r9)     // Catch:{ IllegalArgumentException -> 0x01fc }
            r9 = 0
            r15.setLenient(r9)     // Catch:{ IllegalArgumentException -> 0x01fc }
            r9 = 1
            r15.set(r9, r13)     // Catch:{ IllegalArgumentException -> 0x01fc }
            int r4 = r4 + -1
            r9 = 2
            r15.set(r9, r4)     // Catch:{ IllegalArgumentException -> 0x01fc }
            r4 = 5
            r15.set(r4, r6)     // Catch:{ IllegalArgumentException -> 0x01fc }
            r4 = 11
            r15.set(r4, r3)     // Catch:{ IllegalArgumentException -> 0x01fc }
            r3 = 12
            r15.set(r3, r11)     // Catch:{ IllegalArgumentException -> 0x01fc }
            r3 = 13
            r15.set(r3, r5)     // Catch:{ IllegalArgumentException -> 0x01fc }
            r3 = 14
            r4 = 0
            r15.set(r3, r4)     // Catch:{ IllegalArgumentException -> 0x01fc }
            long r23 = r15.getTimeInMillis()     // Catch:{ IllegalArgumentException -> 0x01fc }
            goto L_0x01c6
        L_0x0189:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x01fc }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x01fc }
            throw r3     // Catch:{ IllegalArgumentException -> 0x01fc }
        L_0x018f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x01fc }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x01fc }
            throw r3     // Catch:{ IllegalArgumentException -> 0x01fc }
        L_0x0195:
            r12 = 59
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x01fc }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x01fc }
            throw r3     // Catch:{ IllegalArgumentException -> 0x01fc }
        L_0x019d:
            r12 = 59
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x01fc }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x01fc }
            throw r3     // Catch:{ IllegalArgumentException -> 0x01fc }
        L_0x01a5:
            r12 = 59
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x01fc }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x01fc }
            throw r3     // Catch:{ IllegalArgumentException -> 0x01fc }
        L_0x01ad:
            r12 = 59
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x01fc }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x01fc }
            throw r3     // Catch:{ IllegalArgumentException -> 0x01fc }
        L_0x01b5:
            r12 = 59
            goto L_0x01fc
        L_0x01b8:
            r12 = 59
            java.lang.String r3 = "max-age"
            boolean r3 = r5.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x01ca
            long r20 = getMin(r15)     // Catch:{  }
        L_0x01c6:
            r3 = 1
            r19 = 1
            goto L_0x021f
        L_0x01ca:
            java.lang.String r3 = "domain"
            boolean r3 = r5.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x01fe
            boolean r3 = r15.endsWith(r1)     // Catch:{ IllegalArgumentException -> 0x01fc }
            if (r3 != 0) goto L_0x01f5
            boolean r3 = r15.startsWith(r1)     // Catch:{ IllegalArgumentException -> 0x01fc }
            if (r3 == 0) goto L_0x01e4
            r3 = 1
            java.lang.String r15 = r15.substring(r3)     // Catch:{ IllegalArgumentException -> 0x021f }
            goto L_0x01e5
        L_0x01e4:
            r3 = 1
        L_0x01e5:
            java.lang.String r4 = o.initCloseCode.getMin((java.lang.String) r15)     // Catch:{ IllegalArgumentException -> 0x021f }
            if (r4 == 0) goto L_0x01ef
            r8 = r4
            r18 = 0
            goto L_0x021f
        L_0x01ef:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x021f }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x021f }
            throw r4     // Catch:{ IllegalArgumentException -> 0x021f }
        L_0x01f5:
            r3 = 1
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x021f }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x021f }
            throw r4     // Catch:{ IllegalArgumentException -> 0x021f }
        L_0x01fc:
            r3 = 1
            goto L_0x021f
        L_0x01fe:
            r3 = 1
            java.lang.String r4 = "path"
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x020a
            r22 = r15
            goto L_0x021f
        L_0x020a:
            java.lang.String r4 = "secure"
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0215
            r16 = 1
            goto L_0x021f
        L_0x0215:
            java.lang.String r4 = "httponly"
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x021f
            r17 = 1
        L_0x021f:
            int r5 = r14 + 1
            r3 = 59
            r4 = 0
            r6 = 61
            r9 = 1
            r11 = -1
            goto L_0x004b
        L_0x022a:
            r0 = -9223372036854775808
            int r2 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0234
        L_0x0230:
            r12 = r0
            r0 = r30
            goto L_0x026a
        L_0x0234:
            r0 = -1
            int r2 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0266
            r0 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r2 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0248
            r0 = 1000(0x3e8, double:4.94E-321)
            long r20 = r20 * r0
            goto L_0x024d
        L_0x0248:
            r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x024d:
            long r0 = r28 + r20
            int r2 = (r0 > r28 ? 1 : (r0 == r28 ? 0 : -1))
            if (r2 < 0) goto L_0x025d
            r2 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0230
            goto L_0x0262
        L_0x025d:
            r2 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
        L_0x0262:
            r0 = r30
            r12 = r2
            goto L_0x026a
        L_0x0266:
            r0 = r30
            r12 = r23
        L_0x026a:
            java.lang.String r1 = r0.getMin
            if (r8 != 0) goto L_0x0271
            r14 = r1
            r2 = 0
            goto L_0x027b
        L_0x0271:
            boolean r2 = setMax(r1, r8)
            if (r2 != 0) goto L_0x0279
            r2 = 0
            return r2
        L_0x0279:
            r2 = 0
            r14 = r8
        L_0x027b:
            int r1 = r1.length()
            int r3 = r14.length()
            if (r1 == r3) goto L_0x0290
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.length()
            java.lang.String r1 = r1.setMax(r14)
            if (r1 != 0) goto L_0x0290
            return r2
        L_0x0290:
            java.lang.String r1 = "/"
            r8 = r22
            if (r8 == 0) goto L_0x029f
            boolean r2 = r8.startsWith(r1)
            if (r2 != 0) goto L_0x029d
            goto L_0x029f
        L_0x029d:
            r15 = r8
            goto L_0x02b1
        L_0x029f:
            java.lang.String r0 = r30.toIntRange()
            r2 = 47
            int r2 = r0.lastIndexOf(r2)
            if (r2 == 0) goto L_0x02b0
            r3 = 0
            java.lang.String r1 = r0.substring(r3, r2)
        L_0x02b0:
            r15 = r1
        L_0x02b1:
            o.fromOpcode r0 = new o.fromOpcode
            r9 = r0
            r11 = r7
            r9.<init>(r10, r11, r12, r14, r15, r16, r17, r18, r19)
            return r0
        L_0x02b9:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fromOpcode.setMax(long, o.Draft_76, java.lang.String):o.fromOpcode");
    }

    private static int getMax(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    private static long getMin(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e) {
            if (!str.matches("-?\\d+")) {
                throw e;
            } else if (str.startsWith("-")) {
                return Long.MIN_VALUE;
            } else {
                return Long.MAX_VALUE;
            }
        }
    }

    public static List<fromOpcode> getMin(Draft_76 draft_76, Draft_75 draft_75) {
        List<String> min = draft_75.getMin("Set-Cookie");
        int size = min.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            fromOpcode max = setMax(System.currentTimeMillis(), draft_76, min.get(i));
            if (max != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(max);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof fromOpcode)) {
            return false;
        }
        fromOpcode fromopcode = (fromOpcode) obj;
        if (fromopcode.getMin.equals(this.getMin) && fromopcode.setMax.equals(this.setMax) && fromopcode.toFloatRange.equals(this.toFloatRange) && fromopcode.toIntRange.equals(this.toIntRange) && fromopcode.IsOverlapping == this.IsOverlapping && fromopcode.isInside == this.isInside && fromopcode.FastBitmap$CoordinateSystem == this.FastBitmap$CoordinateSystem && fromopcode.toString == this.toString && fromopcode.toDoubleRange == this.toDoubleRange) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.IsOverlapping;
        return ((((((((((((((((this.getMin.hashCode() + 527) * 31) + this.setMax.hashCode()) * 31) + this.toFloatRange.hashCode()) * 31) + this.toIntRange.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.isInside ^ true ? 1 : 0)) * 31) + (this.FastBitmap$CoordinateSystem ^ true ? 1 : 0)) * 31) + (this.toString ^ true ? 1 : 0)) * 31) + (this.toDoubleRange ^ true ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getMin);
        sb.append('=');
        sb.append(this.setMax);
        if (this.toString) {
            if (this.IsOverlapping == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(FramedataImpl1.setMax(new Date(this.IsOverlapping)));
            }
        }
        if (!this.toDoubleRange) {
            sb.append("; domain=");
            sb.append(this.toFloatRange);
        }
        sb.append("; path=");
        sb.append(this.toIntRange);
        if (this.isInside) {
            sb.append("; secure");
        }
        if (this.FastBitmap$CoordinateSystem) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
