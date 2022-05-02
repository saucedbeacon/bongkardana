package com.alipay.mobile.rome.syncsdk.transport.b;

import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncsdk.util.k;
import o.onActivityPostCreated;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class a {
    private static int equals = 1;
    private static char getMax;
    private static char getMin;
    private static final String h = a.class.getSimpleName();
    private static int length;
    private static char setMax;
    private static char setMin;

    /* renamed from: a  reason: collision with root package name */
    protected byte f9434a;
    protected byte b;
    protected byte c;
    protected int d;
    protected byte e = 0;
    protected byte[] f;
    protected byte[] g;

    static void setMin() {
        getMax = 45625;
        setMin = 54982;
        getMin = 55213;
        setMax = 9509;
    }

    public abstract void c(byte[] bArr);

    public abstract byte[] g();

    static {
        setMin();
        int i = equals + 13;
        length = i % 128;
        int i2 = i % 2;
    }

    protected a() {
    }

    public final int a() {
        int i = equals + 25;
        length = i % 128;
        int i2 = i % 2;
        byte b2 = this.b;
        int i3 = length + 23;
        equals = i3 % 128;
        if ((i3 % 2 == 0 ? '8' : 'D') == 'D') {
            return b2;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return b2;
    }

    public final void a(int i) {
        int i2 = equals + 117;
        length = i2 % 128;
        int i3 = i2 % 2;
        this.b = (byte) i;
        int i4 = equals + 13;
        length = i4 % 128;
        if ((i4 % 2 != 0 ? '6' : '!') != '!') {
            int i5 = 62 / 0;
        }
    }

    public final int b() {
        int i = equals + 21;
        length = i % 128;
        int i2 = i % 2;
        byte b2 = this.c;
        int i3 = equals + 103;
        length = i3 % 128;
        int i4 = i3 % 2;
        return b2;
    }

    public final void b(int i) {
        int i2 = equals + 101;
        length = i2 % 128;
        int i3 = i2 % 2;
        this.c = (byte) i;
        int i4 = equals + 107;
        length = i4 % 128;
        if ((i4 % 2 != 0 ? 'P' : ' ') == 'P') {
            Object[] objArr = null;
            int length2 = objArr.length;
        }
    }

    public final int c() {
        int i = length + 97;
        equals = i % 128;
        if ((i % 2 == 0 ? 'b' : 10) == 10) {
            return this.d;
        }
        int i2 = this.d;
        Object obj = null;
        super.hashCode();
        return i2;
    }

    public final int d() {
        int i = length + 33;
        equals = i % 128;
        int i2 = i % 2;
        byte b2 = this.e;
        int i3 = length + 89;
        equals = i3 % 128;
        if (!(i3 % 2 == 0)) {
            return b2;
        }
        Object obj = null;
        super.hashCode();
        return b2;
    }

    public final byte[] e() {
        try {
            int i = equals + 33;
            length = i % 128;
            int i2 = i % 2;
            byte[] bArr = this.g;
            int i3 = equals + 115;
            length = i3 % 128;
            int i4 = i3 % 2;
            return bArr;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final void a(byte[] bArr) {
        try {
            int i = equals + 13;
            length = i % 128;
            int i2 = i % 2;
            this.g = bArr;
            this.d = bArr.length;
            int i3 = length + 9;
            equals = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final void b(byte[] bArr) {
        int i = equals + 83;
        length = i % 128;
        int i2 = i % 2;
        this.g = k.b(bArr);
        this.d = bArr.length;
        this.e = 0;
        int i3 = length + 49;
        equals = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r0 > 0) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r7.g.length > 0) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String f() {
        /*
            r7 = this;
            int r0 = equals
            int r0 = r0 + 49
            int r1 = r0 % 128
            length = r1
            r1 = 2
            int r0 = r0 % r1
            byte[] r0 = r7.g
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0012
            r0 = 0
            goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            if (r0 == 0) goto L_0x0016
            goto L_0x0085
        L_0x0016:
            int r0 = length
            int r0 = r0 + 103
            int r4 = r0 % 128
            equals = r4
            int r0 = r0 % r1
            r4 = 90
            if (r0 != 0) goto L_0x0026
            r0 = 21
            goto L_0x0028
        L_0x0026:
            r0 = 90
        L_0x0028:
            if (r0 == r4) goto L_0x0034
            byte[] r0 = r7.g
            int r0 = r0.length
            r4 = 0
            int r4 = r4.length     // Catch:{ all -> 0x0032 }
            if (r0 <= 0) goto L_0x0085
            goto L_0x0039
        L_0x0032:
            r0 = move-exception
            throw r0
        L_0x0034:
            byte[] r0 = r7.g
            int r0 = r0.length
            if (r0 <= 0) goto L_0x0085
        L_0x0039:
            java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x006c }
            byte[] r4 = r7.g     // Catch:{ UnsupportedEncodingException -> 0x006c }
            r5 = 6
            char[] r5 = new char[r5]     // Catch:{ UnsupportedEncodingException -> 0x006c }
            r6 = 48942(0xbf2e, float:6.8582E-41)
            r5[r2] = r6     // Catch:{ UnsupportedEncodingException -> 0x006c }
            r2 = 8854(0x2296, float:1.2407E-41)
            r5[r3] = r2     // Catch:{ UnsupportedEncodingException -> 0x006c }
            r2 = 65164(0xfe8c, float:9.1314E-41)
            r5[r1] = r2     // Catch:{ UnsupportedEncodingException -> 0x006c }
            r2 = 3
            r3 = 51292(0xc85c, float:7.1875E-41)
            r5[r2] = r3     // Catch:{ UnsupportedEncodingException -> 0x006c }
            r2 = 4
            r3 = 64734(0xfcde, float:9.0712E-41)
            r5[r2] = r3     // Catch:{ UnsupportedEncodingException -> 0x006c }
            r2 = 5
            r3 = 44308(0xad14, float:6.2089E-41)
            r5[r2] = r3     // Catch:{ UnsupportedEncodingException -> 0x006c }
            java.lang.String r2 = getMax(r5)     // Catch:{ UnsupportedEncodingException -> 0x006c }
            java.lang.String r2 = r2.intern()     // Catch:{ UnsupportedEncodingException -> 0x006c }
            r0.<init>(r4, r2)     // Catch:{ UnsupportedEncodingException -> 0x006c }
            goto L_0x0087
        L_0x006c:
            r0 = move-exception
            java.lang.String r2 = h
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getDataStr: [ Exception "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = " ]"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.alipay.mobile.rome.syncsdk.util.c.d(r2, r0)
        L_0x0085:
            java.lang.String r0 = ""
        L_0x0087:
            int r2 = equals
            int r2 = r2 + 119
            int r3 = r2 % 128
            length = r3
            int r2 = r2 % r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.rome.syncsdk.transport.b.a.f():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        if ((r6 != null) != true) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if ((r6 != null) != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = equals
            int r0 = r0 + 101
            int r1 = r0 % 128
            length = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 == r2) goto L_0x001b
            if (r6 == 0) goto L_0x0017
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x0082
            goto L_0x0026
        L_0x001b:
            r0 = 82
            int r0 = r0 / r3
            if (r6 == 0) goto L_0x0022
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            if (r0 == r2) goto L_0x0026
            goto L_0x0082
        L_0x0026:
            int r0 = r6.length()
            if (r0 <= 0) goto L_0x0082
            int r0 = length
            int r0 = r0 + 107
            int r4 = r0 % 128
            equals = r4
            int r0 = r0 % r1
            r0 = 6
            char[] r0 = new char[r0]     // Catch:{ UnsupportedEncodingException -> 0x0068 }
            r4 = 48942(0xbf2e, float:6.8582E-41)
            r0[r3] = r4     // Catch:{ UnsupportedEncodingException -> 0x0068 }
            r3 = 8854(0x2296, float:1.2407E-41)
            r0[r2] = r3     // Catch:{ UnsupportedEncodingException -> 0x0068 }
            r2 = 65164(0xfe8c, float:9.1314E-41)
            r0[r1] = r2     // Catch:{ UnsupportedEncodingException -> 0x0068 }
            r1 = 3
            r2 = 51292(0xc85c, float:7.1875E-41)
            r0[r1] = r2     // Catch:{ UnsupportedEncodingException -> 0x0068 }
            r1 = 4
            r2 = 64734(0xfcde, float:9.0712E-41)
            r0[r1] = r2     // Catch:{ UnsupportedEncodingException -> 0x0068 }
            r1 = 5
            r2 = 44308(0xad14, float:6.2089E-41)
            r0[r1] = r2     // Catch:{ UnsupportedEncodingException -> 0x0068 }
            java.lang.String r0 = getMax(r0)     // Catch:{ UnsupportedEncodingException -> 0x0068 }
            java.lang.String r0 = r0.intern()     // Catch:{ UnsupportedEncodingException -> 0x0068 }
            byte[] r6 = r6.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x0068 }
            r5.a((byte[]) r6)     // Catch:{ UnsupportedEncodingException -> 0x0068 }
            return
        L_0x0068:
            r6 = move-exception
            java.lang.String r0 = h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "setDataStr: [ Exception "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = " ]"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.alipay.mobile.rome.syncsdk.util.c.d(r0, r6)
            return
        L_0x0082:
            r6 = 0
            r5.g = r6
            r5.d = r3
            return
        L_0x0088:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.rome.syncsdk.transport.b.a.a(java.lang.String):void");
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", this.f9434a);
            jSONObject.put("packetType", this.b);
            jSONObject.put("packetReqOrRep", this.c);
            jSONObject.put("dataLen", this.d);
            jSONObject.put("isDataGziped", this.e);
            jSONObject.put("extField", this.f);
            jSONObject.put("dataStr", f());
            int i = length + 13;
            equals = i % 128;
            int i2 = i % 2;
            int i3 = equals + 43;
            length = i3 % 128;
            if ((i3 % 2 != 0 ? '%' : 'P') != '%') {
                try {
                    return jSONObject.toString();
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                try {
                    String jSONObject2 = jSONObject.toString();
                    Object[] objArr = null;
                    int length2 = objArr.length;
                    return jSONObject2;
                } catch (Exception e3) {
                    throw e3;
                }
            }
        } catch (JSONException e4) {
            String str = h;
            StringBuilder sb = new StringBuilder("toString: [ Exception ");
            sb.append(e4);
            sb.append(" ]");
            c.d(str, sb.toString());
            return "Pakcet toString failed";
        }
    }

    public static boolean a(a aVar) {
        boolean z = false;
        if (aVar.f9434a != b.b) {
            return false;
        }
        try {
            int i = length + 107;
            equals = i % 128;
            if (i % 2 == 0) {
                z = true;
            }
            boolean z2 = !z;
            int i2 = equals + 121;
            length = i2 % 128;
            if (i2 % 2 == 0) {
                return z2;
            }
            Object obj = null;
            super.hashCode();
            return z2;
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String getMax(char[] cArr) {
        int i = length + 95;
        equals = i % 128;
        int i2 = i % 2;
        char[] cArr2 = new char[cArr.length];
        char[] cArr3 = new char[2];
        int i3 = 0;
        while (true) {
            if ((i3 < cArr.length ? 'I' : '3') != 'I') {
                String str = new String(cArr2, 1, cArr2[0]);
                int i4 = equals + 87;
                length = i4 % 128;
                int i5 = i4 % 2;
                return str;
            }
            int i6 = equals + 51;
            length = i6 % 128;
            int i7 = i6 % 2;
            cArr3[0] = cArr[i3];
            int i8 = i3 + 1;
            cArr3[1] = cArr[i8];
            onActivityPostCreated.setMax(cArr3, getMax, setMax, setMin, getMin);
            cArr2[i3] = cArr3[0];
            cArr2[i8] = cArr3[1];
            i3 += 2;
        }
    }
}
