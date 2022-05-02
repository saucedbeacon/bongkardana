package com.alibaba.griver.core.jsapi.subpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.network.NetworkUtil;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.PatternUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.ResourceContext;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.parser.PackageParseUtils;
import com.alibaba.ariver.resource.parser.ParseContext;
import com.alibaba.ariver.resource.runtime.ResourceContextManager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.core.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class SubPackageBridgeExtension implements BridgeExtension {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Set<String> f9070a = new HashSet();
    /* access modifiers changed from: private */
    public final Map<String, Future<BridgeResponse>> b = new ConcurrentHashMap();

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    @ThreadType(ExecutorType.URGENT_DISPLAY)
    @ActionFilter
    public void loadSubPackage(@BindingNode(App.class) App app, @BindingParam({"preload"}) String str, @BindingParam(required = true, value = {"packages"}) JSONArray jSONArray, @BindingCallback BridgeCallback bridgeCallback) {
        AppModel appModel = (AppModel) app.getData(AppModel.class);
        if (appModel == null || appModel.getAppInfoModel() == null || appModel.getAppInfoModel().getSubPackages() == null) {
            RVLogger.w("AriverRes:SubPackageBridgeExtension", "loadSubPackage...non subPackage mode");
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, GriverEnv.getResources().getString(R.string.griver_core_no_subpackage_configuration)));
        } else if (!"wifi".equals(str) || TextUtils.equals("WIFI", NetworkUtil.getDetailNetworkType(app.getAppContext().getContext()))) {
            ArrayList arrayList = new ArrayList();
            JSONObject subPackages = appModel.getAppInfoModel().getSubPackages();
            boolean z = true;
            for (int i = 0; i < jSONArray.size(); i++) {
                String string = jSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    if (TextUtils.isEmpty(subPackages.getString(string))) {
                        if (string.endsWith("/")) {
                            string = string.substring(0, string.length() - 1);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append(string);
                            sb.append("/");
                            string = sb.toString();
                        }
                        if (!TextUtils.isEmpty(subPackages.getString(string))) {
                            StringBuilder sb2 = new StringBuilder("loadSubPackage, root path non-match, adapted here, rootAttrib: ");
                            sb2.append(string);
                            sb2.append(" correct rootPath: ");
                            sb2.append(string);
                            RVLogger.d("AriverRes:SubPackageBridgeExtension", sb2.toString());
                        }
                    }
                    if (!this.f9070a.contains(string)) {
                        arrayList.add(string);
                        z = false;
                    }
                }
            }
            if (z) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
                RVLogger.d("AriverRes:SubPackageBridgeExtension", "loadSubPackage... all packages has loaded.");
                return;
            }
            a(app, appModel, arrayList, bridgeCallback, jSONArray.size() == 1);
        } else {
            RVLogger.w("AriverRes:SubPackageBridgeExtension", "loadSubPackage...networkType is dismatch:".concat(String.valueOf(str)));
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, GriverEnv.getResources().getString(R.string.griver_core_sub_package_download_network_mismatch)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0097, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void a(com.alibaba.ariver.app.api.App r16, com.alibaba.ariver.resource.api.models.AppModel r17, java.util.List<java.lang.String> r18, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r19, boolean r20) {
        /*
            r15 = this;
            r9 = r15
            r0 = r18
            r10 = r19
            monitor-enter(r15)
            if (r0 == 0) goto L_0x0098
            boolean r1 = r18.isEmpty()     // Catch:{ all -> 0x00c7 }
            if (r1 == 0) goto L_0x0010
            goto L_0x0098
        L_0x0010:
            com.alibaba.ariver.resource.api.models.AppInfoModel r1 = r17.getAppInfoModel()     // Catch:{ all -> 0x00c7 }
            com.alibaba.fastjson.JSONObject r11 = r1.getSubPackages()     // Catch:{ all -> 0x00c7 }
            r1 = 0
            r12 = 0
        L_0x001a:
            int r1 = r18.size()     // Catch:{ all -> 0x00c7 }
            if (r12 >= r1) goto L_0x008f
            java.lang.Object r1 = r0.get(r12)     // Catch:{ all -> 0x00c7 }
            r13 = r1
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x00c7 }
            java.lang.String r8 = r11.getString(r13)     // Catch:{ all -> 0x00c7 }
            java.util.Map<java.lang.String, java.util.concurrent.Future<com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse>> r1 = r9.b     // Catch:{ all -> 0x00c7 }
            java.lang.Object r1 = r1.get(r8)     // Catch:{ all -> 0x00c7 }
            r3 = r1
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3     // Catch:{ all -> 0x00c7 }
            if (r3 == 0) goto L_0x0058
            java.lang.String r0 = "AriverRes:SubPackageBridgeExtension"
            java.lang.String r1 = "prepareSubPackage reuse task "
            java.lang.String r2 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x00c7 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r1)     // Catch:{ all -> 0x00c7 }
            com.alibaba.ariver.kernel.common.service.executor.ExecutorType r0 = com.alibaba.ariver.kernel.common.service.executor.ExecutorType.IO     // Catch:{ all -> 0x00c7 }
            com.alibaba.griver.core.jsapi.subpackage.SubPackageBridgeExtension$1 r7 = new com.alibaba.griver.core.jsapi.subpackage.SubPackageBridgeExtension$1     // Catch:{ all -> 0x00c7 }
            r1 = r7
            r2 = r15
            r4 = r8
            r5 = r20
            r6 = r19
            r1.<init>(r3, r4, r5, r6)     // Catch:{ all -> 0x00c7 }
            com.alibaba.ariver.kernel.common.utils.ExecutorUtils.runNotOnMain(r0, r7)     // Catch:{ all -> 0x00c7 }
            monitor-exit(r15)
            return
        L_0x0058:
            com.alibaba.griver.core.jsapi.subpackage.SubPackageBridgeExtension$ResultDispatchFuture r5 = new com.alibaba.griver.core.jsapi.subpackage.SubPackageBridgeExtension$ResultDispatchFuture     // Catch:{ all -> 0x00c7 }
            r1 = 0
            r5.<init>()     // Catch:{ all -> 0x00c7 }
            java.util.Map<java.lang.String, java.util.concurrent.Future<com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse>> r1 = r9.b     // Catch:{ all -> 0x00c7 }
            r1.put(r8, r5)     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = "AriverRes:SubPackageBridgeExtension"
            java.lang.String r2 = "prepareSubPackage begin task for "
            java.lang.String r3 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x00c7 }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x00c7 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r1, r2)     // Catch:{ all -> 0x00c7 }
            com.alibaba.griver.core.jsapi.subpackage.SubPackageBridgeExtension$2 r14 = new com.alibaba.griver.core.jsapi.subpackage.SubPackageBridgeExtension$2     // Catch:{ all -> 0x00c7 }
            r1 = r14
            r2 = r15
            r3 = r17
            r4 = r13
            r6 = r20
            r7 = r19
            r1.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00c7 }
            com.alibaba.ariver.resource.subpackage.SubPackageDownloader r1 = new com.alibaba.ariver.resource.subpackage.SubPackageDownloader     // Catch:{ all -> 0x00c7 }
            r2 = r16
            r3 = r17
            r1.<init>(r2, r3, r13, r14)     // Catch:{ all -> 0x00c7 }
            r1.a()     // Catch:{ all -> 0x00c7 }
            int r12 = r12 + 1
            goto L_0x001a
        L_0x008f:
            if (r20 != 0) goto L_0x0096
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse r0 = com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.SUCCESS     // Catch:{ all -> 0x00c7 }
            r10.sendBridgeResponse(r0)     // Catch:{ all -> 0x00c7 }
        L_0x0096:
            monitor-exit(r15)
            return
        L_0x0098:
            r2 = r16
            java.lang.String r0 = "AriverRes:SubPackageBridgeExtension"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c7 }
            java.lang.String r3 = "loadSubPackage...no valid root need load: "
            r1.<init>(r3)     // Catch:{ all -> 0x00c7 }
            java.lang.String r2 = r16.getAppId()     // Catch:{ all -> 0x00c7 }
            r1.append(r2)     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00c7 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r0, r1)     // Catch:{ all -> 0x00c7 }
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse$Error r0 = new com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse$Error     // Catch:{ all -> 0x00c7 }
            r1 = 13
            android.content.res.Resources r2 = com.alibaba.griver.base.common.env.GriverEnv.getResources()     // Catch:{ all -> 0x00c7 }
            int r3 = com.alibaba.griver.core.R.string.griver_core_sub_package_no_valid_package     // Catch:{ all -> 0x00c7 }
            java.lang.String r2 = r2.getString(r3)     // Catch:{ all -> 0x00c7 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00c7 }
            r10.sendBridgeResponse(r0)     // Catch:{ all -> 0x00c7 }
            monitor-exit(r15)
            return
        L_0x00c7:
            r0 = move-exception
            monitor-exit(r15)
            goto L_0x00cb
        L_0x00ca:
            throw r0
        L_0x00cb:
            goto L_0x00ca
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.jsapi.subpackage.SubPackageBridgeExtension.a(com.alibaba.ariver.app.api.App, com.alibaba.ariver.resource.api.models.AppModel, java.util.List, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback, boolean):void");
    }

    /* access modifiers changed from: private */
    public void a(AppModel appModel, String str) {
        if (TextUtils.isEmpty(appModel.getAppId()) || TextUtils.isEmpty(str)) {
            RVLogger.w("AriverRes:SubPackageBridgeExtension", "parseIntoResourceContext callback...appId downloadUrl is null");
            return;
        }
        ParseContext parseContext = new ParseContext();
        parseContext.appId = appModel.getAppId();
        parseContext.onlineHost = appModel.getAppInfoModel().getVhost();
        parseContext.packagePath = str;
        parseContext.ignorePatterns = Collections.singletonList(PatternUtils.compile(RVConstants.FILE_API_PERMISSION));
        if ("yes".equalsIgnoreCase(GriverConfig.getConfig(GriverConfigConstants.KEY_SHOULD_VERIFY_APP, "YES"))) {
            parseContext.needVerify = true;
        } else {
            parseContext.needVerify = false;
        }
        Map<String, Resource> parsePackage = PackageParseUtils.parsePackage(parseContext);
        ResourceContext resourceContext = ResourceContextManager.getInstance().get(appModel.getAppId());
        if (resourceContext != null && resourceContext.getMainPackage() != null) {
            for (Resource next : parsePackage.values()) {
                RVLogger.d("AriverRes:SubPackageBridgeExtension", "add subPackage resource: ".concat(String.valueOf(next)));
                resourceContext.getMainPackage().add(next);
            }
        }
    }

    class ResultDispatchFuture implements Future<BridgeResponse> {

        /* renamed from: a  reason: collision with root package name */
        private CountDownLatch f9071a;
        private BridgeResponse b;

        public boolean cancel(boolean z) {
            return false;
        }

        public boolean isCancelled() {
            return false;
        }

        private ResultDispatchFuture() {
            this.f9071a = new CountDownLatch(1);
            this.b = null;
        }

        public synchronized void setResult(BridgeResponse bridgeResponse) {
            RVLogger.d("AriverRes:SubPackageBridgeExtension", "ResultDispatchFuture set result ".concat(String.valueOf(bridgeResponse)));
            this.b = bridgeResponse;
            this.f9071a.countDown();
        }

        public boolean isDone() {
            return this.f9071a.getCount() == 0;
        }

        public BridgeResponse get() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f9071a.await(30, TimeUnit.SECONDS);
            StringBuilder sb = new StringBuilder("ResultDispatchFuture wait task dispatch for ");
            sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
            RVLogger.d("AriverRes:SubPackageBridgeExtension", sb.toString());
            return this.b;
        }

        public BridgeResponse get(long j, @NonNull TimeUnit timeUnit) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f9071a.await(j, timeUnit);
            StringBuilder sb = new StringBuilder("ResultDispatchFuture wait task dispatch for ");
            sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
            RVLogger.d("AriverRes:SubPackageBridgeExtension", sb.toString());
            return this.b;
        }
    }
}
