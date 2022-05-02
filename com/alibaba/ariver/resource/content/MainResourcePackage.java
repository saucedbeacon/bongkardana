package com.alibaba.ariver.resource.content;

import android.text.TextUtils;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.track.Event;
import com.alibaba.ariver.kernel.api.track.EventAttr;
import com.alibaba.ariver.kernel.api.track.EventTracker;
import com.alibaba.ariver.kernel.api.track.TrackId;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.DownloadInstallCallback;
import com.alibaba.ariver.resource.api.ResourceContext;
import com.alibaba.ariver.resource.api.content.OfflineResource;
import com.alibaba.ariver.resource.api.content.ResourceQuery;
import com.alibaba.ariver.resource.api.extension.PackageParsedPoint;
import com.alibaba.ariver.resource.api.models.TemplateConfigModel;
import com.alibaba.ariver.resource.api.network.OnlineResourceFetcher;
import com.alibaba.ariver.resource.content.BaseResourcePackage;
import com.alibaba.ariver.resource.parser.ParseContext;
import com.alibaba.ariver.resource.parser.a;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.text.Typography;

public class MainResourcePackage extends BaseResourcePackage {
    private static int IsOverlapping = 1;
    private static int getMax = 0;
    private static boolean getMin = true;
    private static char[] length = {178, Typography.plusMinus, Typography.pound, 138, 149};
    private static boolean setMax = true;
    private static int setMin = 93;

    /* renamed from: a  reason: collision with root package name */
    private AtomicBoolean f10184a = new AtomicBoolean(false);
    private boolean b = false;
    private AtomicInteger c = new AtomicInteger(3);
    protected String mOnlineHost = null;

    /* access modifiers changed from: protected */
    public boolean canHotUpdate(String str) {
        int i = getMax + 79;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        if ((str != null) && !TextUtils.equals(str, this.appVersion)) {
            return false;
        }
        try {
            int i3 = IsOverlapping + 51;
            getMax = i3 % 128;
            if ((i3 % 2 != 0 ? '1' : Typography.dollar) != '1') {
                return true;
            }
            int i4 = 39 / 0;
            return true;
        } catch (Exception e) {
            throw e;
        }
    }

    static /* synthetic */ boolean access$002(MainResourcePackage mainResourcePackage, boolean z) {
        try {
            int i = IsOverlapping + 19;
            getMax = i % 128;
            if (!(i % 2 == 0)) {
                mainResourcePackage.b = z;
                Object[] objArr = null;
                int length2 = objArr.length;
            } else {
                try {
                    mainResourcePackage.b = z;
                } catch (Exception e) {
                    throw e;
                }
            }
            int i2 = getMax + 121;
            IsOverlapping = i2 % 128;
            int i3 = i2 % 2;
            return z;
        } catch (Exception e2) {
            throw e2;
        }
    }

    static /* synthetic */ AtomicInteger access$100(MainResourcePackage mainResourcePackage) {
        int i = IsOverlapping + 51;
        getMax = i % 128;
        char c2 = i % 2 != 0 ? ']' : 'R';
        AtomicInteger atomicInteger = mainResourcePackage.c;
        if (c2 != 'R') {
            Object obj = null;
            super.hashCode();
        }
        return atomicInteger;
    }

