package com.alibaba.ariver.app.api;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ParamUtils {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, ParamImpl> f8950a = new HashMap<String, ParamImpl>() {
        {
            put("url", new ParamImpl("url", "u", RVParams.ParamType.STRING, ""));
            put("defaultTitle", new ParamImpl("defaultTitle", RVParams.DEFAULT_TITLE, RVParams.ParamType.STRING, ""));
            put("titleImage", new ParamImpl("titleImage", RVParams.TITLE_IMAGE, RVParams.ParamType.STRING, ""));
            put("showTitleBar", new ParamImpl("showTitleBar", RVParams.SHOW_TITLEBAR, RVParams.ParamType.BOOLEAN, Boolean.TRUE));
            put(RVParams.LONG_SHOW_FAVORITES, new ParamImpl(RVParams.LONG_SHOW_FAVORITES, RVParams.SHOW_FAVORITES, RVParams.ParamType.BOOLEAN, Boolean.FALSE));
            put(RVParams.LONG_SHOW_REPORT_BTN, new ParamImpl(RVParams.LONG_SHOW_REPORT_BTN, RVParams.SHOW_REPORT_BTN, RVParams.ParamType.BOOLEAN, Boolean.FALSE));
            put(RVParams.LONG_SHOW_TOOLBAR, new ParamImpl(RVParams.LONG_SHOW_TOOLBAR, RVParams.SHOW_TOOLBAR, RVParams.ParamType.BOOLEAN, Boolean.FALSE));
            put("showLoading", new ParamImpl("showLoading", RVParams.SHOW_LOADING, RVParams.ParamType.BOOLEAN, Boolean.FALSE));
            put(RVParams.LONG_CLOSE_BUTTON_TEXT, new ParamImpl(RVParams.LONG_CLOSE_BUTTON_TEXT, RVParams.CLOSE_BUTTON_TEXT, RVParams.ParamType.STRING, ""));
            put(RVParams.LONG_SSO_LOGIN_ENABLE, new ParamImpl(RVParams.LONG_SSO_LOGIN_ENABLE, RVParams.SSO_LOGIN_ENABLE, RVParams.ParamType.BOOLEAN, Boolean.TRUE));
            put(RVParams.LONG_SAFEPAY_ENABLE, new ParamImpl(RVParams.LONG_SAFEPAY_ENABLE, RVParams.SAFEPAY_ENABLE, RVParams.ParamType.BOOLEAN, Boolean.TRUE));
            put(RVParams.LONG_SAFEPAY_CONTEXT, new ParamImpl(RVParams.LONG_SAFEPAY_CONTEXT, RVParams.SAFEPAY_CONTEXT, RVParams.ParamType.STRING, ""));
            put(RVParams.LONG_READ_TITLE, new ParamImpl(RVParams.LONG_READ_TITLE, RVParams.READ_TITLE, RVParams.ParamType.BOOLEAN, Boolean.TRUE));
            put(RVParams.LONG_BIZ_SCENARIO, new ParamImpl(RVParams.LONG_BIZ_SCENARIO, RVParams.BIZ_SCENARIO, RVParams.ParamType.STRING, ""));
            put(RVParams.LONG_ANTI_PHISHING, new ParamImpl(RVParams.LONG_ANTI_PHISHING, RVParams.ANTI_PHISHING, RVParams.ParamType.BOOLEAN, Boolean.TRUE));
            put(RVParams.LONG_TOOLBAR_MENU, new ParamImpl(RVParams.LONG_TOOLBAR_MENU, RVParams.TOOLBAR_MENU, RVParams.ParamType.STRING, ""));
            put("pullRefresh", new ParamImpl("pullRefresh", RVParams.PULL_REFRESH, RVParams.ParamType.BOOLEAN, Boolean.FALSE));
            put("showTitleLoading", new ParamImpl("showTitleLoading", RVParams.SHOW_TITLE_LOADING, RVParams.ParamType.BOOLEAN, Boolean.FALSE));
            put("showProgress", new ParamImpl("showProgress", RVParams.SHOW_PROGRESS, RVParams.ParamType.BOOLEAN, Boolean.FALSE));
            put(RVParams.LONG_SMART_TOOLBAR, new ParamImpl(RVParams.LONG_SMART_TOOLBAR, RVParams.SMART_TOOLBAR, RVParams.ParamType.BOOLEAN, Boolean.FALSE));
            put(RVParams.LONG_ENABLE_PROXY, new ParamImpl(RVParams.LONG_ENABLE_PROXY, RVParams.ENABLE_PROXY, RVParams.ParamType.BOOLEAN, Boolean.FALSE));
            put(RVParams.LONG_CAN_PULL_DOWN, new ParamImpl(RVParams.LONG_CAN_PULL_DOWN, RVParams.CAN_PULL_DOWN, RVParams.ParamType.BOOLEAN, Boolean.TRUE));
            put(RVParams.LONG_SHOW_DOMAIN, new ParamImpl(RVParams.LONG_SHOW_DOMAIN, RVParams.SHOW_DOMAIN, RVParams.ParamType.BOOLEAN, Boolean.TRUE));
            put(RVParams.LONG_PREFETCH_LOCATION, new ParamImpl(RVParams.LONG_PREFETCH_LOCATION, RVParams.PREFETCH_LOCATION, RVParams.ParamType.BOOLEAN, Boolean.FALSE));
            put("showOptionMenu", new ParamImpl("showOptionMenu", RVParams.SHOW_OPTION_MENU, RVParams.ParamType.BOOLEAN, Boolean.TRUE));
            put("backgroundColor", new ParamImpl("backgroundColor", RVParams.BACKGROUND_COLOR, RVParams.ParamType.INT, -1));
            put(RVParams.LONG_INTERCEPT_JUMP, new ParamImpl(RVParams.LONG_INTERCEPT_JUMP, RVParams.INTERCEPT_JUMP, RVParams.ParamType.BOOLEAN, Boolean.TRUE));
            put(RVParams.LONG_CLOSE_AFTER_PAY_FINISH, new ParamImpl(RVParams.LONG_CLOSE_AFTER_PAY_FINISH, RVParams.CLOSE_AFTER_PAY_FINISH, RVParams.ParamType.BOOLEAN, Boolean.TRUE));
            put(RVStartParams.KEY_TRANSPARENT, new ParamImpl(RVStartParams.KEY_TRANSPARENT, "tt", RVParams.ParamType.BOOLEAN, Boolean.FALSE));
            put("fullscreen", new ParamImpl("fullscreen", RVStartParams.KEY_FULLSCREEN_SHORT, RVParams.ParamType.BOOLEAN, Boolean.FALSE));
            put("landscape", new ParamImpl("landscape", RVStartParams.KEY_LANDSCAPE_SHORT, RVParams.ParamType.STRING, ""));
            put(RVParams.LONG_ENABLE_SCROLLBAR, new ParamImpl(RVParams.LONG_ENABLE_SCROLLBAR, RVParams.ENABLE_SCROLLBAR, RVParams.ParamType.BOOLEAN, Boolean.TRUE));
            put(RVParams.LONG_DELAY_RENDER, new ParamImpl(RVParams.LONG_DELAY_RENDER, RVParams.DELAY_RENDER, RVParams.ParamType.BOOLEAN, Boolean.FALSE));
            put(RVParams.LONG_CAN_DESTROY, new ParamImpl(RVParams.LONG_CAN_DESTROY, RVParams.CAN_DESTROY, RVParams.ParamType.BOOLEAN, Boolean.FALSE));
            put("transparentTitle", new ParamImpl("transparentTitle", RVParams.TRANSPARENT_TITLE, RVParams.ParamType.STRING, ""));
            put(RVParams.LONG_TITLE_SCROLLDISTANCE, new ParamImpl(RVParams.LONG_TITLE_SCROLLDISTANCE, RVParams.TITLE_SCROLLDISTANCE, RVParams.ParamType.INT, 255));
            put(RVParams.LONG_BOUNCE_TOP_COLOR, new ParamImpl(RVParams.LONG_BOUNCE_TOP_COLOR, RVParams.BOUNCE_TOP_COLOR, true, RVParams.ParamType.INT, Integer.valueOf(RVParams.DEFAULT_LONG_BOUNCE_TOP_COLOR)));
            put(RVParams.LONG_ALLOWS_BOUNCE_VERTICAL, new ParamImpl(RVParams.LONG_ALLOWS_BOUNCE_VERTICAL, RVParams.ALLOWS_BOUNCE_VERTICAL, RVParams.ParamType.STRING, ""));
            put(RVStartParams.LONG_NB_UPDATE, new ParamImpl(RVStartParams.LONG_NB_UPDATE, RVParams.NB_UPDATE, RVParams.ParamType.STRING, "async"));
            put(RVStartParams.LONG_NB_OFFLINE, new ParamImpl(RVStartParams.LONG_NB_OFFLINE, RVParams.NB_OFFLINE, RVParams.ParamType.STRING, "async"));
            put(RVStartParams.LONG_NB_URL, new ParamImpl(RVStartParams.LONG_NB_URL, RVParams.NB_URL, RVParams.ParamType.STRING, ""));
            put(RVParams.LONG_OB_VERSION, new ParamImpl(RVParams.LONG_OB_VERSION, RVParams.OB_VERSION, RVParams.ParamType.STRING, ""));
            put(RVStartParams.LONG_NB_VERSION, new ParamImpl(RVStartParams.LONG_NB_VERSION, RVParams.NB_VERSION, RVParams.ParamType.STRING, ""));
            put("navSearchBar_type", new ParamImpl("navSearchBar_type", RVParams.NAV_SEARCH_BAR_TYPE, RVParams.ParamType.STRING, ""));
            put(RVParams.LONG_NAV_SEARCH_BAR_PLACEHOLDER, new ParamImpl(RVParams.LONG_NAV_SEARCH_BAR_PLACEHOLDER, RVParams.NAV_SEARCH_BAR_PLACEHOLDER, RVParams.ParamType.STRING, ""));
            put(RVParams.LONG_NAV_SEARCH_BAR_VALUE, new ParamImpl(RVParams.LONG_NAV_SEARCH_BAR_VALUE, RVParams.NAV_SEARCH_BAR_VALUE, RVParams.ParamType.STRING, ""));
            put(RVParams.LONG_NAV_SEARCH_BAR_MAX_LENGTH, new ParamImpl(RVParams.LONG_NAV_SEARCH_BAR_MAX_LENGTH, RVParams.NAV_SEARCH_BAR_MAX_LENGTH, RVParams.ParamType.INT, 0));
            put(RVParams.LONG_NAV_SEARCH_BAR_SEARCH_PLACEHOLDER, new ParamImpl(RVParams.LONG_NAV_SEARCH_BAR_SEARCH_PLACEHOLDER, RVParams.NAV_SEARCH_BAR_SEARCH_PLACEHOLDER, RVParams.ParamType.BOOLEAN, Boolean.FALSE));
            put("backBtnImage", new ParamImpl("backBtnImage", RVParams.BACKBTN_IMAGE, RVParams.ParamType.STRING, "default"));
            put(RVParams.LONG_BACKBTN_TEXTCOLOR, new ParamImpl(RVParams.LONG_BACKBTN_TEXTCOLOR, RVParams.BACKBTN_TEXTCOLOR, RVParams.ParamType.INT, -16777216));
            put("titleColor", new ParamImpl("titleColor", RVParams.TITLE_COLOR, RVParams.ParamType.INT, -16777216));
            put(RVParams.LONG_TRANSPARENT_TITLE_TEXTAUTO, new ParamImpl(RVParams.LONG_TRANSPARENT_TITLE_TEXTAUTO, RVParams.TRANSPARENT_TITLE_TEXTAUTO, RVParams.ParamType.STRING, "NO"));
            put(RVParams.LONG_PRESSO_LOGIN, new ParamImpl(RVParams.LONG_PRESSO_LOGIN, RVParams.PRESSO_LOGIN, RVParams.ParamType.STRING, "YES"));
            put(RVParams.LONG_PRESSO_LOGIN_BINDINGPAGE, new ParamImpl(RVParams.LONG_PRESSO_LOGIN_BINDINGPAGE, RVParams.PRESSO_LOGIN_BINDINGPAGE, RVParams.ParamType.STRING, ""));
            put(RVParams.LONG_PRESSO_LOGIN_URL, new ParamImpl(RVParams.LONG_PRESSO_LOGIN_URL, RVParams.PRESSO_LOGIN_URL, RVParams.ParamType.STRING, ""));
            put("tabBarJson", new ParamImpl("tabBarJson", "tabBarJson", RVParams.ParamType.STRING, ""));
            put("enableTabBar", new ParamImpl("enableTabBar", "enableTabBar", RVParams.ParamType.STRING, "default"));
            put("tabItemCount", new ParamImpl("tabItemCount", "tabItemCount", RVParams.ParamType.INT, -1));
            put("titleBarColor", new ParamImpl("titleBarColor", "titleBarColor", RVParams.ParamType.INT, (Object) null));
            put("preventAutoLoginLoop", new ParamImpl("preventAutoLoginLoop", "preventAutoLoginLoop", RVParams.ParamType.BOOLEAN, Boolean.FALSE));
            put(RVStartParams.KEY_TRANS_ANIMATE, new ParamImpl(RVStartParams.KEY_TRANS_ANIMATE, RVParams.TRANS_ANIMATE, RVParams.ParamType.BOOLEAN, Boolean.FALSE));
            put(RVParams.LONG_NB_OFFMODE, new ParamImpl(RVParams.LONG_NB_OFFMODE, RVParams.NB_OFFMODE, RVParams.ParamType.STRING, "force"));
            put("openUrlMethod", new ParamImpl("openUrlMethod", "openUrlMethod", RVParams.ParamType.STRING, "GET"));
            put("openUrlPostParams", new ParamImpl("openUrlPostParams", "openUrlPostParams", RVParams.ParamType.STRING, ""));
            put(RVParams.LONG_SHARETOKENPARAMS, new ParamImpl(RVParams.LONG_SHARETOKENPARAMS, RVParams.SHARETOKENPARAMS, RVParams.ParamType.STRING, ""));
        }
    };
    private static int getMax = 1;
    private static int length;
    private static char[] setMax;
    private static long setMin;

    static void length() {
        setMax = new char[]{'U', 18170, 36122, 54311, 6784};
        setMin = 2318490074195838638L;
    }

    static {
        length();
        int i = length + 35;
        getMax = i % 128;
        if (!(i % 2 != 0)) {
            int i2 = 94 / 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e4, code lost:
        if (r3.equals("YES") == false) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0110, code lost:
        if (r3 == false) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011a, code lost:
        if ("YES".equals(r3) == false) goto L_0x011c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(@androidx.annotation.NonNull android.os.Bundle r16) {
        /*
            r0 = r16
            java.lang.String r1 = "tt"
            java.lang.String r2 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getString(r0, r1)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r4 = "transparent"
            if (r3 == 0) goto L_0x0014
            java.lang.String r2 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getString(r0, r4)
        L_0x0014:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r5 = 1
            java.lang.String r6 = "YES"
            r7 = 0
            if (r3 == 0) goto L_0x0045
            int r3 = length
            int r3 = r3 + 95
            int r8 = r3 % 128
            getMax = r8
            int r3 = r3 % 2
            boolean r3 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getBoolean(r0, r4, r7)
            if (r3 != 0) goto L_0x0030
            r3 = 1
            goto L_0x0031
        L_0x0030:
            r3 = 0
        L_0x0031:
            if (r3 == r5) goto L_0x0034
            goto L_0x003a
        L_0x0034:
            boolean r1 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getBoolean(r0, r1, r7)
            if (r1 == 0) goto L_0x0045
        L_0x003a:
            int r1 = getMax
            int r1 = r1 + 99
            int r2 = r1 % 128
            length = r2
            int r1 = r1 % 2
            r2 = r6
        L_0x0045:
            boolean r1 = r6.equalsIgnoreCase(r2)
            if (r1 != 0) goto L_0x0053
            java.lang.String r1 = "TRUE"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x0136
        L_0x0053:
            java.lang.String r1 = "st"
            r0.remove(r1)
            java.lang.String r2 = "showTitleBar"
            r0.remove(r2)
            java.lang.String r3 = "sb"
            r0.remove(r3)
            java.lang.String r4 = "showToolBar"
            r0.remove(r4)
            java.lang.String r8 = "sp"
            r0.remove(r8)
            java.lang.String r9 = "showProgress"
            r0.remove(r9)
            java.lang.String r10 = "sd"
            r0.remove(r10)
            java.lang.String r11 = "showDomain"
            r0.remove(r11)
            java.lang.String r12 = "pd"
            r0.remove(r12)
            java.lang.String r13 = "canPullDown"
            r0.remove(r13)
            java.lang.String r14 = "abv"
            r0.remove(r14)
            java.lang.String r15 = "allowsBounceVertical"
            r0.remove(r15)
            java.lang.String r5 = "NO"
            r0.putString(r1, r5)
            r0.putString(r2, r5)
            r0.putString(r3, r5)
            r0.putString(r4, r5)
            r0.putString(r8, r5)
            r0.putString(r9, r5)
            r0.putString(r10, r5)
            r0.putString(r11, r5)
            r0.putString(r12, r5)
            r0.putString(r13, r5)
            r0.putString(r14, r5)
            r0.putString(r15, r5)
            java.lang.String r1 = "backgroundColor"
            boolean r2 = r0.containsKey(r1)
            if (r2 != 0) goto L_0x0136
            java.lang.String r2 = "bc"
            boolean r3 = r0.containsKey(r2)
            if (r3 != 0) goto L_0x0136
            java.lang.String r3 = "fullscreen"
            java.lang.String r3 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getString(r0, r3)
            java.lang.String r4 = "fullscreen"
            boolean r4 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getBoolean(r0, r4, r7)
            if (r4 != 0) goto L_0x00d5
            r4 = 1
            goto L_0x00d6
        L_0x00d5:
            r4 = 0
        L_0x00d6:
            r5 = 1
            if (r4 == r5) goto L_0x00da
            goto L_0x0136
        L_0x00da:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x00ea
            boolean r3 = r3.equals(r6)     // Catch:{ Exception -> 0x00e7 }
            if (r3 != 0) goto L_0x0136
            goto L_0x00ea
        L_0x00e7:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x00ea:
            java.lang.String r3 = "transAnimate"
            java.lang.String r3 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getString(r0, r3)
            java.lang.String r4 = "transAnimate"
            boolean r4 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getBoolean(r0, r4, r7)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L_0x011c
            int r5 = length
            int r5 = r5 + 79
            int r7 = r5 % 128
            getMax = r7
            int r5 = r5 % 2
            if (r5 != 0) goto L_0x0116
            boolean r3 = r6.equals(r3)
            r5 = 0
            super.hashCode()     // Catch:{ all -> 0x0113 }
            if (r3 != 0) goto L_0x011e
            goto L_0x011c
        L_0x0113:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0116:
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x011e
        L_0x011c:
            if (r4 == 0) goto L_0x0129
        L_0x011e:
            r3 = -1291845632(0xffffffffb3000000, float:-2.9802322E-8)
            r0.putInt(r2, r3)
            r2 = -1291845632(0xffffffffb3000000, float:-2.9802322E-8)
            r0.putInt(r1, r2)
            return
        L_0x0129:
            r3 = 855638016(0x33000000, float:2.9802322E-8)
            r0.putInt(r2, r3)     // Catch:{ Exception -> 0x0134 }
            r2 = 855638016(0x33000000, float:2.9802322E-8)
            r0.putInt(r1, r2)     // Catch:{ Exception -> 0x0134 }
            goto L_0x0136
        L_0x0134:
            r0 = move-exception
            throw r0
        L_0x0136:
            int r0 = length
            int r0 = r0 + 125
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.app.api.ParamUtils.a(android.os.Bundle):void");
    }

    public static Bundle unify(Bundle bundle, String str, boolean z) {
        try {
            boolean z2 = true;
            if (!(f8950a.containsKey(str))) {
                int i = length + 117;
                getMax = i % 128;
                if (i % 2 == 0) {
                    z2 = false;
                }
                if (!z2) {
                    int i2 = 70 / 0;
                }
                return bundle;
            }
            try {
                Bundle unify = f8950a.get(str).unify(bundle, z);
                int i3 = length + 1;
                getMax = i3 % 128;
                int i4 = i3 % 2;
                return unify;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Bundle] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008b, code lost:
        r11 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getString(r10, com.alibaba.ariver.kernel.RVParams.LONG_ALLOWS_BOUNCE_VERTICAL, "");
        com.alibaba.ariver.kernel.common.utils.RVLogger.d("AriverApp.ParamUtils", "merge LONG_ALLOWS_BOUNCE_VERTICAL & LONG_CAN_PULL_DOWN ".concat(java.lang.String.valueOf(r11)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (android.text.TextUtils.isEmpty(r11) != false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b0, code lost:
        if ("YES".equals(r11) == false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r10.putBoolean(com.alibaba.ariver.kernel.RVParams.LONG_CAN_PULL_DOWN, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bc, code lost:
        if ("NO".equals(r11) == false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00be, code lost:
        r11 = getMax + 43;
        length = r11 % 128;
        r11 = r11 % 2;
        r10.putBoolean(com.alibaba.ariver.kernel.RVParams.LONG_CAN_PULL_DOWN, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cc, code lost:
        r2 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getInt(r10, "tabItemCount", -1);
        r7 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getString(r10, "enableTabBar", "default");
        r8 = new java.lang.StringBuilder("tabItemCount ");
        r8.append(r2);
        r8.append(", enableTabBar ");
        r8.append(r7);
        com.alibaba.ariver.kernel.common.utils.RVLogger.d("AriverApp.ParamUtils", r8.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f8, code lost:
        if (android.text.TextUtils.equals("default", r7) == false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fa, code lost:
        if (r2 == -1) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fc, code lost:
        r10.putString("enableTabBar", "YES");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0104, code lost:
        if (android.text.TextUtils.equals("YES", r7) == false) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0106, code lost:
        if (r2 != -1) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0108, code lost:
        r11 = getMax + 119;
        length = r11 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0112, code lost:
        if ((r11 % 2) == 0) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0114, code lost:
        r11 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0116, code lost:
        r11 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0117, code lost:
        r10.putInt("tabItemCount", r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0120, code lost:
        if (r10.containsKey(com.alibaba.ariver.kernel.RVParams.LONG_SHOW_THIRDDISCLAIMER) == false) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0122, code lost:
        com.alibaba.ariver.kernel.common.utils.RVLogger.d("AriverApp.ParamUtils", "parse contains LONG_SHOW_THIRDDISCLAIMER force set true");
        r10.remove(com.alibaba.ariver.kernel.RVParams.LONG_SHOW_THIRDDISCLAIMER);
        r10.putBoolean(com.alibaba.ariver.kernel.RVParams.LONG_SHOW_THIRDDISCLAIMER, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012d, code lost:
        return r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle unifyAll(android.os.Bundle r10, boolean r11) {
        /*
            r0 = 0
            r1 = 1
            if (r10 != 0) goto L_0x000e
            int r10 = length
            int r10 = r10 + r1
            int r11 = r10 % 128
            getMax = r11
            int r10 = r10 % 2
            return r0
        L_0x000e:
            a((android.os.Bundle) r10)
            java.lang.String r2 = "appId"
            java.lang.String r2 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getString(r10, r2)
            java.lang.String r3 = "20000067"
            boolean r2 = r3.equals(r2)
            java.util.Map<java.lang.String, com.alibaba.ariver.app.api.ParamImpl> r3 = f8950a
            java.lang.String r4 = "showProgress"
            java.lang.Object r3 = r3.get(r4)
            com.alibaba.ariver.app.api.ParamImpl r3 = (com.alibaba.ariver.app.api.ParamImpl) r3
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3.setDefaultValue(r2)
            r2 = 0
            if (r11 == 0) goto L_0x0033
            r3 = 1
            goto L_0x0034
        L_0x0033:
            r3 = 0
        L_0x0034:
            if (r3 == 0) goto L_0x003d
            b(r10)     // Catch:{ Exception -> 0x003a }
            goto L_0x003d
        L_0x003a:
            r10 = move-exception
            goto L_0x00cb
        L_0x003d:
            java.util.Map<java.lang.String, com.alibaba.ariver.app.api.ParamImpl> r3 = f8950a
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0047:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x012e }
            r5 = 43
            if (r4 == 0) goto L_0x0052
            r4 = 20
            goto L_0x0054
        L_0x0052:
            r4 = 43
        L_0x0054:
            if (r4 == r5) goto L_0x008b
            int r4 = length
            int r4 = r4 + 89
            int r5 = r4 % 128
            getMax = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x0078
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.util.Map<java.lang.String, com.alibaba.ariver.app.api.ParamImpl> r5 = f8950a
            java.lang.Object r4 = r5.get(r4)
            com.alibaba.ariver.app.api.ParamImpl r4 = (com.alibaba.ariver.app.api.ParamImpl) r4
            android.os.Bundle r10 = r4.unify(r10, r11)
            int r4 = r0.length     // Catch:{ all -> 0x0076 }
            goto L_0x0047
        L_0x0076:
            r10 = move-exception
            throw r10
        L_0x0078:
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.util.Map<java.lang.String, com.alibaba.ariver.app.api.ParamImpl> r5 = f8950a
            java.lang.Object r4 = r5.get(r4)
            com.alibaba.ariver.app.api.ParamImpl r4 = (com.alibaba.ariver.app.api.ParamImpl) r4
            android.os.Bundle r10 = r4.unify(r10, r11)
            goto L_0x0047
        L_0x008b:
            java.lang.String r11 = "allowsBounceVertical"
            java.lang.String r0 = ""
            java.lang.String r11 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getString(r10, r11, r0)
            java.lang.String r0 = java.lang.String.valueOf(r11)
            java.lang.String r3 = "merge LONG_ALLOWS_BOUNCE_VERTICAL & LONG_CAN_PULL_DOWN "
            java.lang.String r0 = r3.concat(r0)
            java.lang.String r3 = "AriverApp.ParamUtils"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r3, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            java.lang.String r4 = "YES"
            if (r0 != 0) goto L_0x00cc
            boolean r0 = r4.equals(r11)
            java.lang.String r6 = "canPullDown"
            if (r0 == 0) goto L_0x00b6
            r10.putBoolean(r6, r1)     // Catch:{ Exception -> 0x012e }
            goto L_0x00cc
        L_0x00b6:
            java.lang.String r0 = "NO"
            boolean r11 = r0.equals(r11)
            if (r11 == 0) goto L_0x00cc
            int r11 = getMax
            int r11 = r11 + r5
            int r0 = r11 % 128
            length = r0
            int r11 = r11 % 2
            r10.putBoolean(r6, r2)
            goto L_0x00cc
        L_0x00cb:
            throw r10
        L_0x00cc:
            r11 = -1
            java.lang.String r0 = "tabItemCount"
            int r2 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getInt(r10, r0, r11)
            java.lang.String r5 = "default"
            java.lang.String r6 = "enableTabBar"
            java.lang.String r7 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getString(r10, r6, r5)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "tabItemCount "
            r8.<init>(r9)
            r8.append(r2)
            java.lang.String r9 = ", enableTabBar "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r3, r8)
            boolean r5 = android.text.TextUtils.equals(r5, r7)
            if (r5 == 0) goto L_0x0100
            if (r2 == r11) goto L_0x011a
            r10.putString(r6, r4)
            goto L_0x011a
        L_0x0100:
            boolean r4 = android.text.TextUtils.equals(r4, r7)
            if (r4 == 0) goto L_0x011a
            if (r2 != r11) goto L_0x011a
            int r11 = getMax
            int r11 = r11 + 119
            int r2 = r11 % 128
            length = r2
            int r11 = r11 % 2
            if (r11 == 0) goto L_0x0116
            r11 = 5
            goto L_0x0117
        L_0x0116:
            r11 = 4
        L_0x0117:
            r10.putInt(r0, r11)
        L_0x011a:
            java.lang.String r11 = "showThirdDisclaimer"
            boolean r0 = r10.containsKey(r11)
            if (r0 == 0) goto L_0x012d
            java.lang.String r0 = "parse contains LONG_SHOW_THIRDDISCLAIMER force set true"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r3, r0)
            r10.remove(r11)
            r10.putBoolean(r11, r1)
        L_0x012d:
            return r10
        L_0x012e:
            r10 = move-exception
            goto L_0x0131
        L_0x0130:
            throw r10
        L_0x0131:
            goto L_0x0130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.app.api.ParamUtils.unifyAll(android.os.Bundle, boolean):android.os.Bundle");
    }

    private static void b(Bundle bundle) {
        boolean z;
        if (!bundle.containsKey("showOptionMenu") && !bundle.containsKey(RVParams.SHOW_OPTION_MENU)) {
            boolean z2 = false;
            boolean z3 = BundleUtils.getBoolean(bundle, RVParams.isH5App, false);
            StringBuilder sb = new StringBuilder("pre-fill set showOptionMenu as ");
            if (!z3) {
                int i = length + 113;
                getMax = i % 128;
                int i2 = i % 2;
                int i3 = getMax + 3;
                length = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
            try {
                sb.append(z);
                try {
                    RVLogger.d("AriverApp.ParamUtils", sb.toString());
                    if ((!z3 ? ']' : 'S') != 'S') {
                        z2 = true;
                    }
                    bundle.putBoolean("showOptionMenu", z2);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    public static void filterCreatePageParams(Bundle bundle) {
        int i = length + 109;
        getMax = i % 128;
        int i2 = i % 2;
        bundle.remove("url");
        bundle.remove("MINI-PROGRAM-WEB-VIEW-TAG");
        RVLogger.d("AriverApp.ParamUtils", "in H5SessionPlugin delete preRpc startparam");
        bundle.remove("preRpc");
        bundle.remove("navSearchBar_type");
        bundle.remove(RVStartParams.KEY_FRAGMENT_TYPE);
        bundle.remove(RVStartParams.KEY_FROM_RELAUNCH);
        bundle.remove("backgroundColor");
        bundle.remove("transparentTitle");
        bundle.remove(RVParams.LONG_TRANSPARENT_TITLE_TEXTAUTO);
        RVLogger.d("AriverApp.ParamUtils", "in H5SessionPlugin delete titleImage startparam");
        bundle.remove("titleImage");
        bundle.remove(RVParams.LONG_BOUNCE_TOP_COLOR);
        bundle.remove("closeAllWindow");
        bundle.remove(RVParams.DISABLE_PAGE_ROUTE);
        int i3 = getMax + 115;
        length = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = null;
            int length2 = objArr.length;
        }
    }

    public static void processTransparent(Bundle bundle) {
        boolean z = false;
        if ((!BundleUtils.getBoolean(bundle, RVStartParams.KEY_TRANSPARENT, false) ? 18 : '2') != '2') {
            int i = BundleUtils.getInt(bundle, "backgroundColor", -16777216);
            if (i != -16777216) {
                z = true;
            }
            if (z) {
                bundle.putInt("backgroundColor", i | -16777216);
                int i2 = length + 75;
                getMax = i2 % 128;
                int i3 = i2 % 2;
            }
        }
        int i4 = getMax + 47;
        length = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if ((com.alibaba.ariver.kernel.common.utils.BundleUtils.getBoolean(r4, com.alibaba.ariver.kernel.RVStartParams.KEY_TRANS_ANIMATE, true) ? ')' : '1') != ')') goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (com.alibaba.ariver.kernel.common.utils.BundleUtils.getBoolean(r4, com.alibaba.ariver.kernel.RVStartParams.KEY_TRANS_ANIMATE, false) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isShowTransAnimate(android.os.Bundle r4) {
        /*
            r0 = 0
            java.lang.String r1 = "transparent"
            boolean r1 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getBoolean(r4, r1, r0)
            if (r1 == 0) goto L_0x0046
            int r1 = getMax
            int r1 = r1 + 75
            int r2 = r1 % 128
            length = r2
            int r1 = r1 % 2
            r2 = 1
            if (r1 == 0) goto L_0x0018
            r1 = 1
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            java.lang.String r3 = "transAnimate"
            if (r1 == 0) goto L_0x002d
            boolean r4 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getBoolean(r4, r3, r2)
            r1 = 41
            if (r4 == 0) goto L_0x0028
            r4 = 41
            goto L_0x002a
        L_0x0028:
            r4 = 49
        L_0x002a:
            if (r4 == r1) goto L_0x0033
            goto L_0x0046
        L_0x002d:
            boolean r4 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getBoolean(r4, r3, r0)
            if (r4 == 0) goto L_0x0046
        L_0x0033:
            int r4 = length
            int r4 = r4 + 39
            int r1 = r4 % 128
            getMax = r1
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x0045
            r4 = 99
            int r4 = r4 / r0
            return r2
        L_0x0043:
            r4 = move-exception
            throw r4
        L_0x0045:
            return r2
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.app.api.ParamUtils.isShowTransAnimate(android.os.Bundle):boolean");
    }

    public static boolean transparentBackground(Bundle bundle) {
        if (!TextUtils.isEmpty(BundleUtils.getString(bundle, RVStartParams.KEY_BACKGROUND_IMAGE_URL))) {
            int i = getMax + 97;
            length = i % 128;
            int i2 = i % 2;
            return true;
        }
        int i3 = getMax + 81;
        length = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022 A[Catch:{ Exception -> 0x004f }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024 A[Catch:{ Exception -> 0x004f }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028 A[Catch:{ Exception -> 0x004f }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0027 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.alibaba.ariver.app.api.ParamImpl a(java.lang.String r7) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 90
            if (r0 == 0) goto L_0x000b
            r0 = 90
            goto L_0x000d
        L_0x000b:
            r0 = 87
        L_0x000d:
            r2 = 0
            r3 = 0
            if (r0 == r1) goto L_0x0051
            java.util.Map<java.lang.String, com.alibaba.ariver.app.api.ParamImpl> r0 = f8950a
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x004f }
            r4 = 1
            if (r1 == 0) goto L_0x0024
            r1 = 1
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            if (r1 == r4) goto L_0x0028
            return r2
        L_0x0028:
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x004f }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x004f }
            java.util.Map<java.lang.String, com.alibaba.ariver.app.api.ParamImpl> r5 = f8950a     // Catch:{ Exception -> 0x004f }
            java.lang.Object r1 = r5.get(r1)     // Catch:{ Exception -> 0x004f }
            com.alibaba.ariver.app.api.ParamImpl r1 = (com.alibaba.ariver.app.api.ParamImpl) r1     // Catch:{ Exception -> 0x004f }
            java.lang.String r5 = r1.getLongName()     // Catch:{ Exception -> 0x004f }
            java.lang.String r6 = r1.getShortName()     // Catch:{ Exception -> 0x004f }
            boolean r5 = r7.equals(r5)     // Catch:{ Exception -> 0x004f }
            if (r5 != 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r4 = 0
        L_0x0046:
            if (r4 == 0) goto L_0x004e
            boolean r4 = r7.equals(r6)
            if (r4 == 0) goto L_0x001b
        L_0x004e:
            return r1
        L_0x004f:
            r7 = move-exception
            throw r7
        L_0x0051:
            int r7 = length
            int r7 = r7 + 21
            int r0 = r7 % 128
            getMax = r0
            int r7 = r7 % 2
            int r7 = getMax
            int r7 = r7 + 43
            int r0 = r7 % 128
            length = r0
            int r7 = r7 % 2
            r0 = 14
            if (r7 == 0) goto L_0x006c
            r7 = 93
            goto L_0x006e
        L_0x006c:
            r7 = 14
        L_0x006e:
            if (r7 == r0) goto L_0x0076
            r7 = 56
            int r7 = r7 / r3
            return r2
        L_0x0074:
            r7 = move-exception
            throw r7
        L_0x0076:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.app.api.ParamUtils.a(java.lang.String):com.alibaba.ariver.app.api.ParamImpl");
    }

    public static void remove(Bundle bundle, String str) {
        try {
            int i = length + 25;
            getMax = i % 128;
            int i2 = i % 2;
            if ((bundle != null) && !TextUtils.isEmpty(str)) {
                ParamImpl a2 = a(str);
                if ((a2 != null ? '1' : 13) == '1') {
                    try {
                        bundle.remove(a2.getLongName());
                        bundle.remove(a2.getShortName());
                        int i3 = getMax + 39;
                        length = i3 % 128;
                        int i4 = i3 % 2;
                    } catch (Exception e) {
                        throw e;
                    }
                }
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.Map<java.lang.String, java.lang.String>, java.lang.Object, java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        if (android.text.TextUtils.isEmpty(r19) != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r0 = com.alibaba.ariver.kernel.common.utils.UrlUtils.getParam(com.alibaba.ariver.kernel.common.utils.UrlUtils.parseUrl(r19), "__webview_options__", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        com.alibaba.ariver.kernel.common.utils.RVLogger.w("AriverApp.ParamUtils", "no magic options found");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
        com.alibaba.ariver.kernel.common.utils.RVLogger.d("AriverApp.ParamUtils", "found magic options ".concat(java.lang.String.valueOf(r0)));
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r0 = java.net.URLDecoder.decode(r0, setMin(-1 - android.text.TextUtils.indexOf("", '0'), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 5, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1)).intern());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        com.alibaba.ariver.kernel.common.utils.RVLogger.e("AriverApp.ParamUtils", "magic options decode exp ", r0);
        r0 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r0 != false) goto L_0x0024;
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.String> parseMagicOptions(java.lang.String r19, boolean r20) {
        /*
            java.lang.String r1 = ""
            int r0 = getMax     // Catch:{ Exception -> 0x0166 }
            int r0 = r0 + 53
            int r2 = r0 % 128
            length = r2
            r2 = 2
            int r0 = r0 % r2
            java.lang.String r3 = "AriverApp.ParamUtils"
            r4 = 0
            if (r0 == 0) goto L_0x001e
            boolean r0 = android.text.TextUtils.isEmpty(r19)
            super.hashCode()     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x002a
            goto L_0x0024
        L_0x001b:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x001e:
            boolean r0 = android.text.TextUtils.isEmpty(r19)
            if (r0 == 0) goto L_0x002a
        L_0x0024:
            java.lang.String r0 = "no url found in magic parameter"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r3, r0)
            return r4
        L_0x002a:
            android.net.Uri r0 = com.alibaba.ariver.kernel.common.utils.UrlUtils.parseUrl(r19)     // Catch:{ Exception -> 0x0166 }
            java.lang.String r5 = "__webview_options__"
            java.lang.String r0 = com.alibaba.ariver.kernel.common.utils.UrlUtils.getParam(r0, r5, r4)     // Catch:{ Exception -> 0x0166 }
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0166 }
            if (r5 == 0) goto L_0x0040
            java.lang.String r0 = "no magic options found"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r3, r0)
            return r4
        L_0x0040:
            java.lang.String r5 = java.lang.String.valueOf(r0)
            java.lang.String r6 = "found magic options "
            java.lang.String r5 = r6.concat(r5)
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r3, r5)
            r5 = 0
            r7 = 48
            r8 = 0
            int r9 = android.text.TextUtils.indexOf(r1, r7)     // Catch:{ all -> 0x0077 }
            int r9 = -1 - r9
            long r10 = android.widget.ExpandableListView.getPackedPositionForGroup(r8)     // Catch:{ all -> 0x0077 }
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            int r12 = r12 + 5
            float r10 = android.media.AudioTrack.getMaxVolume()     // Catch:{ all -> 0x0077 }
            r11 = 0
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            int r10 = r10 + -1
            char r10 = (char) r10     // Catch:{ all -> 0x0077 }
            java.lang.String r9 = setMin(r9, r12, r10)     // Catch:{ all -> 0x0077 }
            java.lang.String r9 = r9.intern()     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r9)     // Catch:{ all -> 0x0077 }
            goto L_0x007e
        L_0x0077:
            r0 = move-exception
            java.lang.String r9 = "magic options decode exp "
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r3, r9, r0)
            r0 = r4
        L_0x007e:
            boolean r9 = android.text.TextUtils.isEmpty(r0)
            r10 = 88
            if (r9 == 0) goto L_0x0089
            r9 = 50
            goto L_0x008b
        L_0x0089:
            r9 = 88
        L_0x008b:
            if (r9 == r10) goto L_0x00a6
            int r0 = getMax
            int r0 = r0 + 67
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % r2
            java.lang.String r1 = "failed to decode magic options"
            if (r0 == 0) goto L_0x00a2
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r3, (java.lang.String) r1)
            int r0 = r4.length     // Catch:{ all -> 0x009f }
            goto L_0x00a5
        L_0x009f:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x00a2:
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r3, (java.lang.String) r1)
        L_0x00a5:
            return r4
        L_0x00a6:
            java.lang.String r9 = "&"
            java.lang.String[] r0 = r0.split(r9)     // Catch:{ Exception -> 0x015b }
            if (r0 == 0) goto L_0x0159
            int r9 = r0.length     // Catch:{ Exception -> 0x015b }
            if (r9 != 0) goto L_0x00b3
            goto L_0x0159
        L_0x00b3:
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ Exception -> 0x015b }
            r9.<init>()     // Catch:{ Exception -> 0x015b }
            int r10 = r0.length     // Catch:{ Exception -> 0x015b }
            r11 = 0
        L_0x00ba:
            if (r11 >= r10) goto L_0x0158
            r12 = r0[r11]     // Catch:{ Exception -> 0x015b }
            java.lang.String r13 = "="
            java.lang.String[] r12 = r12.split(r13)     // Catch:{ Exception -> 0x015b }
            int r13 = r12.length     // Catch:{ Exception -> 0x015b }
            r14 = 1
            if (r13 >= r2) goto L_0x00ca
            r13 = 1
            goto L_0x00cb
        L_0x00ca:
            r13 = 0
        L_0x00cb:
            if (r13 == r14) goto L_0x0114
            r13 = r12[r8]     // Catch:{ Exception -> 0x015b }
            int r15 = android.view.ViewConfiguration.getKeyRepeatDelay()     // Catch:{ Exception -> 0x015b }
            int r15 = r15 >> 16
            long r16 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ Exception -> 0x015b }
            int r18 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            int r4 = r18 + 4
            int r17 = android.view.ViewConfiguration.getPressedStateDuration()     // Catch:{ Exception -> 0x0111 }
            int r5 = r17 >> 16
            char r5 = (char) r5     // Catch:{ Exception -> 0x0111 }
            java.lang.String r4 = setMin(r15, r4, r5)     // Catch:{ Exception -> 0x0111 }
            java.lang.String r4 = r4.intern()     // Catch:{ Exception -> 0x0111 }
            java.lang.String r4 = java.net.URLDecoder.decode(r13, r4)     // Catch:{ Exception -> 0x0111 }
            r5 = r12[r14]     // Catch:{ Exception -> 0x0111 }
            int r6 = android.view.KeyEvent.getDeadChar(r8, r8)     // Catch:{ Exception -> 0x0111 }
            int r12 = android.text.TextUtils.indexOf(r1, r7, r8)     // Catch:{ Exception -> 0x0111 }
            int r12 = r12 + 6
            int r13 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ Exception -> 0x0111 }
            char r13 = (char) r13     // Catch:{ Exception -> 0x0111 }
            java.lang.String r6 = setMin(r6, r12, r13)     // Catch:{ Exception -> 0x0111 }
            java.lang.String r6 = r6.intern()     // Catch:{ Exception -> 0x0111 }
            java.lang.String r5 = java.net.URLDecoder.decode(r5, r6)     // Catch:{ Exception -> 0x0111 }
            r9.put(r4, r5)     // Catch:{ Exception -> 0x0111 }
            goto L_0x0128
        L_0x0111:
            r0 = move-exception
            r1 = 0
            goto L_0x015d
        L_0x0114:
            int r4 = getMax
            int r4 = r4 + 103
            int r5 = r4 % 128
            length = r5
            int r4 = r4 % r2
            r4 = 93
            if (r20 == 0) goto L_0x0124
            r5 = 93
            goto L_0x0126
        L_0x0124:
            r5 = 72
        L_0x0126:
            if (r5 == r4) goto L_0x012b
        L_0x0128:
            r12 = 0
            goto L_0x014f
        L_0x012b:
            r4 = r12[r8]     // Catch:{ Exception -> 0x0111 }
            long r5 = android.widget.ExpandableListView.getPackedPositionForGroup(r8)     // Catch:{ Exception -> 0x0111 }
            r12 = 0
            int r15 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            int r5 = android.text.AndroidCharacter.getEastAsianWidth(r7)     // Catch:{ Exception -> 0x0111 }
            int r5 = r5 + r14
            int r6 = android.text.TextUtils.getCapsMode(r1, r8, r8)     // Catch:{ Exception -> 0x0111 }
            char r6 = (char) r6     // Catch:{ Exception -> 0x0111 }
            java.lang.String r5 = setMin(r15, r5, r6)     // Catch:{ Exception -> 0x0111 }
            java.lang.String r5 = r5.intern()     // Catch:{ Exception -> 0x0111 }
            java.lang.String r4 = java.net.URLDecoder.decode(r4, r5)     // Catch:{ Exception -> 0x0111 }
            r5 = 0
            r9.put(r4, r5)     // Catch:{ Exception -> 0x0155 }
        L_0x014f:
            int r11 = r11 + 1
            r5 = r12
            r4 = 0
            goto L_0x00ba
        L_0x0155:
            r0 = move-exception
            r1 = r5
            goto L_0x015d
        L_0x0158:
            return r9
        L_0x0159:
            r1 = r4
            return r1
        L_0x015b:
            r0 = move-exception
            r1 = r4
        L_0x015d:
            java.lang.String r2 = "failed to decode magic option."
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r3, r2, r0)
            return r1
        L_0x0163:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0166:
            r0 = move-exception
            goto L_0x0169
        L_0x0168:
            throw r0
        L_0x0169:
            goto L_0x0168
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.app.api.ParamUtils.parseMagicOptions(java.lang.String, boolean):java.util.Map");
    }

    public static void parseMagicOptions(Bundle bundle, String str) {
        Map<String, String> parseMagicOptions = parseMagicOptions(str, false);
        if (parseMagicOptions != null) {
            int i = getMax + 97;
            length = i % 128;
            int i2 = i % 2;
            if (!parseMagicOptions.isEmpty()) {
                try {
                    try {
                        int i3 = length + 29;
                        getMax = i3 % 128;
                        int i4 = i3 % 2;
                        for (Map.Entry next : parseMagicOptions.entrySet()) {
                            int i5 = length + 37;
                            getMax = i5 % 128;
                            int i6 = i5 % 2;
                            String str2 = (String) next.getKey();
                            String str3 = (String) next.getValue();
                            if ((!TextUtils.isEmpty(str3) ? 'Y' : 29) != 29) {
                                int i7 = getMax + 59;
                                length = i7 % 128;
                                if (i7 % 2 != 0) {
                                    boolean equals = RVParams.DELAY_RENDER.equals(str2);
                                    Object obj = null;
                                    super.hashCode();
                                    if (equals) {
                                    }
                                } else if (RVParams.DELAY_RENDER.equals(str2)) {
                                }
                                if ((!RVParams.LONG_DELAY_RENDER.equals(str2) ? 'b' : 'Q') == 'b') {
                                    if (!"tt".equals(str2) && !RVStartParams.KEY_TRANSPARENT.equals(str2)) {
                                        remove(bundle, str2);
                                        bundle.putString(str2, str3);
                                        StringBuilder sb = new StringBuilder("decode magic option [key] ");
                                        sb.append(str2);
                                        sb.append(" [value] ");
                                        sb.append(str3);
                                        RVLogger.d("AriverApp.ParamUtils", sb.toString());
                                    }
                                }
                            }
                        }
                        if (bundle.containsKey(RVParams.LONG_SHOW_THIRDDISCLAIMER)) {
                            int i8 = getMax + 59;
                            length = i8 % 128;
                            if ((i8 % 2 != 0 ? '^' : ';') != ';') {
                                RVLogger.d("AriverApp.ParamUtils", "parseMagicOptions contains LONG_SHOW_THIRDDISCLAIMER force set true");
                                bundle.remove(RVParams.LONG_SHOW_THIRDDISCLAIMER);
                                bundle.putBoolean(RVParams.LONG_SHOW_THIRDDISCLAIMER, false);
                                return;
                            }
                            RVLogger.d("AriverApp.ParamUtils", "parseMagicOptions contains LONG_SHOW_THIRDDISCLAIMER force set true");
                            bundle.remove(RVParams.LONG_SHOW_THIRDDISCLAIMER);
                            bundle.putBoolean(RVParams.LONG_SHOW_THIRDDISCLAIMER, true);
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    RVLogger.e("AriverApp.ParamUtils", "failed to decode magic option.", e2);
                }
            }
        }
    }

    public static void mergeParams(Bundle bundle, JSONObject jSONObject) {
        if (jSONObject != null && !jSONObject.isEmpty()) {
            for (String next : jSONObject.keySet()) {
                try {
                    ParamImpl a2 = a(next);
                    if (a2 == null || (bundle.get(a2.getLongName()) == null && bundle.get(a2.getShortName()) == null)) {
                        Object obj = jSONObject.get(next);
                        boolean z = false;
                        if (obj instanceof String) {
                            String str = (String) obj;
                            if (bundle.containsKey(next)) {
                                z = true;
                            }
                            if (z && !TextUtils.isEmpty(BundleUtils.getString(bundle, next))) {
                                StringBuilder sb = new StringBuilder("bundle contain ");
                                sb.append(next);
                                sb.append(" value:");
                                sb.append(BundleUtils.getString(bundle, next));
                                sb.append(" not to merge appInfo");
                                RVLogger.d("AriverApp.ParamUtils", sb.toString());
                            } else {
                                bundle.putString(next, str);
                            }
                        } else if (obj instanceof Boolean) {
                            int i = getMax + 37;
                            length = i % 128;
                            int i2 = i % 2;
                            bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                        } else if (obj instanceof BigDecimal) {
                            bundle.putDouble(next, ((BigDecimal) obj).doubleValue());
                            int i3 = getMax + 65;
                            length = i3 % 128;
                            int i4 = i3 % 2;
                        } else if (obj instanceof Integer) {
                            bundle.putInt(next, ((Integer) obj).intValue());
                        } else {
                            if ((obj instanceof JSONObject ? 11 : 'D') == 11) {
                                bundle.putString(next, ((JSONObject) obj).toString());
                            } else if (obj instanceof JSONArray) {
                                int i5 = getMax + 83;
                                length = i5 % 128;
                                if (i5 % 2 != 0) {
                                    z = true;
                                }
                                if (z) {
                                    bundle.putString(next, ((JSONArray) obj).toString());
                                    Object obj2 = null;
                                    super.hashCode();
                                } else {
                                    try {
                                        bundle.putString(next, ((JSONArray) obj).toString());
                                    } catch (Exception e) {
                                        throw e;
                                    }
                                }
                                int i6 = getMax + 91;
                                length = i6 % 128;
                                int i7 = i6 % 2;
                            } else {
                                continue;
                            }
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder("merge config [key] ");
                        sb2.append(next);
                        sb2.append(" already exists and value not empty");
                        RVLogger.d("AriverApp.ParamUtils", sb2.toString());
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
    }

    private static String setMin(int i, int i2, char c) {
        int i3 = length + 121;
        getMax = i3 % 128;
        if (i3 % 2 == 0) {
        }
        int i4 = 0;
        char[] cArr = new char[i2];
        while (true) {
            if ((i4 < i2 ? (char) 5 : 3) == 3) {
                return new String(cArr);
            }
            int i5 = getMax + 119;
            length = i5 % 128;
            int i6 = i5 % 2;
            cArr[i4] = (char) ((int) ((((long) setMax[i + i4]) ^ (((long) i4) * setMin)) ^ ((long) c)));
            i4++;
        }
    }
}
