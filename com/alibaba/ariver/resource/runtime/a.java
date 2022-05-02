package com.alibaba.ariver.resource.runtime;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.UrlUtils;
import com.alibaba.ariver.resource.api.ResourceContext;
import com.alibaba.ariver.resource.api.content.NetworkStream;
import com.alibaba.ariver.resource.api.content.OfflineResource;
import com.alibaba.ariver.resource.api.content.ResourcePackage;
import com.alibaba.ariver.resource.api.content.ResourceProvider;
import com.alibaba.ariver.resource.api.content.ResourceQuery;
import com.alibaba.ariver.resource.api.extension.ResourceProviderPoint;
import com.alibaba.ariver.resource.api.models.AppInfoQuery;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.network.OnlineResourceFetcher;
import com.alibaba.ariver.resource.api.proxy.RVAppInfoManager;
import com.alibaba.ariver.resource.content.GlobalPackagePool;
import com.alibaba.fastjson.JSONObject;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class a implements NetworkStream.Listener, ResourceProvider {
    private static int equals = 1;
    private static byte[] getMax = {-113, -58, -14, -35, -38};
    private static int getMin = -1812709262;
    private static int isInside = 0;
    private static int length = 1725625334;
    private static short[] setMax;
    private static int setMin = 118;

    /* renamed from: a  reason: collision with root package name */
    private String f10207a;
    private Map<String, String> b;
    private final List<NetworkStream> c;
    private final List<InputStream> d;
    private HashMap<String, Resource> e;
    private Map<String, String> f;
    private boolean g;
    private boolean h;
    private boolean i;
    private String j;
    private String k;
    private boolean l;
    private ResourceContext m;
    private OnlineResourceFetcher n;

    /* renamed from: o  reason: collision with root package name */
    private RVAppInfoManager f10208o;
    private ResourceProviderPoint p;
    private String q;
    private App r;
    private boolean s;
    private boolean t;

    static /* synthetic */ ResourceContext a(a aVar) {
        int i2 = isInside + 45;
        equals = i2 % 128;
        int i3 = i2 % 2;
        ResourceContext resourceContext = aVar.m;
        try {
            int i4 = isInside + 101;
            try {
                equals = i4 % 128;
                if ((i4 % 2 == 0 ? 24 : 'Y') != 24) {
                    return resourceContext;
                }
                int i5 = 17 / 0;
                return resourceContext;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    public a(ResourceContext resourceContext) {
        try {
            this.g = false;
            this.h = false;
            this.i = false;
            this.l = false;
            RVAppInfoManager rVAppInfoManager = null;
            this.f10208o = rVAppInfoManager;
            this.s = false;
            this.t = false;
            this.m = resourceContext;
            this.e = new HashMap<>();
            this.n = resourceContext.getOnlineResourceFetcher();
            this.p = ExtensionPoint.as(ResourceProviderPoint.class).node(resourceContext.getApp()).create();
            if (resourceContext.getMainPackageInfo() != null) {
                this.q = resourceContext.getMainPackageInfo().getAppInfoModel().getVhost();
                this.f10207a = resourceContext.getMainPackageInfo().getAppInfoModel().getFallbackBaseUrl();
                int i2 = equals + 51;
                isInside = i2 % 128;
                int i3 = i2 % 2;
            }
            this.c = Collections.synchronizedList(new ArrayList());
            this.d = Collections.synchronizedList(new ArrayList());
            this.b = Collections.synchronizedMap(new HashMap());
            this.f10208o = (RVAppInfoManager) RVProxy.get(RVAppInfoManager.class);
            this.r = this.m.getApp();
            RVConfigService rVConfigService = (RVConfigService) RVProxy.get(RVConfigService.class);
            if (rVConfigService != null) {
                int i4 = equals + 119;
                isInside = i4 % 128;
                if ((i4 % 2 != 0 ? 'N' : ':') != 'N') {
                    this.s = "yes".equalsIgnoreCase(rVConfigService.getConfigWithProcessCache("h5_enableUseAppxHtmlNebulaX", ""));
                    this.t = "yes".equalsIgnoreCase(rVConfigService.getConfigWithProcessCache("h5_enableInlineAppxJsFile", ""));
                } else {
                    this.s = "yes".equalsIgnoreCase(rVConfigService.getConfigWithProcessCache("h5_enableUseAppxHtmlNebulaX", ""));
                    this.t = "yes".equalsIgnoreCase(rVConfigService.getConfigWithProcessCache("h5_enableInlineAppxJsFile", ""));
                    super.hashCode();
                }
                try {
                    int i5 = equals + 43;
                    isInside = i5 % 128;
                    int i6 = i5 % 2;
                } catch (Exception e2) {
                    throw e2;
                }
            }
            c();
            int i7 = isInside + 61;
            equals = i7 % 128;
            if (!(i7 % 2 != 0)) {
                int i8 = 81 / 0;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    private void c() {
        String str;
        this.f = new ConcurrentHashMap();
        if ("YES".equalsIgnoreCase(BundleUtils.getString(this.r.getStartParams(), RVParams.APPX_ROUTE_FRAMEWORK)) && BundleUtils.contains(this.r.getStartParams(), RVParams.APPX_ROUTE_BIZPREFIX)) {
            int i2 = isInside + 103;
            equals = i2 % 128;
            int i3 = i2 % 2;
            String string = BundleUtils.getString(this.r.getStartParams(), RVParams.APPX_ROUTE_BIZPREFIX);
            if (!TextUtils.isEmpty(string)) {
                Map<String, String> map = this.f;
                String combinePath = FileUtils.combinePath(this.q, "index.js");
                String str2 = this.q;
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append("index.js");
                map.put(combinePath, FileUtils.combinePath(str2, sb.toString()));
                Map<String, String> map2 = this.f;
                String combinePath2 = FileUtils.combinePath(this.q, "index.html");
                String str3 = this.q;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append("index.html");
                map2.put(combinePath2, FileUtils.combinePath(str3, sb2.toString()));
                Map<String, String> map3 = this.f;
                String combinePath3 = FileUtils.combinePath(this.q, "index.worker.js");
                String str4 = this.q;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append("index.worker.js");
                map3.put(combinePath3, FileUtils.combinePath(str4, sb3.toString()));
                AppModel appModel = (AppModel) this.r.getData(AppModel.class);
                if (appModel != null) {
                    try {
                        if (appModel.getAppInfoModel() != null) {
                            int i4 = isInside + 19;
                            equals = i4 % 128;
                            if (i4 % 2 == 0) {
                                JSONObject subPackages = appModel.getAppInfoModel().getSubPackages();
                                Object obj = null;
                                super.hashCode();
                                if (subPackages == null) {
                                    return;
                                }
                            } else if (appModel.getAppInfoModel().getSubPackages() == null) {
                                return;
                            }
                            Set<String> keySet = appModel.getAppInfoModel().getSubPackages().keySet();
                            if (keySet != null) {
                                int i5 = equals + 3;
                                isInside = i5 % 128;
                                int i6 = i5 % 2;
                                if (!keySet.isEmpty()) {
                                    Iterator<String> it = keySet.iterator();
                                    while (true) {
                                        if (!(!it.hasNext())) {
                                            int i7 = equals + 83;
                                            isInside = i7 % 128;
                                            if (i7 % 2 != 0) {
                                                str = it.next();
                                                int i8 = 75 / 0;
                                                if ((!TextUtils.isEmpty(str) ? (char) 27 : 22) != 27) {
                                                }
                                            } else {
                                                str = it.next();
                                                if (TextUtils.isEmpty(str)) {
                                                }
                                            }
                                            try {
                                                if (!"whole".equalsIgnoreCase(str)) {
                                                    int i9 = equals + 45;
                                                    isInside = i9 % 128;
                                                    int i10 = i9 % 2;
                                                    if (!"main".equalsIgnoreCase(str)) {
                                                        Map<String, String> map4 = this.f;
                                                        String str5 = this.q;
                                                        StringBuilder sb4 = new StringBuilder();
                                                        sb4.append(str);
                                                        sb4.append("/index.worker.js");
                                                        String combinePath4 = FileUtils.combinePath(str5, sb4.toString());
                                                        String str6 = this.q;
                                                        StringBuilder sb5 = new StringBuilder();
                                                        sb5.append(str);
                                                        sb5.append("/");
                                                        sb5.append(string);
                                                        sb5.append("index.worker.js");
                                                        map4.put(combinePath4, FileUtils.combinePath(str6, sb5.toString()));
                                                        Map<String, String> map5 = this.f;
                                                        String str7 = this.q;
                                                        StringBuilder sb6 = new StringBuilder();
                                                        sb6.append(str);
                                                        sb6.append("/index.js");
                                                        String combinePath5 = FileUtils.combinePath(str7, sb6.toString());
                                                        String str8 = this.q;
                                                        StringBuilder sb7 = new StringBuilder();
                                                        sb7.append(str);
                                                        sb7.append("/");
                                                        sb7.append(string);
                                                        sb7.append("index.js");
                                                        map5.put(combinePath5, FileUtils.combinePath(str8, sb7.toString()));
                                                    }
                                                }
                                            } catch (Exception e2) {
                                                throw e2;
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Exception e3) {
                        throw e3;
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.alibaba.ariver.engine.api.resources.Resource] */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x029f, code lost:
        if (com.alibaba.ariver.resource.api.models.AppInfoScene.isDevSource(r5) == false) goto L_0x02a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x041b, code lost:
        if (r6.endsWith("/favicon.png") == false) goto L_0x041d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01bc, code lost:
        if (android.text.TextUtils.isEmpty(r10) == false) goto L_0x01be;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x025e A[Catch:{ Exception -> 0x0103, all -> 0x04d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0261 A[Catch:{ Exception -> 0x0103, all -> 0x04d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0307 A[Catch:{ Exception -> 0x0103, all -> 0x04d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0308 A[Catch:{ Exception -> 0x0103, all -> 0x04d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x030b A[Catch:{ Exception -> 0x0103, all -> 0x04d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03dc A[Catch:{ Exception -> 0x0103, all -> 0x04d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0093 A[Catch:{ Exception -> 0x0103, all -> 0x04d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d0 A[SYNTHETIC, Splitter:B:47:0x00d0] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x017e A[SYNTHETIC, Splitter:B:71:0x017e] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01eb A[Catch:{ Exception -> 0x0103, all -> 0x04d0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.alibaba.ariver.engine.api.resources.Resource getContent(com.alibaba.ariver.resource.api.content.ResourceQuery r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            java.lang.String r2 = "index.html"
            java.lang.String r3 = "https://appx"
            java.lang.String r4 = "AriverRes:ContentProvider"
            r5 = 0
            r18.a()     // Catch:{ all -> 0x04d0 }
            java.lang.String r6 = r0.pureUrl     // Catch:{ all -> 0x04d0 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x04d0 }
            if (r7 == 0) goto L_0x001c
            java.lang.String r0 = "invalid url parameter"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x04d0 }
            return r5
        L_0x001c:
            java.lang.String r7 = "file://"
            boolean r7 = r6.startsWith(r7)     // Catch:{ all -> 0x04d0 }
            java.lang.String r8 = "https://"
            if (r7 != 0) goto L_0x0042
            java.lang.String r7 = "http://"
            boolean r7 = r6.startsWith(r7)     // Catch:{ all -> 0x04d0 }
            if (r7 != 0) goto L_0x0042
            boolean r7 = r6.startsWith(r8)     // Catch:{ all -> 0x04d0 }
            if (r7 != 0) goto L_0x0042
            java.lang.String r0 = "skip load resource for "
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x04d0 }
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r0)     // Catch:{ all -> 0x04d0 }
            return r5
        L_0x0042:
            boolean r7 = r19.isMainDoc()     // Catch:{ all -> 0x04d0 }
            java.lang.String r6 = com.alibaba.ariver.kernel.common.utils.UrlUtils.purifyUrl(r6)     // Catch:{ all -> 0x04d0 }
            boolean r9 = r6.startsWith(r3)     // Catch:{ all -> 0x04d0 }
            r11 = 91
            if (r9 == 0) goto L_0x0055
            r9 = 51
            goto L_0x0057
        L_0x0055:
            r9 = 91
        L_0x0057:
            java.lang.String r12 = "https://appx-ng"
            r13 = 0
            if (r9 == r11) goto L_0x0085
            boolean r9 = r19.isAppxNgRoute()     // Catch:{ all -> 0x04d0 }
            if (r9 == 0) goto L_0x0085
            java.lang.String r9 = r6.replace(r3, r12)     // Catch:{ all -> 0x04d0 }
            java.lang.String r14 = r0.pureUrl     // Catch:{ all -> 0x04d0 }
            java.lang.String r14 = r14.replace(r3, r12)     // Catch:{ all -> 0x04d0 }
            r0.pureUrl = r14     // Catch:{ all -> 0x04d0 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x04d0 }
            java.lang.String r15 = "appx-ng replace "
            r14.<init>(r15)     // Catch:{ all -> 0x04d0 }
            java.lang.String r15 = r0.pureUrl     // Catch:{ all -> 0x04d0 }
            r14.append(r15)     // Catch:{ all -> 0x04d0 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r14)     // Catch:{ all -> 0x04d0 }
            r0.setCanUseFallback(r13)     // Catch:{ all -> 0x04d0 }
            goto L_0x0086
        L_0x0085:
            r9 = r6
        L_0x0086:
            java.util.Map<java.lang.String, java.lang.String> r14 = r1.f     // Catch:{ all -> 0x04d0 }
            boolean r14 = r14.containsKey(r6)     // Catch:{ all -> 0x04d0 }
            r15 = 19
            r16 = 2
            r10 = 1
            if (r14 == 0) goto L_0x00c1
            boolean r14 = r19.isAppxNgRoute()     // Catch:{ all -> 0x04d0 }
            if (r14 == 0) goto L_0x009b
            r14 = 0
            goto L_0x009c
        L_0x009b:
            r14 = 1
        L_0x009c:
            if (r14 == r10) goto L_0x00c1
            int r9 = equals
            int r9 = r9 + r15
            int r14 = r9 % 128
            isInside = r14
            int r9 = r9 % 2
            if (r9 == 0) goto L_0x00b7
            java.util.Map<java.lang.String, java.lang.String> r9 = r1.f     // Catch:{ all -> 0x04d0 }
            java.lang.Object r9 = r9.get(r6)     // Catch:{ all -> 0x04d0 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x04d0 }
            r0.pureUrl = r9     // Catch:{ all -> 0x04d0 }
            r14 = 10
            int r14 = r14 / r13
            goto L_0x00c1
        L_0x00b7:
            java.util.Map<java.lang.String, java.lang.String> r9 = r1.f     // Catch:{ all -> 0x04d0 }
            java.lang.Object r9 = r9.get(r6)     // Catch:{ all -> 0x04d0 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x04d0 }
            r0.pureUrl = r9     // Catch:{ all -> 0x04d0 }
        L_0x00c1:
            boolean r14 = r6.startsWith(r3)     // Catch:{ all -> 0x04d0 }
            if (r14 == 0) goto L_0x00c9
            r14 = 1
            goto L_0x00ca
        L_0x00c9:
            r14 = 0
        L_0x00ca:
            java.lang.String r15 = "https://appx/af-appx.min.js"
            if (r14 == r10) goto L_0x00d0
            goto L_0x0178
        L_0x00d0:
            boolean r14 = r6.startsWith(r15)     // Catch:{ all -> 0x04d0 }
            if (r14 == 0) goto L_0x0106
            int r14 = isInside     // Catch:{ Exception -> 0x0103 }
            int r14 = r14 + 31
            int r11 = r14 % 128
            equals = r11     // Catch:{ Exception -> 0x0103 }
            int r14 = r14 % 2
            java.lang.String r11 = "js_renderFrameworkStart"
            if (r14 != 0) goto L_0x00f5
            java.lang.Class<com.alibaba.ariver.kernel.api.track.EventTracker> r14 = com.alibaba.ariver.kernel.api.track.EventTracker.class
            java.lang.Object r14 = com.alibaba.ariver.kernel.common.RVProxy.get(r14)     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.kernel.api.track.EventTracker r14 = (com.alibaba.ariver.kernel.api.track.EventTracker) r14     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.app.api.App r10 = r1.r     // Catch:{ all -> 0x04d0 }
            r14.stub(r10, r11)     // Catch:{ all -> 0x04d0 }
            r10 = 14
            int r10 = r10 / r13
            goto L_0x0159
        L_0x00f5:
            java.lang.Class<com.alibaba.ariver.kernel.api.track.EventTracker> r10 = com.alibaba.ariver.kernel.api.track.EventTracker.class
            java.lang.Object r10 = com.alibaba.ariver.kernel.common.RVProxy.get(r10)     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.kernel.api.track.EventTracker r10 = (com.alibaba.ariver.kernel.api.track.EventTracker) r10     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.app.api.App r14 = r1.r     // Catch:{ all -> 0x04d0 }
            r10.stub(r14, r11)     // Catch:{ all -> 0x04d0 }
            goto L_0x0159
        L_0x0103:
            r0 = move-exception
            goto L_0x0300
        L_0x0106:
            java.lang.String r10 = "https://appx/af-appx.worker.min.js"
            boolean r10 = r6.startsWith(r10)     // Catch:{ all -> 0x04d0 }
            if (r10 == 0) goto L_0x0159
            com.alibaba.ariver.app.api.App r10 = r1.r     // Catch:{ all -> 0x04d0 }
            java.lang.String r11 = "appxRouteWorker"
            boolean r14 = r19.isAppxNgRoute()     // Catch:{ all -> 0x04d0 }
            r10.putBooleanValue(r11, r14)     // Catch:{ all -> 0x04d0 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x04d0 }
            java.lang.String r11 = "appx-ng set appxRouteWorker is "
            r10.<init>(r11)     // Catch:{ all -> 0x04d0 }
            boolean r11 = r19.isAppxNgRoute()     // Catch:{ all -> 0x04d0 }
            r10.append(r11)     // Catch:{ all -> 0x04d0 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r10)     // Catch:{ all -> 0x04d0 }
            java.lang.Class<com.alibaba.ariver.kernel.api.track.EventTracker> r10 = com.alibaba.ariver.kernel.api.track.EventTracker.class
            java.lang.Object r10 = com.alibaba.ariver.kernel.common.RVProxy.get(r10)     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.kernel.api.track.EventTracker r10 = (com.alibaba.ariver.kernel.api.track.EventTracker) r10     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.app.api.App r11 = r1.r     // Catch:{ all -> 0x04d0 }
            java.lang.String r14 = "appxRoute"
            boolean r17 = r19.isAppxNgRoute()     // Catch:{ all -> 0x04d0 }
            if (r17 == 0) goto L_0x0143
            java.lang.String r17 = "yes"
            goto L_0x0145
        L_0x0143:
            java.lang.String r17 = "no"
        L_0x0145:
            r13 = r17
            r10.addAttr(r11, r14, r13)     // Catch:{ all -> 0x04d0 }
            java.lang.Class<com.alibaba.ariver.kernel.api.track.EventTracker> r10 = com.alibaba.ariver.kernel.api.track.EventTracker.class
            java.lang.Object r10 = com.alibaba.ariver.kernel.common.RVProxy.get(r10)     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.kernel.api.track.EventTracker r10 = (com.alibaba.ariver.kernel.api.track.EventTracker) r10     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.app.api.App r11 = r1.r     // Catch:{ all -> 0x04d0 }
            java.lang.String r13 = "js_workerFrameworkStart"
            r10.stub(r11, r13)     // Catch:{ all -> 0x04d0 }
        L_0x0159:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x04d0 }
            java.lang.String r11 = "app "
            r10.<init>(r11)     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.app.api.App r11 = r1.r     // Catch:{ all -> 0x04d0 }
            long r13 = r11.getNodeId()     // Catch:{ all -> 0x04d0 }
            r10.append(r13)     // Catch:{ all -> 0x04d0 }
            java.lang.String r11 = "load "
            r10.append(r11)     // Catch:{ all -> 0x04d0 }
            r10.append(r6)     // Catch:{ all -> 0x04d0 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r10)     // Catch:{ all -> 0x04d0 }
        L_0x0178:
            boolean r10 = r1.i     // Catch:{ all -> 0x04d0 }
            java.lang.String r11 = "ResFallback"
            if (r10 == 0) goto L_0x01dd
            boolean r10 = r6.startsWith(r3)     // Catch:{ all -> 0x04d0 }
            if (r10 == 0) goto L_0x01dd
            int r10 = isInside
            int r10 = r10 + 61
            int r13 = r10 % 128
            equals = r13
            int r10 = r10 % 2
            java.lang.String r13 = "hasTinyGoOnline true use tinyRes again "
            if (r10 != 0) goto L_0x01a9
            java.lang.String r10 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x04d0 }
            java.lang.String r10 = r13.concat(r10)     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r10)     // Catch:{ all -> 0x04d0 }
            java.lang.String r10 = r18.a((com.alibaba.ariver.resource.api.content.ResourceQuery) r19)     // Catch:{ all -> 0x04d0 }
            boolean r13 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x04d0 }
            int r14 = r5.length     // Catch:{ all -> 0x04d0 }
            if (r13 != 0) goto L_0x01dd
            goto L_0x01be
        L_0x01a9:
            java.lang.String r10 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x04d0 }
            java.lang.String r10 = r13.concat(r10)     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r10)     // Catch:{ all -> 0x04d0 }
            java.lang.String r10 = r18.a((com.alibaba.ariver.resource.api.content.ResourceQuery) r19)     // Catch:{ all -> 0x04d0 }
            boolean r13 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x04d0 }
            if (r13 != 0) goto L_0x01dd
        L_0x01be:
            java.lang.String r0 = r9.replace(r8, r10)     // Catch:{ all -> 0x04d0 }
            java.lang.Class<com.alibaba.ariver.kernel.api.track.EventTracker> r2 = com.alibaba.ariver.kernel.api.track.EventTracker.class
            java.lang.Object r2 = com.alibaba.ariver.kernel.common.RVProxy.get(r2)     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.kernel.api.track.EventTracker r2 = (com.alibaba.ariver.kernel.api.track.EventTracker) r2     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.app.api.App r3 = r1.r     // Catch:{ all -> 0x04d0 }
            r2.stub(r3, r11)     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.resource.api.network.OnlineResourceFetcher r2 = r1.n     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.resource.api.ResourceContext r3 = r1.m     // Catch:{ all -> 0x04d0 }
            java.lang.String r3 = r3.getAppId()     // Catch:{ all -> 0x04d0 }
            r6 = 1
            com.alibaba.ariver.engine.api.resources.Resource r0 = r2.getOnlineResource(r0, r6, r3)     // Catch:{ all -> 0x04d0 }
            return r0
        L_0x01dd:
            java.lang.String r10 = r1.q     // Catch:{ all -> 0x04d0 }
            java.lang.String r10 = com.alibaba.ariver.kernel.common.utils.FileUtils.combinePath(r10, r2)     // Catch:{ all -> 0x04d0 }
            boolean r10 = r6.equalsIgnoreCase(r10)     // Catch:{ all -> 0x04d0 }
            r13 = 100
            if (r10 == 0) goto L_0x0252
            com.alibaba.ariver.resource.api.ResourceContext r10 = r1.m     // Catch:{ all -> 0x04d0 }
            java.lang.String r14 = r0.originUrl     // Catch:{ all -> 0x04d0 }
            byte[] r10 = r10.getSnapshotIndex(r14)     // Catch:{ all -> 0x04d0 }
            if (r10 != 0) goto L_0x01f8
            r5 = 1
            r14 = 0
            goto L_0x01fa
        L_0x01f8:
            r5 = 1
            r14 = 1
        L_0x01fa:
            if (r14 == r5) goto L_0x0210
            com.alibaba.ariver.resource.api.ResourceContext r5 = r1.m     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.app.api.App r5 = r5.getApp()     // Catch:{ all -> 0x04d0 }
            if (r5 == 0) goto L_0x0210
            com.alibaba.ariver.resource.api.ResourceContext r5 = r1.m     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.app.api.App r5 = r5.getApp()     // Catch:{ all -> 0x04d0 }
            java.lang.String r10 = r0.originUrl     // Catch:{ all -> 0x04d0 }
            byte[] r10 = com.alibaba.ariver.resource.api.snapshot.RVSnapshotUtils.loadSnapshotFile(r5, r10)     // Catch:{ all -> 0x04d0 }
        L_0x0210:
            r5 = 53
            if (r10 == 0) goto L_0x0217
            r14 = 19
            goto L_0x0219
        L_0x0217:
            r14 = 53
        L_0x0219:
            if (r14 == r5) goto L_0x0252
            int r5 = r10.length     // Catch:{ all -> 0x04d0 }
            if (r5 <= r13) goto L_0x0252
            java.lang.String r0 = "SnapshotProvider use snapshotData success! "
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x04d0 }
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r0)     // Catch:{ all -> 0x04d0 }
            java.lang.Class<com.alibaba.ariver.kernel.api.track.EventTracker> r0 = com.alibaba.ariver.kernel.api.track.EventTracker.class
            java.lang.Object r0 = com.alibaba.ariver.kernel.common.RVProxy.get(r0)     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.kernel.api.track.EventTracker r0 = (com.alibaba.ariver.kernel.api.track.EventTracker) r0     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.app.api.App r2 = r1.r     // Catch:{ all -> 0x04d0 }
            java.lang.String r3 = "UseSnapShot"
            r0.stub(r2, r3)     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.resource.api.content.OfflineResource r0 = new com.alibaba.ariver.resource.api.content.OfflineResource     // Catch:{ all -> 0x04d0 }
            r0.<init>(r6, r10)     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.engine.api.resources.ResourceSourceType r2 = com.alibaba.ariver.engine.api.resources.ResourceSourceType.SNAPSHOT     // Catch:{ all -> 0x04d0 }
            r0.setSourceType(r2)     // Catch:{ all -> 0x04d0 }
            int r2 = isInside     // Catch:{ Exception -> 0x024f }
            int r2 = r2 + 41
            int r3 = r2 % 128
            equals = r3
            int r2 = r2 % 2
            return r0
        L_0x024f:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x0252:
            com.alibaba.ariver.resource.api.ResourceContext r5 = r1.m     // Catch:{ all -> 0x04d0 }
            android.os.Bundle r5 = r5.getStartParams()     // Catch:{ all -> 0x04d0 }
            boolean r10 = r1.s     // Catch:{ all -> 0x04d0 }
            r14 = 15
            if (r10 == 0) goto L_0x0261
            r10 = 76
            goto L_0x0263
        L_0x0261:
            r10 = 15
        L_0x0263:
            if (r10 == r14) goto L_0x0301
            java.lang.String r10 = r1.q     // Catch:{ all -> 0x04d0 }
            java.lang.String r10 = com.alibaba.ariver.kernel.common.utils.FileUtils.combinePath(r10, r2)     // Catch:{ all -> 0x04d0 }
            boolean r10 = r6.equalsIgnoreCase(r10)     // Catch:{ all -> 0x04d0 }
            if (r10 == 0) goto L_0x0301
            int r10 = equals
            int r10 = r10 + 125
            int r14 = r10 % 128
            isInside = r14
            int r10 = r10 % 2
            java.lang.String r10 = "isTinyApp"
            r14 = 0
            boolean r10 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getBoolean(r5, r10, r14)     // Catch:{ all -> 0x04d0 }
            if (r10 == 0) goto L_0x0301
            int r10 = equals
            int r10 = r10 + 69
            int r14 = r10 % 128
            isInside = r14
            int r10 = r10 % 2
            if (r10 == 0) goto L_0x029b
            boolean r5 = com.alibaba.ariver.resource.api.models.AppInfoScene.isDevSource(r5)     // Catch:{ all -> 0x04d0 }
            r10 = 0
            super.hashCode()     // Catch:{ all -> 0x04d0 }
            if (r5 != 0) goto L_0x0301
            goto L_0x02a1
        L_0x029b:
            boolean r5 = com.alibaba.ariver.resource.api.models.AppInfoScene.isDevSource(r5)     // Catch:{ all -> 0x04d0 }
            if (r5 != 0) goto L_0x0301
        L_0x02a1:
            int r5 = equals     // Catch:{ Exception -> 0x0103 }
            int r5 = r5 + 107
            int r10 = r5 % 128
            isInside = r10     // Catch:{ Exception -> 0x0103 }
            int r5 = r5 % 2
            java.lang.String r5 = "use appx html:\t"
            java.lang.String r10 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x04d0 }
            java.lang.String r5 = r5.concat(r10)     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r5)     // Catch:{ all -> 0x04d0 }
            boolean r5 = r19.isAppxNgRoute()     // Catch:{ all -> 0x04d0 }
            if (r5 == 0) goto L_0x02c5
            java.lang.String r2 = com.alibaba.ariver.kernel.common.utils.FileUtils.combinePath(r12, r2)     // Catch:{ all -> 0x04d0 }
            r0.pureUrl = r2     // Catch:{ all -> 0x04d0 }
            goto L_0x02cb
        L_0x02c5:
            java.lang.String r2 = com.alibaba.ariver.kernel.common.utils.FileUtils.combinePath(r3, r2)     // Catch:{ all -> 0x04d0 }
            r0.pureUrl = r2     // Catch:{ all -> 0x04d0 }
        L_0x02cb:
            com.alibaba.ariver.engine.api.resources.Resource r2 = r18.getRawResource(r19)     // Catch:{ all -> 0x04d0 }
            if (r2 != 0) goto L_0x02d9
            r0.pureUrl = r9     // Catch:{ all -> 0x04d0 }
            java.lang.String r2 = "replace html file fail , global package is null"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r2)     // Catch:{ all -> 0x04d0 }
            goto L_0x0301
        L_0x02d9:
            boolean r5 = r1.t     // Catch:{ all -> 0x04d0 }
            if (r5 == 0) goto L_0x0301
            byte[] r0 = r2.getBytes()     // Catch:{ all -> 0x04d0 }
            java.lang.Object r0 = r0.clone()     // Catch:{ all -> 0x04d0 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x04d0 }
            byte[] r3 = com.alibaba.ariver.resource.runtime.b.f10210a     // Catch:{ all -> 0x04d0 }
            byte[] r5 = com.alibaba.ariver.resource.runtime.b.b     // Catch:{ all -> 0x04d0 }
            java.lang.String r6 = r1.q     // Catch:{ all -> 0x04d0 }
            byte[] r0 = com.alibaba.ariver.resource.runtime.b.a((byte[]) r0, (byte[]) r3, (byte[]) r5, (java.lang.String) r6, (com.alibaba.ariver.resource.runtime.a) r1)     // Catch:{ all -> 0x04d0 }
            if (r0 == 0) goto L_0x02ff
            int r3 = r0.length     // Catch:{ all -> 0x04d0 }
            r5 = 1
            if (r3 <= r5) goto L_0x02ff
            java.lang.String r3 = "replaceJsFile success"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r3)     // Catch:{ all -> 0x04d0 }
            r2.setBytes(r0)     // Catch:{ all -> 0x04d0 }
        L_0x02ff:
            return r2
        L_0x0300:
            throw r0
        L_0x0301:
            com.alibaba.ariver.engine.api.resources.Resource r2 = r18.getRawResource(r19)     // Catch:{ all -> 0x04d0 }
            if (r2 == 0) goto L_0x0308
            goto L_0x0309
        L_0x0308:
            r2 = 0
        L_0x0309:
            if (r7 != 0) goto L_0x0315
            com.alibaba.ariver.kernel.common.service.executor.ExecutorType r5 = com.alibaba.ariver.kernel.common.service.executor.ExecutorType.IDLE     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.resource.runtime.a$1 r10 = new com.alibaba.ariver.resource.runtime.a$1     // Catch:{ all -> 0x04d0 }
            r10.<init>()     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.kernel.common.utils.ExecutorUtils.execute(r5, r10)     // Catch:{ all -> 0x04d0 }
        L_0x0315:
            if (r2 == 0) goto L_0x03dc
            r0 = 43
            if (r7 == 0) goto L_0x0339
            int r3 = equals
            int r3 = r3 + r0
            int r0 = r3 % 128
            isInside = r0
            int r3 = r3 % 2
            java.lang.String r0 = "H5_AL_SESSION_MAP_SUCCESS"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r0)     // Catch:{ all -> 0x04d0 }
            java.lang.Class<com.alibaba.ariver.kernel.api.track.EventTracker> r0 = com.alibaba.ariver.kernel.api.track.EventTracker.class
            java.lang.Object r0 = com.alibaba.ariver.kernel.common.RVProxy.get(r0)     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.kernel.api.track.EventTracker r0 = (com.alibaba.ariver.kernel.api.track.EventTracker) r0     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.app.api.App r3 = r1.r     // Catch:{ all -> 0x04d0 }
            java.lang.String r5 = "ResMainDocOffline"
            r0.stub(r3, r5)     // Catch:{ all -> 0x04d0 }
            goto L_0x0356
        L_0x0339:
            boolean r3 = r1.h     // Catch:{ all -> 0x04d0 }
            if (r3 != 0) goto L_0x033f
            r0 = 29
        L_0x033f:
            r3 = 29
            if (r0 == r3) goto L_0x0344
            goto L_0x0356
        L_0x0344:
            r0 = 1
            r1.h = r0     // Catch:{ all -> 0x04d0 }
            java.lang.Class<com.alibaba.ariver.kernel.api.track.EventTracker> r0 = com.alibaba.ariver.kernel.api.track.EventTracker.class
            java.lang.Object r0 = com.alibaba.ariver.kernel.common.RVProxy.get(r0)     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.kernel.api.track.EventTracker r0 = (com.alibaba.ariver.kernel.api.track.EventTracker) r0     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.app.api.App r3 = r1.r     // Catch:{ all -> 0x04d0 }
            java.lang.String r5 = "ResSubResOffline"
            r0.stub(r3, r5)     // Catch:{ all -> 0x04d0 }
        L_0x0356:
            boolean r0 = r15.equals(r6)     // Catch:{ all -> 0x04d0 }
            if (r0 == 0) goto L_0x03ce
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x03c8 }
            byte[] r3 = r2.getBytes()     // Catch:{ all -> 0x03c8 }
            long r5 = android.view.ViewConfiguration.getZoomControlsTimeout()     // Catch:{ all -> 0x03c8 }
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            int r10 = r10 + -86
            short r5 = (short) r10     // Catch:{ all -> 0x03c8 }
            r6 = 1812709347(0x6c0bbfe3, float:6.757874E26)
            int r10 = android.widget.ExpandableListView.getPackedPositionType(r7)     // Catch:{ all -> 0x03c8 }
            int r6 = r6 - r10
            java.lang.String r10 = ""
            int r10 = android.view.MotionEvent.axisFromString(r10)     // Catch:{ all -> 0x03c8 }
            int r10 = 121 - r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x03c8 }
            r11 = -1725625335(0xffffffff99250c09, float:-8.5327305E-24)
            long r14 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x03c8 }
            int r12 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            int r12 = r12 + r11
            int r7 = android.view.ViewConfiguration.getScrollBarSize()     // Catch:{ all -> 0x03c8 }
            int r7 = r7 >> 8
            int r7 = r7 + -119
            java.lang.String r5 = setMin(r5, r6, r10, r12, r7)     // Catch:{ all -> 0x03c8 }
            java.lang.String r5 = r5.intern()     // Catch:{ all -> 0x03c8 }
            r6 = 0
            r0.<init>(r3, r6, r13, r5)     // Catch:{ all -> 0x03c8 }
            java.lang.String r3 = "\\r?\\n"
            java.lang.String[] r0 = r0.split(r3)     // Catch:{ all -> 0x03c8 }
            r0 = r0[r16]     // Catch:{ all -> 0x03c8 }
            r3 = 3
            java.lang.String r0 = r0.substring(r3)     // Catch:{ all -> 0x03c8 }
            java.lang.String r3 = "detect render appx version is: "
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x03c8 }
            java.lang.String r3 = r3.concat(r5)     // Catch:{ all -> 0x03c8 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r4, (java.lang.String) r3)     // Catch:{ all -> 0x03c8 }
            com.alibaba.ariver.resource.api.ResourceContext r3 = r1.m     // Catch:{ all -> 0x03c8 }
            com.alibaba.ariver.app.api.App r3 = r3.getApp()     // Catch:{ all -> 0x03c8 }
            java.lang.Class<com.alibaba.ariver.engine.api.model.AppxVersionStore> r5 = com.alibaba.ariver.engine.api.model.AppxVersionStore.class
            r6 = 1
            java.lang.Object r3 = r3.getData(r5, r6)     // Catch:{ all -> 0x03c8 }
            com.alibaba.ariver.engine.api.model.AppxVersionStore r3 = (com.alibaba.ariver.engine.api.model.AppxVersionStore) r3     // Catch:{ all -> 0x03c8 }
            r3.renderVersion = r0     // Catch:{ all -> 0x03c8 }
            goto L_0x03ce
        L_0x03c8:
            r0 = move-exception
            java.lang.String r3 = "detect render appx version exception: "
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r4, r3, r0)     // Catch:{ all -> 0x04d0 }
        L_0x03ce:
            java.lang.String r0 = "load response from offline: "
            java.lang.String r3 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x04d0 }
            java.lang.String r0 = r0.concat(r3)     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r0)     // Catch:{ all -> 0x04d0 }
            return r2
        L_0x03dc:
            java.util.HashMap<java.lang.String, com.alibaba.ariver.engine.api.resources.Resource> r2 = r1.e     // Catch:{ all -> 0x04d0 }
            java.lang.Object r2 = r2.remove(r9)     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.engine.api.resources.Resource r2 = (com.alibaba.ariver.engine.api.resources.Resource) r2     // Catch:{ all -> 0x04d0 }
            if (r2 == 0) goto L_0x03ec
            java.lang.String r0 = "load response from map local."
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r0)     // Catch:{ all -> 0x04d0 }
            return r2
        L_0x03ec:
            java.lang.String r2 = "/favicon.ico"
            boolean r2 = r6.endsWith(r2)     // Catch:{ all -> 0x04d0 }
            if (r2 != 0) goto L_0x04c0
            int r2 = isInside
            r5 = 91
            int r2 = r2 + r5
            int r5 = r2 % 128
            equals = r5
            int r2 = r2 % 2
            if (r2 != 0) goto L_0x0415
            java.lang.String r2 = "/favicon.png"
            boolean r2 = r6.endsWith(r2)     // Catch:{ all -> 0x04d0 }
            r5 = 0
            int r7 = r5.length     // Catch:{ all -> 0x04d0 }
            if (r2 != 0) goto L_0x040e
            r10 = 51
            goto L_0x0410
        L_0x040e:
            r10 = 32
        L_0x0410:
            r2 = 32
            if (r10 == r2) goto L_0x04c0
            goto L_0x041d
        L_0x0415:
            java.lang.String r2 = "/favicon.png"
            boolean r2 = r6.endsWith(r2)     // Catch:{ all -> 0x04d0 }
            if (r2 != 0) goto L_0x04c0
        L_0x041d:
            java.lang.String r2 = "/favicon2.ico"
            boolean r2 = r6.endsWith(r2)     // Catch:{ all -> 0x04d0 }
            if (r2 == 0) goto L_0x0427
            goto L_0x04c0
        L_0x0427:
            boolean r2 = r6.startsWith(r3)     // Catch:{ all -> 0x04d0 }
            if (r2 == 0) goto L_0x0469
            java.lang.String r2 = r18.a((com.alibaba.ariver.resource.api.content.ResourceQuery) r19)     // Catch:{ all -> 0x04d0 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x04d0 }
            if (r3 != 0) goto L_0x0439
            r13 = 0
            goto L_0x043a
        L_0x0439:
            r13 = 1
        L_0x043a:
            if (r13 == 0) goto L_0x043d
            goto L_0x0469
        L_0x043d:
            int r0 = isInside
            int r0 = r0 + 21
            int r3 = r0 % 128
            equals = r3
            int r0 = r0 % 2
            r0 = 1
            r1.i = r0     // Catch:{ all -> 0x04d0 }
            java.lang.Class<com.alibaba.ariver.kernel.api.track.EventTracker> r0 = com.alibaba.ariver.kernel.api.track.EventTracker.class
            java.lang.Object r0 = com.alibaba.ariver.kernel.common.RVProxy.get(r0)     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.kernel.api.track.EventTracker r0 = (com.alibaba.ariver.kernel.api.track.EventTracker) r0     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.app.api.App r3 = r1.r     // Catch:{ all -> 0x04d0 }
            r0.stub(r3, r11)     // Catch:{ all -> 0x04d0 }
            java.lang.String r0 = r9.replace(r8, r2)     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.resource.api.network.OnlineResourceFetcher r2 = r1.n     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.resource.api.ResourceContext r3 = r1.m     // Catch:{ all -> 0x04d0 }
            java.lang.String r3 = r3.getAppId()     // Catch:{ all -> 0x04d0 }
            r5 = 1
            com.alibaba.ariver.engine.api.resources.Resource r0 = r2.getOnlineResource(r0, r5, r3)     // Catch:{ all -> 0x04d0 }
            return r0
        L_0x0469:
            java.lang.String r2 = r1.a((java.lang.String) r9)     // Catch:{ all -> 0x04d0 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x04d0 }
            if (r3 != 0) goto L_0x0480
            java.lang.Class<com.alibaba.ariver.kernel.api.track.EventTracker> r3 = com.alibaba.ariver.kernel.api.track.EventTracker.class
            java.lang.Object r3 = com.alibaba.ariver.kernel.common.RVProxy.get(r3)     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.kernel.api.track.EventTracker r3 = (com.alibaba.ariver.kernel.api.track.EventTracker) r3     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.app.api.App r5 = r1.r     // Catch:{ all -> 0x04d0 }
            r3.stub(r5, r11)     // Catch:{ all -> 0x04d0 }
        L_0x0480:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x04d0 }
            if (r3 != 0) goto L_0x0489
            r3 = 77
            goto L_0x048b
        L_0x0489:
            r3 = 23
        L_0x048b:
            r5 = 23
            if (r3 == r5) goto L_0x04a3
            boolean r3 = r19.isCanUseFallback()     // Catch:{ all -> 0x04d0 }
            if (r3 == 0) goto L_0x04a3
            com.alibaba.ariver.resource.api.network.OnlineResourceFetcher r0 = r1.n     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.resource.api.ResourceContext r3 = r1.m     // Catch:{ all -> 0x04d0 }
            java.lang.String r3 = r3.getAppId()     // Catch:{ all -> 0x04d0 }
            r5 = 1
            com.alibaba.ariver.engine.api.resources.Resource r0 = r0.getOnlineResource(r2, r5, r3)     // Catch:{ all -> 0x04d0 }
            return r0
        L_0x04a3:
            com.alibaba.ariver.resource.api.extension.ResourceProviderPoint r2 = r1.p     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.engine.api.resources.Resource r0 = r2.getResource(r0)     // Catch:{ all -> 0x04d0 }
            if (r0 == 0) goto L_0x04b1
            java.lang.String r2 = "load response from provider point"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r2)     // Catch:{ all -> 0x04d0 }
            return r0
        L_0x04b1:
            java.lang.String r0 = "load response from web "
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x04d0 }
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r0)     // Catch:{ all -> 0x04d0 }
            r2 = 0
            return r2
        L_0x04c0:
            java.lang.String r0 = "favicon request intercepted"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r0)     // Catch:{ all -> 0x04d0 }
            com.alibaba.ariver.resource.api.content.OfflineResource r0 = new com.alibaba.ariver.resource.api.content.OfflineResource     // Catch:{ all -> 0x04d0 }
            r2 = 0
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x04d0 }
            java.lang.String r3 = "image/x-icon"
            r0.<init>(r6, r2, r3)     // Catch:{ all -> 0x04d0 }
            return r0
        L_0x04d0:
            r0 = move-exception
            java.lang.String r2 = "load response from web catch exception "
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r4, r2, r0)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.resource.runtime.a.getContent(com.alibaba.ariver.resource.api.content.ResourceQuery):com.alibaba.ariver.engine.api.resources.Resource");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.alibaba.ariver.engine.api.resources.Resource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.alibaba.ariver.engine.api.resources.Resource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.alibaba.ariver.engine.api.resources.Resource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.alibaba.ariver.engine.api.resources.Resource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.alibaba.ariver.engine.api.resources.Resource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: com.alibaba.ariver.engine.api.resources.Resource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.alibaba.ariver.engine.api.resources.Resource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: com.alibaba.ariver.engine.api.resources.Resource} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.alibaba.ariver.engine.api.resources.Resource getRawResource(@androidx.annotation.NonNull com.alibaba.ariver.resource.api.content.ResourceQuery r6) {
        /*
            r5 = this;
            com.alibaba.ariver.resource.api.ResourceContext r0 = r5.m
            r1 = 0
            if (r0 == 0) goto L_0x000a
            com.alibaba.ariver.engine.api.resources.Resource r0 = r0.getRawResource(r6)
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            if (r0 != 0) goto L_0x0015
            com.alibaba.ariver.resource.content.ResourcePackagePool r0 = com.alibaba.ariver.resource.content.ResourcePackagePool.getInstance()
            com.alibaba.ariver.engine.api.resources.Resource r0 = r0.get(r6)
        L_0x0015:
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x001b
            r4 = 1
            goto L_0x001c
        L_0x001b:
            r4 = 0
        L_0x001c:
            if (r4 == r3) goto L_0x001f
            goto L_0x003f
        L_0x001f:
            int r0 = isInside
            int r0 = r0 + 65
            int r4 = r0 % 128
            equals = r4
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0037
            com.alibaba.ariver.resource.content.GlobalPackagePool r0 = com.alibaba.ariver.resource.content.GlobalPackagePool.getInstance()
            com.alibaba.ariver.engine.api.resources.Resource r0 = r0.get(r6)
            int r6 = r1.length     // Catch:{ all -> 0x0035 }
            goto L_0x003f
        L_0x0035:
            r6 = move-exception
            throw r6
        L_0x0037:
            com.alibaba.ariver.resource.content.GlobalPackagePool r0 = com.alibaba.ariver.resource.content.GlobalPackagePool.getInstance()
            com.alibaba.ariver.engine.api.resources.Resource r0 = r0.get(r6)
        L_0x003f:
            if (r0 == 0) goto L_0x0058
            int r6 = equals     // Catch:{ Exception -> 0x0056 }
            int r6 = r6 + 25
            int r1 = r6 % 128
            isInside = r1     // Catch:{ Exception -> 0x0056 }
            int r6 = r6 % 2
            r1 = 8
            if (r6 == 0) goto L_0x0052
            r6 = 8
            goto L_0x0054
        L_0x0052:
            r6 = 36
        L_0x0054:
            r2 = 1
            goto L_0x0058
        L_0x0056:
            r6 = move-exception
            throw r6
        L_0x0058:
            r5.g = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.resource.runtime.a.getRawResource(com.alibaba.ariver.resource.api.content.ResourceQuery):com.alibaba.ariver.engine.api.resources.Resource");
    }

    private String a(ResourceQuery resourceQuery) {
        int i2 = equals + 31;
        isInside = i2 % 128;
        int i3 = i2 % 2;
        if ((resourceQuery.isAppxNgRoute() ? 17 : '%') != '%') {
            boolean z = true;
            if (!((!TextUtils.isEmpty(this.k)) || this.f10208o == null)) {
                AppInfoQuery appInfoQuery = new AppInfoQuery(RVConstants.TINY_APPX_NG_APPID);
                ResourcePackage resourcePackage = GlobalPackagePool.getInstance().getPackage(RVConstants.TINY_APPX_NG_APPID);
                if (resourcePackage != null) {
                    if ((!TextUtils.isEmpty(resourcePackage.version()) ? 'U' : 'I') == 'U') {
                        int i4 = equals + 13;
                        isInside = i4 % 128;
                        int i5 = i4 % 2;
                        appInfoQuery.version(resourcePackage.version());
                    }
                }
                AppModel appModel = this.f10208o.getAppModel(appInfoQuery);
                if ((appModel == null ? 'L' : 'B') != 'B') {
                    try {
                        int i6 = isInside + 101;
                        equals = i6 % 128;
                        if (i6 % 2 == 0) {
                            z = false;
                        }
                        if (!z) {
                            int i7 = 72 / 0;
                        }
                        int i8 = equals + 89;
                        isInside = i8 % 128;
                        if (i8 % 2 == 0) {
                            return null;
                        }
                        int i9 = 48 / 0;
                        return null;
                    } catch (Exception e2) {
                        throw e2;
                    }
                } else {
                    this.k = appModel.getAppInfoModel().getFallbackBaseUrl();
                    StringBuilder sb = new StringBuilder("getAppNgTinyResFallbackUrl ");
                    sb.append(this.k);
                    RVLogger.d("AriverRes:ContentProvider", sb.toString());
                }
            }
            return this.k;
        }
        try {
            if (!((TextUtils.isEmpty(this.j) ? '=' : 10) == 10 || this.f10208o == null)) {
                AppInfoQuery appInfoQuery2 = new AppInfoQuery("66666692");
                ResourcePackage resourcePackage2 = GlobalPackagePool.getInstance().getPackage("66666692");
                if (resourcePackage2 != null && !TextUtils.isEmpty(resourcePackage2.version())) {
                    appInfoQuery2.version(resourcePackage2.version());
                }
                AppModel appModel2 = this.f10208o.getAppModel(appInfoQuery2);
                if (appModel2 == null) {
                    return null;
                }
                this.j = appModel2.getAppInfoModel().getFallbackBaseUrl();
                StringBuilder sb2 = new StringBuilder("getTinyResFallbackUrl ");
                sb2.append(this.j);
                RVLogger.d("AriverRes:ContentProvider", sb2.toString());
            }
            String str = this.j;
            int i10 = isInside + 121;
            equals = i10 % 128;
            if (i10 % 2 != 0) {
                return str;
            }
            int i11 = 32 / 0;
            return str;
        } catch (Exception e3) {
            throw e3;
        }
    }

    public Resource getLocalResource(String str) {
        int i2 = isInside + 105;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Resource resource = null;
        ResourceQuery asUrl = ResourceQuery.asUrl(str);
        if (!(this.m == null)) {
            try {
                int i4 = equals + 15;
                try {
                    isInside = i4 % 128;
                    if (i4 % 2 != 0) {
                        resource = this.m.getRawResource(asUrl);
                        int i5 = 43 / 0;
                    } else {
                        resource = this.m.getRawResource(asUrl);
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (Exception e3) {
                throw e3;
            }
        }
        return (resource == null ? '8' : 'B') != '8' ? resource : GlobalPackagePool.getInstance().get(asUrl);
    }

    public Resource getContent(String str) {
        int i2 = isInside + 37;
        equals = i2 % 128;
        int i3 = i2 % 2;
        if (TextUtils.isEmpty(str)) {
            RVLogger.e("AriverRes:ContentProvider", "getContent url null!!!", new Throwable("Just Print"));
            return null;
        }
        ResourceQuery resourceQuery = new ResourceQuery(str);
        if ((this.r != null ? 'F' : 'K') != 'K') {
            try {
                resourceQuery.setAppxNgRoute("YES".equalsIgnoreCase(BundleUtils.getString(this.r.getStartParams(), RVParams.APPX_ROUTE_FRAMEWORK)));
                int i4 = equals + 79;
                isInside = i4 % 128;
                int i5 = i4 % 2;
            } catch (Exception e2) {
                throw e2;
            }
        }
        try {
            resourceQuery.setCanUseFallback(false);
            resourceQuery.setMainDoc(false);
            return getContent(resourceQuery);
        } catch (Exception e3) {
            throw e3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        r2.e.put(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mapContent(java.lang.String r3, com.alibaba.ariver.engine.api.resources.Resource r4) {
        /*
            r2 = this;
            int r0 = equals
            int r0 = r0 + 37
            int r1 = r0 % 128
            isInside = r1
            int r0 = r0 % 2
            r1 = 82
            if (r0 == 0) goto L_0x0011
            r0 = 62
            goto L_0x0013
        L_0x0011:
            r0 = 82
        L_0x0013:
            if (r0 == r1) goto L_0x0022
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 41
            int r1 = r1 / 0
            if (r0 == 0) goto L_0x0041
            goto L_0x0028
        L_0x0020:
            r3 = move-exception
            throw r3
        L_0x0022:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0041
        L_0x0028:
            java.lang.Throwable r3 = new java.lang.Throwable
            java.lang.String r4 = "Just Print"
            r3.<init>(r4)
            java.lang.String r4 = "AriverRes:ContentProvider"
            java.lang.String r0 = "map Content url null!!!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r4, r0, r3)
            int r3 = equals
            int r3 = r3 + 37
            int r4 = r3 % 128
            isInside = r4
            int r3 = r3 % 2
            return
        L_0x0041:
            java.util.HashMap<java.lang.String, com.alibaba.ariver.engine.api.resources.Resource> r0 = r2.e
            r0.put(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.resource.runtime.a.mapContent(java.lang.String, com.alibaba.ariver.engine.api.resources.Resource):void");
    }

    public void setFallbackCache(String str, byte[] bArr) {
        try {
            int i2 = equals + 59;
            isInside = i2 % 128;
            int i3 = i2 % 2;
            if (this.m.getMainPackage() != null) {
                this.m.getMainPackage().add(new OfflineResource(UrlUtils.purifyUrl(str), bArr));
                int i4 = isInside + 93;
                equals = i4 % 128;
                int i5 = i4 % 2;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String getFallbackUrl(String str) {
        String purifyUrl = UrlUtils.purifyUrl(str);
        String str2 = null;
        if (!TextUtils.isEmpty(purifyUrl)) {
            if ((this.b != null ? '!' : 'J') != 'J') {
                int i2 = isInside + 87;
                equals = i2 % 128;
                int i3 = i2 % 2;
                String str3 = this.b.get(purifyUrl);
                try {
                    int i4 = equals + 109;
                    isInside = i4 % 128;
                    if (!(i4 % 2 != 0)) {
                        return str3;
                    }
                    super.hashCode();
                    return str3;
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
        return str2;
    }

    private String a(String str) {
        try {
            String str2 = null;
            if ((TextUtils.isEmpty(this.f10207a) ? '-' : 23) == '-') {
                int i2 = isInside + 11;
                equals = i2 % 128;
                if (i2 % 2 != 0) {
                    return str2;
                }
                super.hashCode();
                return str2;
            } else if (!str.startsWith(this.q)) {
                int i3 = equals + 11;
                isInside = i3 % 128;
                int i4 = i3 % 2;
                return str2;
            } else {
                String combinePath = FileUtils.combinePath(this.f10207a, str.replace(this.q, ""));
                RVLogger.d("AriverRes:ContentProvider", "fallback final url ".concat(String.valueOf(combinePath)));
                int i5 = equals + 43;
                isInside = i5 % 128;
                int i6 = i5 % 2;
                return combinePath;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public void onInputClose(NetworkStream networkStream) {
        try {
            int i2 = equals + 93;
            isInside = i2 % 128;
            int i3 = i2 % 2;
            RVLogger.debug("AriverRes:ContentProvider", "on input stream close.");
            this.c.remove(networkStream);
            int i4 = isInside + 81;
            equals = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 45 / 0;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public void onInputOpen(NetworkStream networkStream) {
        int i2 = equals + 107;
        isInside = i2 % 128;
        int i3 = i2 % 2;
        RVLogger.debug("AriverRes:ContentProvider", "on input stream open.");
        this.c.add(networkStream);
        int i4 = equals + 21;
        isInside = i4 % 128;
        if (!(i4 % 2 == 0)) {
            int i5 = 16 / 0;
        }
    }

    public void onResourceError(NetworkStream networkStream, int i2) {
        try {
            int i3 = equals + 37;
            isInside = i3 % 128;
            if ((i3 % 2 != 0 ? 'Q' : ';') != 'Q') {
                try {
                    this.c.remove(networkStream);
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                this.c.remove(networkStream);
                int i4 = 73 / 0;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    public void onInputException() {
        int i2 = equals + 103;
        isInside = i2 % 128;
        if (i2 % 2 != 0) {
        }
        this.l = true;
        RVLogger.d("AriverRes:ContentProvider", "h5InputStream exception");
    }

    public void a() {
        try {
            int i2 = equals + 21;
            isInside = i2 % 128;
            if (i2 % 2 == 0) {
                this.l = false;
            } else {
                this.l = true;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public boolean hasInputException() {
        try {
            int i2 = isInside + 33;
            equals = i2 % 128;
            int i3 = i2 % 2;
            boolean z = this.l;
            int i4 = equals + 109;
            isInside = i4 % 128;
            if ((i4 % 2 != 0 ? 2 : 'E') != 2) {
                return z;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return z;
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008b, code lost:
        com.alibaba.ariver.kernel.common.utils.RVLogger.e("AriverRes:ContentProvider", (java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0090, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
            r5 = this;
            java.lang.String r0 = "AriverRes:ContentProvider"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008a }
            java.lang.String r2 = "disconnect connList "
            r1.<init>(r2)     // Catch:{ Exception -> 0x008a }
            java.util.List<com.alibaba.ariver.resource.api.content.NetworkStream> r2 = r5.c     // Catch:{ Exception -> 0x008a }
            int r2 = r2.size()     // Catch:{ Exception -> 0x008a }
            r1.append(r2)     // Catch:{ Exception -> 0x008a }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x008a }
            com.alibaba.ariver.kernel.common.utils.RVLogger.debug(r0, r1)     // Catch:{ Exception -> 0x008a }
            java.util.List<com.alibaba.ariver.resource.api.content.NetworkStream> r0 = r5.c     // Catch:{ Exception -> 0x008a }
            monitor-enter(r0)     // Catch:{ Exception -> 0x008a }
            r1 = 0
        L_0x001d:
            java.util.List<com.alibaba.ariver.resource.api.content.NetworkStream> r2 = r5.c     // Catch:{ all -> 0x0087 }
            int r2 = r2.size()     // Catch:{ all -> 0x0087 }
            if (r1 >= r2) goto L_0x003e
            java.util.List<com.alibaba.ariver.resource.api.content.NetworkStream> r2 = r5.c     // Catch:{ all -> 0x0087 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0087 }
            com.alibaba.ariver.resource.api.content.NetworkStream r2 = (com.alibaba.ariver.resource.api.content.NetworkStream) r2     // Catch:{ all -> 0x0087 }
            if (r2 == 0) goto L_0x003b
            r2.close()     // Catch:{ Exception -> 0x0033 }
            goto L_0x003b
        L_0x0033:
            r2 = move-exception
            java.lang.String r3 = "AriverRes:ContentProvider"
            java.lang.String r4 = "close connection exception."
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r3, r4, r2)     // Catch:{ all -> 0x0087 }
        L_0x003b:
            int r1 = r1 + 1
            goto L_0x001d
        L_0x003e:
            java.util.List<com.alibaba.ariver.resource.api.content.NetworkStream> r1 = r5.c     // Catch:{ all -> 0x0087 }
            r1.clear()     // Catch:{ all -> 0x0087 }
            monitor-exit(r0)     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = "AriverRes:ContentProvider"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008a }
            java.lang.String r2 = "disconnect inputStreamList "
            r1.<init>(r2)     // Catch:{ Exception -> 0x008a }
            java.util.List<java.io.InputStream> r2 = r5.d     // Catch:{ Exception -> 0x008a }
            int r2 = r2.size()     // Catch:{ Exception -> 0x008a }
            r1.append(r2)     // Catch:{ Exception -> 0x008a }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x008a }
            com.alibaba.ariver.kernel.common.utils.RVLogger.debug(r0, r1)     // Catch:{ Exception -> 0x008a }
            java.util.List<java.io.InputStream> r0 = r5.d     // Catch:{ Exception -> 0x008a }
            monitor-enter(r0)     // Catch:{ Exception -> 0x008a }
            java.util.List<java.io.InputStream> r1 = r5.d     // Catch:{ all -> 0x0084 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0084 }
        L_0x0066:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0084 }
            if (r2 == 0) goto L_0x007d
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0084 }
            java.io.InputStream r2 = (java.io.InputStream) r2     // Catch:{ all -> 0x0084 }
            r2.close()     // Catch:{ Exception -> 0x0076 }
            goto L_0x0066
        L_0x0076:
            r2 = move-exception
            java.lang.String r3 = "AriverRes:ContentProvider"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r3, (java.lang.Throwable) r2)     // Catch:{ all -> 0x0084 }
            goto L_0x0066
        L_0x007d:
            java.util.List<java.io.InputStream> r1 = r5.d     // Catch:{ all -> 0x0084 }
            r1.clear()     // Catch:{ all -> 0x0084 }
            monitor-exit(r0)     // Catch:{ all -> 0x0084 }
            return
        L_0x0084:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ Exception -> 0x008a }
            throw r1     // Catch:{ Exception -> 0x008a }
        L_0x0087:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ Exception -> 0x008a }
            throw r1     // Catch:{ Exception -> 0x008a }
        L_0x008a:
            r0 = move-exception
            java.lang.String r1 = "AriverRes:ContentProvider"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r1, (java.lang.Throwable) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.resource.runtime.a.b():void");
    }

    public void releaseContent() {
        RVLogger.d("AriverRes:ContentProvider", "releaseContent");
        b();
        if ((this.b != null ? 18 : 'c') != 'c') {
            try {
                int i2 = isInside + 47;
                equals = i2 % 128;
                int i3 = i2 % 2;
                try {
                    this.b.clear();
                    return;
                } catch (Throwable th) {
                    RVLogger.e("AriverRes:ContentProvider", "clear mFallbackUrlMap exception ", th);
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        int i4 = isInside + 15;
        equals = i4 % 128;
        if ((i4 % 2 == 0 ? 'T' : '9') == 'T') {
            int i5 = 19 / 0;
        }
    }

    public boolean isLocal() {
        int i2 = equals + 67;
        isInside = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.g;
        int i4 = isInside + 17;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f A[SYNTHETIC, Splitter:B:24:0x004f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMin(short r6, int r7, byte r8, int r9, int r10) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = setMin     // Catch:{ Exception -> 0x00ae }
            int r10 = r10 + r1
            r1 = -1
            r2 = 0
            r3 = 1
            if (r10 != r1) goto L_0x000f
            r1 = 1
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            if (r1 == r3) goto L_0x0014
        L_0x0012:
            r1 = 0
            goto L_0x002b
        L_0x0014:
            int r1 = isInside
            int r1 = r1 + 69
            int r4 = r1 % 128
            equals = r4
            int r1 = r1 % 2
            r4 = 41
            if (r1 != 0) goto L_0x0025
            r1 = 56
            goto L_0x0027
        L_0x0025:
            r1 = 41
        L_0x0027:
            if (r1 == r4) goto L_0x002a
            goto L_0x0012
        L_0x002a:
            r1 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x004d
            byte[] r10 = getMax
            if (r10 == 0) goto L_0x0033
            r10 = 0
            goto L_0x0034
        L_0x0033:
            r10 = 1
        L_0x0034:
            if (r10 == r3) goto L_0x0042
            byte[] r10 = getMax
            int r4 = length
            int r4 = r4 + r9
            byte r10 = r10[r4]
            int r4 = setMin
            int r10 = r10 + r4
            byte r10 = (byte) r10
            goto L_0x004d
        L_0x0042:
            short[] r10 = setMax
            int r4 = length
            int r4 = r4 + r9
            short r10 = r10[r4]
            int r4 = setMin
            int r10 = r10 + r4
            short r10 = (short) r10
        L_0x004d:
            if (r10 <= 0) goto L_0x00a9
            int r4 = isInside     // Catch:{ Exception -> 0x00ae }
            int r4 = r4 + 113
            int r5 = r4 % 128
            equals = r5     // Catch:{ Exception -> 0x00ae }
            int r4 = r4 % 2
            int r9 = r9 + r10
            int r9 = r9 + -2
            int r4 = length
            int r9 = r9 + r4
            if (r1 == 0) goto L_0x0063
            r1 = 1
            goto L_0x006e
        L_0x0063:
            int r1 = equals
            int r1 = r1 + 17
            int r4 = r1 % 128
            isInside = r4
            int r1 = r1 % 2
            r1 = 0
        L_0x006e:
            int r9 = r9 + r1
            int r1 = getMin     // Catch:{ Exception -> 0x00a7 }
            int r7 = r7 + r1
            char r7 = (char) r7     // Catch:{ Exception -> 0x00a7 }
            r0.append(r7)     // Catch:{ Exception -> 0x00a7 }
            r1 = 1
        L_0x0077:
            if (r1 >= r10) goto L_0x00a9
            int r4 = isInside
            int r4 = r4 + 111
            int r5 = r4 % 128
            equals = r5
            int r4 = r4 % 2
            byte[] r4 = getMax
            if (r4 == 0) goto L_0x0089
            r4 = 0
            goto L_0x008a
        L_0x0089:
            r4 = 1
        L_0x008a:
            if (r4 == r3) goto L_0x0095
            byte[] r4 = getMax
            int r5 = r9 + -1
            byte r9 = r4[r9]
            int r9 = r9 + r6
            byte r9 = (byte) r9
            goto L_0x009d
        L_0x0095:
            short[] r4 = setMax
            int r5 = r9 + -1
            short r9 = r4[r9]
            int r9 = r9 + r6
            short r9 = (short) r9
        L_0x009d:
            r9 = r9 ^ r8
            int r7 = r7 + r9
            char r7 = (char) r7
            r9 = r5
            r0.append(r7)
            int r1 = r1 + 1
            goto L_0x0077
        L_0x00a7:
            r6 = move-exception
            throw r6
        L_0x00a9:
            java.lang.String r6 = r0.toString()
            return r6
        L_0x00ae:
            r6 = move-exception
            goto L_0x00b1
        L_0x00b0:
            throw r6
        L_0x00b1:
            goto L_0x00b0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.resource.runtime.a.setMin(short, int, byte, int, int):java.lang.String");
    }
}
