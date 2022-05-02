package com.alibaba.griver.bluetooth.altbeacon.beacon.utils;

import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UrlBeaconUrlCompressor {

    /* renamed from: a  reason: collision with root package name */
    private static List<TLDMapEntry> f10274a;

    static {
        ArrayList arrayList = new ArrayList();
        f10274a = arrayList;
        arrayList.add(new TLDMapEntry(".com/", (byte) 0));
        f10274a.add(new TLDMapEntry(".org/", (byte) 1));
        f10274a.add(new TLDMapEntry(".edu/", (byte) 2));
        f10274a.add(new TLDMapEntry(".net/", (byte) 3));
        f10274a.add(new TLDMapEntry(".info/", (byte) 4));
        f10274a.add(new TLDMapEntry(".biz/", (byte) 5));
        f10274a.add(new TLDMapEntry(".gov/", (byte) 6));
        f10274a.add(new TLDMapEntry(".com", (byte) 7));
        f10274a.add(new TLDMapEntry(".org", (byte) 8));
        f10274a.add(new TLDMapEntry(".edu", (byte) 9));
        f10274a.add(new TLDMapEntry(".net", (byte) 10));
        f10274a.add(new TLDMapEntry(".info", Ascii.VT));
        f10274a.add(new TLDMapEntry(".biz", Ascii.FF));
        f10274a.add(new TLDMapEntry(".gov", (byte) 13));
    }

    private static byte a(String str) {
        Iterator<TLDMapEntry> it = f10274a.iterator();
        byte b = -1;
        boolean z = false;
        while (!z && it.hasNext()) {
            TLDMapEntry next = it.next();
            boolean equalsIgnoreCase = next.tld.equalsIgnoreCase(str);
            if (equalsIgnoreCase) {
                b = next.encodedByte;
            }
            z = equalsIgnoreCase;
        }
        return b;
    }

    private static String a(Byte b) {
        Iterator<TLDMapEntry> it = f10274a.iterator();
        String str = null;
        boolean z = false;
        while (!z && it.hasNext()) {
            TLDMapEntry next = it.next();
            boolean z2 = next.encodedByte == b.byteValue();
            if (z2) {
                str = next.tld;
            }
            z = z2;
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00be, code lost:
        if (r3 != null) goto L_0x00d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] compress(java.lang.String r12) {
        /*
            if (r12 == 0) goto L_0x0104
            int r0 = r12.length()
            byte[] r0 = new byte[r0]
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            java.lang.String r2 = "^((?i)http|https):\\/\\/((?i)www\\.)?((?:[0-9a-zA-Z_-]+\\.?)+)(/?)([./0-9a-zA-Z_-]*)"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.util.regex.Matcher r12 = r2.matcher(r12)
            boolean r2 = r12.matches()
            if (r2 == 0) goto L_0x00fe
            r2 = 2
            java.lang.String r3 = r12.group(r2)
            r4 = 1
            if (r3 == 0) goto L_0x0026
            r3 = 1
            goto L_0x0027
        L_0x0026:
            r3 = 0
        L_0x0027:
            java.lang.String r5 = r12.group(r4)
            java.lang.String r5 = r5.toLowerCase()
            java.lang.String r6 = "http"
            boolean r5 = r5.equalsIgnoreCase(r6)
            r6 = 3
            if (r5 == 0) goto L_0x003e
            if (r3 == 0) goto L_0x003b
            r2 = 0
        L_0x003b:
            r0[r1] = r2
            goto L_0x0045
        L_0x003e:
            if (r3 == 0) goto L_0x0042
            r2 = 1
            goto L_0x0043
        L_0x0042:
            r2 = 3
        L_0x0043:
            r0[r1] = r2
        L_0x0045:
            java.lang.String r2 = r12.group(r6)
            byte[] r2 = r2.getBytes()
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
            java.lang.String r2 = r3.toLowerCase()
            java.lang.String r3 = "."
            java.lang.String r5 = java.util.regex.Pattern.quote(r3)
            java.lang.String[] r2 = r2.split(r5)
            r5 = 4
            if (r2 == 0) goto L_0x00cf
            byte[] r6 = new byte[r4]
            r7 = 46
            r6[r1] = r7
            int r7 = r2.length
            if (r7 != r4) goto L_0x006e
            r7 = 1
            goto L_0x0070
        L_0x006e:
            int r7 = r2.length
            int r7 = r7 - r4
        L_0x0070:
            r8 = 0
            r9 = 1
        L_0x0072:
            if (r8 >= r7) goto L_0x0089
            if (r8 <= 0) goto L_0x007b
            java.lang.System.arraycopy(r6, r1, r0, r9, r4)
            int r9 = r9 + 1
        L_0x007b:
            r10 = r2[r8]
            byte[] r10 = r10.getBytes()
            int r11 = r10.length
            java.lang.System.arraycopy(r10, r1, r0, r9, r11)
            int r9 = r9 + r11
            int r8 = r8 + 1
            goto L_0x0072
        L_0x0089:
            int r6 = r2.length
            if (r6 <= r4) goto L_0x00cd
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r3)
            int r3 = r2.length
            int r3 = r3 - r4
            r2 = r2[r3]
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            java.lang.String r3 = r12.group(r5)
            if (r3 != 0) goto L_0x00a4
            r6 = r2
            goto L_0x00b3
        L_0x00a4:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
        L_0x00b3:
            byte r6 = a((java.lang.String) r6)
            r7 = -1
            if (r6 == r7) goto L_0x00c1
            int r2 = r9 + 1
            r0[r9] = r6
            if (r3 == 0) goto L_0x00d0
            goto L_0x00d1
        L_0x00c1:
            byte[] r2 = r2.getBytes()
            int r3 = r2.length
            java.lang.System.arraycopy(r2, r1, r0, r9, r3)
            int r4 = r9 + r3
            r2 = r4
            goto L_0x00d0
        L_0x00cd:
            r2 = r9
            goto L_0x00d0
        L_0x00cf:
            r2 = 1
        L_0x00d0:
            r4 = 0
        L_0x00d1:
            if (r4 != 0) goto L_0x00e5
            java.lang.String r3 = r12.group(r5)
            if (r3 == 0) goto L_0x00e5
            int r4 = r3.length()
            byte[] r3 = r3.getBytes()
            java.lang.System.arraycopy(r3, r1, r0, r2, r4)
            int r2 = r2 + r4
        L_0x00e5:
            r3 = 5
            java.lang.String r12 = r12.group(r3)
            if (r12 == 0) goto L_0x00f8
            int r3 = r12.length()
            byte[] r12 = r12.getBytes()
            java.lang.System.arraycopy(r12, r1, r0, r2, r3)
            int r2 = r2 + r3
        L_0x00f8:
            byte[] r12 = new byte[r2]
            java.lang.System.arraycopy(r0, r1, r12, r1, r2)
            return r12
        L_0x00fe:
            java.net.MalformedURLException r12 = new java.net.MalformedURLException
            r12.<init>()
            throw r12
        L_0x0104:
            java.net.MalformedURLException r12 = new java.net.MalformedURLException
            r12.<init>()
            goto L_0x010b
        L_0x010a:
            throw r12
        L_0x010b:
            goto L_0x010a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.bluetooth.altbeacon.beacon.utils.UrlBeaconUrlCompressor.compress(java.lang.String):byte[]");
    }

    public static String uncompress(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        byte b = bArr[0] & Ascii.SI;
        int i = 1;
        if (b == 0) {
            stringBuffer.append("http://www.");
        } else if (b == 1) {
            stringBuffer.append("https://www.");
        } else if (b == 2) {
            stringBuffer.append("http://");
        } else if (b == 3) {
            stringBuffer.append("https://");
        }
        byte b2 = -1;
        while (i < bArr.length) {
            byte b3 = bArr[i];
            if (b2 == 0 && b3 == 0) {
                break;
            }
            String a2 = a(Byte.valueOf(b3));
            if (a2 != null) {
                stringBuffer.append(a2);
            } else {
                stringBuffer.append((char) b3);
            }
            i++;
            b2 = b3;
        }
        return stringBuffer.toString();
    }

    static class TLDMapEntry {
        public final byte encodedByte;
        public final String tld;

        public TLDMapEntry(String str, byte b) {
            this.tld = str;
            this.encodedByte = b;
        }
    }
}
