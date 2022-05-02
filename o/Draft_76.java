package o;

import com.alibaba.griver.h5.permission.GriverJSAPIPermission;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocket;
import com.google.common.base.Ascii;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import kotlin.text.Typography;

public final class Draft_76 {
    private static final char[] toFloatRange = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final String IsOverlapping;
    private final String equals;
    public final List<String> getMax;
    public final String getMin;
    private final String isInside;
    @Nullable
    public final List<String> length;
    public final int setMax;
    public final String setMin;
    @Nullable
    private final String toIntRange;

    Draft_76(getMin getmin) {
        this.setMin = getmin.setMin;
        this.isInside = setMax(getmin.setMax, false);
        this.IsOverlapping = setMax(getmin.getMin, false);
        this.getMin = getmin.length;
        int i = -1;
        if (getmin.getMax != -1) {
            i = getmin.getMax;
        } else {
            String str = getmin.setMin;
            if (str.equals("http")) {
                i = 80;
            } else if (str.equals("https")) {
                i = WebSocket.DEFAULT_WSS_PORT;
            }
        }
        this.setMax = i;
        this.getMax = length(getmin.isInside, false);
        String str2 = null;
        this.length = getmin.toIntRange != null ? length(getmin.toIntRange, true) : null;
        this.toIntRange = getmin.IsOverlapping != null ? setMax(getmin.IsOverlapping, false) : str2;
        this.equals = getmin.toString();
    }

