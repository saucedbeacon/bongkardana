package com.alibaba.griver.base.common.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import id.dana.utils.permission.ManifestPermission;
import java.lang.reflect.Method;
import o.IntRange;
import o.PlaybackStateCompat;

public class CommonUtils {

    /* renamed from: a  reason: collision with root package name */
    private static float f9056a;
    private static PlaybackStateCompat.ErrorCode<String, Uri> b = new PlaybackStateCompat.ErrorCode<>(20);

    public static long getLong(JSONObject jSONObject, String str) {
        return getLong(jSONObject, str, 0);
    }

    public static long getLong(JSONObject jSONObject, String str, long j) {
        return ((Long) getValue(jSONObject, str, Long.valueOf(j))).longValue();
    }

    public static long getLong(Bundle bundle, String str) {
        return getLong(bundle, str, 0);
    }

    public static long getLong(Bundle bundle, String str, long j) {
        return ((Long) getValue(bundle, str, Long.valueOf(j))).longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        r1 = r1.get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T getValue(android.os.Bundle r1, java.lang.String r2, T r3) {
        /*
            if (r1 == 0) goto L_0x0028
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0028 }
            if (r0 == 0) goto L_0x0009
            goto L_0x0028
        L_0x0009:
            if (r3 != 0) goto L_0x000c
            return r3
        L_0x000c:
            boolean r0 = r1.containsKey(r2)     // Catch:{ Exception -> 0x0028 }
            if (r0 != 0) goto L_0x0013
            return r3
        L_0x0013:
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0028 }
            if (r1 == 0) goto L_0x0028
            java.lang.Class r2 = r3.getClass()     // Catch:{ Exception -> 0x0028 }
            java.lang.Class r0 = r1.getClass()     // Catch:{ Exception -> 0x0028 }
            boolean r2 = r2.isAssignableFrom(r0)     // Catch:{ Exception -> 0x0028 }
            if (r2 == 0) goto L_0x0028
            r3 = r1
        L_0x0028:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.common.utils.CommonUtils.getValue(android.os.Bundle, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r1 = r1.get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T getValue(com.alibaba.fastjson.JSONObject r1, java.lang.String r2, T r3) {
        /*
            if (r1 == 0) goto L_0x0027
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0027
            if (r3 != 0) goto L_0x000b
            return r3
        L_0x000b:
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L_0x0012
            return r3
        L_0x0012:
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L_0x0027
            java.lang.Class r2 = r3.getClass()
            java.lang.Class r0 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r0)
            if (r2 == 0) goto L_0x0027
            r3 = r1
        L_0x0027:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.common.utils.CommonUtils.getValue(com.alibaba.fastjson.JSONObject, java.lang.String, java.lang.Object):java.lang.Object");
    }

    public static int dip2px(Context context, float f) {
        a(context);
        return (int) ((f * f9056a) + 0.5f);
    }

    private static void a(Context context) {
        try {
            if (f9056a == 0.0f) {
                f9056a = context.getResources().getDisplayMetrics().density;
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean contains(JSONObject jSONObject, String str) {
        return jSONObject != null && !jSONObject.isEmpty() && jSONObject.containsKey(str);
    }

    public static float getFloat(JSONObject jSONObject, String str, float f) {
        return ((Float) getValue(jSONObject, str, Float.valueOf(f))).floatValue();
    }

    public static int getInt(JSONObject jSONObject, String str) {
        return getInt(jSONObject, str, 0);
    }

    public static int getInt(JSONObject jSONObject, String str, int i) {
        return ((Integer) getValue(jSONObject, str, Integer.valueOf(i))).intValue();
    }

    public static boolean isAppPermissionOPen(Context context) {
        if (context == null) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT < 23) {
                return b(context);
            }
            if (IntRange.length(context, ManifestPermission.ACCESS_COARSE_LOCATION) == 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    private static boolean b(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return a(context, 0);
        }
        return true;
    }

    private static boolean a(Context context, int i) {
        Method method;
        try {
            Object systemService = context.getSystemService("appops");
            if (systemService == null || (method = systemService.getClass().getMethod("checkOp", new Class[]{Integer.TYPE, Integer.TYPE, String.class})) == null) {
                return false;
            }
            if (((Integer) method.invoke(systemService, new Object[]{Integer.valueOf(i), Integer.valueOf(Binder.getCallingUid()), context.getPackageName()})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    public static String getString(JSONObject jSONObject, String str) {
        return getString(jSONObject, str, "");
    }

    public static String getString(JSONObject jSONObject, String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        return (String) getValue(jSONObject, str, str2);
    }

    public static Uri parseUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = b.get(str);
        if (uri != null) {
            return uri;
        }
        try {
            uri = Uri.parse(str);
            b.put(str, uri);
            return uri;
        } catch (Exception unused) {
            return uri;
        }
    }
}
