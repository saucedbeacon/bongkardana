package com.alibaba.griver.base.common.security;

import android.os.SystemClock;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.griver.api.common.security.GriverSecurityExtension;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.AESUtil;
import com.alibaba.griver.base.common.utils.MD5Util;
import java.nio.charset.Charset;
import kotlin.text.Typography;
import o.onActivityPreStopped;

public class GriverDefaultSecurityExtension implements GriverSecurityExtension {
    private static int getMax = 1;
    private static char getMin = '\u0003';
    private static int setMax;
    private static char[] setMin = {'U', 'T', 'F', '-', '8', 'V', 'W', 'X', 'Y'};

    /* renamed from: a  reason: collision with root package name */
    private String f10220a = null;

    public void initWithKey(String str) {
        try {
            boolean z = false;
            if (!(!TextUtils.isEmpty(str))) {
                GriverLogger.w("GriverBase:GriverDefaultSecurityExtension", "aes key should not be empty");
                return;
            }
            if (str.length() != 16) {
                z = true;
            }
            if (z) {
                int i = setMax + 71;
                getMax = i % 128;
                int i2 = i % 2;
                GriverLogger.w("GriverBase:GriverDefaultSecurityExtension", "aes key length should be 16");
                return;
            }
            this.f10220a = str;
            int i3 = getMax + 67;
            try {
                setMax = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if ((!com.alibaba.griver.base.common.utils.ReflectUtils.classExist(com.alibaba.griver.base.common.constants.SecurityConstants.SG_CLASS) ? '5' : 'L') != 'L') goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (com.alibaba.griver.base.common.utils.ReflectUtils.classExist(com.alibaba.griver.base.common.constants.SecurityConstants.SG_CLASS) == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r1 = com.alibaba.fastjson.JSON.parseObject(com.alibaba.griver.base.common.utils.KitUtils.getAssetContent(com.alibaba.griver.base.common.env.GriverEnv.getApplicationContext(), com.alibaba.griver.base.common.constants.GriverBaseConstants.GRIVER_CONFIG_ASSET_PATH));
        r2 = com.alibaba.griver.base.common.constants.SecurityConstants.DEFAULT_AUTH_CODE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r1 == null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        r6 = 'D';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        r6 = 'I';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        if (r6 == 'D') goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005a, code lost:
        if (r1.containsKey("authCode") == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
        if (android.text.TextUtils.isEmpty(r1.getString("authCode")) != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0066, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0068, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0069, code lost:
        if (r3 == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006b, code lost:
        r2 = r1.getString("authCode");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006f, code lost:
        r0 = com.alibaba.griver.base.common.utils.SecurityGuardUtils.getExtraData(r2, "GriverAESKey");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0079, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007b, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007c, code lost:
        if (r4 == false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007e, code lost:
        com.alibaba.griver.base.common.logger.GriverLogger.w("GriverBase:GriverDefaultSecurityExtension", "get aes key from security guard failed, the key is empty");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0083, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008a, code lost:
        if (r0.length() == 16) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008c, code lost:
        r0 = getMax + 125;
        setMax = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        com.alibaba.griver.base.common.logger.GriverLogger.w("GriverBase:GriverDefaultSecurityExtension", "get aes key from security guard, but the key length should be 16");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r0 = setMax + 121;
        getMax = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r8.f10220a = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00aa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ac, code lost:
        com.alibaba.griver.base.common.logger.GriverLogger.e("GriverBase:GriverDefaultSecurityExtension", "init with security guard failed", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initWithSecurityGuard() {
        /*
            r8 = this;
            java.lang.String r0 = "authCode"
            int r1 = getMax
            int r1 = r1 + 101
            int r2 = r1 % 128
            setMax = r2
            int r1 = r1 % 2
            r2 = 5
            if (r1 == 0) goto L_0x0011
            r1 = 5
            goto L_0x0013
        L_0x0011:
            r1 = 95
        L_0x0013:
            java.lang.String r3 = "com.alibaba.wireless.security.open.SecurityGuardManager"
            r4 = 0
            java.lang.String r5 = "GriverBase:GriverDefaultSecurityExtension"
            if (r1 == r2) goto L_0x002a
            boolean r1 = com.alibaba.griver.base.common.utils.ReflectUtils.classExist(r3)
            r2 = 76
            if (r1 != 0) goto L_0x0025
            r1 = 53
            goto L_0x0027
        L_0x0025:
            r1 = 76
        L_0x0027:
            if (r1 == r2) goto L_0x0039
            goto L_0x0033
        L_0x002a:
            boolean r1 = com.alibaba.griver.base.common.utils.ReflectUtils.classExist(r3)     // Catch:{ Exception -> 0x00b4 }
            r2 = 41
            int r2 = r2 / r4
            if (r1 != 0) goto L_0x0039
        L_0x0033:
            java.lang.String r0 = "Security guard not integrated, return"
            com.alibaba.griver.base.common.logger.GriverLogger.w(r5, r0)
            return
        L_0x0039:
            android.app.Application r1 = com.alibaba.griver.base.common.env.GriverEnv.getApplicationContext()     // Catch:{ Exception -> 0x00ab }
            java.lang.String r2 = "Griver/config.json"
            java.lang.String r1 = com.alibaba.griver.base.common.utils.KitUtils.getAssetContent(r1, r2)     // Catch:{ Exception -> 0x00ab }
            com.alibaba.fastjson.JSONObject r1 = com.alibaba.fastjson.JSON.parseObject(r1)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r2 = "0a6a"
            r3 = 68
            if (r1 == 0) goto L_0x0050
            r6 = 68
            goto L_0x0052
        L_0x0050:
            r6 = 73
        L_0x0052:
            r7 = 1
            if (r6 == r3) goto L_0x0056
            goto L_0x006f
        L_0x0056:
            boolean r3 = r1.containsKey(r0)     // Catch:{ Exception -> 0x00ab }
            if (r3 == 0) goto L_0x006f
            java.lang.String r3 = r1.getString(r0)     // Catch:{ Exception -> 0x00ab }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x00ab }
            if (r3 != 0) goto L_0x0068
            r3 = 1
            goto L_0x0069
        L_0x0068:
            r3 = 0
        L_0x0069:
            if (r3 == 0) goto L_0x006f
            java.lang.String r2 = r1.getString(r0)     // Catch:{ Exception -> 0x00ab }
        L_0x006f:
            java.lang.String r0 = "GriverAESKey"
            java.lang.String r0 = com.alibaba.griver.base.common.utils.SecurityGuardUtils.getExtraData(r2, r0)     // Catch:{ Exception -> 0x00ab }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00ab }
            if (r1 == 0) goto L_0x007c
            r4 = 1
        L_0x007c:
            if (r4 == 0) goto L_0x0084
            java.lang.String r0 = "get aes key from security guard failed, the key is empty"
            com.alibaba.griver.base.common.logger.GriverLogger.w(r5, r0)     // Catch:{ Exception -> 0x00ab }
            return
        L_0x0084:
            int r1 = r0.length()     // Catch:{ Exception -> 0x00ab }
            r2 = 16
            if (r1 == r2) goto L_0x00a8
            int r0 = getMax
            int r0 = r0 + 125
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            java.lang.String r0 = "get aes key from security guard, but the key length should be 16"
            com.alibaba.griver.base.common.logger.GriverLogger.w(r5, r0)     // Catch:{ Exception -> 0x00ab }
            int r0 = setMax     // Catch:{ Exception -> 0x00a6 }
            int r0 = r0 + 121
            int r1 = r0 % 128
            getMax = r1     // Catch:{ Exception -> 0x00a6 }
            int r0 = r0 % 2
            return
        L_0x00a6:
            r0 = move-exception
            throw r0
        L_0x00a8:
            r8.f10220a = r0     // Catch:{ Exception -> 0x00ab }
            return
        L_0x00ab:
            r0 = move-exception
            java.lang.String r1 = "init with security guard failed"
            com.alibaba.griver.base.common.logger.GriverLogger.e(r5, r1, r0)
            return
        L_0x00b2:
            r0 = move-exception
            throw r0
        L_0x00b4:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.common.security.GriverDefaultSecurityExtension.initWithSecurityGuard():void");
    }

    public String getIdentifier() {
        int i = setMax + 45;
        getMax = i % 128;
        int i2 = i % 2;
        if ((TextUtils.isEmpty(this.f10220a) ? 1 : '3') != 1) {
            return MD5Util.getMD5String(this.f10220a);
        }
        try {
            int i3 = getMax + 57;
            setMax = i3 % 128;
            String str = null;
            if (!(i3 % 2 == 0)) {
                super.hashCode();
            }
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, java.lang.String] */
    public String encrypt(String str) {
        if (TextUtils.isEmpty(this.f10220a)) {
            int i = getMax + 117;
            setMax = i % 128;
            int i2 = i % 2;
            GriverLogger.d("GriverBase:GriverDefaultSecurityExtension", "private key is empty, do not encrypt");
            return str;
        }
        ? r4 = 0;
        if ((TextUtils.isEmpty(str) ? Typography.amp : 'c') != 'c') {
            int i3 = setMax + 5;
            getMax = i3 % 128;
            if (i3 % 2 == 0) {
                GriverLogger.d("GriverBase:GriverDefaultSecurityExtension", "data is empty, do not encrypt");
                super.hashCode();
                return str;
            }
            GriverLogger.d("GriverBase:GriverDefaultSecurityExtension", "data is empty, do not encrypt");
            return str;
        }
        boolean z = false;
        byte[] bytes = str.getBytes(Charset.forName(setMin(new char[]{1, 2, 0, 5, 'O'}, (byte) ((SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)) + 22), 5 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern()));
        byte[] encrypt = AESUtil.encrypt(this.f10220a.getBytes(Charset.forName(setMin(new char[]{1, 2, 0, 5, 'O'}, (byte) (PhoneNumberUtils.toaFromString("") - 106), 5 - View.MeasureSpec.getSize(0)).intern())), bytes, 0, bytes.length);
        if (encrypt == null) {
            z = true;
        }
        if (!z) {
            String encodeToString = Base64.encodeToString(encrypt, 2);
            int i4 = setMax + 105;
            getMax = i4 % 128;
            if (i4 % 2 != 0) {
                return encodeToString;
            }
            int length = r4.length;
            return encodeToString;
        }
        GriverLogger.w("GriverBase:GriverDefaultSecurityExtension", "encrypt with aes failed, return null");
        return r4;
    }

    public String decrypt(String str, String str2) {
        boolean z = true;
        if (TextUtils.isEmpty(this.f10220a)) {
            GriverLogger.d("GriverBase:GriverDefaultSecurityExtension", "private key is empty, do not decrypt");
            int i = setMax + 53;
            getMax = i % 128;
            int i2 = i % 2;
            return str;
        }
        if (!TextUtils.isEmpty(str)) {
            z = false;
        }
        if (z) {
            int i3 = setMax + 45;
            getMax = i3 % 128;
            int i4 = i3 % 2;
            GriverLogger.d("GriverBase:GriverDefaultSecurityExtension", "data is empty, do not decrypt");
            return str;
        }
        byte[] decode = Base64.decode(str, 2);
        byte[] decrypt = AESUtil.decrypt(this.f10220a.getBytes(Charset.forName(setMin(new char[]{1, 2, 0, 5, 'O'}, (byte) (23 - KeyEvent.normalizeMetaState(0)), TextUtils.lastIndexOf("", '0', 0, 0) + 6).intern())), decode, 0, decode.length);
        if (decrypt != null) {
            return new String(decrypt, Charset.forName(setMin(new char[]{1, 2, 0, 5, 'O'}, (byte) (152 - PhoneNumberUtils.toaFromString("")), 6 - (ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1))).intern()));
        }
        int i5 = setMax + 17;
        getMax = i5 % 128;
        int i6 = i5 % 2;
        GriverLogger.w("GriverBase:GriverDefaultSecurityExtension", "decrypt with aes failed, return null");
        return null;
    }

    private static String setMin(char[] cArr, byte b, int i) {
        try {
            char[] cArr2 = setMin;
            char c = getMin;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr3[i] = (char) (cArr[i] - b);
            }
            if (i > 1) {
                for (int i2 = 0; i2 < i; i2 += 2) {
                    char c2 = cArr[i2];
                    int i3 = i2 + 1;
                    char c3 = cArr[i3];
                    if ((c2 == c3 ? 'c' : 22) != 22) {
                        int i4 = setMax + 5;
                        getMax = i4 % 128;
                        if ((i4 % 2 == 0 ? (char) 6 : 17) != 6) {
                            cArr3[i2] = (char) (c2 - b);
                            cArr3[i3] = (char) (c3 - b);
                        } else {
                            cArr3[i2] = (char) (c2 << b);
                            cArr3[i2 >> 1] = (char) (c3 - b);
                        }
                    } else {
                        int min = onActivityPreStopped.setMin(c2, c);
                        int length = onActivityPreStopped.length(c2, c);
                        int min2 = onActivityPreStopped.setMin(c3, c);
                        int length2 = onActivityPreStopped.length(c3, c);
                        if (!(length != length2)) {
                            int i5 = getMax + 113;
                            setMax = i5 % 128;
                            int i6 = i5 % 2;
                            try {
                                int max = onActivityPreStopped.setMax(min, c);
                                int max2 = onActivityPreStopped.setMax(min2, c);
                                int max3 = onActivityPreStopped.getMax(max, length, c);
                                int max4 = onActivityPreStopped.getMax(max2, length2, c);
                                cArr3[i2] = cArr2[max3];
                                cArr3[i3] = cArr2[max4];
                            } catch (Exception e) {
                                throw e;
                            }
                        } else if (min == min2) {
                            int max5 = onActivityPreStopped.setMax(length, c);
                            int max6 = onActivityPreStopped.setMax(length2, c);
                            int max7 = onActivityPreStopped.getMax(min, max5, c);
                            int max8 = onActivityPreStopped.getMax(min2, max6, c);
                            cArr3[i2] = cArr2[max7];
                            cArr3[i3] = cArr2[max8];
                            int i7 = setMax + 121;
                            getMax = i7 % 128;
                            int i8 = i7 % 2;
                        } else {
                            int max9 = onActivityPreStopped.getMax(min, length2, c);
                            int max10 = onActivityPreStopped.getMax(min2, length, c);
                            cArr3[i2] = cArr2[max9];
                            cArr3[i3] = cArr2[max10];
                        }
                    }
                }
            }
            String str = new String(cArr3);
            int i9 = setMax + 11;
            getMax = i9 % 128;
            int i10 = i9 % 2;
            return str;
        } catch (Exception e2) {
            throw e2;
        }
    }
}
