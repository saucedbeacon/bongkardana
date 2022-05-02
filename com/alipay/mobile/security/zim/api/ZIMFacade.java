package com.alipay.mobile.security.zim.api;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.alibaba.fastjson.JSON;
import com.alipay.bis.common.service.facade.gw.zim.ZimInitGwResponse;
import com.alipay.mobile.security.bio.api.BioDetectorBuilder;
import com.alipay.mobile.security.bio.runtime.Runtime;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.local.apsecurity.ApSecurityService;
import com.alipay.mobile.security.bio.service.local.monitorlog.MonitorLogService;
import com.alipay.mobile.security.zim.biz.RecordProcessor;
import com.alipay.mobile.security.zim.biz.ZimComponentCallbacks;
import com.alipay.mobile.security.zim.info.AppDataProvider;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import java.util.HashMap;
import java.util.Map;

public abstract class ZIMFacade {
    public static final int COMMAND_CANCLE = 4099;
    public static final int COMMAND_SERVER_CONTINUE = 4098;
    public static final int COMMAND_SERVER_FAIL = 8193;
    public static final int COMMAND_SERVER_RETRY = 8194;
    public static final int COMMAND_SERVER_SUCCESS = 4097;
    public static final int COMMAND_VALIDATE_FAIL = 4100;
    public static final String KEY_AUTO_CLOSE = "zimAutoClose";
    public static final String KEY_AVATAR = "avatar";
    public static final String KEY_BIO_ACTION = "zimAction";
    public static final String KEY_BIZ_DATA = "bizData";
    public static final String KEY_CERT_NAME = "certName";
    public static final String KEY_CERT_NO = "certNo";
    public static final String KEY_ENV_NAME = "env_name";
    public static final String KEY_FACE_PAY_INFO = "facepayInfoMap";
    public static final String KEY_FACE_TOKEN = "ftoken";
    public static final String KEY_INIT_RESP = "zimInitResp";
    public static final String KEY_INIT_RESP_OLD = "zim.init.resp";
    public static final String KEY_LOCALE = "locale";
    public static final String KEY_PUBLIC_KEY_PROD = "public_key_prod";
    public static final String KEY_PUBLIC_KEY_TEST = "public_key_test";
    public static final String KEY_ZIM_MSG_CHANNEL = "zimMessageChannel";
    public static final String TAG = "ZimPlatform";
    protected static Map<String, Object> mCustomEnvs = new HashMap();

    public abstract void command(int i);

    public abstract void destroy();

    public abstract void init(String str, ZimInitGwResponse zimInitGwResponse, Map<String, String> map, ZIMCallback zIMCallback);

    public abstract void init(String str, ZimInitGwResponse zimInitGwResponse, Map<String, String> map, ZimMessageChannel zimMessageChannel, ZIMCallback zIMCallback);

    public abstract ZimInitGwResponse parse(String str);

    public abstract void retry();

    public abstract void retry(String str);

    public abstract void verify(String str, ZimInitGwResponse zimInitGwResponse, Map<String, String> map, ZIMCallback zIMCallback);

    public abstract void verify(String str, ZimInitGwResponse zimInitGwResponse, Map<String, String> map, ZimMessageChannel zimMessageChannel, ZIMCallback zIMCallback);

    public abstract void verify(String str, Map<String, String> map, ZIMCallback zIMCallback);