    public final URL getMax() {
        try {
            return new URL(this.equals);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final URI setMax() {
        getMin floatRange = toFloatRange();
        int size = floatRange.isInside.size();
        for (int i = 0; i < size; i++) {
            String str = floatRange.isInside.get(i);
            floatRange.isInside.set(i, getMin(str, 0, str.length(), "[]", true, true, false, true, (Charset) null));
        }
        if (floatRange.toIntRange != null) {
            int size2 = floatRange.toIntRange.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = floatRange.toIntRange.get(i2);
                if (str2 != null) {
                    floatRange.toIntRange.set(i2, getMin(str2, 0, str2.length(), "\\^`{|}", true, true, true, true, (Charset) null));
                }
            }
        }
        if (floatRange.IsOverlapping != null) {
            String str3 = floatRange.IsOverlapping;
            floatRange.IsOverlapping = getMin(str3, 0, str3.length(), " \"#<>\\^`{|}", true, true, false, false, (Charset) null);
        }
        String obj = floatRange.toString();
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

    public final boolean setMin() {
        return this.setMin.equals("https");
    }

    public final String getMin() {
        if (this.isInside.isEmpty()) {
            return "";
        }
        int length2 = this.setMin.length() + 3;
        String str = this.equals;
        return this.equals.substring(length2, initCloseCode.length(str, length2, str.length(), ":@"));
    }

    public final String length() {
        if (this.IsOverlapping.isEmpty()) {
            return "";
        }
        int indexOf = this.equals.indexOf(64);
        return this.equals.substring(this.equals.indexOf(58, this.setMin.length() + 3) + 1, indexOf);
    }

    public static int getMax(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return WebSocket.DEFAULT_WSS_PORT;
        }
        return -1;
    }

    public final String toIntRange() {
        int indexOf = this.equals.indexOf(47, this.setMin.length() + 3);
        String str = this.equals;
        return this.equals.substring(indexOf, initCloseCode.length(str, indexOf, str.length(), "?#"));
    }

    static void setMax(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    public final List<String> IsOverlapping() {
        int indexOf = this.equals.indexOf(47, this.setMin.length() + 3);
        String str = this.equals;
        int length2 = initCloseCode.length(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < length2) {
            int i = indexOf + 1;
            int max = initCloseCode.getMax(this.equals, i, length2, '/');
            arrayList.add(this.equals.substring(i, max));
            indexOf = max;
        }
        return arrayList;
    }

    @Nullable
    public final String isInside() {
        if (this.length == null) {
            return null;
        }
        int indexOf = this.equals.indexOf(63) + 1;
        String str = this.equals;
        return this.equals.substring(indexOf, initCloseCode.getMax(str, indexOf, str.length(), '#'));
    }

    public static void getMax(StringBuilder sb, List<String> list) {
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

    static List<String> setMax(String str) {
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

    public final getMin toFloatRange() {
        int i;
        getMin getmin = new getMin();
        getmin.setMin = this.setMin;
        getmin.setMax = getMin();
        getmin.getMin = length();
        getmin.length = this.getMin;
        int i2 = this.setMax;
        String str = this.setMin;
        int i3 = -1;
        if (str.equals("http")) {
            i = 80;
        } else {
            i = str.equals("https") ? WebSocket.DEFAULT_WSS_PORT : -1;
        }
        if (i2 != i) {
            i3 = this.setMax;
        }
        getmin.getMax = i3;
        getmin.isInside.clear();
        getmin.isInside.addAll(IsOverlapping());
        String isInside2 = isInside();
        String str2 = null;
        getmin.toIntRange = isInside2 != null ? setMax(getMin(isInside2, 0, isInside2.length(), " \"'<>#", true, false, true, true, (Charset) null)) : null;
        if (this.toIntRange != null) {
            str2 = this.equals.substring(this.equals.indexOf(35) + 1);
        }
        getmin.IsOverlapping = str2;
        return getmin;
    }

    @Nullable
    public final getMin length(String str) {
        try {
            return new getMin().getMax(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static Draft_76 getMin(String str) {
        return new getMin().getMax((Draft_76) null, str).setMin();
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof Draft_76) && ((Draft_76) obj).equals.equals(this.equals);
    }

    public final int hashCode() {
        return this.equals.hashCode();
    }

    public final String toString() {
        return this.equals;
    }

    public static final class getMin {
        @Nullable
        public String IsOverlapping;
        int getMax = -1;
        public String getMin = "";
        final List<String> isInside;
        @Nullable
        String length;
        public String setMax = "";
        @Nullable
        String setMin;
        @Nullable
        public List<String> toIntRange;

        public getMin() {
            ArrayList arrayList = new ArrayList();
            this.isInside = arrayList;
            arrayList.add("");
        }

        public final getMin length(String str, @Nullable String str2) {
            if (str != null) {
                if (this.toIntRange == null) {
                    this.toIntRange = new ArrayList();
                }
                this.toIntRange.add(Draft_76.setMin(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, true));
                this.toIntRange.add(str2 != null ? Draft_76.setMin(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, true) : null);
                return this;
            }
            throw new NullPointerException("name == null");
        }

        public final getMin setMin(String str, @Nullable String str2) {
            if (str != null) {
                if (this.toIntRange == null) {
                    this.toIntRange = new ArrayList();
                }
                this.toIntRange.add(Draft_76.setMin(str, " \"'<>#&=", true, true));
                this.toIntRange.add(str2 != null ? Draft_76.setMin(str2, " \"'<>#&=", true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public final Draft_76 setMin() {
            if (this.setMin == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.length != null) {
                return new Draft_76(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.setMin;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.setMax.isEmpty() || !this.getMin.isEmpty()) {
                sb.append(this.setMax);
                if (!this.getMin.isEmpty()) {
                    sb.append(':');
                    sb.append(this.getMin);
                }
                sb.append('@');
            }
            String str2 = this.length;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.length);
                    sb.append(']');
                } else {
                    sb.append(this.length);
                }
            }
            if (!(this.getMax == -1 && this.setMin == null)) {
                int i = this.getMax;
                if (i == -1) {
                    i = Draft_76.getMax(this.setMin);
                }
                String str3 = this.setMin;
                if (str3 == null || i != Draft_76.getMax(str3)) {
                    sb.append(':');
                    sb.append(i);
                }
            }
            Draft_76.setMax(sb, this.isInside);
            if (this.toIntRange != null) {
                sb.append('?');
                Draft_76.getMax(sb, this.toIntRange);
            }
            if (this.IsOverlapping != null) {
                sb.append('#');
                sb.append(this.IsOverlapping);
            }
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        public final getMin getMax(@Nullable Draft_76 draft_76, String str) {
            int length2;
            int i;
            boolean z;
            Draft_76 draft_762 = draft_76;
            String str2 = str;
            int length3 = initCloseCode.length(str2, 0, str.length());
            int min = initCloseCode.getMin(str2, length3, str.length());
            int max = setMax(str2, length3, min);
            char c = 65535;
            if (max != -1) {
                if (str.regionMatches(true, length3, GriverJSAPIPermission.PROTOCOL_HTTPS, 0, 6)) {
                    this.setMin = "https";
                    length3 += 6;
                } else if (str.regionMatches(true, length3, GriverJSAPIPermission.PROTOCOL_HTTP, 0, 5)) {
                    this.setMin = "http";
                    length3 += 5;
                } else {
                    StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                    sb.append(str2.substring(0, max));
                    sb.append("'");
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (draft_762 != null) {
                this.setMin = draft_762.setMin;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int min2 = getMin(str2, length3, min);
            char c2 = '?';
            char c3 = '#';
            if (min2 >= 2 || draft_762 == null || !draft_762.setMin.equals(this.setMin)) {
                int i2 = length3 + min2;
                boolean z2 = false;
                boolean z3 = false;
                while (true) {
                    length2 = initCloseCode.length(str2, i2, min, "@/\\?#");
                    char charAt = length2 != min ? str2.charAt(length2) : 65535;
                    if (charAt == c || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        int i3 = length2;
                        int max2 = getMax(str2, i2, i3);
                        int i4 = max2 + 1;
                    } else if (charAt == '@') {
                        if (!z2) {
                            int max3 = initCloseCode.getMax(str2, i2, length2, ':');
                            int i5 = max3;
                            String str3 = "%40";
                            i = length2;
                            String min3 = Draft_76.getMin(str, i2, max3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                            if (z3) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(this.setMax);
                                sb2.append(str3);
                                sb2.append(min3);
                                min3 = sb2.toString();
                            }
                            this.setMax = min3;
                            if (i5 != i) {
                                this.getMin = Draft_76.getMin(str, i5 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                z = true;
                            } else {
                                z = z2;
                            }
                            z2 = z;
                            z3 = true;
                        } else {
                            i = length2;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.getMin);
                            sb3.append("%40");
                            sb3.append(Draft_76.getMin(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null));
                            this.getMin = sb3.toString();
                        }
                        i2 = i + 1;
                        c = 65535;
                        c2 = '?';
                        c3 = '#';
                    }
                }
                int i32 = length2;
                int max22 = getMax(str2, i2, i32);
                int i42 = max22 + 1;
                if (i42 < i32) {
                    this.length = initCloseCode.getMin(Draft_76.getMin(str2, i2, max22, false));
                    int min4 = setMin(str2, i42, i32);
                    this.getMax = min4;
                    if (min4 == -1) {
                        StringBuilder sb4 = new StringBuilder("Invalid URL port: \"");
                        sb4.append(str2.substring(i42, i32));
                        sb4.append(Typography.quote);
                        throw new IllegalArgumentException(sb4.toString());
                    }
                } else {
                    this.length = initCloseCode.getMin(Draft_76.getMin(str2, i2, max22, false));
                    this.getMax = Draft_76.getMax(this.setMin);
                }
                if (this.length != null) {
                    length3 = i32;
                } else {
                    StringBuilder sb5 = new StringBuilder("Invalid URL host: \"");
                    sb5.append(str2.substring(i2, max22));
                    sb5.append(Typography.quote);
                    throw new IllegalArgumentException(sb5.toString());
                }
            } else {
                this.setMax = draft_76.getMin();
                this.getMin = draft_76.length();
                this.length = draft_762.getMin;
                this.getMax = draft_762.setMax;
                this.isInside.clear();
                this.isInside.addAll(draft_76.IsOverlapping());
                if (length3 == min || str2.charAt(length3) == '#') {
                    String isInside2 = draft_76.isInside();
                    this.toIntRange = isInside2 != null ? Draft_76.setMax(Draft_76.setMin(isInside2, " \"'<>#", true, true)) : null;
                }
            }
            int length4 = initCloseCode.length(str2, length3, min, "?#");
            length(str2, length3, length4);
            if (length4 < min && str2.charAt(length4) == '?') {
                int max4 = initCloseCode.getMax(str2, length4, min, '#');
                this.toIntRange = Draft_76.setMax(Draft_76.getMin(str, length4 + 1, max4, " \"'<>#", true, false, true, true, (Charset) null));
                length4 = max4;
            }
            if (length4 < min && str2.charAt(length4) == '#') {
                this.IsOverlapping = Draft_76.getMin(str, length4 + 1, min, "", true, false, false, false, (Charset) null);
            }
            return this;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00b4 A[SYNTHETIC] */
        private void length(java.lang.String r17, int r18, int r19) {
            /*
                r16 = this;
                r0 = r16
                r1 = r18
                r2 = r19
                if (r1 != r2) goto L_0x0009
                return
            L_0x0009:
                char r3 = r17.charAt(r18)
                r4 = 47
                java.lang.String r5 = ""
                r6 = 1
                if (r3 == r4) goto L_0x0024
                r4 = 92
                if (r3 != r4) goto L_0x0019
                goto L_0x0024
            L_0x0019:
                java.util.List<java.lang.String> r3 = r0.isInside
                int r4 = r3.size()
                int r4 = r4 - r6
                r3.set(r4, r5)
                goto L_0x0030
            L_0x0024:
                java.util.List<java.lang.String> r3 = r0.isInside
                r3.clear()
                java.util.List<java.lang.String> r3 = r0.isInside
                r3.add(r5)
            L_0x002e:
                int r1 = r1 + 1
            L_0x0030:
                r8 = r1
                if (r8 >= r2) goto L_0x00b4
                java.lang.String r1 = "/\\"
                r3 = r17
                int r1 = o.initCloseCode.length(r3, r8, r2, r1)
                if (r1 >= r2) goto L_0x003f
                r4 = 1
                goto L_0x0040
            L_0x003f:
                r4 = 0
            L_0x0040:
                r11 = 1
                r12 = 0
                r13 = 0
                r14 = 1
                r15 = 0
                java.lang.String r10 = " \"<>^`{}|/\\?#"
                r7 = r17
                r9 = r1
                java.lang.String r7 = o.Draft_76.getMin(r7, r8, r9, r10, r11, r12, r13, r14, r15)
                boolean r8 = setMin(r7)
                if (r8 != 0) goto L_0x00b0
                boolean r8 = getMax(r7)
                if (r8 == 0) goto L_0x0086
                java.util.List<java.lang.String> r7 = r0.isInside
                int r8 = r7.size()
                int r8 = r8 - r6
                java.lang.Object r7 = r7.remove(r8)
                java.lang.String r7 = (java.lang.String) r7
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L_0x0080
                java.util.List<java.lang.String> r7 = r0.isInside
                boolean r7 = r7.isEmpty()
                if (r7 != 0) goto L_0x0080
                java.util.List<java.lang.String> r7 = r0.isInside
                int r8 = r7.size()
                int r8 = r8 - r6
                r7.set(r8, r5)
                goto L_0x00b0
            L_0x0080:
                java.util.List<java.lang.String> r7 = r0.isInside
                r7.add(r5)
                goto L_0x00b0
            L_0x0086:
                java.util.List<java.lang.String> r8 = r0.isInside
                int r9 = r8.size()
                int r9 = r9 - r6
                java.lang.Object r8 = r8.get(r9)
                java.lang.String r8 = (java.lang.String) r8
                boolean r8 = r8.isEmpty()
                if (r8 == 0) goto L_0x00a4
                java.util.List<java.lang.String> r8 = r0.isInside
                int r9 = r8.size()
                int r9 = r9 - r6
                r8.set(r9, r7)
                goto L_0x00a9
            L_0x00a4:
                java.util.List<java.lang.String> r8 = r0.isInside
                r8.add(r7)
            L_0x00a9:
                if (r4 == 0) goto L_0x00b0
                java.util.List<java.lang.String> r7 = r0.isInside
                r7.add(r5)
            L_0x00b0:
                if (r4 == 0) goto L_0x0030
                goto L_0x002e
            L_0x00b4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.Draft_76.getMin.length(java.lang.String, int, int):void");
        }

        private static boolean setMin(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private static boolean getMax(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private static int setMax(String str, int i, int i2) {
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

        private static int getMin(String str, int i, int i2) {
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

        private static int setMin(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(Draft_76.getMin(str, i, i2, "", false, false, false, true, (Charset) null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
    }

    private static String setMax(String str, boolean z) {
        return getMin(str, 0, str.length(), z);
    }

    private static List<String> length(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? setMax(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static String getMin(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                submitLazy submitlazy = new submitLazy();
                submitlazy.setMin(str, i, i3);
                setMin(submitlazy, str, i3, i2, z);
                return submitlazy.invokeSuspend();
            }
        }
        return str.substring(i, i2);
    }

    private static void setMin(submitLazy submitlazy, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int length2 = initCloseCode.length(str.charAt(i + 1));
                int length3 = initCloseCode.length(str.charAt(i3));
                if (!(length2 == -1 || length3 == -1)) {
                    submitlazy.equals((length2 << 4) + length3);
                    i = i3;
                    i += Character.charCount(codePointAt);
                }
            } else if (codePointAt == 43 && z) {
                submitlazy.equals(32);
                i += Character.charCount(codePointAt);
            }
            submitlazy.getMin(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    private static boolean length(String str, int i, int i2) {
        int i3 = i + 2;
        if (i3 >= i2 || str.charAt(i) != '%' || initCloseCode.length(str.charAt(i + 1)) == -1 || initCloseCode.length(str.charAt(i3)) == -1) {
            return false;
        }
        return true;
    }

    static String getMin(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        String str3 = str;
        int i3 = i2;
        String str4 = str2;
        Charset charset2 = charset;
        int i4 = i;
        while (i4 < i3) {
            int codePointAt = str3.codePointAt(i4);
            int i5 = 43;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str4.indexOf(codePointAt) != -1 || ((codePointAt == 37 && (!z || (z2 && !length(str3, i4, i3)))) || (codePointAt == 43 && z3)))) {
                submitLazy submitlazy = new submitLazy();
                submitlazy.setMin(str3, i, i4);
                submitLazy submitlazy2 = null;
                while (i4 < i3) {
                    int codePointAt2 = str3.codePointAt(i4);
                    if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 == i5 && z3) {
                            String str5 = z ? "+" : "%2B";
                            submitlazy.setMin(str5, 0, str5.length());
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z4) || str4.indexOf(codePointAt2) != -1 || (codePointAt2 == 37 && (!z || (z2 && !length(str3, i4, i3)))))) {
                            if (submitlazy2 == null) {
                                submitlazy2 = new submitLazy();
                            }
                            if (charset2 == null || charset2.equals(initCloseCode.setMax)) {
                                submitlazy2.getMin(codePointAt2);
                            } else {
                                int charCount = Character.charCount(codePointAt2) + i4;
                                if (str3 == null) {
                                    throw new IllegalArgumentException("string == null");
                                } else if (i4 < 0) {
                                    throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i4)));
                                } else if (charCount < i4) {
                                    StringBuilder sb = new StringBuilder("endIndex < beginIndex: ");
                                    sb.append(charCount);
                                    sb.append(" < ");
                                    sb.append(i4);
                                    throw new IllegalArgumentException(sb.toString());
                                } else if (charCount > str.length()) {
                                    StringBuilder sb2 = new StringBuilder("endIndex > string.length: ");
                                    sb2.append(charCount);
                                    sb2.append(" > ");
                                    sb2.append(str.length());
                                    throw new IllegalArgumentException(sb2.toString());
                                } else if (charset2 == null) {
                                    throw new IllegalArgumentException("charset == null");
                                } else if (charset2.equals(MonitorModel.getMax)) {
                                    submitlazy2.setMin(str3, i4, charCount);
                                } else {
                                    byte[] bytes = str3.substring(i4, charCount).getBytes(charset2);
                                    submitlazy2.length(bytes, 0, bytes.length);
                                }
                            }
                            while (!submitlazy2.setMax()) {
                                byte IsOverlapping2 = submitlazy2.IsOverlapping() & 255;
                                submitlazy.equals(37);
                                submitlazy.equals((int) toFloatRange[(IsOverlapping2 >> 4) & 15]);
                                submitlazy.equals((int) toFloatRange[IsOverlapping2 & Ascii.SI]);
                            }
                        } else {
                            submitlazy.getMin(codePointAt2);
                        }
                    }
                    i4 += Character.charCount(codePointAt2);
                    i5 = 43;
                }
                return submitlazy.invokeSuspend();
            }
            i4 += Character.charCount(codePointAt);
        }
        int i6 = i;
        return str.substring(i, i2);
    }

    static String setMax(String str, String str2, boolean z, Charset charset) {
        return getMin(str, 0, str.length(), str2, z, false, true, true, charset);
    }

    public static String setMin(String str, String str2, boolean z, boolean z2) {
        return getMin(str, 0, str.length(), str2, z, false, z2, true, (Charset) null);
    }

    @Nullable
    public static Draft_76 setMin(String str) {
        try {
            return new getMin().getMax((Draft_76) null, str).setMin();
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
