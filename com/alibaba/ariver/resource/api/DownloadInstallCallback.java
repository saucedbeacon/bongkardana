package com.alibaba.ariver.resource.api;

import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.models.AppModel;

public class DownloadInstallCallback implements PackageDownloadCallback {

    /* renamed from: a  reason: collision with root package name */
    private boolean f10165a;
    private boolean b;
    /* access modifiers changed from: private */
    public PackageInstallCallback c;
    /* access modifiers changed from: private */
    public AppModel d;

    public void onPrepare(@Nullable String str) {
    }

    public void onProgress(String str, int i) {
    }

    public DownloadInstallCallback(AppModel appModel) {
        this(appModel, false, false, (PackageInstallCallback) null);
    }

    public DownloadInstallCallback(AppModel appModel, boolean z, boolean z2, @Nullable PackageInstallCallback packageInstallCallback) {
        this.d = appModel;
        this.f10165a = z;
        this.b = z2;
        this.c = packageInstallCallback;
    }

    public void onCancel(@Nullable String str) {
        RVLogger.d("AriverRes:DownloadInstallCallback", "onCancel, url: ".concat(String.valueOf(str)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r3 = (com.alibaba.ariver.resource.api.proxy.RVResourceManager) com.alibaba.ariver.kernel.common.RVProxy.get(com.alibaba.ariver.resource.api.proxy.RVResourceManager.class);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFinish(@androidx.annotation.Nullable java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "onFinish, url: "
            java.lang.String r3 = r0.concat(r3)
            java.lang.String r0 = "AriverRes:DownloadInstallCallback"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r3)
            boolean r3 = r2.f10165a
            if (r3 == 0) goto L_0x002e
            java.lang.Class<com.alibaba.ariver.resource.api.proxy.RVResourceManager> r3 = com.alibaba.ariver.resource.api.proxy.RVResourceManager.class
            java.lang.Object r3 = com.alibaba.ariver.kernel.common.RVProxy.get(r3)
            com.alibaba.ariver.resource.api.proxy.RVResourceManager r3 = (com.alibaba.ariver.resource.api.proxy.RVResourceManager) r3
            if (r3 == 0) goto L_0x002e
            boolean r0 = r2.b
            if (r0 == 0) goto L_0x0024
            com.alibaba.ariver.kernel.common.service.executor.ExecutorType r0 = com.alibaba.ariver.kernel.common.service.executor.ExecutorType.URGENT_DISPLAY
            goto L_0x0026
        L_0x0024:
            com.alibaba.ariver.kernel.common.service.executor.ExecutorType r0 = com.alibaba.ariver.kernel.common.service.executor.ExecutorType.IO
        L_0x0026:
            com.alibaba.ariver.resource.api.DownloadInstallCallback$1 r1 = new com.alibaba.ariver.resource.api.DownloadInstallCallback$1
            r1.<init>(r3)
            com.alibaba.ariver.kernel.common.utils.ExecutorUtils.execute(r0, r1)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.resource.api.DownloadInstallCallback.onFinish(java.lang.String):void");
    }

    public void onFailed(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder("onFinish, url: ");
        sb.append(str);
        sb.append(", errorCode: ");
        sb.append(i);
        sb.append(", errorMsg: ");
        sb.append(str2);
        RVLogger.d("AriverRes:DownloadInstallCallback", sb.toString());
        PackageInstallCallback packageInstallCallback = this.c;
        if (packageInstallCallback != null) {
            packageInstallCallback.onResult(false, (String) null);
        }
    }
}
