package com.alipay.imobile.network.quake.transport.http;

import com.alibaba.wireless.security.SecExceptionCode;
import com.alipay.imobile.network.quake.transport.HttpDate;
import com.alipay.imobile.network.quake.util.b;
import com.alipay.imobile.network.quake.util.e;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class Cookie {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f9377a = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern b = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern c = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern d = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    private final String e;
    private final String f;
    private final long g;
    private final String h;
    private final String i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        String f9378a;
        String b;
        long c = HttpDate.MAX_DATE;
        String d;
        String e = "/";
        boolean f;
        boolean g;
        boolean h;
        boolean i;

        private Builder a(String str, boolean z) {
            if (str != null) {
                String a2 = e.a(str);
                if (a2 != null) {
                    this.d = a2;
                    this.i = z;
                    return this;
                }
                throw new IllegalArgumentException("unexpected domain: ".concat(String.valueOf(str)));
            }
            throw new IllegalArgumentException("domain == null");
        }

        public final Cookie build() {
            return new Cookie(this);
        }

        public final Builder domain(String str) {
            return a(str, false);
        }

        public final Builder expiresAt(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > HttpDate.MAX_DATE) {
                j = 253402300799999L;
            }
            this.c = j;
            this.h = true;
            return this;
        }

        public final Builder hostOnlyDomain(String str) {
            return a(str, true);
        }

        public final Builder httpOnly() {
            this.g = true;
            return this;
        }

        public final Builder name(String str) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(-388143038, oncanceled);
                onCancelLoad.getMin(-388143038, oncanceled);
            }
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str.trim().equals(str)) {
                this.f9378a = str;
                return this;
            } else {
                throw new IllegalArgumentException("name is not trimmed");
            }
        }

        public final Builder path(String str) {
            if (str.startsWith("/")) {
                this.e = str;
                return this;
            }
            throw new IllegalArgumentException("path must start with '/'");
        }

        public final Builder secure() {
            this.f = true;
            return this;
        }

        public final Builder value(String str) {
            if (str == null) {
                throw new NullPointerException("value == null");
            } else if (str.trim().equals(str)) {
                this.b = str;
                return this;
            } else {
                throw new IllegalArgumentException("value is not trimmed");
            }
        }
    }

    private Cookie(Builder builder) {
        if (builder.f9378a == null) {
            throw new IllegalArgumentException("builder.name == null");
        } else if (builder.b == null) {
            throw new IllegalArgumentException("builder.value == null");
        } else if (builder.d != null) {
            this.e = builder.f9378a;
            this.f = builder.b;
            this.g = builder.c;
            this.h = builder.d;
            this.i = builder.e;
            this.j = builder.f;
            this.k = builder.g;
            this.l = builder.h;
            this.m = builder.i;
        } else {
            throw new IllegalArgumentException("builder.domain == null");
        }
    }

    private Cookie(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.e = str;
        this.f = str2;
        this.g = j2;
        this.h = str3;
        this.i = str4;
        this.j = z;
        this.k = z2;
        this.m = z3;
        this.l = z4;
    }

    private static int a(String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    private static long a(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e2) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e2;
        }
    }

    private static long a(String str, int i2, int i3) {
        int a2 = a(str, i2, i3, false);
        Matcher matcher = d.matcher(str);
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        while (a2 < i3) {
            int a3 = a(str, a2 + 1, i3, true);
            matcher.region(a2, a3);
            if (i5 == -1 && matcher.usePattern(d).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
                i8 = Integer.parseInt(matcher.group(2));
                i9 = Integer.parseInt(matcher.group(3));
            } else if (i6 == -1 && matcher.usePattern(c).matches()) {
                i6 = Integer.parseInt(matcher.group(1));
            } else if (i7 == -1 && matcher.usePattern(b).matches()) {
                i7 = b.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
            } else if (i4 == -1 && matcher.usePattern(f9377a).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
            }
            a2 = a(str, a3 + 1, i3, false);
        }
        if (i4 >= 70 && i4 <= 99) {
            i4 += SecExceptionCode.SEC_ERROR_AVMP;
        }
        if (i4 >= 0 && i4 <= 69) {
            i4 += 2000;
        }
        if (i4 < 1601) {
            throw new IllegalArgumentException();
        } else if (i7 == -1) {
            throw new IllegalArgumentException();
        } else if (i6 <= 0 || i6 > 31) {
            throw new IllegalArgumentException();
        } else if (i5 < 0 || i5 > 23) {
            throw new IllegalArgumentException();
        } else if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        } else if (i9 < 0 || i9 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(e.f9396a);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i4);
            gregorianCalendar.set(2, i7 - 1);
            gregorianCalendar.set(5, i6);
            gregorianCalendar.set(11, i5);
            gregorianCalendar.set(12, i8);
            gregorianCalendar.set(13, i9);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.alipay.imobile.network.quake.transport.http.Cookie a(long r23, java.net.URL r25, java.lang.String r26) {
        /*
            r0 = r26
            int r1 = r26.length()
            r2 = 59
            r3 = 0
            int r4 = com.alipay.imobile.network.quake.util.e.a((java.lang.String) r0, (int) r3, (int) r1, (char) r2)
            r5 = 61
            int r6 = com.alipay.imobile.network.quake.util.e.a((java.lang.String) r0, (int) r3, (int) r4, (char) r5)
            r7 = 0
            if (r6 != r4) goto L_0x0017
            return r7
        L_0x0017:
            java.lang.String r9 = com.alipay.imobile.network.quake.util.e.c(r0, r3, r6)
            boolean r8 = r9.isEmpty()
            if (r8 == 0) goto L_0x0022
            return r7
        L_0x0022:
            r8 = 1
            int r6 = r6 + r8
            java.lang.String r10 = com.alipay.imobile.network.quake.util.e.c(r0, r6, r4)
            int r4 = r4 + r8
            r11 = -1
            r13 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r6 = r7
            r8 = r6
            r19 = r11
            r21 = r13
            r15 = 0
            r16 = 0
            r17 = 1
            r18 = 0
        L_0x003d:
            if (r4 >= r1) goto L_0x00ab
            int r7 = com.alipay.imobile.network.quake.util.e.a((java.lang.String) r0, (int) r4, (int) r1, (char) r2)
            int r2 = com.alipay.imobile.network.quake.util.e.a((java.lang.String) r0, (int) r4, (int) r7, (char) r5)
            java.lang.String r4 = com.alipay.imobile.network.quake.util.e.c(r0, r4, r2)
            if (r2 >= r7) goto L_0x0054
            int r2 = r2 + 1
            java.lang.String r2 = com.alipay.imobile.network.quake.util.e.c(r0, r2, r7)
            goto L_0x0056
        L_0x0054:
            java.lang.String r2 = ""
        L_0x0056:
            java.lang.String r5 = "expires"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0067
            int r4 = r2.length()     // Catch:{ IllegalArgumentException -> 0x00a3 }
            long r21 = a((java.lang.String) r2, (int) r3, (int) r4)     // Catch:{ IllegalArgumentException -> 0x00a3 }
            goto L_0x0073
        L_0x0067:
            java.lang.String r5 = "max-age"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0076
            long r19 = a(r2)     // Catch:{  }
        L_0x0073:
            r18 = 1
            goto L_0x00a3
        L_0x0076:
            java.lang.String r5 = "domain"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0085
            java.lang.String r6 = b(r2)     // Catch:{ IllegalArgumentException -> 0x00a3 }
            r17 = 0
            goto L_0x00a3
        L_0x0085:
            java.lang.String r5 = "path"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x008f
            r8 = r2
            goto L_0x00a3
        L_0x008f:
            java.lang.String r2 = "secure"
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0099
            r15 = 1
            goto L_0x00a3
        L_0x0099:
            java.lang.String r2 = "httponly"
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x00a3
            r16 = 1
        L_0x00a3:
            int r4 = r7 + 1
            r2 = 59
            r5 = 61
            r7 = 0
            goto L_0x003d
        L_0x00ab:
            r0 = -9223372036854775808
            int r2 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x00b3
        L_0x00b1:
            r11 = r0
            goto L_0x00d8
        L_0x00b3:
            int r0 = (r19 > r11 ? 1 : (r19 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x00d6
            r0 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r2 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00c5
            r0 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r0
            goto L_0x00ca
        L_0x00c5:
            r19 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00ca:
            long r0 = r23 + r19
            int r2 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r2 < 0) goto L_0x00d4
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 <= 0) goto L_0x00b1
        L_0x00d4:
            r11 = r13
            goto L_0x00d8
        L_0x00d6:
            r11 = r21
        L_0x00d8:
            if (r6 != 0) goto L_0x00e2
            java.lang.String r0 = r25.getHost()
            r13 = r0
            r0 = r25
            goto L_0x00ed
        L_0x00e2:
            r0 = r25
            boolean r1 = a(r0, r6)
            if (r1 != 0) goto L_0x00ec
            r1 = 0
            return r1
        L_0x00ec:
            r13 = r6
        L_0x00ed:
            java.lang.String r1 = "/"
            if (r8 == 0) goto L_0x00fa
            boolean r2 = r8.startsWith(r1)
            if (r2 != 0) goto L_0x00f8
            goto L_0x00fa
        L_0x00f8:
            r14 = r8
            goto L_0x010b
        L_0x00fa:
            java.lang.String r0 = r25.getPath()
            r2 = 47
            int r2 = r0.lastIndexOf(r2)
            if (r2 == 0) goto L_0x010a
            java.lang.String r1 = r0.substring(r3, r2)
        L_0x010a:
            r14 = r1
        L_0x010b:
            com.alipay.imobile.network.quake.transport.http.Cookie r0 = new com.alipay.imobile.network.quake.transport.http.Cookie
            r8 = r0
            r8.<init>(r9, r10, r11, r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.quake.transport.http.Cookie.a(long, java.net.URL, java.lang.String):com.alipay.imobile.network.quake.transport.http.Cookie");
    }

    private static boolean a(URL url, String str) {
        String host = url.getHost();
        if (host.equals(str)) {
            return true;
        }
        return host.endsWith(str) && host.charAt((host.length() - str.length()) - 1) == '.' && !b.a(host);
    }

    private static String b(String str) {
        if (!str.endsWith(".")) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            String a2 = e.a(str);
            if (a2 != null) {
                return a2;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    private static boolean b(URL url, String str) {
        String path = url.getPath();
        if (path.equals(str)) {
            return true;
        }
        if (path.startsWith(str)) {
            return str.endsWith("/") || path.charAt(str.length()) == '/';
        }
        return false;
    }

    public static Cookie parse(URL url, String str) {
        return a(System.currentTimeMillis(), url, str);
    }

    public static List<Cookie> parseAll(URL url, List<String> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            Cookie parse = parse(url, list.get(i2));
            if (parse != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(parse);
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public final String domain() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return cookie.e.equals(this.e) && cookie.f.equals(this.f) && cookie.h.equals(this.h) && cookie.i.equals(this.i) && cookie.g == this.g && cookie.j == this.j && cookie.k == this.k && cookie.l == this.l && cookie.m == this.m;
    }

    public final long expiresAt() {
        return this.g;
    }

    public final int hashCode() {
        long j2 = this.g;
        return ((((((((((((((((this.e.hashCode() + 527) * 31) + this.f.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.j ^ true ? 1 : 0)) * 31) + (this.k ^ true ? 1 : 0)) * 31) + (this.l ^ true ? 1 : 0)) * 31) + (this.m ^ true ? 1 : 0);
    }

    public final boolean hostOnly() {
        return this.m;
    }

    public final boolean httpOnly() {
        return this.k;
    }

    public final boolean matches(URL url) {
        if ((this.m ? url.getHost().equals(this.h) : a(url, this.h)) && b(url, this.i)) {
            return !this.j || "https".equals(url.getProtocol());
        }
        return false;
    }

    public final String name() {
        return this.e;
    }

    public final String path() {
        return this.i;
    }

    public final boolean persistent() {
        return this.l;
    }

    public final boolean secure() {
        return this.j;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        sb.append('=');
        sb.append(this.f);
        if (this.l) {
            if (this.g == Long.MIN_VALUE) {
                str = "; max-age=0";
            } else {
                sb.append("; expires=");
                str = HttpDate.format(new Date(this.g));
            }
            sb.append(str);
        }
        if (!this.m) {
            sb.append("; domain=");
            sb.append(this.h);
        }
        sb.append("; path=");
        sb.append(this.i);
        if (this.j) {
            sb.append("; secure");
        }
        if (this.k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public final String value() {
        return this.f;
    }
}
