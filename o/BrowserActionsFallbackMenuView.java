package o;

import com.bca.xco.widget.connection.httpclient.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

public final class BrowserActionsFallbackMenuView {
    private static final Pattern IsOverlapping = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    private static final Pattern getMin = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern length = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern setMin = Pattern.compile("(\\d{2,4})[^\\d]*");
    private final long equals;
    public final String getMax;
    private final boolean hashCode;
    private final boolean isInside;
    public final String setMax;
    private final boolean toDoubleRange;
    private final String toFloatRange;
    private final String toIntRange;
    private final boolean values;

    private BrowserActionsFallbackMenuView(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.getMax = str;
        this.setMax = str2;
        this.equals = j;
        this.toIntRange = str3;
        this.toFloatRange = str4;
        this.isInside = z;
        this.values = z2;
        this.hashCode = z3;
        this.toDoubleRange = z4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0257, code lost:
        if (r1 > com.alipay.imobile.network.quake.transport.HttpDate.MAX_DATE) goto L_0x025f;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0282  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static o.BrowserActionsFallbackMenuView setMax(long r30, com.bca.xco.widget.connection.httpclient.p r32, java.lang.String r33) {
        /*
            r0 = r32
            r1 = r33
            java.lang.String r2 = "."
            int r3 = r33.length()
            r4 = 59
            r5 = 0
            int r6 = o.CustomTabsIntent$ShareState.getMin(r1, r5, r3, r4)
            r7 = 61
            int r8 = o.CustomTabsIntent$ShareState.getMin(r1, r5, r6, r7)
            r9 = 0
            if (r8 != r6) goto L_0x001b
            return r9
        L_0x001b:
            java.lang.String r11 = o.CustomTabsIntent$ShareState.length(r1, r5, r8)
            boolean r10 = r11.isEmpty()
            if (r10 == 0) goto L_0x0026
            return r9
        L_0x0026:
            r10 = 1
            int r8 = r8 + r10
            java.lang.String r12 = o.CustomTabsIntent$ShareState.length(r1, r8, r6)
            int r6 = r6 + r10
            r8 = r9
            r23 = r8
            r17 = 0
            r18 = 0
            r19 = 1
            r20 = 0
            r21 = -1
            r24 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
        L_0x003f:
            if (r6 >= r3) goto L_0x0229
            int r9 = o.CustomTabsIntent$ShareState.getMin(r1, r6, r3, r4)
            int r15 = o.CustomTabsIntent$ShareState.getMin(r1, r6, r9, r7)
            java.lang.String r6 = o.CustomTabsIntent$ShareState.length(r1, r6, r15)
            if (r15 >= r9) goto L_0x0056
            int r15 = r15 + 1
            java.lang.String r15 = o.CustomTabsIntent$ShareState.length(r1, r15, r9)
            goto L_0x0058
        L_0x0056:
            java.lang.String r15 = ""
        L_0x0058:
            java.lang.String r7 = "expires"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x01b5
            int r6 = r15.length()     // Catch:{ IllegalArgumentException -> 0x01b2 }
            int r7 = getMax(r15, r5, r6, r5)     // Catch:{ IllegalArgumentException -> 0x01b2 }
            java.util.regex.Pattern r13 = IsOverlapping     // Catch:{ IllegalArgumentException -> 0x01b2 }
            java.util.regex.Matcher r13 = r13.matcher(r15)     // Catch:{ IllegalArgumentException -> 0x01b2 }
            r4 = -1
            r5 = -1
            r26 = -1
            r27 = -1
            r28 = -1
            r29 = -1
        L_0x0078:
            if (r7 >= r6) goto L_0x011c
            int r14 = r7 + 1
            int r14 = getMax(r15, r14, r6, r10)     // Catch:{ IllegalArgumentException -> 0x01b2 }
            r13.region(r7, r14)     // Catch:{ IllegalArgumentException -> 0x01b2 }
            r7 = -1
            if (r5 != r7) goto L_0x00af
            java.util.regex.Pattern r7 = IsOverlapping     // Catch:{ IllegalArgumentException -> 0x01b2 }
            java.util.regex.Matcher r7 = r13.usePattern(r7)     // Catch:{ IllegalArgumentException -> 0x01b2 }
            boolean r7 = r7.matches()     // Catch:{ IllegalArgumentException -> 0x01b2 }
            if (r7 == 0) goto L_0x00af
            java.lang.String r5 = r13.group(r10)     // Catch:{ IllegalArgumentException -> 0x01b2 }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ IllegalArgumentException -> 0x01b2 }
            r7 = 2
            java.lang.String r7 = r13.group(r7)     // Catch:{ IllegalArgumentException -> 0x01b2 }
            int r28 = java.lang.Integer.parseInt(r7)     // Catch:{ IllegalArgumentException -> 0x01b2 }
            r7 = 3
            java.lang.String r7 = r13.group(r7)     // Catch:{ IllegalArgumentException -> 0x01b2 }
            int r29 = java.lang.Integer.parseInt(r7)     // Catch:{ IllegalArgumentException -> 0x01b2 }
            r7 = r27
            goto L_0x010d
        L_0x00af:
            r7 = r27
            r10 = -1
            if (r7 != r10) goto L_0x00ca
            java.util.regex.Pattern r10 = getMin     // Catch:{ IllegalArgumentException -> 0x01b2 }
            java.util.regex.Matcher r10 = r13.usePattern(r10)     // Catch:{ IllegalArgumentException -> 0x01b2 }
            boolean r10 = r10.matches()     // Catch:{ IllegalArgumentException -> 0x01b2 }
            if (r10 == 0) goto L_0x00ca
            r10 = 1
            java.lang.String r7 = r13.group(r10)     // Catch:{ IllegalArgumentException -> 0x01b2 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ IllegalArgumentException -> 0x01b2 }
            goto L_0x010d
        L_0x00ca:
            r10 = r26
            r1 = -1
            if (r10 != r1) goto L_0x00f4
            java.util.regex.Pattern r1 = length     // Catch:{ IllegalArgumentException -> 0x01b2 }
            java.util.regex.Matcher r1 = r13.usePattern(r1)     // Catch:{ IllegalArgumentException -> 0x01b2 }
            boolean r1 = r1.matches()     // Catch:{ IllegalArgumentException -> 0x01b2 }
            if (r1 == 0) goto L_0x00f3
            r1 = 1
            java.lang.String r10 = r13.group(r1)     // Catch:{ IllegalArgumentException -> 0x01b2 }
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x01b2 }
            java.lang.String r1 = r10.toLowerCase(r1)     // Catch:{ IllegalArgumentException -> 0x01b2 }
            java.util.regex.Pattern r10 = length     // Catch:{ IllegalArgumentException -> 0x01b2 }
            java.lang.String r10 = r10.pattern()     // Catch:{ IllegalArgumentException -> 0x01b2 }
            int r1 = r10.indexOf(r1)     // Catch:{ IllegalArgumentException -> 0x01b2 }
            int r26 = r1 / 4
            goto L_0x010d
        L_0x00f3:
            r1 = -1
        L_0x00f4:
            if (r4 != r1) goto L_0x010b
            java.util.regex.Pattern r1 = setMin     // Catch:{ IllegalArgumentException -> 0x01b2 }
            java.util.regex.Matcher r1 = r13.usePattern(r1)     // Catch:{ IllegalArgumentException -> 0x01b2 }
            boolean r1 = r1.matches()     // Catch:{ IllegalArgumentException -> 0x01b2 }
            if (r1 == 0) goto L_0x010b
            r1 = 1
            java.lang.String r4 = r13.group(r1)     // Catch:{ IllegalArgumentException -> 0x01b2 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ IllegalArgumentException -> 0x01b2 }
        L_0x010b:
            r26 = r10
        L_0x010d:
            int r14 = r14 + 1
            r1 = 0
            int r10 = getMax(r15, r14, r6, r1)     // Catch:{ IllegalArgumentException -> 0x01b2 }
            r1 = r33
            r27 = r7
            r7 = r10
            r10 = 1
            goto L_0x0078
        L_0x011c:
            r10 = r26
            r7 = r27
            r1 = 70
            if (r4 < r1) goto L_0x012a
            r1 = 99
            if (r4 > r1) goto L_0x012a
            int r4 = r4 + 1900
        L_0x012a:
            if (r4 < 0) goto L_0x0132
            r1 = 69
            if (r4 > r1) goto L_0x0132
            int r4 = r4 + 2000
        L_0x0132:
            r1 = 1601(0x641, float:2.243E-42)
            if (r4 < r1) goto L_0x01aa
            r1 = -1
            if (r10 == r1) goto L_0x01a2
            if (r7 <= 0) goto L_0x019a
            r1 = 31
            if (r7 > r1) goto L_0x019a
            if (r5 < 0) goto L_0x0192
            r1 = 23
            if (r5 > r1) goto L_0x0192
            r14 = r28
            r1 = 59
            if (r14 < 0) goto L_0x018c
            if (r14 > r1) goto L_0x018c
            r6 = r29
            if (r6 < 0) goto L_0x0186
            if (r6 > r1) goto L_0x0186
            java.util.GregorianCalendar r13 = new java.util.GregorianCalendar     // Catch:{ IllegalArgumentException -> 0x01f9 }
            java.util.TimeZone r15 = o.CustomTabsIntent$ShareState.getMax     // Catch:{ IllegalArgumentException -> 0x01f9 }
            r13.<init>(r15)     // Catch:{ IllegalArgumentException -> 0x01f9 }
            r15 = 0
            r13.setLenient(r15)     // Catch:{ IllegalArgumentException -> 0x01f9 }
            r15 = 1
            r13.set(r15, r4)     // Catch:{ IllegalArgumentException -> 0x01f9 }
            int r4 = r10 + -1
            r10 = 2
            r13.set(r10, r4)     // Catch:{ IllegalArgumentException -> 0x01f9 }
            r4 = 5
            r13.set(r4, r7)     // Catch:{ IllegalArgumentException -> 0x01f9 }
            r4 = 11
            r13.set(r4, r5)     // Catch:{ IllegalArgumentException -> 0x01f9 }
            r4 = 12
            r13.set(r4, r14)     // Catch:{ IllegalArgumentException -> 0x01f9 }
            r4 = 13
            r13.set(r4, r6)     // Catch:{ IllegalArgumentException -> 0x01f9 }
            r4 = 14
            r5 = 0
            r13.set(r4, r5)     // Catch:{ IllegalArgumentException -> 0x01f9 }
            long r24 = r13.getTimeInMillis()     // Catch:{ IllegalArgumentException -> 0x01f9 }
            goto L_0x01c3
        L_0x0186:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x01f9 }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x01f9 }
            throw r4     // Catch:{ IllegalArgumentException -> 0x01f9 }
        L_0x018c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x01f9 }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x01f9 }
            throw r4     // Catch:{ IllegalArgumentException -> 0x01f9 }
        L_0x0192:
            r1 = 59
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x01f9 }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x01f9 }
            throw r4     // Catch:{ IllegalArgumentException -> 0x01f9 }
        L_0x019a:
            r1 = 59
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x01f9 }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x01f9 }
            throw r4     // Catch:{ IllegalArgumentException -> 0x01f9 }
        L_0x01a2:
            r1 = 59
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x01f9 }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x01f9 }
            throw r4     // Catch:{ IllegalArgumentException -> 0x01f9 }
        L_0x01aa:
            r1 = 59
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x01f9 }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x01f9 }
            throw r4     // Catch:{ IllegalArgumentException -> 0x01f9 }
        L_0x01b2:
            r1 = 59
            goto L_0x01f9
        L_0x01b5:
            r1 = 59
            java.lang.String r4 = "max-age"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x01c7
            long r21 = getMin(r15)     // Catch:{  }
        L_0x01c3:
            r4 = 1
            r20 = 1
            goto L_0x021c
        L_0x01c7:
            java.lang.String r4 = "domain"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x01fb
            boolean r4 = r15.endsWith(r2)     // Catch:{ IllegalArgumentException -> 0x01f9 }
            if (r4 != 0) goto L_0x01f2
            boolean r4 = r15.startsWith(r2)     // Catch:{ IllegalArgumentException -> 0x01f9 }
            if (r4 == 0) goto L_0x01e1
            r4 = 1
            java.lang.String r15 = r15.substring(r4)     // Catch:{ IllegalArgumentException -> 0x021c }
            goto L_0x01e2
        L_0x01e1:
            r4 = 1
        L_0x01e2:
            java.lang.String r5 = o.CustomTabsIntent$ShareState.setMax((java.lang.String) r15)     // Catch:{ IllegalArgumentException -> 0x021c }
            if (r5 == 0) goto L_0x01ec
            r8 = r5
            r19 = 0
            goto L_0x021c
        L_0x01ec:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x021c }
            r5.<init>()     // Catch:{ IllegalArgumentException -> 0x021c }
            throw r5     // Catch:{ IllegalArgumentException -> 0x021c }
        L_0x01f2:
            r4 = 1
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x021c }
            r5.<init>()     // Catch:{ IllegalArgumentException -> 0x021c }
            throw r5     // Catch:{ IllegalArgumentException -> 0x021c }
        L_0x01f9:
            r4 = 1
            goto L_0x021c
        L_0x01fb:
            r4 = 1
            java.lang.String r5 = "path"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0207
            r23 = r15
            goto L_0x021c
        L_0x0207:
            java.lang.String r5 = "secure"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0212
            r17 = 1
            goto L_0x021c
        L_0x0212:
            java.lang.String r5 = "httponly"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x021c
            r18 = 1
        L_0x021c:
            int r6 = r9 + 1
            r1 = r33
            r4 = 59
            r5 = 0
            r7 = 61
            r9 = 0
            r10 = 1
            goto L_0x003f
        L_0x0229:
            r1 = -9223372036854775808
            int r3 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0231
        L_0x022f:
            r13 = r1
            goto L_0x0263
        L_0x0231:
            r1 = -1
            int r3 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0261
            r1 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r3 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x0245
            r1 = 1000(0x3e8, double:4.94E-321)
            long r21 = r21 * r1
            goto L_0x024a
        L_0x0245:
            r21 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x024a:
            long r1 = r30 + r21
            int r3 = (r1 > r30 ? 1 : (r1 == r30 ? 0 : -1))
            if (r3 < 0) goto L_0x025a
            r3 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x022f
            goto L_0x025f
        L_0x025a:
            r3 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
        L_0x025f:
            r13 = r3
            goto L_0x0263
        L_0x0261:
            r13 = r24
        L_0x0263:
            if (r8 != 0) goto L_0x0269
            java.lang.String r1 = r0.setMax
            r15 = r1
            goto L_0x0272
        L_0x0269:
            boolean r1 = getMax(r0, r8)
            if (r1 != 0) goto L_0x0271
            r1 = 0
            return r1
        L_0x0271:
            r15 = r8
        L_0x0272:
            java.lang.String r1 = "/"
            r9 = r23
            if (r9 == 0) goto L_0x0282
            boolean r2 = r9.startsWith(r1)
            if (r2 != 0) goto L_0x027f
            goto L_0x0282
        L_0x027f:
            r16 = r9
            goto L_0x0295
        L_0x0282:
            java.lang.String r0 = r32.getMax()
            r2 = 47
            int r2 = r0.lastIndexOf(r2)
            if (r2 == 0) goto L_0x0293
            r3 = 0
            java.lang.String r1 = r0.substring(r3, r2)
        L_0x0293:
            r16 = r1
        L_0x0295:
            o.BrowserActionsFallbackMenuView r0 = new o.BrowserActionsFallbackMenuView
            r10 = r0
            r10.<init>(r11, r12, r13, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BrowserActionsFallbackMenuView.setMax(long, com.bca.xco.widget.connection.httpclient.p, java.lang.String):o.BrowserActionsFallbackMenuView");
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

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserActionsFallbackMenuView)) {
            return false;
        }
        BrowserActionsFallbackMenuView browserActionsFallbackMenuView = (BrowserActionsFallbackMenuView) obj;
        if (browserActionsFallbackMenuView.getMax.equals(this.getMax) && browserActionsFallbackMenuView.setMax.equals(this.setMax) && browserActionsFallbackMenuView.toIntRange.equals(this.toIntRange) && browserActionsFallbackMenuView.toFloatRange.equals(this.toFloatRange) && browserActionsFallbackMenuView.equals == this.equals && browserActionsFallbackMenuView.isInside == this.isInside && browserActionsFallbackMenuView.values == this.values && browserActionsFallbackMenuView.toDoubleRange == this.toDoubleRange && browserActionsFallbackMenuView.hashCode == this.hashCode) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.equals;
        return ((((((((((((((((this.getMax.hashCode() + 527) * 31) + this.setMax.hashCode()) * 31) + this.toIntRange.hashCode()) * 31) + this.toFloatRange.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.isInside ^ true ? 1 : 0)) * 31) + (this.values ^ true ? 1 : 0)) * 31) + (this.toDoubleRange ^ true ? 1 : 0)) * 31) + (this.hashCode ^ true ? 1 : 0);
    }

    private static boolean getMax(p pVar, String str) {
        String str2 = pVar.setMax;
        if (str2.equals(str)) {
            return true;
        }
        if (!str2.endsWith(str) || str2.charAt((str2.length() - str.length()) - 1) != '.' || CustomTabsIntent$ShareState.getMax(str2)) {
            return false;
        }
        return true;
    }

    public static List<BrowserActionsFallbackMenuView> setMin(p pVar, setCardElevation setcardelevation) {
        List list;
        int length2 = setcardelevation.setMin.length / 2;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i = 0; i < length2; i++) {
            int i2 = i * 2;
            if ("Set-Cookie".equalsIgnoreCase(setcardelevation.setMin[i2])) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(2);
                }
                arrayList2.add(setcardelevation.setMin[i2 + 1]);
            }
        }
        if (arrayList2 != null) {
            list = Collections.unmodifiableList(arrayList2);
        } else {
            list = Collections.emptyList();
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            BrowserActionsFallbackMenuView max = setMax(System.currentTimeMillis(), pVar, (String) list.get(i3));
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

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getMax);
        sb.append('=');
        sb.append(this.setMax);
        if (this.toDoubleRange) {
            if (this.equals == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(onGetActiveNotifications.setMin(new Date(this.equals)));
            }
        }
        if (!this.hashCode) {
            sb.append("; domain=");
            sb.append(this.toIntRange);
        }
        sb.append("; path=");
        sb.append(this.toFloatRange);
        if (this.isInside) {
            sb.append("; secure");
        }
        if (this.values) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
