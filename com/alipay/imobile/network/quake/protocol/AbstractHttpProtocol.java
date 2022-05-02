package com.alipay.imobile.network.quake.protocol;

import android.graphics.Color;
import android.view.ViewConfiguration;
import com.alipay.imobile.network.quake.transport.HttpDate;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.Date;
import java.util.Map;
import kotlin.text.Typography;

public abstract class AbstractHttpProtocol<T> implements Protocol<T> {
    private static long getMin = -6585290768583187151L;
    private static int length = 1;
    private static int setMax;
    private static char[] setMin = {25010, 50306, 11203, 36441, 62747};

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.alipay.imobile.network.quake.cache.Cache.Entry parseCacheHeaders(com.alipay.imobile.network.quake.NetworkResponse r23) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            int r0 = length
            int r0 = r0 + 111
            int r3 = r0 % 128
            setMax = r3
            int r0 = r0 % 2
            java.util.Map<java.lang.String, java.lang.String> r3 = r2.extData
            r4 = 0
            if (r3 != 0) goto L_0x001e
            int r0 = setMax
            int r0 = r0 + 17
            int r2 = r0 % 128
            length = r2
            int r0 = r0 % 2
            return r4
        L_0x001e:
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "Date"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r7 = 1
            if (r0 == 0) goto L_0x002f
            r9 = 1
            goto L_0x0030
        L_0x002f:
            r9 = 0
        L_0x0030:
            if (r9 == 0) goto L_0x0037
            long r12 = r1.parseDateAsEpoch(r0)
            goto L_0x0039
        L_0x0037:
            r12 = 0
        L_0x0039:
            java.lang.String r0 = "Cache-Control"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r9 = com.alipay.imobile.network.quake.Quake.TAG
            java.lang.String r14 = java.lang.String.valueOf(r0)
            java.lang.String r15 = "headers.get(\"Cache-Control\")="
            java.lang.String r14 = r15.concat(r14)
            com.alipay.iap.android.common.log.LoggerWrapper.d(r9, r14)
            java.lang.String r9 = "max-age="
            if (r0 == 0) goto L_0x00fa
            java.lang.String r14 = ","
            java.lang.String[] r14 = r0.split(r14)
            int r15 = r14.length
            r8 = 0
            r16 = 0
            r18 = 0
            r19 = 0
        L_0x0062:
            if (r8 >= r15) goto L_0x00f2
            int r0 = length
            int r0 = r0 + 117
            int r10 = r0 % 128
            setMax = r10
            int r0 = r0 % 2
            r0 = r14[r8]
            java.lang.String r0 = r0.trim()     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r10 = "no-cache"
            boolean r10 = r10.equals(r0)     // Catch:{ Exception -> 0x00e6 }
            if (r10 != 0) goto L_0x00e5
            java.lang.String r10 = "no-store"
            boolean r10 = r10.equals(r0)     // Catch:{ Exception -> 0x00e6 }
            if (r10 == 0) goto L_0x0086
            r10 = 1
            goto L_0x0087
        L_0x0086:
            r10 = 0
        L_0x0087:
            if (r10 == 0) goto L_0x008a
            goto L_0x00e5
        L_0x008a:
            boolean r10 = r0.startsWith(r9)     // Catch:{ Exception -> 0x00e6 }
            if (r10 == 0) goto L_0x00a5
            int r10 = setMax
            int r10 = r10 + 13
            int r11 = r10 % 128
            length = r11
            int r10 = r10 % 2
            r10 = 8
            java.lang.String r0 = r0.substring(r10)     // Catch:{ Exception -> 0x00e6 }
            long r16 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x00e6 }
            goto L_0x00ee
        L_0x00a5:
            java.lang.String r10 = "stale-while-revalidate="
            boolean r10 = r0.startsWith(r10)     // Catch:{ Exception -> 0x00e6 }
            r11 = 22
            if (r10 == 0) goto L_0x00b3
            r10 = 22
            goto L_0x00b5
        L_0x00b3:
            r10 = 98
        L_0x00b5:
            if (r10 == r11) goto L_0x00d0
            java.lang.String r10 = "must-revalidate"
            boolean r10 = r10.equals(r0)     // Catch:{ Exception -> 0x00e6 }
            if (r10 != 0) goto L_0x00cd
            java.lang.String r10 = "proxy-revalidate"
            boolean r0 = r10.equals(r0)     // Catch:{ Exception -> 0x00e6 }
            if (r0 == 0) goto L_0x00c9
            r0 = 1
            goto L_0x00ca
        L_0x00c9:
            r0 = 0
        L_0x00ca:
            if (r0 == r7) goto L_0x00cd
            goto L_0x00ee
        L_0x00cd:
            r18 = 1
            goto L_0x00ee
        L_0x00d0:
            int r10 = setMax
            int r10 = r10 + 101
            int r11 = r10 % 128
            length = r11
            int r10 = r10 % 2
            r10 = 23
            java.lang.String r0 = r0.substring(r10)     // Catch:{ Exception -> 0x00e6 }
            long r19 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x00e6 }
            goto L_0x00ee
        L_0x00e5:
            return r4
        L_0x00e6:
            r0 = move-exception
            java.lang.String r10 = com.alipay.imobile.network.quake.Quake.TAG
            java.lang.String r11 = ""
            com.alipay.iap.android.common.log.LoggerWrapper.e(r10, r11, r0)
        L_0x00ee:
            int r8 = r8 + 1
            goto L_0x0062
        L_0x00f2:
            r10 = r16
            r0 = r18
            r14 = r19
            r4 = 1
            goto L_0x0100
        L_0x00fa:
            r0 = 0
            r4 = 0
            r10 = 0
            r14 = 0
        L_0x0100:
            java.lang.String r8 = "Expires"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x010f
            long r16 = r1.parseDateAsEpoch(r8)
            goto L_0x0111
        L_0x010f:
            r16 = 0
        L_0x0111:
            java.lang.String r8 = "Last-Modified"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            r7 = 47
            if (r8 == 0) goto L_0x0124
            r19 = 11
            r19 = r9
            r9 = 11
            goto L_0x0128
        L_0x0124:
            r19 = r9
            r9 = 47
        L_0x0128:
            if (r9 == r7) goto L_0x012f
            long r7 = r1.parseDateAsEpoch(r8)
            goto L_0x0131
        L_0x012f:
            r7 = 0
        L_0x0131:
            java.lang.String r9 = "ETag"
            java.lang.Object r9 = r3.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            if (r4 == 0) goto L_0x014b
            r12 = 1000(0x3e8, double:4.94E-321)
            long r16 = r10 * r12
            long r5 = r5 + r16
            if (r0 == 0) goto L_0x0144
            goto L_0x0173
        L_0x0144:
            java.lang.Long.signum(r14)
            long r12 = r12 * r14
            long r12 = r12 + r5
            goto L_0x0174
        L_0x014b:
            r20 = 0
            int r4 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r4 <= 0) goto L_0x0171
            int r4 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r4 < 0) goto L_0x0171
            int r4 = length
            int r4 = r4 + 21
            int r1 = r4 % 128
            setMax = r1
            int r4 = r4 % 2
            if (r4 == 0) goto L_0x0164
            r18 = 0
            goto L_0x0166
        L_0x0164:
            r18 = 1
        L_0x0166:
            if (r18 == 0) goto L_0x016d
            long r16 = r16 - r12
            long r5 = r5 + r16
            goto L_0x0173
        L_0x016d:
            long r12 = r16 & r12
            long r5 = r5 & r12
            goto L_0x0173
        L_0x0171:
            r5 = r20
        L_0x0173:
            r12 = r5
        L_0x0174:
            com.alipay.imobile.network.quake.cache.Cache$Entry r1 = new com.alipay.imobile.network.quake.cache.Cache$Entry
            r1.<init>()
            byte[] r2 = r2.data     // Catch:{ Exception -> 0x01ea }
            r1.data = r2     // Catch:{ Exception -> 0x01ea }
            r1.dataVersion = r9     // Catch:{ Exception -> 0x01ea }
            r1.softExpireTime = r5     // Catch:{ Exception -> 0x01ea }
            r1.finalExpireTime = r12     // Catch:{ Exception -> 0x01ea }
            r1.lastModified = r7     // Catch:{ Exception -> 0x01ea }
            r1.extData = r3     // Catch:{ Exception -> 0x01ea }
            boolean r2 = com.alipay.iap.android.common.log.LoggerWrapper.isDebuggable()     // Catch:{ Exception -> 0x01ea }
            if (r2 == 0) goto L_0x01cc
            java.lang.String r2 = com.alipay.imobile.network.quake.Quake.TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r19
            r3.<init>(r4)
            r3.append(r10)
            java.lang.String r4 = ", stale-while-revalidate="
            r3.append(r4)
            r3.append(r14)
            java.lang.String r4 = ", must-revalidate="
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ", softExpireTime="
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = ", finalExpireTime="
            r3.append(r0)
            r3.append(r12)
            java.lang.String r0 = ", current="
            r3.append(r0)
            long r4 = java.lang.System.currentTimeMillis()
            r3.append(r4)
            java.lang.String r0 = r3.toString()
            com.alipay.iap.android.common.log.LoggerWrapper.i(r2, r0)
        L_0x01cc:
            int r0 = length
            int r0 = r0 + 119
            int r2 = r0 % 128
            setMax = r2
            int r0 = r0 % 2
            r2 = 28
            if (r0 == 0) goto L_0x01dd
            r0 = 28
            goto L_0x01df
        L_0x01dd:
            r0 = 92
        L_0x01df:
            if (r0 == r2) goto L_0x01e2
            return r1
        L_0x01e2:
            r0 = 79
            r2 = 0
            int r0 = r0 / r2
            return r1
        L_0x01e7:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x01ea:
            r0 = move-exception
            goto L_0x01ed
        L_0x01ec:
            throw r0
        L_0x01ed:
            goto L_0x01ec
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.quake.protocol.AbstractHttpProtocol.parseCacheHeaders(com.alipay.imobile.network.quake.NetworkResponse):com.alipay.imobile.network.quake.cache.Cache$Entry");
    }

    /* access modifiers changed from: protected */
    public String parseCharset(Map<String, String> map) {
        int i = setMax + 55;
        length = i % 128;
        String parseCharset = parseCharset(map, (!(i % 2 == 0) ? setMin((ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) - 1, (char) (25064 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 5 - Color.alpha(0)) : setMin(-1 / (ViewConfiguration.getGlobalActionKeyTimeout() > 1 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 1 ? 0 : -1)), (char) (24590 % (ViewConfiguration.getScrollFriction() > 1.0f ? 1 : (ViewConfiguration.getScrollFriction() == 1.0f ? 0 : -1))), Color.alpha(0) + 4)).intern());
        try {
            int i2 = length + 81;
            setMax = i2 % 128;
            if ((i2 % 2 != 0 ? 'R' : Typography.quote) == '\"') {
                return parseCharset;
            }
            int i3 = 76 / 0;
            return parseCharset;
        } catch (Exception e) {
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public String parseCharset(Map<String, String> map, String str) {
        String[] split;
        if (map == null) {
            int i = length + 55;
            setMax = i % 128;
            int i2 = i % 2;
            return str;
        }
        String str2 = map.get("Content-Type");
        if ((str2 == null ? '/' : 0) == '/') {
            return str;
        }
        String[] split2 = str2.split(";");
        int length2 = split2.length;
        int i3 = 1;
        while (true) {
            if ((i3 < length2 ? 12 : 'H') != 12) {
                return str;
            }
            split = split2[i3].trim().split(SimpleComparison.EQUAL_TO_OPERATION);
            if (split.length == 2) {
                int i4 = setMax + 97;
                length = i4 % 128;
                if (i4 % 2 == 0) {
                    if ("charset".equals(split[0])) {
                        break;
                    }
                } else if ("charset".equals(split[0])) {
                    break;
                }
            }
            i3++;
        }
        String str3 = split[1];
        int i5 = length + 43;
        setMax = i5 % 128;
        if (i5 % 2 == 0) {
            return str3;
        }
        Object[] objArr = null;
        int length3 = objArr.length;
        return str3;
    }

    /* access modifiers changed from: protected */
    public long parseDateAsEpoch(String str) {
        Date parse = HttpDate.parse(str);
        if ((parse == null ? ',' : 10) != ',') {
            long time = parse.getTime();
            int i = setMax + 41;
            length = i % 128;
            if ((i % 2 == 0 ? 31 : 'F') == 'F') {
                return time;
            }
            Object obj = null;
            super.hashCode();
            return time;
        }
        int i2 = length + 61;
        setMax = i2 % 128;
        return i2 % 2 != 0 ? 0 : 0;
    }

    private static String setMin(int i, char c, int i2) {
        int i3 = length + 119;
        setMax = i3 % 128;
        int i4 = i3 % 2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (true) {
            if ((i5 < i2 ? 3 : 'N') == 'N') {
                return new String(cArr);
            }
            int i6 = setMax + 79;
            length = i6 % 128;
            if (i6 % 2 == 0) {
                try {
                    cArr[i5] = (char) ((int) ((((long) setMin[i >>> i5]) * (((long) i5) % getMin)) + ((long) c)));
                    i5 += 123;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                cArr[i5] = (char) ((int) ((((long) setMin[i + i5]) ^ (((long) i5) * getMin)) ^ ((long) c)));
                i5++;
            }
        }
    }
}
