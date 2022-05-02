package com.zoloz.builder.monitor;

import android.content.Context;
import com.alipay.mobile.security.bio.log.BehaviourIdEnum;
import com.alipay.mobile.security.bio.log.VerifyBehavior;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.local.monitorlog.MonitorLogService;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.Thread;

public class ZLZCrashHandler implements Thread.UncaughtExceptionHandler {
    private static final String TAG = "ZLZCrashHandler";
    private static ZLZCrashHandler sInstance;
    private boolean isHandleMessage = true;
    private Context mContext;
    private Thread.UncaughtExceptionHandler mOringinalHandler;

    private void saveErrorMessages(Throwable th) {
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static com.zoloz.builder.monitor.ZLZCrashHandler getInstance() {
        /*
            java.lang.Class<com.zoloz.builder.monitor.ZLZCrashHandler> r0 = com.zoloz.builder.monitor.ZLZCrashHandler.class
            com.zoloz.builder.monitor.ZLZCrashHandler r1 = sInstance
            if (r1 != 0) goto L_0x001d
            monitor-enter(r0)
            com.zoloz.builder.monitor.ZLZCrashHandler r1 = sInstance     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            monitor-enter(r0)     // Catch:{ all -> 0x001a }
            com.zoloz.builder.monitor.ZLZCrashHandler r1 = new com.zoloz.builder.monitor.ZLZCrashHandler     // Catch:{ all -> 0x0015 }
            r1.<init>()     // Catch:{ all -> 0x0015 }
            sInstance = r1     // Catch:{ all -> 0x0015 }
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            goto L_0x0018
        L_0x0015:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x001d:
            com.zoloz.builder.monitor.ZLZCrashHandler r0 = sInstance
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zoloz.builder.monitor.ZLZCrashHandler.getInstance():com.zoloz.builder.monitor.ZLZCrashHandler");
    }

    private ZLZCrashHandler() {
    }

    public void enable(Context context) {
        this.mContext = context.getApplicationContext();
        if (this != Thread.getDefaultUncaughtExceptionHandler()) {
            this.mOringinalHandler = Thread.getDefaultUncaughtExceptionHandler();
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public void uncaughtException(Thread thread, Throwable th) {
        th.getLocalizedMessage();
        reportCrashInfo(th);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.mOringinalHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            System.exit(0);
        }
    }

    private void reportCrashInfo(Throwable th) {
        try {
            VerifyBehavior verifyBehavior = new VerifyBehavior();
            verifyBehavior.setSeedID("crash");
            verifyBehavior.getExtParams().put("name", th.getClass().getName());
            verifyBehavior.getExtParams().put(FirebaseAnalytics.Param.METHOD, th.getStackTrace()[0].getMethodName());
            verifyBehavior.getExtParams().put("class", th.getStackTrace()[0].getClassName());
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (StackTraceElement obj : th.getStackTrace()) {
                i++;
                sb.append(obj.toString());
                if (i >= 5) {
                    break;
                }
            }
            verifyBehavior.getExtParams().put("detail", sb.toString());
            MonitorLogService monitorLogService = (MonitorLogService) BioServiceManager.getLocalService(this.mContext, MonitorLogService.class);
            monitorLogService.logBehavior(BehaviourIdEnum.EXCEPTION, verifyBehavior);
            monitorLogService.trigUpload();
            Thread.sleep(1000);
        } catch (Exception unused) {
        }
    }

    public void disable() {
        Thread.setDefaultUncaughtExceptionHandler(this.mOringinalHandler);
    }
}
