package com.iap.ac.android.acs.plugin.downgrade.jsapi;

import com.iap.ac.android.acs.plugin.downgrade.jsapi.interceptor.IAPNotFoundJSAPIInterceptor;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeUtils;
import com.iap.ac.android.common.container.WebContainer;
import com.iap.ac.android.common.log.ACLog;

public class IAPJSAPIInterceptorManager {
    private static final String TAG = ApiDowngradeUtils.logTag("IAPNotFoundJSAPIInterceptorManager");
    private static volatile IAPJSAPIInterceptorManager sInstance;

    private IAPJSAPIInterceptorManager() {
    }

    public static IAPJSAPIInterceptorManager getInstance() {
        if (sInstance == null) {
            synchronized (IAPJSAPIInterceptorManager.class) {
                if (sInstance == null) {
                    sInstance = new IAPJSAPIInterceptorManager();
                }
            }
        }
        return sInstance;
    }

    public void init() {
        ACLog.d(TAG, "init the interceptor of implemented jsapi and the not found jsapi");
        registerJSAPIInterceptor();
        WebContainer.getInstance("ac_biz").registerNotFoundJSAPIInterceptor(new IAPNotFoundJSAPIInterceptor());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0085 A[LOOP:0: B:22:0x007f->B:24:0x0085, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void registerJSAPIInterceptor() {
        /*
            r7 = this;
            com.iap.ac.android.acs.plugin.downgrade.jsapi.interceptor.IAPImplementedJSAPIInterceptor r0 = new com.iap.ac.android.acs.plugin.downgrade.jsapi.interceptor.IAPImplementedJSAPIInterceptor
            r0.<init>()
            com.iap.ac.android.biz.common.ACManager r1 = com.iap.ac.android.biz.common.ACManager.getInstance()
            android.content.Context r1 = r1.getContext()
            com.iap.ac.android.biz.common.ACManager r2 = com.iap.ac.android.biz.common.ACManager.getInstance()
            java.lang.String r2 = r2.getAppId()
            com.iap.ac.android.acs.plugin.downgrade.jsapi.JSAPIRegisterBean r1 = com.iap.ac.android.acs.plugin.downgrade.jsapi.JSAPIRegisterUtils.getJSAPIRegisterList(r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List<java.lang.String> r3 = com.iap.ac.android.acs.plugin.utils.Constants.JS_API_LIST
            r2.<init>(r3)
            java.lang.String r3 = r1.tag
            int r4 = r3.hashCode()
            r5 = -1123558146(0xffffffffbd07dcfe, float:-0.03316974)
            r6 = 1
            if (r4 == r5) goto L_0x004b
            r5 = 772975380(0x2e12ab14, float:3.3348505E-11)
            if (r4 == r5) goto L_0x0041
            r5 = 1571022414(0x5da3e64e, float:1.4762766E18)
            if (r4 == r5) goto L_0x0037
            goto L_0x0055
        L_0x0037:
            java.lang.String r4 = "NOT_CONFIG"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0055
            r3 = 2
            goto L_0x0056
        L_0x0041:
            java.lang.String r4 = "WHITE_LIST"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0055
            r3 = 1
            goto L_0x0056
        L_0x004b:
            java.lang.String r4 = "BLACK_LIST"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0055
            r3 = 0
            goto L_0x0056
        L_0x0055:
            r3 = -1
        L_0x0056:
            if (r3 == 0) goto L_0x006f
            if (r3 == r6) goto L_0x0062
            java.lang.String r1 = "IAPConnectPlugin"
            java.lang.String r3 = "IAPJSAPIInterceptorManager#init: defaule load, register all jsapi."
            com.iap.ac.android.common.log.ACLog.d(r1, r3)
            goto L_0x007b
        L_0x0062:
            java.util.List<java.lang.String> r1 = r1.registerList
            java.lang.String r3 = java.lang.String.valueOf(r1)
            com.iap.ac.android.acs.plugin.utils.MonitorUtil.monitorJSAPIWhiteList(r3)
            r2.retainAll(r1)
            goto L_0x007b
        L_0x006f:
            java.util.List<java.lang.String> r1 = r1.registerList
            java.lang.String r3 = java.lang.String.valueOf(r1)
            com.iap.ac.android.acs.plugin.utils.MonitorUtil.monitorJSAPIBlackList(r3)
            r2.removeAll(r1)
        L_0x007b:
            java.util.Iterator r1 = r2.iterator()
        L_0x007f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0095
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "ac_biz"
            com.iap.ac.android.common.container.IContainer r4 = com.iap.ac.android.common.container.WebContainer.getInstance(r4)
            r4.registerJSAPIInterceptor(r3, r0)
            goto L_0x007f
        L_0x0095:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            com.iap.ac.android.acs.plugin.utils.MonitorUtil.monitorJSAPIRegisterList(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.acs.plugin.downgrade.jsapi.IAPJSAPIInterceptorManager.registerJSAPIInterceptor():void");
    }
}
