package com.alibaba.ariver.resource.subpackage;

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
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.LangResourceUtil;
import com.alibaba.ariver.kernel.common.utils.PatternUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.R;
import com.alibaba.ariver.resource.api.ResourceContext;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.parser.PackageParseUtils;
import com.alibaba.ariver.resource.parser.ParseContext;
import com.alibaba.ariver.resource.runtime.ResourceContextManager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
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
    public Set<String> f9039a = new HashSet();
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
        if (appModel == null) {
            RVLogger.w("AriverRes:SubPackageBridgeExtension", "loadSubPackage...non appModel");
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, "非分包模式_1"));
        } else if (appModel.getAppInfoModel() == null) {
            RVLogger.w("AriverRes:SubPackageBridgeExtension", "loadSubPackage...non getAppInfoModel".concat(String.valueOf(appModel)));
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, "非分包模式_2"));
        } else if (appModel.getAppInfoModel().getSubPackages() == null) {
            RVLogger.w("AriverRes:SubPackageBridgeExtension", "loadSubPackage...non getSubPackages".concat(String.valueOf(appModel)));
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, "非分包模式_3"));
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
                    if (!this.f9039a.contains(string)) {
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
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, LangResourceUtil.getString(R.string.ariver_resource_network_is_dismatch)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void a(com.alibaba.ariver.app.api.App r17, com.alibaba.ariver.resource.api.models.AppModel r18, java.util.List<java.lang.String> r19, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r20, boolean r21) {
        /*
            r16 = this;
            r10 = r16
            r0 = r19
            r11 = r20
            monitor-enter(r16)
            if (r0 == 0) goto L_0x009d
            boolean r1 = r19.isEmpty()     // Catch:{ all -> 0x00c5 }
            if (r1 == 0) goto L_0x0011
            goto L_0x009d
        L_0x0011:
            com.alibaba.ariver.resource.api.models.AppInfoModel r1 = r18.getAppInfoModel()     // Catch:{ all -> 0x00c5 }
            com.alibaba.fastjson.JSONObject r12 = r1.getSubPackages()     // Catch:{ all -> 0x00c5 }
            r1 = 0
            r13 = 0
        L_0x001b:
            int r1 = r19.size()     // Catch:{ all -> 0x00c5 }
            if (r13 >= r1) goto L_0x0094
            java.lang.Object r1 = r0.get(r13)     // Catch:{ all -> 0x00c5 }
            r14 = r1
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x00c5 }
            java.lang.String r9 = r12.getString(r14)     // Catch:{ all -> 0x00c5 }
            java.util.Map<java.lang.String, java.util.concurrent.Future<com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse>> r1 = r10.b     // Catch:{ all -> 0x00c5 }
            java.lang.Object r1 = r1.get(r9)     // Catch:{ all -> 0x00c5 }
            r3 = r1
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3     // Catch:{ all -> 0x00c5 }
            if (r3 == 0) goto L_0x005a
            java.lang.String r0 = "AriverRes:SubPackageBridgeExtension"
            java.lang.String r1 = "prepareSubPackage reuse task "
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x00c5 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r1)     // Catch:{ all -> 0x00c5 }
            com.alibaba.ariver.kernel.common.service.executor.ExecutorType r0 = com.alibaba.ariver.kernel.common.service.executor.ExecutorType.IO     // Catch:{ all -> 0x00c5 }
            com.alibaba.ariver.resource.subpackage.SubPackageBridgeExtension$1 r7 = new com.alibaba.ariver.resource.subpackage.SubPackageBridgeExtension$1     // Catch:{ all -> 0x00c5 }
            r1 = r7
            r2 = r16
            r4 = r9
            r5 = r21
            r6 = r20
            r1.<init>(r3, r4, r5, r6)     // Catch:{ all -> 0x00c5 }
            com.alibaba.ariver.kernel.common.utils.ExecutorUtils.runNotOnMain(r0, r7)     // Catch:{ all -> 0x00c5 }
            monitor-exit(r16)
            return
        L_0x005a:
            com.alibaba.ariver.resource.subpackage.SubPackageBridgeExtension$a r6 = new com.alibaba.ariver.resource.subpackage.SubPackageBridgeExtension$a     // Catch:{ all -> 0x00c5 }
            r1 = 0
            r6.<init>()     // Catch:{ all -> 0x00c5 }
            java.util.Map<java.lang.String, java.util.concurrent.Future<com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse>> r1 = r10.b     // Catch:{ all -> 0x00c5 }
            r1.put(r9, r6)     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = "AriverRes:SubPackageBridgeExtension"
            java.lang.String r2 = "prepareSubPackage begin task for "
            java.lang.String r3 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00c5 }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x00c5 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r1, r2)     // Catch:{ all -> 0x00c5 }
            com.alibaba.ariver.resource.subpackage.SubPackageBridgeExtension$2 r15 = new com.alibaba.ariver.resource.subpackage.SubPackageBridgeExtension$2     // Catch:{ all -> 0x00c5 }
            r1 = r15
            r2 = r16
            r3 = r18
            r4 = r14
            r5 = r17
            r7 = r21
            r8 = r20
            r1.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00c5 }
            com.alibaba.ariver.resource.subpackage.SubPackageDownloader r1 = new com.alibaba.ariver.resource.subpackage.SubPackageDownloader     // Catch:{ all -> 0x00c5 }
            r2 = r17
            r3 = r18
            r1.<init>(r2, r3, r14, r15)     // Catch:{ all -> 0x00c5 }
            r1.a()     // Catch:{ all -> 0x00c5 }
            int r13 = r13 + 1
            goto L_0x001b
        L_0x0094:
            if (r21 != 0) goto L_0x009b
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse r0 = com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.SUCCESS     // Catch:{ all -> 0x00c5 }
            r11.sendBridgeResponse(r0)     // Catch:{ all -> 0x00c5 }
        L_0x009b:
            monitor-exit(r16)
            return
        L_0x009d:
            r2 = r17
            java.lang.String r0 = "AriverRes:SubPackageBridgeExtension"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = "loadSubPackage...no valid root need load: "
            r1.<init>(r3)     // Catch:{ all -> 0x00c5 }
            java.lang.String r2 = r17.getAppId()     // Catch:{ all -> 0x00c5 }
            r1.append(r2)     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00c5 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r0, r1)     // Catch:{ all -> 0x00c5 }
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse$Error r0 = new com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse$Error     // Catch:{ all -> 0x00c5 }
            r1 = 13
            java.lang.String r2 = "无有效的分包"
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00c5 }
            r11.sendBridgeResponse(r0)     // Catch:{ all -> 0x00c5 }
            monitor-exit(r16)
            return
        L_0x00c5:
            r0 = move-exception
            monitor-exit(r16)
            goto L_0x00c9
        L_0x00c8:
            throw r0
        L_0x00c9:
            goto L_0x00c8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.resource.subpackage.SubPackageBridgeExtension.a(com.alibaba.ariver.app.api.App, com.alibaba.ariver.resource.api.models.AppModel, java.util.List, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback, boolean):void");
    }

    /* access modifiers changed from: protected */
    public void onVerifyError(com.alibaba.ariver.resource.parser.a aVar) {
        ParseContext parseContext = aVar.getParseContext();
        if (parseContext != null) {
            StringBuilder sb = new StringBuilder("onVerifyError, delete sub packagePath: ");
            sb.append(parseContext.packagePath);
            RVLogger.w("AriverRes:SubPackageBridgeExtension", sb.toString());
            FileUtils.delete(parseContext.packagePath);
        }
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
        Map<String, Resource> parsePackage = PackageParseUtils.parsePackage(parseContext);
        ResourceContext resourceContext = ResourceContextManager.getInstance().get(appModel.getAppId());
        if (resourceContext != null && resourceContext.getMainPackage() != null) {
            for (Resource next : parsePackage.values()) {
                RVLogger.d("AriverRes:SubPackageBridgeExtension", "add subPackage resource: ".concat(String.valueOf(next)));
                resourceContext.getMainPackage().add(next);
            }
        }
    }

    class a implements Future<BridgeResponse> {
        private CountDownLatch b;
        private BridgeResponse c;

        public boolean cancel(boolean z) {
            return false;
        }

        public boolean isCancelled() {
            return false;
        }

        private a() {
            this.b = new CountDownLatch(1);
            this.c = null;
        }

        public synchronized void a(BridgeResponse bridgeResponse) {
            RVLogger.d("AriverRes:SubPackageBridgeExtension", "ResultDispatchFuture set result ".concat(String.valueOf(bridgeResponse)));
            this.c = bridgeResponse;
            this.b.countDown();
        }

        public boolean isDone() {
            return this.b.getCount() == 0;
        }

        /* renamed from: a */
        public BridgeResponse get() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.b.await(30, TimeUnit.SECONDS);
            StringBuilder sb = new StringBuilder("ResultDispatchFuture wait task dispatch for ");
            sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
            RVLogger.d("AriverRes:SubPackageBridgeExtension", sb.toString());
            return this.c;
        }

        /* renamed from: a */
        public BridgeResponse get(long j, @NonNull TimeUnit timeUnit) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.b.await(j, timeUnit);
            StringBuilder sb = new StringBuilder("ResultDispatchFuture wait task dispatch for ");
            sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
            RVLogger.d("AriverRes:SubPackageBridgeExtension", sb.toString());
            return this.c;
        }
    }
}
