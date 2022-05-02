package com.iap.ac.android.biz.common.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.common.log.ACLog;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import o.upFrom;

public class Utils {
    public static final int getMax = 230;
    private static int length = 0;
    public static final byte[] setMax = {114, -106, -55, 87, Ascii.FF, -69, -13, 0, 3, -3, 47, -44, Ascii.VT, -1, 69, -29, Ascii.GS, -5, -63};
    private static int setMin = 1;

    public static String SHA256(String str) throws NoSuchAlgorithmException {
        if (str == null || str.length() <= 0) {
            return null;
        }
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        instance.update(str.getBytes());
        byte[] digest = instance.digest();
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : digest) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                stringBuffer.append('0');
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder("acCommon readConfigFromAsset failed: ");
                sb.append(e);
                ACLog.e(Constants.TAG, sb.toString());
            }
        }
    }

    public static boolean checkClassExist(String str) {
        try {
            return Class.forName(str) != null;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("check class [");
            sb.append(str);
            sb.append("] exception: ");
            sb.append(e);
            ACLog.e(Constants.TAG, sb.toString());
            return false;
        }
    }

    public static String e(Throwable th) {
        return "".concat(String.valueOf(th));
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String formatSecurityGuardException(java.lang.Throwable r11) {
        /*
            java.lang.String r0 = java.lang.String.valueOf(r11)
            java.lang.String r1 = ""
            java.lang.String r0 = r1.concat(r0)
            boolean r1 = r11 instanceof com.alibaba.wireless.security.open.SecException
            if (r1 == 0) goto L_0x0066
            java.lang.StringBuilder r0 = com.iap.ac.android.a.a.a(r0)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.alibaba.wireless.security.open.SecException r11 = (com.alibaba.wireless.security.open.SecException) r11
            int r11 = r11.getErrorCode()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r3 = 0
            r2[r3] = r11
            byte[] r11 = setMax
            r4 = 7
            byte r4 = r11[r4]
            byte r4 = (byte) r4
            byte r5 = (byte) r4
            byte r6 = (byte) r5
            int r5 = r5 * 3
            int r5 = r5 + 4
            int r6 = r6 * 4
            int r6 = r6 + 16
            int r4 = r4 * 4
            int r4 = 44 - r4
            byte[] r7 = new byte[r6]
            r8 = -1
            int r6 = r6 + r8
            if (r11 != 0) goto L_0x0040
            r8 = r7
            r9 = -1
            r7 = r6
            goto L_0x005f
        L_0x0040:
            int r8 = r8 + r1
            byte r9 = (byte) r4
            r7[r8] = r9
            if (r8 != r6) goto L_0x0057
            java.lang.String r11 = new java.lang.String
            r11.<init>(r7, r3)
            java.lang.String r11 = java.lang.String.format(r11, r2)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            goto L_0x0066
        L_0x0057:
            byte r9 = r11[r5]
            r10 = r6
            r6 = r4
            r4 = r9
            r9 = r8
            r8 = r7
            r7 = r10
        L_0x005f:
            int r4 = -r4
            int r4 = r4 + r6
            int r5 = r5 + r1
            r6 = r7
            r7 = r8
            r8 = r9
            goto L_0x0040
        L_0x0066:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.biz.common.utils.Utils.formatSecurityGuardException(java.lang.Throwable):java.lang.String");
    }

    public static String getDomain(String str) {
        try {
            return new URL(str).getHost();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getNonce() {
        return UUID.randomUUID().toString();
    }

    public static boolean isDomainMatch(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        String domain = getDomain(str2);
        if (TextUtils.isEmpty(domain)) {
            return false;
        }
        if (domain.equals(str)) {
            return true;
        }
        return domain.endsWith(".".concat(String.valueOf(str)));
    }

    public static String readConfigFromAsset(Context context, String str) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        Exception e;
        AssetManager assets = context.getAssets();
        InputStreamReader inputStreamReader2 = null;
        try {
            Object[] objArr = new Object[2];
            objArr[1] = str;
            objArr[0] = assets;
            inputStream = (InputStream) ((Class) upFrom.setMax(19 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0), (char) ((Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 56347))).getMethod("getMin", new Class[]{AssetManager.class, String.class}).invoke((Object) null, objArr);
            try {
                inputStreamReader = new InputStreamReader(inputStream);
            } catch (Exception e2) {
                e = e2;
                inputStreamReader = null;
                bufferedReader = null;
                try {
                    ACLog.e(Constants.TAG, "acCommon readConfigFromAsset failed: ".concat(String.valueOf(e)));
                    try {
                        a(bufferedReader);
                        a(inputStreamReader);
                        a(inputStream);
                        return null;
                    } catch (Exception e3) {
                        throw e3;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStreamReader2 = inputStreamReader;
                    a(bufferedReader);
                    a(inputStreamReader2);
                    a(inputStream);
                    throw r1;
                }
            } catch (Throwable th2) {
                r1 = th2;
                bufferedReader = null;
                a(bufferedReader);
                a(inputStreamReader2);
                a(inputStream);
                throw r1;
            }
            try {
                bufferedReader = new BufferedReader(inputStreamReader);
            } catch (Exception e4) {
                e = e4;
                bufferedReader = null;
                ACLog.e(Constants.TAG, "acCommon readConfigFromAsset failed: ".concat(String.valueOf(e)));
                a(bufferedReader);
                a(inputStreamReader);
                a(inputStream);
                return null;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                inputStreamReader2 = inputStreamReader;
                a(bufferedReader);
                a(inputStreamReader2);
                a(inputStream);
                throw r1;
            }
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if ((readLine != null ? '?' : 'K') != 'K') {
                        sb.append(readLine);
                        int i = setMin + 121;
                        length = i % 128;
                        int i2 = i % 2;
                    } else {
                        String obj = sb.toString();
                        a(bufferedReader);
                        a(inputStreamReader);
                        a(inputStream);
                        int i3 = length + 95;
                        setMin = i3 % 128;
                        int i4 = i3 % 2;
                        return obj;
                    }
                }
            } catch (Exception e5) {
                e = e5;
                ACLog.e(Constants.TAG, "acCommon readConfigFromAsset failed: ".concat(String.valueOf(e)));
                a(bufferedReader);
                a(inputStreamReader);
                a(inputStream);
                return null;
            }
        } catch (Exception e6) {
            e = e6;
            inputStream = null;
            inputStreamReader = null;
            bufferedReader = null;
            ACLog.e(Constants.TAG, "acCommon readConfigFromAsset failed: ".concat(String.valueOf(e)));
            a(bufferedReader);
            a(inputStreamReader);
            a(inputStream);
            return null;
        } catch (Throwable th4) {
            r1 = th4;
            inputStream = null;
            bufferedReader = null;
            a(bufferedReader);
            a(inputStreamReader2);
            a(inputStream);
            throw r1;
        }
    }

    public static long stringToLong(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder("stringToLong exception: ");
            sb.append(e);
            ACLog.e(Constants.TAG, sb.toString());
            return j;
        }
    }
}
