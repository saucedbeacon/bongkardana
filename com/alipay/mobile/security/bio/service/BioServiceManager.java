package com.alipay.mobile.security.bio.service;

import android.content.Context;
import com.alipay.mobile.security.bio.exception.BioIllegalArgumentException;
import com.alipay.mobile.security.bio.exception.InvalidCallException;
import com.alipay.mobile.security.bio.module.MicroModule;
import com.alipay.mobile.security.bio.runtime.Runtime;
import com.alipay.mobile.security.bio.service.impl.BioServiceManagerImpl;
import com.alipay.mobile.security.bio.service.local.LocalService;
import com.alipay.mobile.security.bio.workspace.Env;

public abstract class BioServiceManager {
    private static Env ENV = Env.ONLINE;
    public static final String TAG = "BioServiceManager";
    protected static BioServiceManager sInstance;
    protected final Context mContext;
    private final String mZimId;

    /* access modifiers changed from: protected */
    public abstract void destroy();

    public abstract <T> T getBioService(Class<T> cls);

    public abstract <T> T getBioService(String str);

    public abstract int preLoad();

    public abstract <T extends BioService> T putBioService(String str, Class<T> cls);

    public abstract String startBioActivity(BioAppDescription bioAppDescription, MicroModule microModule);

    public static Env getEnv() {
        return ENV;
    }

    public static void setEnv(Env env) {
        if (ENV != env) {
            ENV = env;
        }
    }

    public BioServiceManager(Context context, String str) {
        if (context != null) {
            this.mContext = context;
            this.mZimId = str;
            return;
        }
        throw new BioIllegalArgumentException();
    }

    @Deprecated
    public static synchronized void createInstance(Context context) {
        synchronized (BioServiceManager.class) {
            if (sInstance == null) {
                sInstance = new BioServiceManagerImpl(context, (String) null);
            } else {
                new InvalidCallException("BioServiceManager.createInstance(Context) : null != sInstance");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void createInstance(android.content.Context r3, java.lang.String r4) {
        /*
            java.lang.Class<com.alipay.mobile.security.bio.service.BioServiceManager> r0 = com.alipay.mobile.security.bio.service.BioServiceManager.class
            monitor-enter(r0)
            com.alipay.mobile.security.bio.service.BioServiceManager r1 = sInstance     // Catch:{ all -> 0x0068 }
            if (r1 != 0) goto L_0x0010
            com.alipay.mobile.security.bio.service.impl.BioServiceManagerImpl r1 = new com.alipay.mobile.security.bio.service.impl.BioServiceManagerImpl     // Catch:{ all -> 0x0068 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x0068 }
            sInstance = r1     // Catch:{ all -> 0x0068 }
            monitor-exit(r0)
            return
        L_0x0010:
            com.alipay.mobile.security.bio.service.BioServiceManager r1 = sInstance     // Catch:{ all -> 0x0068 }
            java.lang.String r1 = r1.mZimId     // Catch:{ all -> 0x0068 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0068 }
            if (r1 == 0) goto L_0x002f
            com.alipay.mobile.security.bio.exception.InvalidCallException r1 = new com.alipay.mobile.security.bio.exception.InvalidCallException     // Catch:{ all -> 0x0068 }
            java.lang.String r2 = "BioServiceManager already exist with zimId=null"
            r1.<init>(r2)     // Catch:{ all -> 0x0068 }
            com.alipay.mobile.security.bio.service.BioServiceManager r1 = sInstance     // Catch:{ all -> 0x0068 }
            r1.destroy()     // Catch:{ all -> 0x0068 }
            com.alipay.mobile.security.bio.service.impl.BioServiceManagerImpl r1 = new com.alipay.mobile.security.bio.service.impl.BioServiceManagerImpl     // Catch:{ all -> 0x0068 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x0068 }
            sInstance = r1     // Catch:{ all -> 0x0068 }
            monitor-exit(r0)
            return
        L_0x002f:
            com.alipay.mobile.security.bio.service.BioServiceManager r3 = sInstance     // Catch:{ all -> 0x0068 }
            java.lang.String r3 = r3.mZimId     // Catch:{ all -> 0x0068 }
            boolean r3 = android.text.TextUtils.equals(r3, r4)     // Catch:{ all -> 0x0068 }
            if (r3 != 0) goto L_0x0066
            com.alipay.mobile.security.bio.service.BioServiceManager r3 = sInstance     // Catch:{ all -> 0x0068 }
            java.lang.Class<com.alipay.mobile.security.bio.service.local.monitorlog.MonitorLogService> r4 = com.alipay.mobile.security.bio.service.local.monitorlog.MonitorLogService.class
            java.lang.Object r3 = r3.getBioService(r4)     // Catch:{ all -> 0x0068 }
            com.alipay.mobile.security.bio.service.local.monitorlog.MonitorLogService r3 = (com.alipay.mobile.security.bio.service.local.monitorlog.MonitorLogService) r3     // Catch:{ all -> 0x0068 }
            if (r3 == 0) goto L_0x0048
            r3.trigUpload()     // Catch:{ all -> 0x0068 }
        L_0x0048:
            com.alipay.mobile.security.bio.exception.InvalidCallException r3 = new com.alipay.mobile.security.bio.exception.InvalidCallException     // Catch:{ all -> 0x0068 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0068 }
            java.lang.String r1 = "BioServiceManager already exist with zimId="
            r4.<init>(r1)     // Catch:{ all -> 0x0068 }
            com.alipay.mobile.security.bio.service.BioServiceManager r1 = sInstance     // Catch:{ all -> 0x0068 }
            java.lang.String r1 = r1.mZimId     // Catch:{ all -> 0x0068 }
            r4.append(r1)     // Catch:{ all -> 0x0068 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0068 }
            r3.<init>(r4)     // Catch:{ all -> 0x0068 }
            int r3 = android.os.Process.myPid()     // Catch:{ all -> 0x0068 }
            android.os.Process.killProcess(r3)     // Catch:{ all -> 0x0068 }
        L_0x0066:
            monitor-exit(r0)
            return
        L_0x0068:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.bio.service.BioServiceManager.createInstance(android.content.Context, java.lang.String):void");
    }

    public static BioServiceManager getCurrentInstance() {
        return sInstance;
    }

    public static void destroyInstance() {
        BioServiceManager bioServiceManager = sInstance;
        if (bioServiceManager != null) {
            bioServiceManager.destroy();
            sInstance = null;
        }
    }

    public Context getBioApplicationContext() {
        return this.mContext;
    }

    public static <T extends LocalService> T getLocalService(Context context, Class<T> cls) {
        return getLocalService(context, Runtime.getBioServiceDescriptionByInterface(context, cls.getName()));
    }

    public static <T extends LocalService> T getLocalService(Context context, BioServiceDescription bioServiceDescription) {
        T t;
        Class clazz;
        if (!(bioServiceDescription == null || (clazz = bioServiceDescription.getClazz()) == null)) {
            try {
                t = (LocalService) clazz.newInstance();
            } catch (Throwable unused) {
            }
            if (!(t == null || context == null)) {
                t.setContext(context.getApplicationContext());
                t.create((BioServiceManager) null);
            }
            return t;
        }
        t = null;
        t.setContext(context.getApplicationContext());
        t.create((BioServiceManager) null);
        return t;
    }
}
