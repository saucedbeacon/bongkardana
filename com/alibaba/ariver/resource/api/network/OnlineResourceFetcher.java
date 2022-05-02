package com.alibaba.ariver.resource.api.network;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.content.NetworkStream;
import com.alibaba.ariver.resource.api.content.OnlineResource;
import com.alibaba.ariver.resource.api.models.AppModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineResourceFetcher {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f10176a;
    /* access modifiers changed from: private */
    public final Map<String, Resource> b = new HashMap();
    private boolean c = false;
    private FallbackListener d;

    public interface FallbackListener {
        void onFailed(String str);

        void onSuccess(String str, Resource resource);
    }

    static {
        ArrayList arrayList = new ArrayList();
        f10176a = arrayList;
        arrayList.add(RVConstants.FILE_API_PERMISSION);
        f10176a.add(RVConstants.FILE_APP_CONFIG);
        f10176a.add(RVConstants.FILE_TABBAR);
        f10176a.add("index.js");
        f10176a.add("index.worker.js");
        f10176a.add("index.html");
    }

    public void setFallbackListener(FallbackListener fallbackListener) {
        this.d = fallbackListener;
    }

    public boolean contains(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.b.containsKey(str);
    }

    public boolean hasKeyResourceFallback() {
        return this.c;
    }

    public void startFallback(AppModel appModel) {
        if (appModel != null && appModel.getAppInfoModel() != null && !TextUtils.isEmpty(appModel.getAppInfoModel().getFallbackBaseUrl())) {
            String fallbackBaseUrl = appModel.getAppInfoModel().getFallbackBaseUrl();
            for (String combinePath : f10176a) {
                prefetchUrl(FileUtils.combinePath(fallbackBaseUrl, combinePath));
            }
            this.c = true;
            RVLogger.d("AriverRes:OnlineResourceFetcher");
        }
    }

    public void prefetchUrl(final String str) {
        if (!TextUtils.isEmpty(str) && !this.b.containsKey(str)) {
            RVLogger.d("AriverRes:OnlineResourceFetcher", "prefetchUrl: ".concat(String.valueOf(str)));
            ExecutorUtils.runNotOnMain(ExecutorType.NETWORK, new Runnable() {
                public void run() {
                    OnlineResourceFetcher.this.getOnlineResource(str, false, (String) null);
                }
            });
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005f, code lost:
        r7 = r5.b.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0067, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r8 = r1.getBytes();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
        if (r8 == null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
        if (r8.length != 0) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        r1 = new com.alibaba.ariver.resource.api.content.OfflineResource(r6, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        if (r5.d == null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        r5.d.onSuccess(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        r2 = new java.lang.StringBuilder("getOnlineResource [");
        r2.append(r6);
        r2.append("] got length: ");
        r2.append(r8.length);
        com.alibaba.ariver.kernel.common.utils.RVLogger.w("AriverRes:OnlineResourceFetcher", r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009f, code lost:
        if (r5.d == null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a1, code lost:
        r5.d.onFailed(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a6, code lost:
        r5.b.remove(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ab, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ac, code lost:
        r1.setSourceType(com.alibaba.ariver.engine.api.resources.ResourceSourceType.FALLBACK);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b1, code lost:
        return r1;
     */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.alibaba.ariver.engine.api.resources.Resource getOnlineResource(java.lang.String r6, boolean r7, java.lang.String r8) {
        /*
            r5 = this;
            java.util.Map<java.lang.String, com.alibaba.ariver.engine.api.resources.Resource> r0 = r5.b
            java.lang.Object r0 = r0.get(r6)
            com.alibaba.ariver.engine.api.resources.Resource r0 = (com.alibaba.ariver.engine.api.resources.Resource) r0
            if (r0 == 0) goto L_0x001a
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "getOnlineResource hit cache: "
            java.lang.String r6 = r7.concat(r6)
            java.lang.String r7 = "AriverRes:OnlineResourceFetcher"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r7, r6)
            return r0
        L_0x001a:
            java.util.Map<java.lang.String, com.alibaba.ariver.engine.api.resources.Resource> r0 = r5.b
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.alibaba.ariver.engine.api.resources.Resource> r1 = r5.b     // Catch:{ all -> 0x00b5 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x00b5 }
            com.alibaba.ariver.engine.api.resources.Resource r1 = (com.alibaba.ariver.engine.api.resources.Resource) r1     // Catch:{ all -> 0x00b5 }
            if (r1 != 0) goto L_0x005e
            java.lang.String r1 = "AriverRes:OnlineResourceFetcher"
            java.lang.String r2 = "getOnlineResource miss cache: "
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x00b5 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r1, r2)     // Catch:{ all -> 0x00b5 }
            boolean r1 = com.alibaba.ariver.kernel.common.utils.UrlUtils.isValidUrl(r6)     // Catch:{ all -> 0x00b5 }
            if (r1 != 0) goto L_0x0055
            java.lang.String r1 = "YES"
            java.lang.Class<com.alibaba.ariver.kernel.common.service.RVConfigService> r2 = com.alibaba.ariver.kernel.common.service.RVConfigService.class
            java.lang.Object r2 = com.alibaba.ariver.kernel.common.RVProxy.get(r2)     // Catch:{ all -> 0x00b5 }
            com.alibaba.ariver.kernel.common.service.RVConfigService r2 = (com.alibaba.ariver.kernel.common.service.RVConfigService) r2     // Catch:{ all -> 0x00b5 }
            java.lang.String r3 = "h5_disableUrlCheck"
            r4 = 0
            java.lang.String r2 = r2.getConfigWithProcessCache(r3, r4)     // Catch:{ all -> 0x00b5 }
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch:{ all -> 0x00b5 }
            if (r1 != 0) goto L_0x0055
            monitor-exit(r0)     // Catch:{ all -> 0x00b5 }
            return r4
        L_0x0055:
            com.alibaba.ariver.engine.api.resources.Resource r1 = r5.createOnlineResource(r6, r7, r8)     // Catch:{ all -> 0x00b5 }
            java.util.Map<java.lang.String, com.alibaba.ariver.engine.api.resources.Resource> r7 = r5.b     // Catch:{ all -> 0x00b5 }
            r7.put(r6, r1)     // Catch:{ all -> 0x00b5 }
        L_0x005e:
            monitor-exit(r0)     // Catch:{ all -> 0x00b5 }
            java.util.Map<java.lang.String, com.alibaba.ariver.engine.api.resources.Resource> r7 = r5.b
            java.lang.Object r7 = r7.get(r6)
            com.alibaba.ariver.engine.api.resources.Resource r7 = (com.alibaba.ariver.engine.api.resources.Resource) r7
            monitor-enter(r7)
            byte[] r8 = r1.getBytes()     // Catch:{ all -> 0x00b2 }
            if (r8 == 0) goto L_0x009d
            int r0 = r8.length     // Catch:{ all -> 0x00b2 }
            if (r0 != 0) goto L_0x0072
            goto L_0x009d
        L_0x0072:
            com.alibaba.ariver.resource.api.content.OfflineResource r1 = new com.alibaba.ariver.resource.api.content.OfflineResource     // Catch:{ all -> 0x00b2 }
            r1.<init>(r6, r8)     // Catch:{ all -> 0x00b2 }
            com.alibaba.ariver.resource.api.network.OnlineResourceFetcher$FallbackListener r0 = r5.d     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x0080
            com.alibaba.ariver.resource.api.network.OnlineResourceFetcher$FallbackListener r0 = r5.d     // Catch:{ all -> 0x00b2 }
            r0.onSuccess(r6, r1)     // Catch:{ all -> 0x00b2 }
        L_0x0080:
            java.lang.String r0 = "AriverRes:OnlineResourceFetcher"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = "getOnlineResource ["
            r2.<init>(r3)     // Catch:{ all -> 0x00b2 }
            r2.append(r6)     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = "] got length: "
            r2.append(r6)     // Catch:{ all -> 0x00b2 }
            int r6 = r8.length     // Catch:{ all -> 0x00b2 }
            r2.append(r6)     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x00b2 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r0, r6)     // Catch:{ all -> 0x00b2 }
            goto L_0x00ab
        L_0x009d:
            com.alibaba.ariver.resource.api.network.OnlineResourceFetcher$FallbackListener r8 = r5.d     // Catch:{ all -> 0x00b2 }
            if (r8 == 0) goto L_0x00a6
            com.alibaba.ariver.resource.api.network.OnlineResourceFetcher$FallbackListener r8 = r5.d     // Catch:{ all -> 0x00b2 }
            r8.onFailed(r6)     // Catch:{ all -> 0x00b2 }
        L_0x00a6:
            java.util.Map<java.lang.String, com.alibaba.ariver.engine.api.resources.Resource> r8 = r5.b     // Catch:{ all -> 0x00b2 }
            r8.remove(r6)     // Catch:{ all -> 0x00b2 }
        L_0x00ab:
            monitor-exit(r7)     // Catch:{ all -> 0x00b2 }
            com.alibaba.ariver.engine.api.resources.ResourceSourceType r6 = com.alibaba.ariver.engine.api.resources.ResourceSourceType.FALLBACK
            r1.setSourceType(r6)
            return r1
        L_0x00b2:
            r6 = move-exception
            monitor-exit(r7)
            throw r6
        L_0x00b5:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.resource.api.network.OnlineResourceFetcher.getOnlineResource(java.lang.String, boolean, java.lang.String):com.alibaba.ariver.engine.api.resources.Resource");
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    public Resource createOnlineResource(String str, boolean z, @Nullable String str2) {
        OnlineResource onlineResource = new OnlineResource(str, new ResourceListener(str));
        if (!TextUtils.isEmpty(str2)) {
            onlineResource.addRequestHeader("x-mass-tappid", str2);
        }
        onlineResource.setPackageRequest(z);
        return onlineResource;
    }

    class ResourceListener implements NetworkStream.Listener {

        /* renamed from: a  reason: collision with root package name */
        private final String f10177a;

        public void onInputClose(NetworkStream networkStream) {
        }

        public void onInputOpen(NetworkStream networkStream) {
        }

        public ResourceListener(String str) {
            this.f10177a = str;
        }

        public void onResourceError(NetworkStream networkStream, int i) {
            StringBuilder sb = new StringBuilder("online resource [");
            sb.append(this.f10177a);
            sb.append("] miss!");
            RVLogger.w("AriverRes:OnlineResourceFetcher", sb.toString());
            OnlineResourceFetcher.this.b.remove(this.f10177a);
        }

        public void onInputException() {
            StringBuilder sb = new StringBuilder("online resource [");
            sb.append(this.f10177a);
            sb.append("] miss!");
            RVLogger.w("AriverRes:OnlineResourceFetcher", sb.toString());
            OnlineResourceFetcher.this.b.remove(this.f10177a);
        }
    }
}
