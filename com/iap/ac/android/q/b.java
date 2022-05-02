package com.iap.ac.android.q;

import android.content.Context;
import android.os.SystemClock;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.http.HttpMethod;
import com.iap.ac.android.biz.common.model.http.HttpRequest;
import com.iap.ac.android.biz.common.model.http.HttpResponse;
import com.iap.ac.android.biz.common.model.multilanguage.resources.Metadata;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.d.f;

public class b {
    public static String b;

    /* renamed from: a  reason: collision with root package name */
    public com.iap.ac.android.d.b f11063a;

    public b(Context context) {
        com.iap.ac.android.d.b bVar = new com.iap.ac.android.d.b(true, context);
        bVar.c.add(new a(context));
        this.f11063a = bVar;
        b = ACManager.getInstance().getCommonConfig().cdnUrl;
    }

    public Metadata a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append("/meta_data.json");
        HttpRequest httpRequest = new HttpRequest(sb.toString(), HttpMethod.GET, (String) null);
        try {
            com.iap.ac.android.d.b bVar = this.f11063a;
            HttpResponse a2 = new f(bVar, httpRequest, bVar.c).a();
            if (a(a2)) {
                Metadata metadata = (Metadata) JsonUtils.fromJson(new String(a2.data), Metadata.class);
                StringBuilder sb2 = new StringBuilder("getMetadata time: ");
                sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                ACLog.i("MultiLanguageHttpClient", sb2.toString());
                return metadata;
            }
        } catch (Throwable th) {
            ACLog.e(Constants.TAG, "getMetadata  exception,  errorCode is: ", th);
            ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_multilanguage_query_bizscene_fail").addParams("resourcesName", "meta_data.json").addParams("resultMessage", (Object) th).event();
        }
        return null;
    }

    public boolean a(HttpResponse httpResponse) {
        if (httpResponse == null) {
            return false;
        }
        int i = httpResponse.statusCode;
        return (i == 200 || i == 304) && httpResponse.data != null;
    }
}
