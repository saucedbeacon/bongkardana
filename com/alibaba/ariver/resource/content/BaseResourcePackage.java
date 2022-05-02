package com.alibaba.ariver.resource.content;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.PackageInstallCallback;
import com.alibaba.ariver.resource.api.ResourceContext;
import com.alibaba.ariver.resource.api.models.AppInfoQuery;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.proxy.RVAppInfoManager;
import com.alibaba.ariver.resource.api.proxy.RVResourceManager;
import com.alibaba.ariver.resource.api.proxy.RVResourcePresetProxy;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public abstract class BaseResourcePackage extends BaseStoragePackage {
    String LOG_TAG = "AriverRes:Package";

    /* renamed from: a  reason: collision with root package name */
    private long f10180a;
    String appId;
    String appVersion;
    private boolean b = false;
    /* access modifiers changed from: private */
    public AtomicBoolean c = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    @Nullable
    public AppModel d;
    RVAppInfoManager mAppInfoManager;
    @Nullable
    final ResourceContext mResourceContext;
    RVResourceManager resourceManager;

    /* access modifiers changed from: package-private */
    public abstract boolean canHotUpdate(String str);

    public boolean needWaitForSetup() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public abstract void onNotInstalled();

    BaseResourcePackage(String str, @Nullable ResourceContext resourceContext) {
        this.appId = str;
        this.mAppInfoManager = (RVAppInfoManager) RVProxy.get(RVAppInfoManager.class);
        this.resourceManager = (RVResourceManager) RVProxy.get(RVResourceManager.class);
        this.mResourceContext = resourceContext;
    }

    public String getLogTag() {
        return this.LOG_TAG;
    }

    public String appId() {
        return this.appId;
    }

    public String version() {
        return this.appVersion;
    }

    public void reload() {
        String str;
        if (this.mSetupLock.getCount() > 0 || this.mParseLock.getCount() > 0 || this.c.get()) {
            RVLogger.d(this.LOG_TAG, "current setup and not do reload!");
            return;
        }
        RVLogger.d(this.LOG_TAG, "reload begin!");
        final AppModel prepareAppModel = prepareAppModel(AppInfoQuery.make(this.appId).disableCache());
        String str2 = null;
        if (prepareAppModel == null) {
            str = null;
        } else {
            str = prepareAppModel.getAppVersion();
        }
        AppModel appModel = this.d;
        if (appModel != null) {
            str2 = appModel.getAppVersion();
        }
        String str3 = this.LOG_TAG;
        StringBuilder sb = new StringBuilder("reload got new ");
        sb.append(str);
        sb.append(", current: ");
        sb.append(str2);
        RVLogger.d(str3, sb.toString());
        if (prepareAppModel == null || AppModel.COMPARATOR.compare(prepareAppModel, this.d) > 0) {
            this.b = false;
            this.c.set(true);
            ResourceUtils.downloadAndInstallApp(new PackageInstallCallback() {
                public void onResult(boolean z, String str) {
                    BaseResourcePackage.this.mSetupLock = new CountDownLatch(1);
                    BaseResourcePackage.this.mParseLock = new CountDownLatch(1);
                    BaseResourcePackage.this.a(true, prepareAppModel);
                    BaseResourcePackage.this.c.set(false);
                    RVLogger.d(BaseResourcePackage.this.LOG_TAG, "reload end!");
                }
            }, prepareAppModel);
            return;
        }
        RVLogger.d(this.LOG_TAG, "reload version compare fail, not refresh!");
    }

    public void setup(boolean z) {
        a(z, (AppModel) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0149, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(boolean r5, @androidx.annotation.Nullable com.alibaba.ariver.resource.api.models.AppModel r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.b     // Catch:{ all -> 0x014a }
            if (r0 == 0) goto L_0x000e
            java.lang.String r5 = r4.LOG_TAG     // Catch:{ all -> 0x014a }
            java.lang.String r6 = "already setupted!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r5, r6)     // Catch:{ all -> 0x014a }
            monitor-exit(r4)
            return
        L_0x000e:
            r0 = 1
            r4.b = r0     // Catch:{ all -> 0x014a }
            java.lang.String r0 = r4.LOG_TAG     // Catch:{ all -> 0x014a }
            java.lang.String r1 = "begin setup with lock: "
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x014a }
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x014a }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r1)     // Catch:{ all -> 0x014a }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x014a }
            r4.f10180a = r0     // Catch:{ all -> 0x014a }
            if (r6 == 0) goto L_0x002b
            r4.d = r6     // Catch:{ all -> 0x014a }
            goto L_0x0037
        L_0x002b:
            java.lang.String r6 = r4.appId     // Catch:{ all -> 0x014a }
            com.alibaba.ariver.resource.api.models.AppInfoQuery r6 = com.alibaba.ariver.resource.api.models.AppInfoQuery.make(r6)     // Catch:{ all -> 0x014a }
            com.alibaba.ariver.resource.api.models.AppModel r6 = r4.prepareAppModel(r6)     // Catch:{ all -> 0x014a }
            r4.d = r6     // Catch:{ all -> 0x014a }
        L_0x0037:
            com.alibaba.ariver.resource.api.proxy.RVAppInfoManager r6 = r4.mAppInfoManager     // Catch:{ all -> 0x014a }
            if (r6 != 0) goto L_0x0076
            com.alibaba.ariver.resource.api.models.AppModel r6 = r4.d     // Catch:{ all -> 0x014a }
            if (r6 != 0) goto L_0x0076
            boolean r5 = r4.hitPresetResource()     // Catch:{ all -> 0x014a }
            java.lang.String r6 = r4.LOG_TAG     // Catch:{ all -> 0x014a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x014a }
            java.lang.String r1 = " cannot find local version for: "
            r0.<init>(r1)     // Catch:{ all -> 0x014a }
            java.lang.String r1 = r4.appId     // Catch:{ all -> 0x014a }
            r0.append(r1)     // Catch:{ all -> 0x014a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x014a }
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r6, r0)     // Catch:{ all -> 0x014a }
            if (r5 == 0) goto L_0x0066
            java.lang.String r5 = r4.LOG_TAG     // Catch:{ all -> 0x014a }
            java.lang.String r6 = " hitPresetPkg!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r5, r6)     // Catch:{ all -> 0x014a }
            r4.onPrepareDone()     // Catch:{ all -> 0x014a }
            monitor-exit(r4)
            return
        L_0x0066:
            java.util.concurrent.CountDownLatch r5 = r4.getSetupLock()     // Catch:{ all -> 0x014a }
            r5.countDown()     // Catch:{ all -> 0x014a }
            java.util.concurrent.CountDownLatch r5 = r4.getParseLock()     // Catch:{ all -> 0x014a }
            r5.countDown()     // Catch:{ all -> 0x014a }
            monitor-exit(r4)
            return
        L_0x0076:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x014a }
            if (r5 == 0) goto L_0x0083
            java.lang.String r6 = r4.LOG_TAG     // Catch:{ all -> 0x014a }
            java.lang.String r2 = "prepareContent with lock!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r6, r2)     // Catch:{ all -> 0x014a }
        L_0x0083:
            java.lang.Class<com.alibaba.ariver.resource.api.proxy.RVResourcePresetProxy> r6 = com.alibaba.ariver.resource.api.proxy.RVResourcePresetProxy.class
            java.lang.Object r6 = com.alibaba.ariver.kernel.common.RVProxy.get(r6)     // Catch:{ all -> 0x014a }
            com.alibaba.ariver.resource.api.proxy.RVResourcePresetProxy r6 = (com.alibaba.ariver.resource.api.proxy.RVResourcePresetProxy) r6     // Catch:{ all -> 0x014a }
            java.util.Map r2 = r6.getPresetAppInfos()     // Catch:{ all -> 0x014a }
            if (r2 == 0) goto L_0x0106
            java.lang.String r3 = r4.appId     // Catch:{ all -> 0x014a }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x014a }
            com.alibaba.ariver.resource.api.models.AppModel r2 = (com.alibaba.ariver.resource.api.models.AppModel) r2     // Catch:{ all -> 0x014a }
            if (r2 == 0) goto L_0x00c6
            java.util.Map r6 = r6.getPresetPackage()     // Catch:{ all -> 0x014a }
            if (r6 == 0) goto L_0x00c6
            java.lang.String r3 = r4.appId     // Catch:{ all -> 0x014a }
            java.lang.Object r3 = r6.get(r3)     // Catch:{ all -> 0x014a }
            if (r3 == 0) goto L_0x00c6
            java.lang.String r3 = r4.appId     // Catch:{ all -> 0x014a }
            java.lang.Object r6 = r6.get(r3)     // Catch:{ all -> 0x014a }
            com.alibaba.ariver.resource.api.proxy.RVResourcePresetProxy$PresetPackage r6 = (com.alibaba.ariver.resource.api.proxy.RVResourcePresetProxy.PresetPackage) r6     // Catch:{ all -> 0x014a }
            boolean r6 = r6.isForceUse()     // Catch:{ all -> 0x014a }
            if (r6 == 0) goto L_0x00c6
            boolean r6 = r4.hitPresetResource()     // Catch:{ all -> 0x014a }
            if (r6 == 0) goto L_0x00c6
            java.lang.String r5 = r4.LOG_TAG     // Catch:{ all -> 0x014a }
            java.lang.String r6 = "prepareContent use preset force used flag!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r5, r6)     // Catch:{ all -> 0x014a }
            monitor-exit(r4)
            return
        L_0x00c6:
            if (r2 == 0) goto L_0x00e1
            java.util.Comparator<com.alibaba.ariver.resource.api.models.AppModel> r6 = com.alibaba.ariver.resource.api.models.AppModel.COMPARATOR     // Catch:{ all -> 0x014a }
            com.alibaba.ariver.resource.api.models.AppModel r3 = r4.d     // Catch:{ all -> 0x014a }
            int r6 = r6.compare(r3, r2)     // Catch:{ all -> 0x014a }
            if (r6 >= 0) goto L_0x00e1
            boolean r6 = r4.hitPresetResource()     // Catch:{ all -> 0x014a }
            if (r6 == 0) goto L_0x00e1
            java.lang.String r5 = r4.LOG_TAG     // Catch:{ all -> 0x014a }
            java.lang.String r6 = "prepareContent use preset because lower current AppInfo!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r5, r6)     // Catch:{ all -> 0x014a }
            monitor-exit(r4)
            return
        L_0x00e1:
            if (r2 == 0) goto L_0x0106
            com.alibaba.ariver.resource.api.models.AppModel r6 = r4.d     // Catch:{ all -> 0x014a }
            if (r6 == 0) goto L_0x0106
            com.alibaba.ariver.resource.api.models.AppModel r6 = r4.d     // Catch:{ all -> 0x014a }
            java.lang.String r6 = r6.getAppVersion()     // Catch:{ all -> 0x014a }
            java.lang.String r2 = r2.getAppVersion()     // Catch:{ all -> 0x014a }
            boolean r6 = android.text.TextUtils.equals(r6, r2)     // Catch:{ all -> 0x014a }
            if (r6 == 0) goto L_0x0106
            boolean r6 = r4.hitPresetResource()     // Catch:{ all -> 0x014a }
            if (r6 == 0) goto L_0x0106
            java.lang.String r5 = r4.LOG_TAG     // Catch:{ all -> 0x014a }
            java.lang.String r6 = "prepareContent just hit presetResource!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r5, r6)     // Catch:{ all -> 0x014a }
            monitor-exit(r4)
            return
        L_0x0106:
            com.alibaba.ariver.resource.api.models.AppModel r6 = r4.d     // Catch:{ all -> 0x014a }
            if (r6 == 0) goto L_0x0111
            com.alibaba.ariver.resource.api.models.AppModel r6 = r4.d     // Catch:{ all -> 0x014a }
            java.lang.String r6 = r6.getAppVersion()     // Catch:{ all -> 0x014a }
            goto L_0x0112
        L_0x0111:
            r6 = 0
        L_0x0112:
            r4.prepareContent(r6)     // Catch:{ all -> 0x014a }
            if (r5 == 0) goto L_0x0148
            java.util.concurrent.CountDownLatch r5 = r4.getSetupLock()     // Catch:{ InterruptedException -> 0x0123 }
            r2 = 5
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0123 }
            r5.await(r2, r6)     // Catch:{ InterruptedException -> 0x0123 }
            goto L_0x012b
        L_0x0123:
            r5 = move-exception
            java.lang.String r6 = r4.LOG_TAG     // Catch:{ all -> 0x014a }
            java.lang.String r2 = "prepareContent block error"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r6, r2, r5)     // Catch:{ all -> 0x014a }
        L_0x012b:
            java.lang.String r5 = r4.LOG_TAG     // Catch:{ all -> 0x014a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x014a }
            java.lang.String r2 = "prepareContent block "
            r6.<init>(r2)     // Catch:{ all -> 0x014a }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x014a }
            long r2 = r2 - r0
            r6.append(r2)     // Catch:{ all -> 0x014a }
            java.lang.String r0 = " ms"
            r6.append(r0)     // Catch:{ all -> 0x014a }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x014a }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r5, r6)     // Catch:{ all -> 0x014a }
        L_0x0148:
            monitor-exit(r4)
            return
        L_0x014a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.resource.content.BaseResourcePackage.a(boolean, com.alibaba.ariver.resource.api.models.AppModel):void");
    }

    /* access modifiers changed from: protected */
    public void onPrepareDone() {
        super.onPrepareDone();
        String str = this.LOG_TAG;
        StringBuilder sb = new StringBuilder("onPrepareDone cost: ");
        sb.append(SystemClock.elapsedRealtime() - this.f10180a);
        RVLogger.d(str, sb.toString());
    }

    /* access modifiers changed from: protected */
    public AppModel prepareAppModel(AppInfoQuery appInfoQuery) {
        ResourceContext resourceContext = this.mResourceContext;
        AppModel mainPackageInfo = (resourceContext == null || !this.appId.equalsIgnoreCase(resourceContext.getAppId())) ? null : this.mResourceContext.getMainPackageInfo();
        return mainPackageInfo == null ? this.mAppInfoManager.getAppModel(appInfoQuery) : mainPackageInfo;
    }

    /* access modifiers changed from: protected */
    public void prepareContent(@Nullable String str) {
        boolean z = false;
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-89631071, oncanceled);
            onCancelLoad.getMin(-89631071, oncanceled);
        }
        a(this.appId, str);
        boolean z2 = !TextUtils.isEmpty(this.appVersion) && !TextUtils.isEmpty(str) && !str.equalsIgnoreCase(this.appVersion);
        AppModel appModel = this.d;
        if (appModel != null && this.resourceManager.isAvailable(appModel)) {
            z = true;
        }
        String str2 = this.LOG_TAG;
        StringBuilder sb = new StringBuilder("prepareContent appId:");
        sb.append(this.appId);
        sb.append(" appVersion ");
        sb.append(str);
        sb.append(" installed:");
        sb.append(z);
        RVLogger.d(str2, sb.toString());
        if (z2 || count() == 0) {
            this.appVersion = str;
            if (!z) {
                onNotInstalled();
            } else {
                parseContent(this.appId, this.resourceManager.getInstallPath(this.d));
            }
        } else {
            RVLogger.d(this.LOG_TAG, "!versionChanged return");
        }
    }

    /* access modifiers changed from: private */
    public void a(String str, String str2) {
        StringBuilder sb = new StringBuilder("AriverRes:Package_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        this.LOG_TAG = sb.toString();
    }

    /* access modifiers changed from: package-private */
    public void hotUpdateApp(String str, @Nullable String str2) {
        if (this.mAppInfoManager == null) {
            RVLogger.e(this.LOG_TAG, "failed to get app provider!");
            return;
        }
        String str3 = this.LOG_TAG;
        StringBuilder sb = new StringBuilder("hotUpdateApp hotVersion: ");
        sb.append(str);
        sb.append(" appVersion:");
        sb.append(this.appVersion);
        RVLogger.d(str3, sb.toString());
        if (this.resourceManager.isAvailable(this.d)) {
            if (str2 == null) {
                str2 = this.resourceManager.getInstallPath(this.d);
            }
            parseContent(this.appId, str2);
            return;
        }
        RVLogger.w(this.LOG_TAG, "hot update but not installed!");
        getParseLock().countDown();
    }

    @Nullable
    public AppModel getAppModel() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("package {");
        sb.append(this.appId);
        sb.append("_");
        sb.append(this.appVersion);
        sb.append("} size: ");
        sb.append(count());
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public boolean hitPresetResource() {
        Map<String, RVResourcePresetProxy.PresetPackage> presetPackage;
        Map<String, AppModel> presetAppInfos;
        RVResourcePresetProxy rVResourcePresetProxy = (RVResourcePresetProxy) RVProxy.get(RVResourcePresetProxy.class);
        if (rVResourcePresetProxy == null || (presetPackage = rVResourcePresetProxy.getPresetPackage()) == null || !presetPackage.containsKey(this.appId)) {
            return false;
        }
        String str = this.LOG_TAG;
        StringBuilder sb = new StringBuilder("prepareForDegrade found preset pkg ");
        sb.append(this.appId);
        RVLogger.d(str, sb.toString());
        RVResourcePresetProxy.PresetPackage presetPackage2 = presetPackage.get(this.appId);
        if (this.mAppInfoManager.getAppModel(AppInfoQuery.make(this.appId).version(presetPackage2.getVersion())) == null && (presetAppInfos = rVResourcePresetProxy.getPresetAppInfos()) != null && presetAppInfos.containsKey(this.appId)) {
            this.d = presetAppInfos.get(this.appId);
        }
        if (this.d == null) {
            return false;
        }
        RVLogger.d(this.LOG_TAG, "prepareForDegrade start install preset pkg!");
        String version = presetPackage2.getVersion();
        this.appVersion = version;
        a(this.appId, version);
        return a(presetPackage2.getInputStream());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: com.alibaba.ariver.resource.parser.a.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.util.zip.ZipInputStream} */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007b, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r12 = new com.alibaba.ariver.resource.parser.a.e(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3 = new java.util.HashMap();
        com.alibaba.ariver.resource.parser.PackageParseUtils.readTarStreamIntoMemory(r3, r12, r2);
        r3 = r3.values().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0095, code lost:
        if (r3.hasNext() == false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0097, code lost:
        r6 = (com.alibaba.ariver.engine.api.resources.Resource) r3.next();
        add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
        if ((r6 instanceof com.alibaba.ariver.resource.api.content.OfflineResource) == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
        ((com.alibaba.ariver.resource.api.content.OfflineResource) r6).setBelongsPackage(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ae, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00af, code lost:
        r6 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b1, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b2, code lost:
        com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b5, code lost:
        throw r3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.io.InputStream r12) {
        /*
            r11 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r2 = r11.LOG_TAG
            java.lang.String r3 = "parsePresetStream start"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r2, r3)
            com.alibaba.ariver.resource.parser.ParseContext r2 = new com.alibaba.ariver.resource.parser.ParseContext
            r2.<init>()
            java.lang.String r3 = r11.appId
            r2.appId = r3
            r11.beforeParsePackage(r2)
            java.lang.String r3 = r2.mainFileName
            if (r3 != 0) goto L_0x002f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r11.appId
            r3.append(r4)
            java.lang.String r4 = ".tar"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L_0x0031
        L_0x002f:
            java.lang.String r3 = r2.mainFileName
        L_0x0031:
            r4 = 2048(0x800, float:2.87E-42)
            byte[] r4 = com.alibaba.ariver.kernel.common.utils.IOUtils.getBuf(r4)
            r5 = 0
            r6 = 0
            java.util.zip.ZipInputStream r7 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x00ed }
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00ed }
            r8.<init>(r12)     // Catch:{ Exception -> 0x00ed }
            r7.<init>(r8)     // Catch:{ Exception -> 0x00ed }
        L_0x0043:
            java.util.zip.ZipEntry r12 = r7.getNextEntry()     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            if (r12 == 0) goto L_0x00d0
            java.lang.String r12 = r12.getName()     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            java.lang.String r8 = "../"
            boolean r8 = r12.contains(r8)     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            if (r8 != 0) goto L_0x00b6
            java.lang.String r8 = "\\"
            boolean r8 = r12.contains(r8)     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            if (r8 != 0) goto L_0x00b6
            java.lang.String r8 = "%"
            boolean r8 = r12.contains(r8)     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            if (r8 == 0) goto L_0x0066
            goto L_0x00b6
        L_0x0066:
            java.lang.String r8 = r11.LOG_TAG     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            java.lang.String r9 = "parsePresetStream check target "
            java.lang.String r10 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            java.lang.String r9 = r9.concat(r10)     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r8, r9)     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            boolean r12 = android.text.TextUtils.equals(r12, r3)     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            if (r12 == 0) goto L_0x0043
            r5 = 1
            com.alibaba.ariver.resource.parser.a.e r12 = new com.alibaba.ariver.resource.parser.a.e     // Catch:{ all -> 0x00b1 }
            r12.<init>(r7)     // Catch:{ all -> 0x00b1 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x00ae }
            r3.<init>()     // Catch:{ all -> 0x00ae }
            com.alibaba.ariver.resource.parser.PackageParseUtils.readTarStreamIntoMemory(r3, r12, r2)     // Catch:{ all -> 0x00ae }
            java.util.Collection r3 = r3.values()     // Catch:{ all -> 0x00ae }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00ae }
        L_0x0091:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x00ae }
            if (r6 == 0) goto L_0x00aa
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x00ae }
            com.alibaba.ariver.engine.api.resources.Resource r6 = (com.alibaba.ariver.engine.api.resources.Resource) r6     // Catch:{ all -> 0x00ae }
            r11.add(r6)     // Catch:{ all -> 0x00ae }
            boolean r8 = r6 instanceof com.alibaba.ariver.resource.api.content.OfflineResource     // Catch:{ all -> 0x00ae }
            if (r8 == 0) goto L_0x0091
            com.alibaba.ariver.resource.api.content.OfflineResource r6 = (com.alibaba.ariver.resource.api.content.OfflineResource) r6     // Catch:{ all -> 0x00ae }
            r6.setBelongsPackage(r11)     // Catch:{ all -> 0x00ae }
            goto L_0x0091
        L_0x00aa:
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r12)     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            goto L_0x00d0
        L_0x00ae:
            r3 = move-exception
            r6 = r12
            goto L_0x00b2
        L_0x00b1:
            r3 = move-exception
        L_0x00b2:
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r6)     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            throw r3     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
        L_0x00b6:
            java.lang.String r8 = r11.LOG_TAG     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            java.lang.String r10 = "parsePresetStream entryName "
            r9.<init>(r10)     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            r9.append(r12)     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            java.lang.String r12 = " not safe!"
            r9.append(r12)     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            java.lang.String r12 = r9.toString()     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r8, r12)     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            goto L_0x0043
        L_0x00d0:
            java.util.concurrent.CountDownLatch r12 = r11.getSetupLock()
            r12.countDown()
            java.util.concurrent.CountDownLatch r12 = r11.getParseLock()
            r12.countDown()
            com.alibaba.ariver.kernel.common.utils.IOUtils.returnBuf(r4)
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r7)
            goto L_0x0109
        L_0x00e5:
            r12 = move-exception
            r6 = r7
            goto L_0x014a
        L_0x00e8:
            r12 = move-exception
            r6 = r7
            goto L_0x00ee
        L_0x00eb:
            r12 = move-exception
            goto L_0x014a
        L_0x00ed:
            r12 = move-exception
        L_0x00ee:
            java.lang.String r3 = r11.LOG_TAG     // Catch:{ all -> 0x00eb }
            java.lang.String r7 = "unZip exception"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r3, r7, r12)     // Catch:{ all -> 0x00eb }
            java.util.concurrent.CountDownLatch r12 = r11.getSetupLock()
            r12.countDown()
            java.util.concurrent.CountDownLatch r12 = r11.getParseLock()
            r12.countDown()
            com.alibaba.ariver.kernel.common.utils.IOUtils.returnBuf(r4)
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r6)
        L_0x0109:
            java.lang.String r12 = r2.appId
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x0114
            r11.afterParsePackage(r2)
        L_0x0114:
            if (r5 != 0) goto L_0x0131
            java.lang.String r12 = r11.LOG_TAG
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "parsePresetStream end with exception!!! cannot found "
            r0.<init>(r1)
            java.lang.String r1 = r11.appId
            r0.append(r1)
            java.lang.String r1 = ".tar !!!"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r12, r0)
            goto L_0x0149
        L_0x0131:
            java.lang.String r12 = r11.LOG_TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "parsePresetStream end cost "
            r2.<init>(r3)
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r0
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r12, r0)
        L_0x0149:
            return r5
        L_0x014a:
            java.util.concurrent.CountDownLatch r0 = r11.getSetupLock()
            r0.countDown()
            java.util.concurrent.CountDownLatch r0 = r11.getParseLock()
            r0.countDown()
            com.alibaba.ariver.kernel.common.utils.IOUtils.returnBuf(r4)
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r6)
            goto L_0x0160
        L_0x015f:
            throw r12
        L_0x0160:
            goto L_0x015f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.resource.content.BaseResourcePackage.a(java.io.InputStream):boolean");
    }

    final class HotUpdatePackageInstallCallback implements PackageInstallCallback {

        /* renamed from: a  reason: collision with root package name */
        private boolean f10181a = false;

        HotUpdatePackageInstallCallback() {
        }

        HotUpdatePackageInstallCallback(boolean z) {
            this.f10181a = z;
        }

        public final void onResult(boolean z, String str) {
            String str2 = BaseResourcePackage.this.LOG_TAG;
            StringBuilder sb = new StringBuilder("HotUpdatePackageInstallCallback onResult install result: ");
            sb.append(z);
            sb.append(" installPath: ");
            sb.append(str);
            sb.append(" forceUpdate: ");
            sb.append(this.f10181a);
            RVLogger.d(str2, sb.toString());
            if (BaseResourcePackage.this.isDetached() || !z) {
                RVLogger.d(BaseResourcePackage.this.LOG_TAG, "HotUpdatePackageInstallCallback onResult already released!");
                BaseResourcePackage.this.getSetupLock().countDown();
                BaseResourcePackage.this.getParseLock().countDown();
                return;
            }
            if (BaseResourcePackage.this.d == null) {
                BaseResourcePackage baseResourcePackage = BaseResourcePackage.this;
                AppModel unused = baseResourcePackage.d = baseResourcePackage.mAppInfoManager.getAppModel(AppInfoQuery.make(BaseResourcePackage.this.appId).version(BaseResourcePackage.this.appVersion));
            }
            if (BaseResourcePackage.this.d == null) {
                RVLogger.e(BaseResourcePackage.this.LOG_TAG, "HotUpdatePackageInstallCallback onResult do not have AppModel!!!");
                BaseResourcePackage.this.onPrepareDone();
                return;
            }
            BaseResourcePackage baseResourcePackage2 = BaseResourcePackage.this;
            baseResourcePackage2.appVersion = baseResourcePackage2.d.getAppVersion();
            if (!this.f10181a) {
                BaseResourcePackage baseResourcePackage3 = BaseResourcePackage.this;
                if (!baseResourcePackage3.canHotUpdate(baseResourcePackage3.appVersion)) {
                    RVLogger.d(BaseResourcePackage.this.LOG_TAG, "canHotUpdate false");
                    return;
                }
            }
            BaseResourcePackage baseResourcePackage4 = BaseResourcePackage.this;
            baseResourcePackage4.a(baseResourcePackage4.d.getAppId(), BaseResourcePackage.this.d.getAppVersion());
            BaseResourcePackage baseResourcePackage5 = BaseResourcePackage.this;
            baseResourcePackage5.hotUpdateApp(baseResourcePackage5.d.getAppVersion(), str);
        }
    }

    /* access modifiers changed from: package-private */
    public void setAppModel(@Nullable AppModel appModel) {
        this.d = appModel;
    }
}