    static /* synthetic */ void access$200(MainResourcePackage mainResourcePackage) {
        try {
            int i = IsOverlapping + 55;
            try {
                getMax = i % 128;
                char c2 = i % 2 != 0 ? '0' : '`';
                mainResourcePackage.a();
                if (c2 != '`') {
                    int i2 = 72 / 0;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public MainResourcePackage(@NonNull ResourceContext resourceContext) {
        super(resourceContext.getAppId(), resourceContext);
        if (resourceContext.getMainPackageInfo() != null) {
            OnlineResourceFetcher onlineResourceFetcher = resourceContext.getOnlineResourceFetcher();
            final String fallbackBaseUrl = resourceContext.getMainPackageInfo().getAppInfoModel().getFallbackBaseUrl();
            final String vhost = resourceContext.getMainPackageInfo().getAppInfoModel().getVhost();
            onlineResourceFetcher.setFallbackListener(new OnlineResourceFetcher.FallbackListener() {
                public void onSuccess(String str, Resource resource) {
                    MainResourcePackage.access$002(MainResourcePackage.this, true);
                    if (str.endsWith(RVConstants.FILE_APP_CONFIG) || str.endsWith(RVConstants.FILE_API_PERMISSION) || str.endsWith(RVConstants.FILE_TABBAR)) {
                        String combinePath = FileUtils.combinePath(vhost, str.replace(fallbackBaseUrl, ""));
                        String logTag = MainResourcePackage.this.getLogTag();
                        StringBuilder sb = new StringBuilder("replace url [");
                        sb.append(str);
                        sb.append("] to [");
                        sb.append(combinePath);
                        sb.append("]");
                        RVLogger.d(logTag, sb.toString());
                        MainResourcePackage.this.add(new OfflineResource(combinePath, resource.getBytes()));
                        if (MainResourcePackage.access$100(MainResourcePackage.this).decrementAndGet() == 0) {
                            RVLogger.d(MainResourcePackage.this.getLogTag(), "all key resource onSuccess, just release setup lock!");
                            MainResourcePackage.this.getSetupLock().countDown();
                            MainResourcePackage.access$200(MainResourcePackage.this);
                        }
                    }
                }

                public void onFailed(String str) {
                    RVLogger.d(MainResourcePackage.this.getLogTag(), "onResource fallback failed! ".concat(String.valueOf(str)));
                }
            });
            this.mOnlineHost = resourceContext.getMainPackageInfo().getAppInfoModel().getVhost();
            int i = getMax + 7;
            IsOverlapping = i % 128;
            int i2 = i % 2;
        }
        int i3 = IsOverlapping + 85;
        getMax = i3 % 128;
        int i4 = i3 % 2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        if ((r4.mResourceContext.getSceneParams().getBoolean(com.alibaba.ariver.kernel.RVConstants.EXTRA_USING_FALLBACK_START) ? 'A' : '+') != 'A') goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNotInstalled() {
        /*
            r4 = this;
            int r0 = getMax     // Catch:{ Exception -> 0x008a }
            int r0 = r0 + 57
            int r1 = r0 % 128
            IsOverlapping = r1     // Catch:{ Exception -> 0x0088 }
            int r0 = r0 % 2
            com.alibaba.ariver.resource.api.ResourceContext r0 = r4.mResourceContext
            if (r0 != 0) goto L_0x0019
            int r0 = getMax
            int r0 = r0 + 117
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            return
        L_0x0019:
            com.alibaba.ariver.resource.api.proxy.RVResourceManager r0 = r4.resourceManager
            com.alibaba.ariver.resource.api.models.AppModel r1 = r4.getAppModel()
            boolean r0 = r0.isAvailable(r1)
            if (r0 == 0) goto L_0x0034
            com.alibaba.ariver.resource.api.proxy.RVResourceManager r0 = r4.resourceManager
            com.alibaba.ariver.resource.api.models.AppModel r1 = r4.getAppModel()
            com.alibaba.ariver.resource.content.MainResourcePackage$2 r2 = new com.alibaba.ariver.resource.content.MainResourcePackage$2
            r2.<init>()
            r0.installApp(r1, r2)
            return
        L_0x0034:
            java.util.concurrent.CountDownLatch r0 = r4.getParseLock()
            r0.countDown()
            r0 = 0
            boolean r2 = r4.b
            r3 = 86
            if (r2 != 0) goto L_0x0046
            r2 = 86
            goto L_0x0048
        L_0x0046:
            r2 = 50
        L_0x0048:
            if (r2 == r3) goto L_0x004b
            goto L_0x0063
        L_0x004b:
            com.alibaba.ariver.resource.api.ResourceContext r2 = r4.mResourceContext     // Catch:{ Exception -> 0x008a }
            android.os.Bundle r2 = r2.getSceneParams()     // Catch:{ Exception -> 0x008a }
            java.lang.String r3 = "usingFallback"
            boolean r2 = r2.getBoolean(r3)     // Catch:{ Exception -> 0x008a }
            r3 = 65
            if (r2 == 0) goto L_0x005e
            r2 = 65
            goto L_0x0060
        L_0x005e:
            r2 = 43
        L_0x0060:
            if (r2 == r3) goto L_0x0063
            goto L_0x006c
        L_0x0063:
            java.lang.String r0 = r4.LOG_TAG
            java.lang.String r1 = "already fallback, just release setupLock!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r1)
            r0 = 5000(0x1388, double:2.4703E-320)
        L_0x006c:
            com.alibaba.ariver.resource.content.MainResourcePackage$3 r2 = new com.alibaba.ariver.resource.content.MainResourcePackage$3
            r2.<init>()
            com.alibaba.ariver.kernel.common.utils.ExecutorUtils.runOnMain(r2, r0)
            int r0 = getMax
            int r0 = r0 + 23
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0087
            r0 = 0
            super.hashCode()     // Catch:{ all -> 0x0085 }
            return
        L_0x0085:
            r0 = move-exception
            throw r0
        L_0x0087:
            return
        L_0x0088:
            r0 = move-exception
            throw r0
        L_0x008a:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.resource.content.MainResourcePackage.onNotInstalled():void");
    }

    public boolean needWaitForSetup() {
        try {
            if ((this.mResourceContext != null ? 12 : 'O') != 'O') {
                int i = IsOverlapping + 73;
                getMax = i % 128;
                int i2 = i % 2;
                if (this.mResourceContext.getApp() != null) {
                    if (this.mResourceContext.getApp().isTinyApp()) {
                        int i3 = IsOverlapping + 31;
                        getMax = i3 % 128;
                        if (i3 % 2 == 0) {
                            return true;
                        }
                        int i4 = 19 / 0;
                        return true;
                    }
                }
            }
            int i5 = getMax + 67;
            IsOverlapping = i5 % 128;
            if (i5 % 2 != 0) {
                return false;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return false;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        if ((r1 ? ']' : '[') != ']') goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0089, code lost:
        if (contains(r0) != false) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.alibaba.ariver.engine.api.resources.Resource get(@androidx.annotation.NonNull com.alibaba.ariver.resource.api.content.ResourceQuery r6) {
        /*
            r5 = this;
            boolean r0 = r6.isNeedAutoCompleteHost()     // Catch:{ Exception -> 0x00cd }
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = r5.mOnlineHost
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = r5.mOnlineHost
            java.lang.String r1 = r6.pureUrl
            java.lang.String r0 = com.alibaba.ariver.kernel.common.utils.FileUtils.combinePath(r0, r1)
            r6.pureUrl = r0
            int r0 = IsOverlapping
            int r0 = r0 + 99
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
        L_0x0022:
            boolean r0 = r6.isLanguageAware()
            if (r0 == 0) goto L_0x00c8
            java.lang.Class<com.alibaba.ariver.kernel.common.service.RVEnvironmentService> r0 = com.alibaba.ariver.kernel.common.service.RVEnvironmentService.class
            java.lang.Object r0 = com.alibaba.ariver.kernel.common.RVProxy.get(r0)
            com.alibaba.ariver.kernel.common.service.RVEnvironmentService r0 = (com.alibaba.ariver.kernel.common.service.RVEnvironmentService) r0
            java.lang.String r0 = r0.getAppLanguage()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 60
            if (r1 != 0) goto L_0x003f
            r1 = 60
            goto L_0x0041
        L_0x003f:
            r1 = 23
        L_0x0041:
            if (r1 == r2) goto L_0x0045
            goto L_0x00c8
        L_0x0045:
            int r1 = IsOverlapping
            int r1 = r1 + 13
            int r2 = r1 % 128
            getMax = r2
            int r1 = r1 % 2
            r2 = 64
            if (r1 == 0) goto L_0x0055
            r1 = 4
            goto L_0x0057
        L_0x0055:
            r1 = 64
        L_0x0057:
            if (r1 == r2) goto L_0x0079
            java.lang.String r1 = r6.pureUrl
            java.lang.String r2 = r5.mOnlineHost
            java.lang.String r0 = com.alibaba.ariver.kernel.common.utils.FileUtils.combinePath(r2, r0)
            java.lang.String r0 = r1.replace(r2, r0)
            boolean r1 = r5.contains(r0)
            r2 = 0
            int r2 = r2.length     // Catch:{ all -> 0x0077 }
            r2 = 93
            if (r1 == 0) goto L_0x0072
            r1 = 93
            goto L_0x0074
        L_0x0072:
            r1 = 91
        L_0x0074:
            if (r1 == r2) goto L_0x008b
            goto L_0x00c8
        L_0x0077:
            r6 = move-exception
            throw r6
        L_0x0079:
            java.lang.String r1 = r6.pureUrl
            java.lang.String r2 = r5.mOnlineHost
            java.lang.String r0 = com.alibaba.ariver.kernel.common.utils.FileUtils.combinePath(r2, r0)
            java.lang.String r0 = r1.replace(r2, r0)
            boolean r1 = r5.contains(r0)
            if (r1 == 0) goto L_0x00c8
        L_0x008b:
            int r1 = IsOverlapping
            int r1 = r1 + 5
            int r2 = r1 % 128
            getMax = r2
            int r1 = r1 % 2
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x009b
            r1 = 0
            goto L_0x009c
        L_0x009b:
            r1 = 1
        L_0x009c:
            java.lang.String r4 = "replace query to language awared url: "
            if (r1 == r3) goto L_0x00b7
            r6.pureUrl = r0
            java.lang.String r1 = r5.getLogTag()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r4.concat(r0)
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r1, r0)
            r0 = 17
            int r0 = r0 / r2
            goto L_0x00c8
        L_0x00b5:
            r6 = move-exception
            throw r6
        L_0x00b7:
            r6.pureUrl = r0     // Catch:{ Exception -> 0x00cd }
            java.lang.String r1 = r5.getLogTag()     // Catch:{ Exception -> 0x00cd }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x00cd }
            java.lang.String r0 = r4.concat(r0)     // Catch:{ Exception -> 0x00cd }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r1, r0)     // Catch:{ Exception -> 0x00cd }
        L_0x00c8:
            com.alibaba.ariver.engine.api.resources.Resource r6 = super.get(r6)
            return r6
        L_0x00cd:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.resource.content.MainResourcePackage.get(com.alibaba.ariver.resource.api.content.ResourceQuery):com.alibaba.ariver.engine.api.resources.Resource");
    }

    /* access modifiers changed from: protected */
    public void onPrepareDone() {
        try {
            if ((this.mResourceContext == null ? ')' : 23) != 23) {
                int i = IsOverlapping + 57;
                getMax = i % 128;
                if (!(i % 2 != 0)) {
                    try {
                        RVLogger.w("MainResource parse need resource context");
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    RVLogger.w("MainResource parse need resource context");
                    int i2 = 23 / 0;
                }
            }
            super.onPrepareDone();
            int i3 = IsOverlapping + 61;
            getMax = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        if (r0 != null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
        throw new java.lang.IllegalStateException("MainResource parse need resource context");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r3.mResourceContext != null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void beforeParsePackage(com.alibaba.ariver.resource.parser.ParseContext r4) {
        /*
            r3 = this;
            int r0 = IsOverlapping     // Catch:{ Exception -> 0x0051 }
            int r0 = r0 + 65
            int r1 = r0 % 128
            getMax = r1     // Catch:{ Exception -> 0x0051 }
            int r0 = r0 % 2
            r1 = 39
            if (r0 == 0) goto L_0x0011
            r0 = 39
            goto L_0x0013
        L_0x0011:
            r0 = 90
        L_0x0013:
            r2 = 0
            if (r0 == r1) goto L_0x001b
            com.alibaba.ariver.resource.api.ResourceContext r0 = r3.mResourceContext
            if (r0 == 0) goto L_0x0047
            goto L_0x0020
        L_0x001b:
            com.alibaba.ariver.resource.api.ResourceContext r0 = r3.mResourceContext
            int r1 = r2.length     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x0047
        L_0x0020:
            super.beforeParsePackage(r4)
            r0 = 1
            r4.needCache = r0
            com.alibaba.ariver.resource.api.ResourceContext r1 = r3.mResourceContext
            com.alibaba.ariver.resource.api.models.AppModel r1 = r1.getMainPackageInfo()
            r4.adaptAppModel(r1)
            int r4 = IsOverlapping
            int r4 = r4 + 107
            int r1 = r4 % 128
            getMax = r1
            int r4 = r4 % 2
            if (r4 == 0) goto L_0x003d
            r4 = 1
            goto L_0x003e
        L_0x003d:
            r4 = 0
        L_0x003e:
            if (r4 == r0) goto L_0x0041
            return
        L_0x0041:
            super.hashCode()     // Catch:{ all -> 0x0045 }
            return
        L_0x0045:
            r4 = move-exception
            throw r4
        L_0x0047:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "MainResource parse need resource context"
            r4.<init>(r0)
            throw r4
        L_0x004f:
            r4 = move-exception
            throw r4
        L_0x0051:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.resource.content.MainResourcePackage.beforeParsePackage(com.alibaba.ariver.resource.parser.ParseContext):void");
    }

    public void afterParsePackage(ParseContext parseContext) {
        if (this.mResourceContext != null) {
            super.afterParsePackage(parseContext);
            a();
            try {
                ((EventTracker) RVProxy.get(EventTracker.class)).stub(this.mResourceContext.getApp(), TrackId.Stub_PkgParse);
                Object obj = null;
                if ((parseContext.fromCache ? 'R' : 15) != 15) {
                    int i = getMax + 43;
                    IsOverlapping = i % 128;
                    if (i % 2 == 0) {
                        ((EventTracker) RVProxy.get(EventTracker.class)).addAttr(this.mResourceContext.getApp(), "parseFromCache", "1");
                        super.hashCode();
                        return;
                    }
                    ((EventTracker) RVProxy.get(EventTracker.class)).addAttr(this.mResourceContext.getApp(), "parseFromCache", "1");
                    return;
                }
                ((EventTracker) RVProxy.get(EventTracker.class)).addAttr(this.mResourceContext.getApp(), "parseFromCache", "0");
                int i2 = IsOverlapping + 121;
                getMax = i2 % 128;
                if ((i2 % 2 != 0 ? 20 : Typography.amp) == 20) {
                    super.hashCode();
                }
            } catch (Exception e) {
                throw e;
            }
        } else {
            throw new IllegalStateException("MainResource parse need resource context");
        }
    }

    private void a() {
        int i = getMax + 53;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        try {
            if (this.f10184a.getAndSet(true)) {
                int i3 = IsOverlapping + 5;
                getMax = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            b();
            ExtensionPoint.as(PackageParsedPoint.class).node(this.mResourceContext.getApp()).create().onResourceParsed(this.mResourceContext.getMainPackageInfo(), this);
        } catch (Exception e) {
            throw e;
        }
    }

    public void onVerifyError(a aVar) {
        App app;
        super.onVerifyError(aVar);
        if ((this.mResourceContext != null ? '6' : 6) != '6') {
            app = null;
        } else {
            int i = getMax + 111;
            IsOverlapping = i % 128;
            int i2 = i % 2;
            try {
                app = this.mResourceContext.getApp();
            } catch (Exception e) {
                throw e;
            }
        }
        Event error = ((EventTracker) RVProxy.get(EventTracker.class)).error(app, "ResVerifyFail", "mainPkgParseFailed");
        if (error != null) {
            int i3 = getMax + 61;
            IsOverlapping = i3 % 128;
            if ((i3 % 2 == 0 ? 24 : 'R') != 'R') {
                error.putAttr(EventAttr.Key_resourceDBFailMsg, aVar.getCode());
                error.putAttr(EventAttr.Key_resourceParseFailMsg, aVar.getMessage());
                int i4 = 61 / 0;
            } else {
                error.putAttr(EventAttr.Key_resourceDBFailMsg, aVar.getCode());
                error.putAttr(EventAttr.Key_resourceParseFailMsg, aVar.getMessage());
            }
        }
        int i5 = getMax + 89;
        IsOverlapping = i5 % 128;
        int i6 = i5 % 2;
    }

    private void b() {
        int i = getMax + 115;
        IsOverlapping = i % 128;
        char[] cArr = null;
        if (i % 2 == 0) {
            ResourceContext resourceContext = this.mResourceContext;
            int length2 = cArr.length;
            if (resourceContext == null) {
                return;
            }
        } else if (this.mResourceContext == null) {
            return;
        }
        if ((this.mResourceContext.getMainPackageInfo() != null ? 31 : 'R') != 'R') {
            int i2 = IsOverlapping + 17;
            getMax = i2 % 128;
            int i3 = i2 % 2;
            TemplateConfigModel templateConfig = this.mResourceContext.getMainPackageInfo().getAppInfoModel().getTemplateConfig();
            if (templateConfig != null) {
                if ((templateConfig.isTemplateValid() ? 'H' : 'U') != 'U') {
                    Resource resource = get(ResourceQuery.asUrl(RVConstants.FILE_API_PERMISSION).setNeedAutoCompleteHost());
                    if (resource != null) {
                        try {
                            resource.setBytes(new String(resource.getBytes(), setMax(cArr, new byte[]{-123, -124, -125, -126, -127}, 126 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)), cArr).intern()).replace(templateConfig.getTemplateId(), this.appId).getBytes());
                            int i4 = IsOverlapping + 35;
                            getMax = i4 % 128;
                            int i5 = i4 % 2;
                        } catch (UnsupportedEncodingException e) {
                            RVLogger.e(this.LOG_TAG, "change api_permission error!", e);
                        }
                    }
                    String str = this.LOG_TAG;
                    StringBuilder sb = new StringBuilder("change api_permission to template: ");
                    sb.append(templateConfig.getTemplateId());
                    RVLogger.d(str, sb.toString());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r0 != null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        throw new java.lang.IllegalStateException("main resource cannot setup without app context");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r2.mResourceContext != null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setup(boolean r3) {
        /*
            r2 = this;
            int r0 = IsOverlapping
            int r0 = r0 + 25
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r1 = 1
            if (r0 == 0) goto L_0x000f
            r0 = 1
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            if (r0 == r1) goto L_0x0017
            com.alibaba.ariver.resource.api.ResourceContext r0 = r2.mResourceContext
            if (r0 == 0) goto L_0x004d
            goto L_0x001d
        L_0x0017:
            com.alibaba.ariver.resource.api.ResourceContext r0 = r2.mResourceContext
            r1 = 0
            int r1 = r1.length     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x004d
        L_0x001d:
            com.alibaba.ariver.resource.api.ResourceContext r0 = r2.mResourceContext
            com.alibaba.ariver.resource.api.models.AppModel r0 = r0.getMainPackageInfo()
            if (r0 == 0) goto L_0x0045
            com.alibaba.ariver.resource.api.ResourceContext r0 = r2.mResourceContext     // Catch:{ Exception -> 0x0043 }
            com.alibaba.ariver.resource.api.models.AppModel r0 = r0.getMainPackageInfo()     // Catch:{ Exception -> 0x0043 }
            com.alibaba.ariver.resource.api.models.AppInfoModel r0 = r0.getAppInfoModel()     // Catch:{ Exception -> 0x0043 }
            java.lang.String r0 = r0.getVhost()     // Catch:{ Exception -> 0x0043 }
            r2.mOnlineHost = r0     // Catch:{ Exception -> 0x0043 }
            super.setup(r3)     // Catch:{ Exception -> 0x0043 }
            int r3 = getMax
            int r3 = r3 + 21
            int r0 = r3 % 128
            IsOverlapping = r0
            int r3 = r3 % 2
            return
        L_0x0043:
            r3 = move-exception
            throw r3
        L_0x0045:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "main resource cannot setup without app main packageInfo"
            r3.<init>(r0)
            throw r3
        L_0x004d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "main resource cannot setup without app context"
            r3.<init>(r0)
            throw r3
        L_0x0055:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.resource.content.MainResourcePackage.setup(boolean):void");
    }

    /* access modifiers changed from: protected */
    public boolean needWaitSetupWhenGet() {
        int i = getMax + 33;
        IsOverlapping = i % 128;
        if (i % 2 == 0) {
        }
        int i2 = getMax + 105;
        IsOverlapping = i2 % 128;
        if ((i2 % 2 == 0 ? 'X' : 'Y') == 'Y') {
            return false;
        }
        Object obj = null;
        super.hashCode();
        return false;
    }

    class MainResourceDownloadCallback extends DownloadInstallCallback {
        MainResourceDownloadCallback() {
            super(MainResourcePackage.this.getAppModel(), true, true, new BaseResourcePackage.HotUpdatePackageInstallCallback());
        }
    }

    private static String setMax(int[] iArr, byte[] bArr, int i, char[] cArr) {
        try {
            char[] cArr2 = length;
            int i2 = setMin;
            int i3 = 0;
            if (setMax) {
                int i4 = IsOverlapping + 13;
                getMax = i4 % 128;
                int i5 = i4 % 2;
                int length2 = bArr.length;
                char[] cArr3 = new char[length2];
                while (true) {
                    if ((i3 < length2 ? 'O' : 29) != 'O') {
                        return new String(cArr3);
                    }
                    int i6 = getMax + 69;
                    IsOverlapping = i6 % 128;
                    if (i6 % 2 == 0) {
                        cArr3[i3] = (char) (cArr2[bArr[(length2 / 0) + i3] + i] >> i2);
                        i3 += 77;
                    } else {
                        cArr3[i3] = (char) (cArr2[bArr[(length2 - 1) - i3] + i] - i2);
                        i3++;
                    }
                }
            } else if (getMin) {
                int i7 = getMax + 13;
                IsOverlapping = i7 % 128;
                int i8 = i7 % 2;
                int length3 = cArr.length;
                char[] cArr4 = new char[length3];
                while (i3 < length3) {
                    int i9 = getMax + 49;
                    IsOverlapping = i9 % 128;
                    int i10 = i9 % 2;
                    cArr4[i3] = (char) (cArr2[cArr[(length3 - 1) - i3] - i] - i2);
                    i3++;
                }
                return new String(cArr4);
            } else {
                int length4 = iArr.length;
                char[] cArr5 = new char[length4];
                int i11 = 0;
                while (true) {
                    if (!(i11 < length4)) {
                        return new String(cArr5);
                    }
                    int i12 = getMax + 37;
                    IsOverlapping = i12 % 128;
                    if (i12 % 2 == 0) {
                        cArr5[i11] = (char) (cArr2[iArr[(length4 >>> 1) << i11] % i] / i2);
                        i11 += 40;
                    } else {
                        cArr5[i11] = (char) (cArr2[iArr[(length4 - 1) - i11] - i] - i2);
                        i11++;
                    }
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
