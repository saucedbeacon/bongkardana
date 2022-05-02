package com.alibaba.griver.core.worker;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.WebResourceResponse;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.utils.IOUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.api.APHttpAuthHandler;
import com.alibaba.griver.base.api.APSslErrorHandler;
import com.alibaba.griver.base.api.APWebResourceRequest;
import com.alibaba.griver.base.api.APWebView;
import com.alibaba.griver.base.api.APWebViewClient;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;
import o.dispatchOnCancelled;
import o.getTabbarModel;
import o.onActivityPreCreated;
import o.onCancelLoad;
import o.onCanceled;

public class f implements APWebViewClient {
    private static int getMax = 0;
    private static long length = 423367779663116532L;
    private static int setMax = 1;

    /* renamed from: a  reason: collision with root package name */
    private String f10419a;
    private c b;

    public void doUpdateVisitedHistory(APWebView aPWebView, String str, boolean z) {
        int i;
        if ((str != null ? '+' : 16) != 16) {
            int i2 = getMax + 93;
            setMax = i2 % 128;
            if (i2 % 2 == 0) {
                i = str.length();
                Object[] objArr = null;
                int length2 = objArr.length;
            } else {
                i = str.length();
            }
        } else {
            i = 0;
            int i3 = getMax + 93;
            setMax = i3 % 128;
            int i4 = i3 % 2;
        }
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1852769171, oncanceled);
            onCancelLoad.getMin(-1852769171, oncanceled);
        }
    }

    public void onFirstVisuallyRender(APWebView aPWebView) {
        try {
            int i = getMax + 85;
            setMax = i % 128;
            if ((i % 2 == 0 ? 'X' : ' ') == 'X') {
                int i2 = 38 / 0;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void onFormResubmission(APWebView aPWebView, Message message, Message message2) {
        int i = getMax + 45;
        setMax = i % 128;
        if (i % 2 == 0) {
            int i2 = 24 / 0;
        }
    }

    public void onLoadResource(APWebView aPWebView, String str) {
        try {
            int i = setMax + 45;
            getMax = i % 128;
            if (!(i % 2 == 0)) {
                int i2 = 81 / 0;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void onPageFinished(APWebView aPWebView, String str, long j) {
        int i = setMax + 23;
        getMax = i % 128;
        int i2 = i % 2;
    }

    public void onPageStarted(APWebView aPWebView, String str, Bitmap bitmap) {
        int i = getMax + 75;
        setMax = i % 128;
        int i2 = i % 2;
    }

    public void onReceivedError(APWebView aPWebView, int i, String str, String str2) {
        try {
            int i2 = getMax + 113;
            setMax = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    public void onReceivedHttpAuthRequest(APWebView aPWebView, APHttpAuthHandler aPHttpAuthHandler, String str, String str2) {
        int i = setMax + 49;
        getMax = i % 128;
        if ((i % 2 != 0 ? '\'' : 'P') != 'P') {
            int i2 = 60 / 0;
        }
    }

    public void onReceivedHttpError(APWebView aPWebView, int i, String str) {
        int i2 = setMax + 87;
        getMax = i2 % 128;
        if ((i2 % 2 != 0 ? 'c' : 'P') == 'c') {
            int i3 = 68 / 0;
        }
    }

    public void onReceivedLoginRequest(APWebView aPWebView, String str, String str2, String str3) {
        try {
            int i = setMax + 87;
            getMax = i % 128;
            if (!(i % 2 == 0)) {
                int i2 = 81 / 0;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void onReceivedResponseHeader(Map<String, List<String>> map) {
        try {
            int i = setMax + 123;
            try {
                getMax = i % 128;
                if (!(i % 2 == 0)) {
                    Object[] objArr = null;
                    int length2 = objArr.length;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public void onReceivedSslError(APWebView aPWebView, APSslErrorHandler aPSslErrorHandler, SslError sslError) {
        try {
            int i = getMax + 5;
            setMax = i % 128;
            if (i % 2 == 0) {
                Object obj = null;
                super.hashCode();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void onResourceFinishLoad(APWebView aPWebView, String str, long j) {
        int i = getMax + 3;
        setMax = i % 128;
        if (!(i % 2 != 0)) {
            int i2 = 55 / 0;
        }
    }

    public void onResourceResponse(APWebView aPWebView, HashMap<String, String> hashMap) {
        int i = getMax + 11;
        setMax = i % 128;
        if ((i % 2 == 0 ? 'S' : '%') != '%') {
            int i2 = 44 / 0;
        }
    }

    public void onScaleChanged(APWebView aPWebView, float f, float f2) {
        int i = getMax + 75;
        setMax = i % 128;
        if ((i % 2 == 0 ? ';' : 9) == ';') {
            Object obj = null;
            super.hashCode();
        }
    }

    public void onTooManyRedirects(APWebView aPWebView, Message message, Message message2) {
        try {
            int i = getMax + 89;
            setMax = i % 128;
            if (!(i % 2 != 0)) {
                Object obj = null;
                super.hashCode();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void onUnhandledKeyEvent(APWebView aPWebView, KeyEvent keyEvent) {
        int i = getMax + 51;
        setMax = i % 128;
        if ((i % 2 == 0 ? 10 : ' ') == 10) {
            Object obj = null;
            super.hashCode();
        }
    }

    public void onWebViewEvent(APWebView aPWebView, int i, Object obj) {
        int i2 = getMax + 121;
        setMax = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            super.hashCode();
        }
    }

    public f(c cVar) {
        try {
            this.f10419a = "WorkerWebViewClient";
            this.b = cVar;
        } catch (Exception e) {
            throw e;
        }
    }

    public String getPageUrl() {
        int i = getMax + 77;
        setMax = i % 128;
        int i2 = i % 2;
        int i3 = setMax + 119;
        getMax = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        int i4 = 58 / 0;
        return null;
    }

    public boolean shouldOverrideUrlLoading(APWebView aPWebView, String str) {
        int i = setMax + 91;
        getMax = i % 128;
        int i2 = i % 2;
        int i3 = setMax + 67;
        getMax = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r6.endsWith("workerjs.js") != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r6.endsWith(".com/worker") == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        r0 = '*';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        r0 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r0 == 9) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r6 = a("text/html", com.alibaba.ariver.kernel.common.utils.IOUtils.readAsset(((com.alibaba.ariver.kernel.common.service.RVEnvironmentService) com.alibaba.ariver.kernel.common.RVProxy.get(com.alibaba.ariver.kernel.common.service.RVEnvironmentService.class)).getResources(r4), "worker.html"));
        r0 = getMax + 85;
        setMax = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        r6 = r5.b.m().b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
        if (r6 != null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0096, code lost:
        if (r6 != null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r1 != false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.webkit.WebResourceResponse a(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = getMax
            int r0 = r0 + 93
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            java.lang.String r3 = "workerjs.js"
            r4 = 0
            if (r0 == 0) goto L_0x0021
            boolean r0 = r6.endsWith(r3)
            if (r0 == 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            if (r1 == 0) goto L_0x0038
            goto L_0x002a
        L_0x0021:
            boolean r0 = r6.endsWith(r3)
            r1 = 49
            int r1 = r1 / r2
            if (r0 == 0) goto L_0x0038
        L_0x002a:
            java.lang.String r6 = "application/javascript"
            java.lang.String r0 = r5.a()
            android.webkit.WebResourceResponse r6 = r5.a(r6, r0)
            goto L_0x0076
        L_0x0035:
            r6 = move-exception
            goto L_0x00af
        L_0x0038:
            java.lang.String r0 = ".com/worker"
            boolean r0 = r6.endsWith(r0)
            r1 = 9
            if (r0 == 0) goto L_0x0045
            r0 = 42
            goto L_0x0047
        L_0x0045:
            r0 = 9
        L_0x0047:
            if (r0 == r1) goto L_0x006c
            java.lang.Class<com.alibaba.ariver.kernel.common.service.RVEnvironmentService> r6 = com.alibaba.ariver.kernel.common.service.RVEnvironmentService.class
            java.lang.Object r6 = com.alibaba.ariver.kernel.common.RVProxy.get(r6)
            com.alibaba.ariver.kernel.common.service.RVEnvironmentService r6 = (com.alibaba.ariver.kernel.common.service.RVEnvironmentService) r6
            android.content.res.Resources r6 = r6.getResources(r4)
            java.lang.String r0 = "worker.html"
            java.lang.String r6 = com.alibaba.ariver.kernel.common.utils.IOUtils.readAsset(r6, r0)
            java.lang.String r0 = "text/html"
            android.webkit.WebResourceResponse r6 = r5.a(r0, r6)
            int r0 = getMax
            int r0 = r0 + 85
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            goto L_0x0076
        L_0x006c:
            com.alibaba.griver.core.worker.c r0 = r5.b
            com.alibaba.griver.core.worker.b r0 = r0.m()
            android.webkit.WebResourceResponse r6 = r0.b(r6)
        L_0x0076:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 91
            r2 = 21
            if (r0 < r2) goto L_0x0080
            r0 = 6
            goto L_0x0082
        L_0x0080:
            r0 = 91
        L_0x0082:
            if (r0 == r1) goto L_0x00b0
            int r0 = setMax
            int r0 = r0 + 59
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x0096
            int r0 = r4.length     // Catch:{ all -> 0x0094 }
            if (r6 == 0) goto L_0x00b0
            goto L_0x0098
        L_0x0094:
            r6 = move-exception
            throw r6
        L_0x0096:
            if (r6 == 0) goto L_0x00b0
        L_0x0098:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "Access-Control-Allow-Origin"
            java.lang.String r3 = "*"
            r0.put(r1, r3)     // Catch:{ Exception -> 0x0035 }
            java.lang.String r1 = "Cache-Control"
            java.lang.String r3 = "no-cache"
            r0.put(r1, r3)     // Catch:{ Exception -> 0x0035 }
            r6.setResponseHeaders(r0)     // Catch:{ Exception -> 0x0035 }
            goto L_0x00b0
        L_0x00af:
            throw r6
        L_0x00b0:
            int r0 = setMax     // Catch:{ Exception -> 0x00c0 }
            int r0 = r0 + r2
            int r1 = r0 % 128
            getMax = r1     // Catch:{ Exception -> 0x00c0 }
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x00bf
            int r0 = r4.length     // Catch:{ all -> 0x00bd }
            return r6
        L_0x00bd:
            r6 = move-exception
            throw r6
        L_0x00bf:
            return r6
        L_0x00c0:
            r6 = move-exception
            throw r6
        L_0x00c2:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.worker.f.a(java.lang.String):android.webkit.WebResourceResponse");
    }

    private String a() {
        int i = getMax + 19;
        setMax = i % 128;
        int i2 = i % 2;
        try {
            String str = null;
            String readAsset = IOUtils.readAsset(((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getResources(str), "workerjs.js");
            if ((TextUtils.isEmpty(readAsset) ? 'M' : 9) == 9) {
                return readAsset.replace("{bridge_token}", this.b.p());
            }
            int i3 = setMax + 83;
            getMax = i3 % 128;
            if ((i3 % 2 != 0 ? Typography.less : 4) == '<') {
                super.hashCode();
            }
            return readAsset;
        } catch (Exception e) {
            throw e;
        }
    }

    public WebResourceResponse shouldInterceptRequest(APWebView aPWebView, String str) {
        WebResourceResponse webResourceResponse;
        int i = getMax + 89;
        setMax = i % 128;
        boolean z = false;
        if ((i % 2 == 0 ? '0' : '7') != '7') {
            RVLogger.d(this.f10419a, "shouldInterceptRequest url: ".concat(String.valueOf(str)));
            webResourceResponse = a(str);
            int i2 = 44 / 0;
        } else {
            RVLogger.d(this.f10419a, "shouldInterceptRequest url: ".concat(String.valueOf(str)));
            webResourceResponse = a(str);
        }
        int i3 = setMax + 59;
        getMax = i3 % 128;
        if (i3 % 2 == 0) {
            z = true;
        }
        if (z) {
            return webResourceResponse;
        }
        Object obj = null;
        super.hashCode();
        return webResourceResponse;
    }

    public WebResourceResponse shouldInterceptRequest(APWebView aPWebView, APWebResourceRequest aPWebResourceRequest) {
        String str = this.f10419a;
        StringBuilder sb = new StringBuilder("shouldInterceptRequest request: ");
        sb.append(aPWebResourceRequest.getUrl());
        RVLogger.d(str, sb.toString());
        WebResourceResponse a2 = a(aPWebResourceRequest.getUrl().toString());
        int i = setMax + 21;
        getMax = i % 128;
        if ((i % 2 != 0 ? ' ' : '4') != ' ') {
            return a2;
        }
        int i2 = 42 / 0;
        return a2;
    }

    private WebResourceResponse a(String str, String str2) {
        byte[] bArr = null;
        if ((str2 == null ? 'K' : ':') == 'K') {
            int i = setMax + 125;
            getMax = i % 128;
            if (!(i % 2 == 0)) {
                int length2 = bArr.length;
            }
            int i2 = setMax + 13;
            getMax = i2 % 128;
            int i3 = i2 % 2;
            str2 = "";
        }
        try {
            bArr = str2.getBytes(getTabbarModel.ENC);
        } catch (Exception e) {
            RVLogger.e(this.f10419a, "failed to get byte array", e);
        }
        return new WebResourceResponse(str, length(new char[]{25192, 42211, 25149, 7899, 56387, 61301, 7408, 30209, 33237}).intern(), new ByteArrayInputStream(bArr));
    }

    public boolean shouldInterceptResponse(APWebView aPWebView, HashMap<String, String> hashMap) {
        int i = getMax + 91;
        setMax = i % 128;
        int i2 = i % 2;
        RVLogger.d(this.f10419a, "shouldInterceptResponse url: ".concat(String.valueOf(hashMap)));
        int i3 = setMax + 55;
        getMax = i3 % 128;
        if ((i3 % 2 != 0 ? ')' : 'F') != ')') {
            return false;
        }
        int i4 = 9 / 0;
        return false;
    }

    public boolean shouldOverrideKeyEvent(APWebView aPWebView, KeyEvent keyEvent) {
        int i = setMax + 41;
        getMax = i % 128;
        int i2 = i % 2;
        int i3 = getMax + 101;
        setMax = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.String] */
    public String getJSBridge() {
        int i = getMax + 3;
        setMax = i % 128;
        ? r1 = 0;
        if (!(i % 2 != 0)) {
            int length2 = r1.length;
        }
        try {
            int i2 = setMax + 99;
            getMax = i2 % 128;
            int i3 = i2 % 2;
            return r1;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean shouldOverrideUrlLoadingForUC(APWebView aPWebView, String str, int i) {
        int i2 = getMax + 77;
        setMax = i2 % 128;
        return i2 % 2 == 0 ? false : false;
    }

    public Map getRequestMap() {
        int i = getMax + 71;
        setMax = i % 128;
        Map map = null;
        if (i % 2 == 0) {
            super.hashCode();
        }
        int i2 = getMax + 71;
        setMax = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    private static String length(char[] cArr) {
        char[] length2 = onActivityPreCreated.length(length, cArr);
        int i = 4;
        while (true) {
            if ((i < length2.length ? 31 : 'N') != 31) {
                String str = new String(length2, 4, length2.length - 4);
                int i2 = getMax + 113;
                setMax = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }
            int i4 = setMax + 17;
            getMax = i4 % 128;
            int i5 = i4 % 2;
            length2[i] = (char) ((int) (((long) (length2[i] ^ length2[i % 4])) ^ (((long) (i - 4)) * length)));
            i++;
        }
    }
}
