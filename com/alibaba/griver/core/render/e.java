package com.alibaba.griver.core.render;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.remotedebug.RDConstant;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.nebula.H5PatternHelper;
import com.alibaba.griver.core.GriverParam;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

public class e {
    private static Boolean c;
    private static JSONArray d;
    private static Boolean e;
    private static JSONArray f;

    /* renamed from: a  reason: collision with root package name */
    public boolean f10327a;
    public boolean b;
    private Object g;
    private boolean h;
    private HashMap<String, String> i;
    private f j;
    private String k;
    private String l;
    private String m;
    private Bundle n;

    /* renamed from: o  reason: collision with root package name */
    private Page f10328o;
    private boolean p;

    private void e() {
    }

    public e() {
    }

    public e(Page page, f fVar) {
        this.f10328o = page;
        this.j = fVar;
        this.f10327a = false;
        this.b = false;
        Bundle startParams = page.getStartParams();
        this.n = startParams;
        this.l = BundleUtils.getString(startParams, GriverParam.PUBLIC_ID);
        this.k = BundleUtils.getString(this.n, "appId");
        this.p = BundleUtils.getBoolean(this.n, RVParams.isTinyApp, false);
        this.g = new Object();
        this.h = false;
        this.i = new HashMap<>();
        JSONObject jSONObject = BundleUtils.toJSONObject(this.n);
        if (GriverParam.SCAN_APP.equals(JSONUtils.getString(jSONObject, RVParams.LONG_BIZ_SCENARIO))) {
            a(true);
        }
        a("startupParams", jSONObject.toJSONString());
        if (c == null) {
            JSONObject parseObject = JSONUtils.parseObject(GriverConfig.getConfigWithProcessCache("h5_nativeInput4Android", ""));
            if (parseObject != null) {
                JSONObject jSONObject2 = JSONUtils.getJSONObject(parseObject, "textArea", (JSONObject) null);
                c = Boolean.valueOf("yes".equalsIgnoreCase(JSONUtils.getString(jSONObject2, "disable")));
                d = JSONUtils.getJSONArray(jSONObject2, "appId", (JSONArray) null);
            }
            e = Boolean.valueOf("yes".equalsIgnoreCase(GriverConfig.getConfigWithProcessCache("h5_EnableInpageInput", "")));
            f = JSONUtils.parseArray(GriverConfig.getConfigWithProcessCache("h5_inPageInputBlackList", ""));
        }
    }

    private void a(boolean z) {
        this.h = z;
    }

