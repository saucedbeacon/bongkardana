package com.bca.xco.widget.connection.httpclient;

import com.alibaba.griver.h5.permission.GriverJSAPIPermission;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocket;
import com.google.common.base.Ascii;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Typography;
import o.CustomTabsIntent$ShareState;
import o.maxSize;

public final class p {
    private static final char[] getMin = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final String IsOverlapping;
    private final List<String> equals;
    public final int getMax;
    private final String isInside;
    public final String length;
    public final String setMax;
    public final List<String> setMin;
    private final String toFloatRange;
    private final String toIntRange;

    static int getMax(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* synthetic */ p(a aVar, byte b) {
        this(aVar);
    }

    private p(a aVar) {
        this.length = aVar.getMax;
        this.IsOverlapping = getMax(aVar.setMin, false);
        this.toIntRange = getMax(aVar.getMin, false);
        this.setMax = aVar.length;
        int i = -1;
        if (aVar.setMax != -1) {
            i = aVar.setMax;
        } else {
            String str = aVar.getMax;
            if (str.equals("http")) {
                i = 80;
            } else if (str.equals("https")) {
                i = WebSocket.DEFAULT_WSS_PORT;
            }
        }
        this.getMax = i;
        this.equals = setMin(aVar.isInside, false);
        String str2 = null;
        this.setMin = aVar.IsOverlapping != null ? setMin(aVar.IsOverlapping, true) : null;
        this.isInside = aVar.toFloatRange != null ? getMax(aVar.toFloatRange, false) : str2;
        this.toFloatRange = aVar.toString();
    }

    public final boolean setMin() {
        return this.length.equals("https");
    }

    public final String setMax() {
        if (this.IsOverlapping.isEmpty()) {
            return "";
        }
        int length2 = this.length.length() + 3;
        String str = this.toFloatRange;
        return this.toFloatRange.substring(length2, CustomTabsIntent$ShareState.setMax(str, length2, str.length(), ":@"));
    }

    public final String length() {
        if (this.toIntRange.isEmpty()) {
            return "";
        }
        int indexOf = this.toFloatRange.indexOf(64);
        return this.toFloatRange.substring(this.toFloatRange.indexOf(58, this.length.length() + 3) + 1, indexOf);
    }

    public static int setMax(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return WebSocket.DEFAULT_WSS_PORT;
        }
        return -1;
    }

    public final String getMax() {
        int indexOf = this.toFloatRange.indexOf(47, this.length.length() + 3);
        String str = this.toFloatRange;
        return this.toFloatRange.substring(indexOf, CustomTabsIntent$ShareState.setMax(str, indexOf, str.length(), "?#"));
    }

