package com.iap.ac.config.lite.b;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.rpc.model.HttpMethod;
import com.iap.ac.android.common.rpc.model.HttpRequest;
import com.iap.ac.android.common.rpc.model.HttpResponse;
import com.iap.ac.android.gol.google.supergw.SuperGwUtils;
import com.iap.ac.android.rpc.http.impl.HttpUrlTransport;
import com.iap.ac.config.lite.ConfigCenterContext;
import com.iap.ac.config.lite.common.KVBuilder;
import com.iap.ac.config.lite.delegate.ConfigMonitor;
import com.iap.ac.config.lite.endcomputing.evaluator.Evaluator;
import com.iap.ac.config.lite.endcomputing.model.CdnResult;
import com.iap.ac.config.lite.facade.request.AmcsConfigRpcRequest;
import com.iap.ac.config.lite.facade.result.AmcsConfigCdnResult;
import com.iap.ac.config.lite.utils.AesUtils;
import com.iap.ac.config.lite.utils.RsaUtils;
import java.util.List;
import org.json.JSONObject;

public abstract class a extends b {
    @NonNull
    private Context c;

    protected a(@NonNull ConfigCenterContext configCenterContext) {
        super(configCenterContext);
        this.c = configCenterContext.getContext();
    }

    private String a(HttpResponse httpResponse) throws Exception {
        String str;
        CdnResult cdnResult = (CdnResult) JsonUtils.fromJson(new String(httpResponse.data), CdnResult.class);
        if (TextUtils.isEmpty(cdnResult.sk)) {
            return cdnResult.data;
        }
        try {
            str = RsaUtils.decrypt(cdnResult.sk, RsaUtils.RSA_PRIVATE_KEY);
        } catch (Exception e) {
            a(ConfigMonitor.Events.CONFIG_DECRYPT_FAIL, KVBuilder.newBuilder().put("type", SuperGwUtils.SIGN_TYPE).put("message", e.getMessage()).build());
            str = null;
        }
        try {
            return AesUtils.decrypt(cdnResult.data, str);
        } catch (Exception e2) {
            a(ConfigMonitor.Events.CONFIG_DECRYPT_FAIL, KVBuilder.newBuilder().put("type", "AES").put("message", e2.getMessage()).build());
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r0 = r0.getJSONConfig(com.iap.ac.config.lite.common.AmcsConstants.CDN_END_COMPUTING_KEY);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String c() {
        /*
            r2 = this;
            com.iap.ac.config.lite.ConfigCenterContext r0 = r2.f9795a
            java.lang.String r0 = r0.getBizCode()
            com.iap.ac.config.lite.ConfigCenter r0 = com.iap.ac.config.lite.ConfigCenter.getInstance(r0)
            java.lang.String r1 = "__xAmcs"
            com.iap.ac.config.lite.ConfigGetter r0 = r0.getSectionConfigGetter(r1)
            if (r0 == 0) goto L_0x0021
            java.lang.String r1 = "cdnEndComputing"
            org.json.JSONObject r0 = r0.getJSONConfig(r1)
            if (r0 == 0) goto L_0x0021
            java.lang.String r1 = "cdn_url"
            java.lang.String r0 = r0.optString(r1)
            return r0
        L_0x0021:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.config.lite.b.a.c():java.lang.String");
    }

    /* access modifiers changed from: protected */
    @Nullable
    public AmcsConfigCdnResult b(String str, JSONObject jSONObject) throws Exception {
        HttpResponse b = b();
        int i = b.statusCode;
        if (i == 200) {
            String a2 = a(b);
            this.f9795a.getConfigStorage().a(a2);
            b(b);
            return new Evaluator(this.f9795a, a2).performCalculate(c(str, jSONObject));
        } else if (i != 304) {
            return null;
        } else {
            return new Evaluator(this.f9795a, this.f9795a.getConfigStorage().b()).performCalculate(c(str, jSONObject));
        }
    }

    public abstract AmcsConfigRpcRequest c(String str, JSONObject jSONObject);

    private HttpResponse b() throws Exception {
        HttpUrlTransport httpUrlTransport = new HttpUrlTransport(false, this.c);
        HttpRequest httpRequest = new HttpRequest(c(), HttpMethod.GET, (String) null);
        httpRequest.addHeader("If-Modified-Since", this.f9795a.getConfigStorage().c());
        return httpUrlTransport.performRequest(httpRequest);
    }

    private void b(@NonNull HttpResponse httpResponse) {
        List list = httpResponse.headers.get("last-modified");
        if (list != null && list.size() > 0) {
            this.f9795a.getConfigStorage().b((String) list.get(0));
        }
    }
}
