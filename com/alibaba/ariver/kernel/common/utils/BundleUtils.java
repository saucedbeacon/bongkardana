package com.alibaba.ariver.kernel.common.utils;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.TypeUtils;

public class BundleUtils {
    public static void tryUnparcel(Bundle bundle) {
        if (bundle != null) {
            try {
                bundle.get("aaa");
            } catch (Throwable th) {
                RVLogger.e("AriverKernel:BundleUtils", "unparcel exception!", th);
            }
        }
    }

    public static Bundle clone(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        return (Bundle) bundle.clone();
    }

    public static boolean contains(Bundle bundle, String str) {
        if (bundle == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return bundle.containsKey(str);
    }

    public static byte[] getByteArray(Bundle bundle, @Nullable String str) {
        if (bundle != null && !TextUtils.isEmpty(str)) {
            try {
                return bundle.getByteArray(str);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static <T extends Parcelable> T getParcelable(Bundle bundle, @Nullable String str) {
        if (bundle != null && !TextUtils.isEmpty(str)) {
            try {
                return bundle.getParcelable(str);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Object getSerializable(Bundle bundle, @Nullable String str) {
        if (bundle != null && !TextUtils.isEmpty(str)) {
            try {
                return bundle.getSerializable(str);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static String getString(Bundle bundle, String str) {
        return getString(bundle, str, "");
    }

    public static String getString(Bundle bundle, String str, String str2) {
        String castToString;
        if (str2 == null) {
            str2 = "";
        }
        if (bundle != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (bundle.containsKey(str) && (castToString = TypeUtils.castToString(bundle.get(str))) != null) {
                        return castToString;
                    }
                }
            } catch (Exception e) {
                RVLogger.e("get json value exception", (Throwable) e);
            }
        }
        return str2;
    }

    public static String getStringOnly(Bundle bundle, String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        return (String) getValue(bundle, str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        r1 = com.alibaba.fastjson.util.TypeUtils.castToBoolean(r1.get(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean getBoolean(android.os.Bundle r1, java.lang.String r2, boolean r3) {
        /*
            if (r1 == 0) goto L_0x0026
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0020 }
            if (r0 == 0) goto L_0x0009
            goto L_0x0026
        L_0x0009:
            boolean r0 = r1.containsKey(r2)     // Catch:{ Exception -> 0x0020 }
            if (r0 != 0) goto L_0x0010
            return r3
        L_0x0010:
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0020 }
            java.lang.Boolean r1 = com.alibaba.fastjson.util.TypeUtils.castToBoolean(r1)     // Catch:{ Exception -> 0x0020 }
            if (r1 == 0) goto L_0x001f
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x0020 }
            return r1
        L_0x001f:
            return r3
        L_0x0020:
            r1 = move-exception
            java.lang.String r2 = "get json value exception"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r2, (java.lang.Throwable) r1)
        L_0x0026:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.BundleUtils.getBoolean(android.os.Bundle, java.lang.String, boolean):boolean");
    }

    public static int getInt(Bundle bundle, String str) {
        return getInt(bundle, str, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        r1 = com.alibaba.fastjson.util.TypeUtils.castToInt(r1.get(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getInt(android.os.Bundle r1, java.lang.String r2, int r3) {
        /*
            if (r1 == 0) goto L_0x0026
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0020 }
            if (r0 == 0) goto L_0x0009
            goto L_0x0026
        L_0x0009:
            boolean r0 = r1.containsKey(r2)     // Catch:{ Exception -> 0x0020 }
            if (r0 != 0) goto L_0x0010
            return r3
        L_0x0010:
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0020 }
            java.lang.Integer r1 = com.alibaba.fastjson.util.TypeUtils.castToInt(r1)     // Catch:{ Exception -> 0x0020 }
            if (r1 == 0) goto L_0x001f
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x0020 }
            return r1
        L_0x001f:
            return r3
        L_0x0020:
            r1 = move-exception
            java.lang.String r2 = "get json value exception"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r2, (java.lang.Throwable) r1)
        L_0x0026:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.BundleUtils.getInt(android.os.Bundle, java.lang.String, int):int");
    }

    public static long getLong(Bundle bundle, String str) {
        return getLong(bundle, str, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        r1 = com.alibaba.fastjson.util.TypeUtils.castToLong(r1.get(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long getLong(android.os.Bundle r1, java.lang.String r2, long r3) {
        /*
            if (r1 == 0) goto L_0x0026
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0020 }
            if (r0 == 0) goto L_0x0009
            goto L_0x0026
        L_0x0009:
            boolean r0 = r1.containsKey(r2)     // Catch:{ Exception -> 0x0020 }
            if (r0 != 0) goto L_0x0010
            return r3
        L_0x0010:
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0020 }
            java.lang.Long r1 = com.alibaba.fastjson.util.TypeUtils.castToLong(r1)     // Catch:{ Exception -> 0x0020 }
            if (r1 == 0) goto L_0x001f
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x0020 }
            return r1
        L_0x001f:
            return r3
        L_0x0020:
            r1 = move-exception
            java.lang.String r2 = "get json value exception"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r2, (java.lang.Throwable) r1)
        L_0x0026:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.BundleUtils.getLong(android.os.Bundle, java.lang.String, long):long");
    }

    public static double getDouble(Bundle bundle, String str) {
        return getDouble(bundle, str, 0.0d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        r1 = com.alibaba.fastjson.util.TypeUtils.castToDouble(r1.get(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static double getDouble(android.os.Bundle r1, java.lang.String r2, double r3) {
        /*
            if (r1 == 0) goto L_0x0026
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0020 }
            if (r0 == 0) goto L_0x0009
            goto L_0x0026
        L_0x0009:
            boolean r0 = r1.containsKey(r2)     // Catch:{ Exception -> 0x0020 }
            if (r0 != 0) goto L_0x0010
            return r3
        L_0x0010:
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0020 }
            java.lang.Double r1 = com.alibaba.fastjson.util.TypeUtils.castToDouble(r1)     // Catch:{ Exception -> 0x0020 }
            if (r1 == 0) goto L_0x001f
            double r1 = r1.doubleValue()     // Catch:{ Exception -> 0x0020 }
            return r1
        L_0x001f:
            return r3
        L_0x0020:
            r1 = move-exception
            java.lang.String r2 = "get json value exception"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r2, (java.lang.Throwable) r1)
        L_0x0026:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.BundleUtils.getDouble(android.os.Bundle, java.lang.String, double):double");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        r1 = r1.get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T getValue(android.os.Bundle r1, java.lang.String r2, T r3) {
        /*
            if (r1 == 0) goto L_0x002f
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0029 }
            if (r0 == 0) goto L_0x0009
            goto L_0x002f
        L_0x0009:
            if (r3 != 0) goto L_0x000c
            return r3
        L_0x000c:
            boolean r0 = r1.containsKey(r2)     // Catch:{ Exception -> 0x0029 }
            if (r0 != 0) goto L_0x0013
            return r3
        L_0x0013:
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0029 }
            if (r1 == 0) goto L_0x0028
            java.lang.Class r2 = r3.getClass()     // Catch:{ Exception -> 0x0029 }
            java.lang.Class r0 = r1.getClass()     // Catch:{ Exception -> 0x0029 }
            boolean r2 = r2.isAssignableFrom(r0)     // Catch:{ Exception -> 0x0029 }
            if (r2 == 0) goto L_0x0028
            r3 = r1
        L_0x0028:
            return r3
        L_0x0029:
            r1 = move-exception
            java.lang.String r2 = "get json value exception"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r2, (java.lang.Throwable) r1)
        L_0x002f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.BundleUtils.getValue(android.os.Bundle, java.lang.String, java.lang.Object):java.lang.Object");
    }

    public static JSONObject toJSONObject(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        if (bundle == null) {
            return jSONObject;
        }
        for (String str : bundle.keySet()) {
            jSONObject.put(str, bundle.get(str));
        }
        return jSONObject;
    }
}