    public abstract void verify(String str, Map<String, String> map, ZimMessageChannel zimMessageChannel, ZIMCallback zIMCallback);

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void initEnv(android.content.Context r2, java.lang.String r3) {
        /*
            boolean r0 = com.alipay.mobile.security.bio.utils.DeviceUtil.isDebug(r2)
            if (r0 != 0) goto L_0x0007
            r3 = 0
        L_0x0007:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x002e
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x002d, all -> 0x002b }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ NameNotFoundException -> 0x002d, all -> 0x002b }
            r1 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r0.getApplicationInfo(r2, r1)     // Catch:{ NameNotFoundException -> 0x002d, all -> 0x002b }
            if (r2 == 0) goto L_0x002e
            android.os.Bundle r0 = r2.metaData     // Catch:{ NameNotFoundException -> 0x002d, all -> 0x002b }
            if (r0 == 0) goto L_0x002e
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x002d, all -> 0x002b }
            java.lang.String r0 = "env_name"
            java.lang.String r2 = r2.getString(r0)     // Catch:{ NameNotFoundException -> 0x002d, all -> 0x002b }
            r3 = r2
            goto L_0x002e
        L_0x002b:
            r2 = move-exception
            throw r2
        L_0x002d:
        L_0x002e:
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 == 0) goto L_0x0036
            java.lang.String r3 = "online"
        L_0x0036:
            com.alipay.mobile.security.bio.workspace.Env r2 = com.alipay.mobile.security.bio.workspace.Env.getEnvByName(r3)
            if (r2 == 0) goto L_0x003f
            com.alipay.mobile.security.bio.service.BioServiceManager.setEnv(r2)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.zim.api.ZIMFacade.initEnv(android.content.Context, java.lang.String):void");
    }

    public static void install(Context context, Map<String, Object> map) {
        if (map != null && map.containsKey(KEY_ENV_NAME)) {
            initEnv(context, (String) map.remove(KEY_ENV_NAME));
        }
        install(context);
    }

    public static void install(Context context) {
        MonitorLogService monitorLogService = (MonitorLogService) BioServiceManager.getLocalService(context, MonitorLogService.class);
        if (monitorLogService != null) {
            monitorLogService.install(context);
        }
        ApSecurityService apSecurityService = (ApSecurityService) BioServiceManager.getLocalService(context, ApSecurityService.class);
        if (apSecurityService != null) {
            apSecurityService.init(context);
        }
        if (!Runtime.isRunningOnQuinox(context)) {
            ZimComponentCallbacks.getInstance((Application) context.getApplicationContext());
        }
    }

    public static ZIMMetaInfo getZimMetaInfo(Context context) {
        return getZimMetaInfo(context, (Map<String, Object>) null);
    }

    public static ZIMMetaInfo getZimMetaInfo(Context context, Map<String, Object> map) {
        AnonymousClass1 r0 = new AppDataProvider() {
            public final String getDeviceType() {
                return "android";
            }

            public final String getApdidToken(Context context) {
                return ZIMFacade.getApDidToken(context);
            }

            public final String getDeviceModel() {
                return Build.MODEL;
            }

            public final String getAppName(Context context) {
                return context == null ? "" : context.getPackageName();
            }

            public final String getAppVersion(Context context) {
                try {
                    return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException unused) {
                    return "";
                }
            }

            public final String getOsVersion() {
                return Build.VERSION.RELEASE;
            }
        };
        ZIMMetaInfo zIMMetaInfo = new ZIMMetaInfo();
        zIMMetaInfo.setApdidToken(r0.getApdidToken(context));
        zIMMetaInfo.setAppName(r0.getAppName(context));
        zIMMetaInfo.setAppVersion(r0.getAppVersion(context));
        zIMMetaInfo.setDeviceModel(r0.getDeviceModel());
        zIMMetaInfo.setDeviceType(r0.getDeviceType());
        zIMMetaInfo.setOsVersion(r0.getOsVersion());
        zIMMetaInfo.setBioMetaInfo(BioDetectorBuilder.getMetaInfos(context, map));
        zIMMetaInfo.setBuildVersion("7.0.0.200909163736");
        return zIMMetaInfo;
    }

    public static String getMetaInfos(Context context) {
        return getMetaInfos(context, (Map<String, Object>) null);
    }

    public static String getMetaInfos(Context context, Map<String, Object> map) {
        return getMetaInfos(context, map, true);
    }

    protected static String getMetaInfos(Context context, Map<String, Object> map, boolean z) {
        if (z) {
            RecordProcessor.createInstance(context);
        }
        try {
            return JSON.toJSONString(getZimMetaInfo(context, map));
        } catch (Throwable unused) {
            return "";
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x006c, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x00b3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getApDidToken(android.content.Context r8) {
        /*
            boolean r0 = com.alipay.mobile.security.bio.runtime.Runtime.isRunningOnQuinox(r8)
            java.lang.String r1 = "getInstance"
            r2 = 1
            r3 = 0
            java.lang.String r4 = ""
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = "com.alipay.mobile.framework.LauncherApplicationAgent"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x006f }
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ all -> 0x006f }
            java.lang.reflect.Method r1 = r0.getMethod(r1, r5)     // Catch:{ all -> 0x006f }
            r1.setAccessible(r2)     // Catch:{ all -> 0x006f }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x006f }
            java.lang.Object r1 = r1.invoke(r1, r5)     // Catch:{ all -> 0x006f }
            java.lang.String r5 = "getMicroApplicationContext"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ all -> 0x006f }
            java.lang.reflect.Method r0 = r0.getMethod(r5, r6)     // Catch:{ all -> 0x006f }
            r0.setAccessible(r2)     // Catch:{ all -> 0x006f }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x006f }
            java.lang.Object r0 = r0.invoke(r1, r5)     // Catch:{ all -> 0x006f }
            java.lang.Class r1 = r0.getClass()     // Catch:{ all -> 0x006f }
            java.lang.String r5 = "findServiceByInterface"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ all -> 0x006f }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r3] = r7     // Catch:{ all -> 0x006f }
            java.lang.reflect.Method r1 = r1.getMethod(r5, r6)     // Catch:{ all -> 0x006f }
            r1.setAccessible(r2)     // Catch:{ all -> 0x006f }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x006f }
            java.lang.String r6 = "com.alipay.apmobilesecuritysdk.DeviceFingerprintService"
            r5[r3] = r6     // Catch:{ all -> 0x006f }
            java.lang.Object r0 = r1.invoke(r0, r5)     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x00b9
            java.lang.Class r1 = r0.getClass()     // Catch:{ all -> 0x006f }
            java.lang.String r5 = "getApdidToken"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ all -> 0x006f }
            java.lang.reflect.Method r1 = r1.getMethod(r5, r6)     // Catch:{ all -> 0x006f }
            r1.setAccessible(r2)     // Catch:{ all -> 0x006f }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x006f }
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch:{ all -> 0x006f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x006f }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x006f }
            if (r1 != 0) goto L_0x00b9
            goto L_0x00b3
        L_0x006f:
            r0 = move-exception
            r0.getMessage()
            goto L_0x00b9
        L_0x0074:
            java.lang.String r0 = "com.alipay.deviceid.DeviceTokenClient"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x00b5 }
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ all -> 0x00b5 }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r3] = r6     // Catch:{ all -> 0x00b5 }
            java.lang.reflect.Method r1 = r0.getMethod(r1, r5)     // Catch:{ all -> 0x00b5 }
            r1.setAccessible(r2)     // Catch:{ all -> 0x00b5 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x00b5 }
            r5[r3] = r8     // Catch:{ all -> 0x00b5 }
            java.lang.Object r1 = r1.invoke(r1, r5)     // Catch:{ all -> 0x00b5 }
            java.lang.String r5 = "getTokenResult"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ all -> 0x00b5 }
            java.lang.reflect.Method r0 = r0.getMethod(r5, r6)     // Catch:{ all -> 0x00b5 }
            r0.setAccessible(r2)     // Catch:{ all -> 0x00b5 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00b5 }
            java.lang.Object r0 = r0.invoke(r1, r3)     // Catch:{ all -> 0x00b5 }
            java.lang.Class r1 = r0.getClass()     // Catch:{ all -> 0x00b5 }
            java.lang.String r3 = "apdidToken"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch:{ all -> 0x00b5 }
            r1.setAccessible(r2)     // Catch:{ all -> 0x00b5 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00b5 }
        L_0x00b3:
            r4 = r0
            goto L_0x00b9
        L_0x00b5:
            r0 = move-exception
            r0.getMessage()
        L_0x00b9:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x00cd
            java.lang.Class<com.alipay.mobile.security.bio.service.local.apsecurity.ApSecurityService> r0 = com.alipay.mobile.security.bio.service.local.apsecurity.ApSecurityService.class
            com.alipay.mobile.security.bio.service.local.LocalService r8 = com.alipay.mobile.security.bio.service.BioServiceManager.getLocalService((android.content.Context) r8, r0)
            com.alipay.mobile.security.bio.service.local.apsecurity.ApSecurityService r8 = (com.alipay.mobile.security.bio.service.local.apsecurity.ApSecurityService) r8
            if (r8 == 0) goto L_0x00cd
            java.lang.String r4 = r8.getApDidToken()
        L_0x00cd:
            boolean r8 = android.text.TextUtils.isEmpty(r4)
            if (r8 == 0) goto L_0x00de
            java.lang.String r8 = com.alipay.mobile.security.bio.service.local.apsecurity.ApSecurityService.getStaticApDidToken()
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x00de
            r4 = r8
        L_0x00de:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.zim.api.ZIMFacade.getApDidToken(android.content.Context):java.lang.String");
    }

    public static void setEnv(Map<String, Object> map) {
        mCustomEnvs.putAll(map);
    }
}