    static void getMax(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    public final List<String> toIntRange() {
        int indexOf = this.toFloatRange.indexOf(47, this.length.length() + 3);
        String str = this.toFloatRange;
        int max = CustomTabsIntent$ShareState.setMax(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < max) {
            int i = indexOf + 1;
            int min = CustomTabsIntent$ShareState.getMin(this.toFloatRange, i, max, '/');
            arrayList.add(this.toFloatRange.substring(i, min));
            indexOf = min;
        }
        return arrayList;
    }

    public final String equals() {
        if (this.setMin == null) {
            return null;
        }
        int indexOf = this.toFloatRange.indexOf(63) + 1;
        String str = this.toFloatRange;
        return this.toFloatRange.substring(indexOf, CustomTabsIntent$ShareState.getMin(str, indexOf + 1, str.length(), '#'));
    }

    public static void setMax(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append(Typography.amp);
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    static List<String> getMax(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add((Object) null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    public final a getMin(String str) {
        a aVar = new a();
        if (aVar.length(this, str) == a.C0073a.SUCCESS) {
            return aVar;
        }
        return null;
    }

    public static p length(String str) {
        a aVar = new a();
        if (aVar.length((p) null, str) == a.C0073a.SUCCESS) {
            return aVar.getMin();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p) && ((p) obj).toFloatRange.equals(this.toFloatRange);
    }

    public final int hashCode() {
        return this.toFloatRange.hashCode();
    }

    public final String toString() {
        return this.toFloatRange;
    }

    public static final class a {
        List<String> IsOverlapping;
        public String getMax;
        public String getMin = "";
        final List<String> isInside;
        public String length;
        public int setMax = -1;
        public String setMin = "";
        String toFloatRange;

        /* renamed from: com.bca.xco.widget.connection.httpclient.p$a$a  reason: collision with other inner class name */
        enum C0073a {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.isInside = arrayList;
            arrayList.add("");
        }

        public final p getMin() {
            if (this.getMax == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.length != null) {
                return new p(this, (byte) 0);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.getMax);
            sb.append("://");
            if (!this.setMin.isEmpty() || !this.getMin.isEmpty()) {
                sb.append(this.setMin);
                if (!this.getMin.isEmpty()) {
                    sb.append(':');
                    sb.append(this.getMin);
                }
                sb.append('@');
            }
            if (this.length.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.length);
                sb.append(']');
            } else {
                sb.append(this.length);
            }
            int i = this.setMax;
            if (i == -1) {
                i = p.setMax(this.getMax);
            }
            if (i != p.setMax(this.getMax)) {
                sb.append(':');
                sb.append(i);
            }
            p.getMax(sb, this.isInside);
            if (this.IsOverlapping != null) {
                sb.append('?');
                p.setMax(sb, this.IsOverlapping);
            }
            if (this.toFloatRange != null) {
                sb.append('#');
                sb.append(this.toFloatRange);
            }
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        public final C0073a length(p pVar, String str) {
            int max;
            int i;
            List<String> list;
            String str2 = str;
            int min = CustomTabsIntent$ShareState.setMin(str2, 0, str.length());
            int min2 = CustomTabsIntent$ShareState.getMin(str2, min, str.length());
            if (setMin(str2, min, min2) != -1) {
                if (str.regionMatches(true, min, GriverJSAPIPermission.PROTOCOL_HTTPS, 0, 6)) {
                    this.getMax = "https";
                    min += 6;
                } else if (!str.regionMatches(true, min, GriverJSAPIPermission.PROTOCOL_HTTP, 0, 5)) {
                    return C0073a.UNSUPPORTED_SCHEME;
                } else {
                    this.getMax = "http";
                    min += 5;
                }
            } else if (pVar == null) {
                return C0073a.MISSING_SCHEME;
            } else {
                this.getMax = pVar.length;
            }
            int max2 = setMax(str2, min, min2);
            char c = '?';
            char c2 = '#';
            if (max2 >= 2 || pVar == null || !pVar.length.equals(this.getMax)) {
                int i2 = min + max2;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    max = CustomTabsIntent$ShareState.setMax(str2, i2, min2, "@/\\?#");
                    char charAt = max != min2 ? str2.charAt(max) : 65535;
                    if (charAt == 65535 || charAt == c2 || charAt == '/' || charAt == '\\' || charAt == c) {
                        int i3 = max;
                        int max3 = getMax(str2, i2, i3);
                        int i4 = max3 + 1;
                    } else if (charAt == '@') {
                        if (!z) {
                            int min3 = CustomTabsIntent$ShareState.getMin(str2, i2, max, ':');
                            int i5 = min3;
                            String str3 = "%40";
                            i = max;
                            String min4 = p.setMin(str, i2, min3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                            if (z2) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(this.setMin);
                                sb.append(str3);
                                sb.append(min4);
                                min4 = sb.toString();
                            }
                            this.setMin = min4;
                            if (i5 != i) {
                                this.getMin = p.setMin(str, i5 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                                z = true;
                            }
                            z2 = true;
                        } else {
                            i = max;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.getMin);
                            sb2.append("%40");
                            sb2.append(p.setMin(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true));
                            this.getMin = sb2.toString();
                        }
                        i2 = i + 1;
                        c = '?';
                        c2 = '#';
                    }
                }
                int i32 = max;
                int max32 = getMax(str2, i2, i32);
                int i42 = max32 + 1;
                if (i42 < i32) {
                    this.length = getMin(str2, i2, max32);
                    int floatRange = toFloatRange(str2, i42, i32);
                    this.setMax = floatRange;
                    if (floatRange == -1) {
                        return C0073a.INVALID_PORT;
                    }
                } else {
                    this.length = getMin(str2, i2, max32);
                    this.setMax = p.setMax(this.getMax);
                }
                if (this.length == null) {
                    return C0073a.INVALID_HOST;
                }
                min = i32;
            } else {
                this.setMin = pVar.setMax();
                this.getMin = pVar.length();
                this.length = pVar.setMax;
                this.setMax = pVar.getMax;
                this.isInside.clear();
                this.isInside.addAll(pVar.toIntRange());
                if (min == min2 || str2.charAt(min) == '#') {
                    String equals = pVar.equals();
                    if (equals != null) {
                        list = p.getMax(p.getMax(equals, " \"'<>#", true, true));
                    } else {
                        list = null;
                    }
                    this.IsOverlapping = list;
                }
            }
            int max4 = CustomTabsIntent$ShareState.setMax(str2, min, min2, "?#");
            length(str2, min, max4);
            if (max4 < min2 && str2.charAt(max4) == '?') {
                int min5 = CustomTabsIntent$ShareState.getMin(str2, max4, min2, '#');
                this.IsOverlapping = p.getMax(p.setMin(str, max4 + 1, min5, " \"'<>#", true, false, true, true));
                max4 = min5;
            }
            if (max4 < min2 && str2.charAt(max4) == '#') {
                this.toFloatRange = p.setMin(str, 1 + max4, min2, "", true, false, false, false);
            }
            return C0073a.SUCCESS;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00aa A[SYNTHETIC] */
        private void length(java.lang.String r13, int r14, int r15) {
            /*
                r12 = this;
                if (r14 != r15) goto L_0x0003
                return
            L_0x0003:
                char r0 = r13.charAt(r14)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r12.isInside
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x002a
            L_0x001e:
                java.util.List<java.lang.String> r0 = r12.isInside
                r0.clear()
                java.util.List<java.lang.String> r0 = r12.isInside
                r0.add(r2)
            L_0x0028:
                int r14 = r14 + 1
            L_0x002a:
                r5 = r14
                if (r5 >= r15) goto L_0x00aa
                java.lang.String r14 = "/\\"
                int r14 = o.CustomTabsIntent$ShareState.setMax(r13, r5, r15, r14)
                if (r14 >= r15) goto L_0x0037
                r0 = 1
                goto L_0x0038
            L_0x0037:
                r0 = 0
            L_0x0038:
                r8 = 1
                r9 = 0
                r10 = 0
                r11 = 1
                java.lang.String r7 = " \"<>^`{}|/\\?#"
                r4 = r13
                r6 = r14
                java.lang.String r1 = com.bca.xco.widget.connection.httpclient.p.setMin(r4, r5, r6, r7, r8, r9, r10, r11)
                boolean r4 = getMin((java.lang.String) r1)
                if (r4 != 0) goto L_0x00a6
                boolean r4 = length(r1)
                if (r4 == 0) goto L_0x007c
                java.util.List<java.lang.String> r1 = r12.isInside
                int r4 = r1.size()
                int r4 = r4 - r3
                java.lang.Object r1 = r1.remove(r4)
                java.lang.String r1 = (java.lang.String) r1
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x0076
                java.util.List<java.lang.String> r1 = r12.isInside
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L_0x0076
                java.util.List<java.lang.String> r1 = r12.isInside
                int r4 = r1.size()
                int r4 = r4 - r3
                r1.set(r4, r2)
                goto L_0x00a6
            L_0x0076:
                java.util.List<java.lang.String> r1 = r12.isInside
                r1.add(r2)
                goto L_0x00a6
            L_0x007c:
                java.util.List<java.lang.String> r4 = r12.isInside
                int r5 = r4.size()
                int r5 = r5 - r3
                java.lang.Object r4 = r4.get(r5)
                java.lang.String r4 = (java.lang.String) r4
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L_0x009a
                java.util.List<java.lang.String> r4 = r12.isInside
                int r5 = r4.size()
                int r5 = r5 - r3
                r4.set(r5, r1)
                goto L_0x009f
            L_0x009a:
                java.util.List<java.lang.String> r4 = r12.isInside
                r4.add(r1)
            L_0x009f:
                if (r0 == 0) goto L_0x00a6
                java.util.List<java.lang.String> r1 = r12.isInside
                r1.add(r2)
            L_0x00a6:
                if (r0 == 0) goto L_0x002a
                goto L_0x0028
            L_0x00aa:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.xco.widget.connection.httpclient.p.a.length(java.lang.String, int, int):void");
        }

        private static boolean getMin(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private static boolean length(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private static int setMin(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }

        private static int setMax(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        private static int getMax(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) == ']');
                }
                i++;
            }
            return i2;
        }

        public static String getMin(String str, int i, int i2) {
            InetAddress inetAddress;
            String length2 = p.length(str, i, i2, false);
            if (!length2.contains(":")) {
                return CustomTabsIntent$ShareState.setMax(length2);
            }
            if (!length2.startsWith("[") || !length2.endsWith("]")) {
                inetAddress = toIntRange(length2, 0, length2.length());
            } else {
                inetAddress = toIntRange(length2, 1, length2.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                return getMin(address);
            }
            throw new AssertionError();
        }

        private static InetAddress toIntRange(String str, int i, int i2) {
            byte[] bArr = new byte[16];
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            while (true) {
                if (i >= i2) {
                    break;
                } else if (i3 == 16) {
                    return null;
                } else {
                    int i6 = i + 2;
                    if (i6 > i2 || !str.regionMatches(i, "::", 0, 2)) {
                        if (i3 != 0) {
                            if (str.regionMatches(i, ":", 0, 1)) {
                                i++;
                            } else if (!str.regionMatches(i, ".", 0, 1) || !length(str, i5, i2, bArr, i3 - 2)) {
                                return null;
                            } else {
                                i3 += 2;
                            }
                        }
                        i5 = i;
                    } else if (i4 != -1) {
                        return null;
                    } else {
                        i3 += 2;
                        i4 = i3;
                        if (i6 == i2) {
                            break;
                        }
                        i5 = i6;
                    }
                    i = i5;
                    int i7 = 0;
                    while (i < i2) {
                        int max = p.getMax(str.charAt(i));
                        if (max == -1) {
                            break;
                        }
                        i7 = (i7 << 4) + max;
                        i++;
                    }
                    int i8 = i - i5;
                    if (i8 == 0 || i8 > 4) {
                        return null;
                    }
                    int i9 = i3 + 1;
                    bArr[i3] = (byte) ((i7 >>> 8) & 255);
                    i3 = i9 + 1;
                    bArr[i9] = (byte) (i7 & 255);
                }
            }
            if (i3 != 16) {
                if (i4 == -1) {
                    return null;
                }
                int i10 = i3 - i4;
                System.arraycopy(bArr, i4, bArr, 16 - i10, i10);
                Arrays.fill(bArr, i4, (16 - i3) + i4, (byte) 0);
            }
            try {
                return InetAddress.getByAddress(bArr);
            } catch (UnknownHostException unused) {
                throw new AssertionError();
            }
        }

        private static boolean length(String str, int i, int i2, byte[] bArr, int i3) {
            int i4 = i3;
            while (i < i2) {
                if (i4 == 16) {
                    return false;
                }
                if (i4 != i3) {
                    if (str.charAt(i) != '.') {
                        return false;
                    }
                    i++;
                }
                int i5 = i;
                int i6 = 0;
                while (i5 < i2) {
                    char charAt = str.charAt(i5);
                    if (charAt < '0' || charAt > '9') {
                        break;
                    } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                        return false;
                    } else {
                        i5++;
                    }
                }
                if (i5 - i == 0) {
                    return false;
                }
                bArr[i4] = (byte) i6;
                i4++;
                i = i5;
            }
            if (i4 != i3 + 4) {
                return false;
            }
            return true;
        }

        private static String getMin(byte[] bArr) {
            int i = 0;
            int i2 = -1;
            int i3 = 0;
            int i4 = 0;
            while (i3 < bArr.length) {
                int i5 = i3;
                while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                    i5 += 2;
                }
                int i6 = i5 - i3;
                if (i6 > i4) {
                    i2 = i3;
                    i4 = i6;
                }
                i3 = i5 + 2;
            }
            maxSize maxsize = new maxSize();
            while (i < bArr.length) {
                if (i == i2) {
                    maxsize.getMin(58);
                    i += i4;
                    if (i == 16) {
                        maxsize.getMin(58);
                    }
                } else {
                    if (i > 0) {
                        maxsize.getMin(58);
                    }
                    maxsize.setMax((long) (((bArr[i] & 255) << 8) | (bArr[i + 1] & 255)));
                    i += 2;
                }
            }
            return maxsize.Mean$Arithmetic();
        }

        private static int toFloatRange(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(p.setMin(str, i, i2, "", false, false, false, true));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
    }

    private static String getMax(String str, boolean z) {
        return length(str, 0, str.length(), z);
    }

    private static List<String> setMin(List<String> list, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            arrayList.add(next != null ? getMax(next, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static String length(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                maxSize maxsize = new maxSize();
                maxsize.setMin(str, i, i3);
                getMax(maxsize, str, i3, i2, z);
                return maxsize.Mean$Arithmetic();
            }
        }
        return str.substring(i, i2);
    }

    private static void getMax(maxSize maxsize, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int max = getMax(str.charAt(i + 1));
                int max2 = getMax(str.charAt(i3));
                if (!(max == -1 || max2 == -1)) {
                    maxsize.getMin((max << 4) + max2);
                    i = i3;
                    i += Character.charCount(codePointAt);
                }
            } else if (codePointAt == 43 && z) {
                maxsize.getMin(32);
                i += Character.charCount(codePointAt);
            }
            maxsize.length(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    private static boolean length(String str, int i, int i2) {
        int i3 = i + 2;
        if (i3 >= i2 || str.charAt(i) != '%' || getMax(str.charAt(i + 1)) == -1 || getMax(str.charAt(i3)) == -1) {
            return false;
        }
        return true;
    }

    static String setMin(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        String str3 = str;
        int i3 = i2;
        String str4 = str2;
        int i4 = i;
        while (i4 < i3) {
            int codePointAt = str3.codePointAt(i4);
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str4.indexOf(codePointAt) != -1 || ((codePointAt == 37 && (!z || (z2 && !length(str3, i4, i3)))) || (codePointAt == 43 && z3)))) {
                maxSize maxsize = new maxSize();
                maxsize.setMin(str3, i, i4);
                maxSize maxsize2 = null;
                while (i4 < i3) {
                    int codePointAt2 = str3.codePointAt(i4);
                    if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 == 43 && z3) {
                            String str5 = z ? "+" : "%2B";
                            maxsize.setMin(str5, 0, str5.length());
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z4) || str4.indexOf(codePointAt2) != -1 || (codePointAt2 == 37 && (!z || (z2 && !length(str3, i4, i3)))))) {
                            if (maxsize2 == null) {
                                maxsize2 = new maxSize();
                            }
                            maxsize2.length(codePointAt2);
                            while (!maxsize2.length()) {
                                byte min = maxsize2.getMin() & 255;
                                maxsize.getMin(37);
                                maxsize.getMin((int) getMin[(min >> 4) & 15]);
                                maxsize.getMin((int) getMin[min & Ascii.SI]);
                            }
                        } else {
                            maxsize.length(codePointAt2);
                        }
                    }
                    i4 += Character.charCount(codePointAt2);
                }
                return maxsize.Mean$Arithmetic();
            }
            i4 += Character.charCount(codePointAt);
        }
        int i5 = i;
        return str.substring(i, i2);
    }

    public static String getMax(String str, String str2, boolean z, boolean z2) {
        return setMin(str, 0, str.length(), str2, z, false, z2, true);
    }

    public final URI getMin() {
        int i;
        List<String> list;
        a aVar = new a();
        aVar.getMax = this.length;
        aVar.setMin = setMax();
        aVar.getMin = length();
        aVar.length = this.setMax;
        int i2 = this.getMax;
        String str = this.length;
        int i3 = -1;
        if (str.equals("http")) {
            i = 80;
        } else {
            i = str.equals("https") ? WebSocket.DEFAULT_WSS_PORT : -1;
        }
        if (i2 != i) {
            i3 = this.getMax;
        }
        aVar.setMax = i3;
        aVar.isInside.clear();
        aVar.isInside.addAll(toIntRange());
        String equals2 = equals();
        String str2 = null;
        if (equals2 != null) {
            list = getMax(setMin(equals2, 0, equals2.length(), " \"'<>#", true, false, true, true));
        } else {
            list = null;
        }
        aVar.IsOverlapping = list;
        if (this.isInside != null) {
            str2 = this.toFloatRange.substring(this.toFloatRange.indexOf(35) + 1);
        }
        aVar.toFloatRange = str2;
        int size = aVar.isInside.size();
        for (int i4 = 0; i4 < size; i4++) {
            String str3 = aVar.isInside.get(i4);
            aVar.isInside.set(i4, setMin(str3, 0, str3.length(), "[]", true, true, false, true));
        }
        if (aVar.IsOverlapping != null) {
            int size2 = aVar.IsOverlapping.size();
            for (int i5 = 0; i5 < size2; i5++) {
                String str4 = aVar.IsOverlapping.get(i5);
                if (str4 != null) {
                    aVar.IsOverlapping.set(i5, setMin(str4, 0, str4.length(), "\\^`{|}", true, true, true, true));
                }
            }
        }
        if (aVar.toFloatRange != null) {
            String str5 = aVar.toFloatRange;
            aVar.toFloatRange = setMin(str5, 0, str5.length(), " \"#<>\\^`{|}", true, true, false, false);
        }
        String obj = aVar.toString();
        try {
            return new URI(obj);
        } catch (URISyntaxException e) {
            try {
                return URI.create(obj.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }
}
