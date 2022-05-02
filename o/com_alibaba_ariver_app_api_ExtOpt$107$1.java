package o;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.b;

@Singleton
public class com_alibaba_ariver_app_api_ExtOpt$107$1 extends setRepeatCount<b.AnonymousClass9> implements b.AnonymousClass16 {
    /* access modifiers changed from: private */
    public com_alibaba_ariver_app_api_ExtOpt$69$1 cacheLoginRpcResult;
    /* access modifiers changed from: private */
    public Throwable error;
    /* access modifiers changed from: private */
    public final Object object = new Object();
    private AtomicInteger requestCount = new AtomicInteger(0);

    @Inject
    public com_alibaba_ariver_app_api_ExtOpt$107$1(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
    }

    public Class<b.AnonymousClass9> getFacadeClass() {
        return b.AnonymousClass9.class;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public o.TitleBarRightButtonView.AnonymousClass1<o.com_alibaba_ariver_app_api_ExtOpt$69$1> holdLogin(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r2.requestCount
            r0.incrementAndGet()
            monitor-enter(r2)
            java.lang.Throwable r0 = r2.error     // Catch:{ all -> 0x0076 }
            boolean r0 = r0 instanceof id.dana.data.login.source.network.HoldLoginException     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x001a
            r2.clearCacheWhenFinished()     // Catch:{ all -> 0x0076 }
            java.lang.Throwable r3 = new java.lang.Throwable     // Catch:{ all -> 0x0076 }
            r3.<init>()     // Catch:{ all -> 0x0076 }
            o.TitleBarRightButtonView$1 r3 = o.TitleBarRightButtonView.AnonymousClass1.error((java.lang.Throwable) r3)     // Catch:{ all -> 0x0076 }
            monitor-exit(r2)     // Catch:{ all -> 0x0076 }
            return r3
        L_0x001a:
            o.com_alibaba_ariver_app_api_ExtOpt$69$1 r0 = r2.cacheLoginRpcResult     // Catch:{ all -> 0x0076 }
            if (r0 != 0) goto L_0x005a
            o.com_alibaba_ariver_app_api_ExtOpt$64$1 r0 = new o.com_alibaba_ariver_app_api_ExtOpt$64$1     // Catch:{ all -> 0x0076 }
            r0.<init>()     // Catch:{ all -> 0x0076 }
            r0.credentials = r4     // Catch:{ all -> 0x0076 }
            com.alipayplus.mobile.component.common.facade.base.MobileEnvInfo r4 = r2.generateMobileEnvInfo()     // Catch:{ all -> 0x0076 }
            r0.envInfo = r4     // Catch:{ all -> 0x0076 }
            r0.loginId = r3     // Catch:{ all -> 0x0076 }
            java.lang.String r3 = "MOBILE_NO"
            r0.loginIdType = r3     // Catch:{ all -> 0x0076 }
            java.lang.String r3 = "HOLD_LOGIN"
            r0.loginType = r3     // Catch:{ all -> 0x0076 }
            o.com_alibaba_ariver_app_api_ExtOpt$105$1 r3 = new o.com_alibaba_ariver_app_api_ExtOpt$105$1     // Catch:{ all -> 0x0076 }
            r3.<init>(r0)     // Catch:{ all -> 0x0076 }
            o.c$2 r4 = new o.c$2     // Catch:{ all -> 0x0076 }
            r4.<init>()     // Catch:{ all -> 0x0076 }
            o.TitleBarRightButtonView$1 r3 = r2.wrapper(r3, r4)     // Catch:{ all -> 0x0076 }
            o.com_alibaba_ariver_app_api_ExtOpt$107$1$4 r4 = new o.com_alibaba_ariver_app_api_ExtOpt$107$1$4     // Catch:{ all -> 0x0076 }
            r4.<init>()     // Catch:{ all -> 0x0076 }
            r3.subscribe(r4)     // Catch:{ all -> 0x0076 }
            java.lang.Object r3 = r2.object     // Catch:{ InterruptedException -> 0x005a }
            monitor-enter(r3)     // Catch:{ InterruptedException -> 0x005a }
            java.lang.Object r4 = r2.object     // Catch:{ all -> 0x0057 }
            r0 = 10000(0x2710, double:4.9407E-320)
            r4.wait(r0)     // Catch:{ all -> 0x0057 }
            monitor-exit(r3)     // Catch:{ all -> 0x0057 }
            goto L_0x005a
        L_0x0057:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ InterruptedException -> 0x005a }
            throw r4     // Catch:{ InterruptedException -> 0x005a }
        L_0x005a:
            o.com_alibaba_ariver_app_api_ExtOpt$69$1 r3 = r2.cacheLoginRpcResult     // Catch:{ all -> 0x0076 }
            java.lang.Throwable r4 = r2.error     // Catch:{ all -> 0x0076 }
            r2.clearCacheWhenFinished()     // Catch:{ all -> 0x0076 }
            if (r3 == 0) goto L_0x0069
            o.TitleBarRightButtonView$1 r3 = o.TitleBarRightButtonView.AnonymousClass1.just(r3)     // Catch:{ all -> 0x0076 }
            monitor-exit(r2)     // Catch:{ all -> 0x0076 }
            return r3
        L_0x0069:
            if (r4 != 0) goto L_0x0070
            java.net.SocketTimeoutException r4 = new java.net.SocketTimeoutException     // Catch:{ all -> 0x0076 }
            r4.<init>()     // Catch:{ all -> 0x0076 }
        L_0x0070:
            o.TitleBarRightButtonView$1 r3 = o.TitleBarRightButtonView.AnonymousClass1.error((java.lang.Throwable) r4)     // Catch:{ all -> 0x0076 }
            monitor-exit(r2)     // Catch:{ all -> 0x0076 }
            return r3
        L_0x0076:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.com_alibaba_ariver_app_api_ExtOpt$107$1.holdLogin(java.lang.String, java.lang.String):o.TitleBarRightButtonView$1");
    }

    private void clearCacheWhenFinished() {
        if (this.requestCount.decrementAndGet() == 0) {
            this.cacheLoginRpcResult = null;
            this.error = null;
        }
    }
}
