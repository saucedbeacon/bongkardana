package com.iap.ac.android.loglite.utils;

import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.iap.ac.android.loglite.core.AnalyticsContext;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import kotlin.text.Typography;

public class LoggingUtil {
    private static int getMin = 1;
    private static int length;
    private static char[] setMin = {207, 221, 222, 193, Typography.paragraph};

    public static StringBuilder appendExtParam(StringBuilder sb, Map<String, String> map) {
        if (sb == null) {
            return null;
        }
        sb.append(',');
        if (map == null || map.size() == 0) {
            return sb;
        }
        boolean z = true;
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (true) {
            if ((it.hasNext() ? 'C' : 5) != 'C') {
                return sb;
            }
            Map.Entry next = it.next();
            String str = (String) next.getKey();
            String str2 = (String) next.getValue();
            if ((str != null ? '^' : 'I') != 'I') {
                if (str2 == null) {
                    int i = length + 101;
                    getMin = i % 128;
                    int i2 = i % 2;
                    str2 = "";
                }
                if (!TextUtils.isEmpty(str2)) {
                    int i3 = length + 79;
                    getMin = i3 % 128;
                    int i4 = i3 % 2;
                    str2 = str2.replace("\r\n", "###").replace("\n", "###").replace("\r", "###");
                }
                if ((z ? 27 : '3') != 27) {
                    sb.append('^');
                } else {
                    try {
                        int i5 = getMin + 101;
                        length = i5 % 128;
                        int i6 = i5 % 2;
                        z = false;
                    } catch (Exception e) {
                        throw e;
                    }
                }
                try {
                    sb.append(str.replace(',', ' ').replace('^', ' ').replace('=', ' '));
                    sb.append('=');
                    sb.append(str2.replace(',', ' ').replace('^', ' '));
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
    }

    public static StringBuilder appendParam(StringBuilder sb, String str) {
        boolean z = true;
        int i = getMin + 1;
        length = i % 128;
        int i2 = i % 2;
        if ((sb == null ? 'N' : 'b') != 'N') {
            sb.append(',');
            if (str != null) {
                try {
                    int i3 = getMin + 77;
                    length = i3 % 128;
                    int i4 = i3 % 2;
                    sb.append(str.replace(',', ' '));
                    try {
                        int i5 = getMin + 27;
                        length = i5 % 128;
                        int i6 = i5 % 2;
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
            return sb;
        }
        int i7 = getMin + 35;
        length = i7 % 128;
        if (i7 % 2 == 0) {
            z = false;
        }
        StringBuilder sb2 = null;
        if (!z) {
            return sb2;
        }
        super.hashCode();
        return sb2;
    }

    public static String getMdapStyleName(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append("_");
        sb.append(str);
        String obj = sb.toString();
        int i = length + 103;
        getMin = i % 128;
        int i2 = i % 2;
        return obj;
    }

    public static String getNowTime() {
        Calendar instance = Calendar.getInstance(TimeZone.getDefault());
        instance.setTimeInMillis(getServerTime());
        StringBuilder sb = new StringBuilder();
        int i = instance.get(1);
        int i2 = instance.get(2) + 1;
        int i3 = instance.get(5);
        int i4 = instance.get(11);
        int i5 = instance.get(12);
        int i6 = instance.get(13);
        int i7 = instance.get(14);
        sb.append(i);
        sb.append('-');
        if (i2 < 10) {
            int i8 = getMin + 125;
            length = i8 % 128;
            if (i8 % 2 != 0) {
                try {
                    sb.append('?');
                } catch (Exception e) {
                    throw e;
                }
            } else {
                sb.append('0');
            }
        }
        sb.append(i2);
        sb.append('-');
        if (i3 < 10) {
            try {
                sb.append('0');
            } catch (Exception e2) {
                throw e2;
            }
        }
        sb.append(i3);
        sb.append(' ');
        if (i4 < 10) {
            sb.append('0');
        }
        sb.append(i4);
        sb.append(':');
        if (i5 < 10) {
            int i9 = length + 25;
            getMin = i9 % 128;
            if (i9 % 2 == 0) {
                sb.append(0);
            } else {
                sb.append('0');
            }
        }
        sb.append(i5);
        sb.append(':');
        if (i6 < 10) {
            sb.append('0');
            int i10 = length + 71;
            getMin = i10 % 128;
            int i11 = i10 % 2;
        }
        sb.append(i6);
        sb.append('.');
        if ((i7 < 100 ? '\'' : '+') == '\'') {
            int i12 = length + 75;
            getMin = i12 % 128;
            if (i12 % 2 == 0) {
                sb.append('O');
            } else {
                sb.append('0');
            }
        }
        if (i7 < 10) {
            sb.append('0');
        }
        sb.append(i7);
        return sb.toString();
    }

    public static String getResolution() {
        DisplayMetrics displayMetrics = AnalyticsContext.getInstance().getApplication().getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("*");
        sb.append(i2);
        String obj = sb.toString();
        try {
            int i3 = length + 125;
            try {
                getMin = i3 % 128;
                int i4 = i3 % 2;
                return obj;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static long getServerTime() {
        int i = getMin + 61;
        length = i % 128;
        int i2 = i % 2;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            int i3 = getMin + 123;
            try {
                length = i3 % 128;
                if (!(i3 % 2 != 0)) {
                    return currentTimeMillis;
                }
                int i4 = 61 / 0;
                return currentTimeMillis;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:3|4|5|6|7|8|9|10) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0035 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0017 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] gzipDataByBytes(byte[] r2, int r3, int r4) throws java.lang.IllegalStateException {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0027 }
            r1.<init>(r0)     // Catch:{ all -> 0x0027 }
            r1.write(r2, r3, r4)     // Catch:{ all -> 0x0025 }
            r1.finish()     // Catch:{ all -> 0x0025 }
            byte[] r2 = r0.toByteArray()     // Catch:{ all -> 0x0025 }
            r1.close()     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r0.close()     // Catch:{ all -> 0x0024 }
            int r3 = length
            int r3 = r3 + 69
            int r4 = r3 % 128
            getMin = r4
            int r3 = r3 % 2
        L_0x0024:
            return r2
        L_0x0025:
            r2 = move-exception
            goto L_0x0029
        L_0x0027:
            r2 = move-exception
            r1 = 0
        L_0x0029:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x002f }
            r3.<init>(r2)     // Catch:{ all -> 0x002f }
            throw r3     // Catch:{ all -> 0x002f }
        L_0x002f:
            r2 = move-exception
            if (r1 == 0) goto L_0x0035
            r1.close()     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r0.close()     // Catch:{ all -> 0x0042 }
            int r3 = getMin
            int r3 = r3 + 83
            int r4 = r3 % 128
            length = r4
            int r3 = r3 % 2
        L_0x0042:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.loglite.utils.LoggingUtil.gzipDataByBytes(byte[], int, int):byte[]");
    }

    public static byte[] gzipDataByString(String str) throws IllegalStateException {
        byte[] bArr;
        int i = length + 21;
        getMin = i % 128;
        if ((i % 2 == 0 ? 1 : 'c') != 'c') {
            try {
                byte[] bytes = str.getBytes(getMax(new int[]{0, 5, 137, 3}, (byte[]) null, PhoneNumberUtils.isWellFormedSmsAddress("") | true).intern());
                bArr = gzipDataByBytes(bytes, 1, bytes.length);
            } catch (Throwable th) {
                throw new IllegalStateException(th);
            }
        } else {
            byte[] bytes2 = str.getBytes(getMax(new int[]{0, 5, 137, 3}, (byte[]) null, !PhoneNumberUtils.isWellFormedSmsAddress("")).intern());
            bArr = gzipDataByBytes(bytes2, 0, bytes2.length);
        }
        int i2 = length + 53;
        getMin = i2 % 128;
        if ((i2 % 2 == 0 ? (char) 4 : 17) != 4) {
            return bArr;
        }
        int i3 = 49 / 0;
        return bArr;
    }

    private static String getMax(int[] iArr, byte[] bArr, boolean z) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = new char[i2];
        System.arraycopy(setMin, i, cArr, 0, i2);
        if (!(bArr == null)) {
            char[] cArr2 = new char[i2];
            int i5 = 0;
            char c = 0;
            while (true) {
                if ((i5 < i2 ? Typography.less : 22) == 22) {
                    break;
                }
                if (bArr[i5] == 1) {
                    int i6 = getMin + 95;
                    length = i6 % 128;
                    int i7 = i6 % 2;
                    cArr2[i5] = (char) (((cArr[i5] << 1) + 1) - c);
                } else {
                    cArr2[i5] = (char) ((cArr[i5] << 1) - c);
                }
                c = cArr2[i5];
                i5++;
            }
            cArr = cArr2;
        }
        if (i4 > 0) {
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr, 0, cArr3, 0, i2);
            int i8 = i2 - i4;
            System.arraycopy(cArr3, 0, cArr, i8, i4);
            System.arraycopy(cArr3, i4, cArr, 0, i8);
        }
        if ((z ? 'U' : '=') == 'U') {
            char[] cArr4 = new char[i2];
            int i9 = 0;
            while (i9 < i2) {
                cArr4[i9] = cArr[(i2 - i9) - 1];
                i9++;
                int i10 = getMin + 73;
                length = i10 % 128;
                int i11 = i10 % 2;
            }
            cArr = cArr4;
        }
        if (i3 > 0) {
            for (int i12 = 0; i12 < i2; i12++) {
                cArr[i12] = (char) (cArr[i12] - iArr[2]);
            }
        }
        return new String(cArr);
    }
}
