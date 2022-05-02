package com.alibaba.griver.core.worker;

import android.os.Build;
import android.os.Looper;
import android.webkit.ValueCallback;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.remotedebug.RDConstant;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.base.api.APWebView;
import com.alibaba.griver.base.api.H5CallBack;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.core.webview.AndroidWebView;

public class c extends H5Worker {
    public static String l = "javascript:";

    /* renamed from: a  reason: collision with root package name */
    private final String f10407a = "WebWorker";
    protected b m;
    private APWebView n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f10408o = false;
    private String p;
    private String q;

    /* access modifiers changed from: protected */
    public String g() {
        return "WebWorker";
    }

    public c() {
        q();
    }

    private void q() {
        t();
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    c.this.l();
                }
            });
        } else {
            l();
        }
    }

    /* access modifiers changed from: protected */
    public void l() {
        long currentTimeMillis = System.currentTimeMillis();
        r();
        this.m = a();
        this.n.setWebViewClient(new f(this));
        this.n.setWebChromeClient(new e(this));
        this.n.getSettings().setUserAgentString(this.q);
        RVLogger.d("WebWorker", "start loading worker js bridge");
        this.n.loadUrl("https://alipay.worker.com/worker");
        StringBuilder sb = new StringBuilder("doInitWorker cost = ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        RVLogger.d("WebWorker", sb.toString());
    }

    public b a() {
        return new b(this, (App) null);
    }

    public b m() {
        return this.m;
    }

    public void h() {
        if (!this.f10408o && this.f != null && this.g && this.c != null) {
            this.f10408o = true;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                o();
            } else {
                ExecutorUtils.runOnMain(new Runnable() {
                    public void run() {
                        c.this.o();
                    }
                });
            }
        }
    }

    /* access modifiers changed from: protected */
    public String n() {
        String jSONString = BundleUtils.toJSONObject(this.f).toJSONString();
        StringBuilder sb = new StringBuilder("__appxStartupParams=");
        sb.append(jSONString);
        sb.append(";var __workerjs=\"self.__appxStartupParams=\" + JSON.stringify(__appxStartupParams) + \";importScripts('");
        sb.append(this.c);
        sb.append("');\";worker.postMessage({action:'exec',data:__workerjs});");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public void o() {
        long currentTimeMillis = System.currentTimeMillis();
        if (GriverEnv.isDebuggable()) {
            this.f.putString("debug", "framework");
        }
        try {
            c(n());
        } catch (Throwable th) {
            RVLogger.e("WebWorker", "tryToInjectStartupParams error!", th);
            MonitorMap.Builder builder = new MonitorMap.Builder();
            b bVar = this.m;
            if (!(bVar == null || bVar.d == null)) {
                builder.appId(this.m.d.getAppId()).version(this.m.d).needAsynAppType(true);
            }
            builder.exception(th).workerType(GriverMonitorConstants.WORKER_TYPE_WEB).message(GriverMonitorConstants.MESSAGE_WORKER_LOAD_SCRIPT_EXCEPTION);
            GriverMonitor.error(GriverMonitorConstants.ERROR_JS_EXECUTE_EXCEPTION, "GriverAppContainer", builder.build());
        }
        StringBuilder sb = new StringBuilder("doInjectStartupParamsAndPushWorker cost = ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        RVLogger.d("WebWorker", sb.toString());
        i();
    }

    /* access modifiers changed from: protected */
    public void c(String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.n.evaluateJavascript(str, (ValueCallback<String>) null);
            return;
        }
        APWebView aPWebView = this.n;
        StringBuilder sb = new StringBuilder();
        sb.append(l);
        sb.append(str);
        aPWebView.loadUrl(sb.toString());
    }

    public void a(String str, String str2, String str3, H5CallBack h5CallBack) {
        a(str, str2, RDConstant.ACTION_CALL_BRIDGE, str3, h5CallBack);
    }

    public void a(String str, String str2, String str3, String str4, H5CallBack h5CallBack) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            b(str, str2, str3, str4, h5CallBack);
            return;
        }
        final String str5 = str;
        final String str6 = str2;
        final String str7 = str3;
        final String str8 = str4;
        final H5CallBack h5CallBack2 = h5CallBack;
        ExecutorUtils.runOnMain(new Runnable() {
            public void run() {
                c.this.b(str5, str6, str7, str8, h5CallBack2);
            }
        });
    }

    /* access modifiers changed from: protected */
    public String a(String str, String str2) {
        StringBuilder sb = new StringBuilder("window.worker.postMessage({\"action\":\"");
        sb.append(str);
        sb.append("\",\"data\":");
        sb.append(str2);
        sb.append("})");
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public void b(String str, String str2, String str3, String str4, H5CallBack h5CallBack) {
        try {
            c(a(str3, str4));
            a(str, str2, h5CallBack);
        } catch (Throwable th) {
            MonitorMap.Builder builder = new MonitorMap.Builder();
            b bVar = this.m;
            if (bVar != null) {
                builder.version(bVar.d);
            }
            builder.appId(str);
            builder.exception(th).workerType(GriverMonitorConstants.WORKER_TYPE_WEB).message(GriverMonitorConstants.MESSAGE_WORKER_SEND_MESSAGE_EXCEPTION);
            GriverMonitor.error(GriverMonitorConstants.ERROR_JS_EXECUTE_EXCEPTION, "GriverAppContainer", builder.build());
            RVLogger.e("WebWorker", "sendToWorker error:", th);
        }
    }

    private void r() {
        AndroidWebView androidWebView = new AndroidWebView(GriverEnv.getApplicationContext());
        this.n = androidWebView;
        androidWebView.setWebContentsDebuggingEnabled(GriverEnv.isDebuggable());
        this.n.getSettings().setJavaScriptEnabled(true);
    }

    public void d(String str) {
        GriverLogger.d("WebWorker", "set ua for worker: ".concat(String.valueOf(str)));
        this.q = str;
    }

    public void k() {
        super.k();
        ExecutorUtils.runOnMain(new Runnable() {
            public void run() {
                c.this.s();
            }
        });
    }

    /* access modifiers changed from: private */
    public void s() {
        APWebView aPWebView = this.n;
        if (aPWebView != null) {
            try {
                aPWebView.destroy();
            } catch (Throwable unused) {
            }
        }
    }

    private void t() {
        this.p = "";
    }

    public String p() {
        return this.p;
    }
}