    public void a() {
        StringBuilder sb = new StringBuilder("resetBridge ");
        sb.append(System.currentTimeMillis());
        RVLogger.d("H5ScriptLoader", sb.toString());
        this.f10327a = false;
        this.b = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        r0 = java.lang.System.currentTimeMillis() - r2;
        r2 = new java.lang.StringBuilder("load javascript elapse [");
        r2.append(r0);
        r2.append("] for ");
        r2.append(r7.m);
        com.alibaba.ariver.kernel.common.utils.RVLogger.d("H5ScriptLoader", r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b() {
        /*
            r7 = this;
            com.alibaba.griver.core.render.f r0 = r7.j
            r1 = 0
            if (r0 != 0) goto L_0x000d
            java.lang.String r0 = "H5ScriptLoader"
            java.lang.String r2 = "invalid web view parameter!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r0, (java.lang.String) r2)
            return r1
        L_0x000d:
            java.lang.String r0 = r0.getUrl()
            r7.m = r0
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Object r0 = r7.g
            monitor-enter(r0)
            com.alibaba.griver.core.render.f r4 = r7.j     // Catch:{ all -> 0x006f }
            r7.b((com.alibaba.griver.core.render.f) r4)     // Catch:{ all -> 0x006f }
            boolean r4 = r7.b     // Catch:{ all -> 0x006f }
            r5 = 1
            if (r4 == 0) goto L_0x002a
            boolean r4 = r7.f10327a     // Catch:{ all -> 0x006f }
            if (r4 == 0) goto L_0x002a
            monitor-exit(r0)     // Catch:{ all -> 0x006f }
            return r5
        L_0x002a:
            android.os.Bundle r4 = r7.n     // Catch:{ all -> 0x006f }
            java.lang.String r6 = "isPrerender"
            boolean r1 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getBoolean(r4, r6, r1)     // Catch:{ all -> 0x006f }
            if (r1 != 0) goto L_0x0042
            com.alibaba.ariver.app.api.Page r1 = r7.f10328o     // Catch:{ all -> 0x006f }
            if (r1 == 0) goto L_0x0042
            java.lang.String r1 = "H5ScriptLoader"
            java.lang.String r4 = "injectPageReady when normal window present"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r1, r4)     // Catch:{ all -> 0x006f }
            r7.c()     // Catch:{ all -> 0x006f }
        L_0x0042:
            boolean r1 = r7.b     // Catch:{ all -> 0x006f }
            if (r1 != 0) goto L_0x004b
            com.alibaba.griver.core.render.f r1 = r7.j     // Catch:{ all -> 0x006f }
            r7.a((com.alibaba.griver.core.render.f) r1)     // Catch:{ all -> 0x006f }
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x006f }
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "load javascript elapse ["
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = "] for "
            r2.append(r0)
            java.lang.String r0 = r7.m
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "H5ScriptLoader"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r1, r0)
            return r5
        L_0x006f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.render.e.b():boolean");
    }

    public void c() {
        f fVar = this.j;
        if (fVar != null) {
            fVar.loadUrl("javascript:(function(){window.ALIPAYVIEWAPPEARED=1})();");
        }
        Page page = this.f10328o;
        if (page != null && page.getRender() != null) {
            EngineUtils.sendToRender(this.f10328o.getRender(), "appearAfterPreRender", (JSONObject) null, (SendToRenderCallback) null);
        }
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            RVLogger.e("H5ScriptLoader", "invalid js parameters!");
            return;
        }
        synchronized (this.g) {
            this.i.put(str, str2);
            if (!this.b) {
                RVLogger.d("H5ScriptLoader", "bridge not loaded.");
                return;
            }
            StringBuilder sb = new StringBuilder("setParamsToWebPage [key] ");
            sb.append(str);
            sb.append(" [value] ");
            sb.append(str2);
            RVLogger.d("H5ScriptLoader", sb.toString());
            f fVar = this.j;
            StringBuilder sb2 = new StringBuilder("javascript:if(typeof AlipayJSBridge === 'object'){AlipayJSBridge.");
            sb2.append(str);
            sb2.append(SimpleComparison.EQUAL_TO_OPERATION);
            sb2.append(str2);
            sb2.append("}");
            fVar.loadUrl(sb2.toString());
        }
    }

    private void a(f fVar) {
        long currentTimeMillis = System.currentTimeMillis();
        String d2 = d();
        RVLogger.d("H5ScriptLoader", "bridgeStr ".concat(String.valueOf(d2)));
        fVar.loadUrl(RDConstant.JAVASCRIPT_SCHEME.concat(String.valueOf(d2)));
        RVLogger.d("H5ScriptLoader", "bridge data loaded!");
        e();
        RVLogger.d("H5ScriptLoader", "load bridge delta time ".concat(String.valueOf(System.currentTimeMillis() - currentTimeMillis)));
    }

    public String d() {
        if (this.b) {
            RVLogger.d("H5ScriptLoader", "bridge already loaded!");
            return null;
        }
        StringBuilder sb = new StringBuilder("composeBridge ");
        sb.append(System.currentTimeMillis());
        RVLogger.d("H5ScriptLoader", sb.toString());
        this.b = true;
        HashMap<String, String> hashMap = this.i;
        Page page = this.f10328o;
        return com.alibaba.griver.core.utils.e.a(hashMap, page, page.getRender().getRenderId());
    }

    private void b(final f fVar) {
        final String configWithProcessCache = GriverConfig.getConfigWithProcessCache(this.p ? "h5_dsRulesForTinyApp" : "h5_dsRules", "");
        if (BundleUtils.getBoolean(this.f10328o.getStartParams(), RVParams.isTinyApp, false)) {
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    e.this.a(fVar, configWithProcessCache);
                }
            }, 1000);
        } else {
            a(fVar, configWithProcessCache);
        }
    }

    public void a(f fVar, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        String obj = b(fVar, str).toString();
        if (!TextUtils.isEmpty(obj)) {
            c(fVar, a(obj));
            RVLogger.d("H5ScriptLoader", "load dynamic delta time ".concat(String.valueOf(System.currentTimeMillis() - currentTimeMillis)));
        }
    }

    @NonNull
    private StringBuilder b(f fVar, String str) {
        StringBuilder sb = new StringBuilder();
        if (fVar == null || TextUtils.isEmpty(str)) {
            RVLogger.d("H5ScriptLoader", "no config found for dynamic script");
            return sb;
        }
        JSONArray parseArray = JSONUtils.parseArray(str);
        if (parseArray == null || parseArray.isEmpty()) {
            RVLogger.w("H5ScriptLoader", "invalid dynamic script.");
            return sb;
        }
        for (int i2 = 0; i2 < parseArray.size(); i2++) {
            List<String> list = null;
            try {
                list = a(parseArray.getJSONObject(i2));
            } catch (Throwable th) {
                RVLogger.e("H5ScriptLoader", "parse dynamic script exception.", th);
            }
            if (list != null && !list.isEmpty()) {
                for (String next : list) {
                    if (!TextUtils.isEmpty(next)) {
                        sb.append(b(next));
                    }
                }
            }
        }
        return sb;
    }

    private String a(String str) {
        StringBuilder sb = new StringBuilder("(function(){if(window.HASINJECTDRNAMICSCRIPT){console.log(\"has load h5_dsRulesV2: \"+window.HASINJECTDRNAMICSCRIPT);return}window.HASINJECTDRNAMICSCRIPT=false;function onDOMReady(callback){var readyRE=/complete|loaded|interactive/;if(readyRE.test(document.readyState)){setTimeout(function(){callback()},1)}else{document.defaultView.addEventListener(\"DOMContentLoaded\",function(){callback()},false)}}onDOMReady(function(){if(!window.HASINJECTDRNAMICSCRIPT){");
        sb.append(str);
        sb.append("console.log(\"load h5_dsRulesV2 success\");window.HASINJECTDRNAMICSCRIPT=true}})})();");
        return sb.toString();
    }

    private String b(String str) {
        RVLogger.d("H5ScriptLoader", "load dynamicV2 script ".concat(String.valueOf(str)));
        StringBuilder sb = new StringBuilder("var script,head=document.head||document.documentElement;script=document.createElement(\"script\");script.async=true;script.charset=\"UTF-8\";script.src=\"");
        sb.append(str);
        sb.append("\";");
        sb.append(c(str));
        sb.append("head.insertBefore(script,head.firstChild);");
        return sb.toString();
    }

    private String c(String str) {
        return (TextUtils.isEmpty(str) || !str.contains("nebula-addcors")) ? "" : "script.setAttribute('crossorigin','');";
    }

    private List<String> a(JSONObject jSONObject) {
        if (this.j == null || jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String next : jSONObject.keySet()) {
            if (!TextUtils.isEmpty(next)) {
                JSONArray jSONArray = jSONObject.getJSONArray(next);
                if (jSONArray != null && !jSONArray.isEmpty()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= jSONArray.size()) {
                            break;
                        }
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        String string = JSONUtils.getString(jSONObject2, "appId");
                        String string2 = JSONUtils.getString(jSONObject2, GriverParam.PUBLIC_ID);
                        String string3 = JSONUtils.getString(jSONObject2, "url");
                        if ((TextUtils.isEmpty(string) || b(this.k, string)) && (TextUtils.isEmpty(string2) || b(this.l, string2)) && (TextUtils.isEmpty(string3) || b(this.m, string3))) {
                            arrayList.add(next);
                            break;
                        }
                        i2++;
                    }
                } else {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    private boolean b(String str, String str2) {
        Pattern compile = H5PatternHelper.compile(str2);
        if (compile == null) {
            return false;
        }
        return compile.matcher(str).find();
    }

    private void c(f fVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            fVar.loadUrl(RDConstant.JAVASCRIPT_SCHEME.concat(String.valueOf(str)));
        }
    }
}
