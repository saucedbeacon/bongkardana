package com.alibaba.griver.base.common.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import id.dana.lib.gcontainer.app.bridge.contact.ContactEventType;

public class NavigationBarCompat {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r4 = r4.getResources();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getHeight(android.content.Context r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r1 = "navigation_bar_height"
            java.lang.String r2 = "dimen"
            java.lang.String r3 = "android"
            int r1 = r4.getIdentifier(r1, r2, r3)
            if (r1 <= 0) goto L_0x0018
            int r0 = r4.getDimensionPixelSize(r1)
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.common.utils.NavigationBarCompat.getHeight(android.content.Context):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (android.provider.Settings.Global.getInt(r4.getContentResolver(), "navigationbar_is_min", 0) == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (android.provider.Settings.Global.getInt(r4.getContentResolver(), "force_fsg_nav_bar", 0) == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (android.provider.Settings.Global.getInt(r4.getContentResolver(), "navigation_gesture_on", 0) == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        if (android.provider.Settings.Secure.getInt(r4.getContentResolver(), "manual_hide_navigationbar", 0) == 0) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isShown(android.app.Activity r4) {
        /*
            boolean r0 = a((android.content.Context) r4)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r0 >= r2) goto L_0x000f
            return r1
        L_0x000f:
            java.lang.String r0 = android.os.Build.BRAND
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x0018
            return r1
        L_0x0018:
            java.lang.String r2 = "HUAWEI"
            boolean r2 = r0.equalsIgnoreCase(r2)
            r3 = 1
            if (r2 == 0) goto L_0x002f
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r0 = "navigationbar_is_min"
            int r4 = android.provider.Settings.Global.getInt(r4, r0, r1)
            if (r4 != 0) goto L_0x0072
        L_0x002d:
            r1 = 1
            goto L_0x0072
        L_0x002f:
            java.lang.String r2 = "XIAOMI"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0044
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r0 = "force_fsg_nav_bar"
            int r4 = android.provider.Settings.Global.getInt(r4, r0, r1)
            if (r4 != 0) goto L_0x0072
            goto L_0x002d
        L_0x0044:
            java.lang.String r2 = "VIVO"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0059
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r0 = "navigation_gesture_on"
            int r4 = android.provider.Settings.Global.getInt(r4, r0, r1)
            if (r4 != 0) goto L_0x0072
            goto L_0x002d
        L_0x0059:
            java.lang.String r2 = "OPPO"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x006e
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r0 = "manual_hide_navigationbar"
            int r4 = android.provider.Settings.Secure.getInt(r4, r0, r1)
            if (r4 != 0) goto L_0x0072
            goto L_0x002d
        L_0x006e:
            boolean r1 = a((android.app.Activity) r4)
        L_0x0072:
            java.lang.String r4 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "navigationBar isShown:"
            java.lang.String r4 = r0.concat(r4)
            java.lang.String r0 = "NavigationBarCompat"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.common.utils.NavigationBarCompat.isShown(android.app.Activity):boolean");
    }

    private static boolean a(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        boolean z = identifier > 0 ? resources.getBoolean(identifier) : false;
        if (z) {
            return true;
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod(ContactEventType.CONTACT_GET, new Class[]{String.class}).invoke(cls, new Object[]{"qemu.hw.mainkeys"});
            if ("1".equals(str)) {
                return false;
            }
            if ("0".equals(str)) {
                return true;
            }
            return z;
        } catch (Exception e) {
            RVLogger.e("NavigationBarCompat", (Throwable) e);
        }
    }

    private static boolean a(Activity activity) {
        try {
            ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            if (viewGroup == null) {
                return false;
            }
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                int id2 = viewGroup.getChildAt(i).getId();
                if (id2 != -1 && "navigationBarBackground".equals(activity.getResources().getResourceEntryName(id2))) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            RVLogger.e("NavigationBarCompat", th);
            return false;
        }
    }
}
