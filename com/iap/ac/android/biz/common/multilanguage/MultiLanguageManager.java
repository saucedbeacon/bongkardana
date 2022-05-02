package com.iap.ac.android.biz.common.multilanguage;

import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.callback.MultiLanguageCallback;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.http.HttpMethod;
import com.iap.ac.android.biz.common.model.http.HttpRequest;
import com.iap.ac.android.biz.common.model.http.HttpResponse;
import com.iap.ac.android.biz.common.model.multilanguage.querycity.CityQueryRpcResult;
import com.iap.ac.android.biz.common.model.multilanguage.querycity.CityRegionsGroupByInitial;
import com.iap.ac.android.biz.common.model.multilanguage.querycity.CountryRegion;
import com.iap.ac.android.biz.common.model.multilanguage.queryregioncode.RegionCodeQueryRpcResult;
import com.iap.ac.android.biz.common.model.multilanguage.queryregioncode.RegionsGroupByInitial;
import com.iap.ac.android.biz.common.model.multilanguage.resources.Metadata;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.task.async.IAPAsyncTask;
import com.iap.ac.android.d.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class MultiLanguageManager {

    /* renamed from: a  reason: collision with root package name */
    public static WeakReference<Handler> f11032a;

    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11033a;
        public final /* synthetic */ List b;
        public final /* synthetic */ MultiLanguageCallback c;

        public a(String str, List list, MultiLanguageCallback multiLanguageCallback) {
            this.f11033a = str;
            this.b = list;
            this.c = multiLanguageCallback;
        }

        public final void run() {
            CityQueryRpcResult cityQueryRpcResult;
            try {
                cityQueryRpcResult = new com.iap.ac.android.r.a().a(this.f11033a, this.b);
            } catch (Throwable th) {
                ACLog.e("MultiLanguageManager", String.format("queryCity error, e=%s", new Object[]{Utils.e(th)}));
                cityQueryRpcResult = null;
            }
            if (cityQueryRpcResult == null || !cityQueryRpcResult.success) {
                cityQueryRpcResult = new CityQueryRpcResult();
            } else {
                for (CountryRegion next : cityQueryRpcResult.countryWithCities) {
                    for (CityRegionsGroupByInitial cityRegionsGroupByInitial : next.cityRegionsGroupByInitials) {
                        next.cities.addAll(cityRegionsGroupByInitial.cities);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (CountryRegion next2 : cityQueryRpcResult.countryWithCities) {
                if (next2.cities.size() != 0 && !TextUtils.isEmpty(next2.regionName) && !TextUtils.isEmpty(next2.regionCode)) {
                    arrayList.add(next2);
                }
            }
            MultiLanguageManager.a(this.c, arrayList);
        }
    }

    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11034a;
        public final /* synthetic */ MultiLanguageCallback b;

        public b(String str, MultiLanguageCallback multiLanguageCallback) {
            this.f11034a = str;
            this.b = multiLanguageCallback;
        }

        public final void run() {
            RegionCodeQueryRpcResult regionCodeQueryRpcResult;
            try {
                regionCodeQueryRpcResult = new com.iap.ac.android.r.b().a(this.f11034a);
            } catch (Throwable th) {
                ACLog.e("MultiLanguageManager", String.format("queryRegionCode error, e=%s", new Object[]{Utils.e(th)}));
                regionCodeQueryRpcResult = null;
            }
            if (regionCodeQueryRpcResult == null || !regionCodeQueryRpcResult.success) {
                regionCodeQueryRpcResult = new RegionCodeQueryRpcResult();
            }
            MultiLanguageManager.a(this.b, regionCodeQueryRpcResult.regionsGroupByInitials);
        }
    }

    public static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11035a;
        public final /* synthetic */ String b;
        public final /* synthetic */ MultiLanguageCallback c;

        public c(String str, String str2, MultiLanguageCallback multiLanguageCallback) {
            this.f11035a = str;
            this.b = str2;
            this.c = multiLanguageCallback;
        }

        public final void run() {
            HashMap hashMap;
            com.iap.ac.android.q.b bVar = new com.iap.ac.android.q.b(ACManager.getInstance().getContext());
            String str = this.f11035a;
            String str2 = this.b;
            Metadata a2 = bVar.a();
            if (a2 == null || a2.lastest_versions == null || TextUtils.isEmpty(a2.static_url)) {
                hashMap = new HashMap();
            } else {
                String str3 = a2.lastest_versions.i18n.get(str);
                String str4 = a2.static_url;
                StringBuilder sb = new StringBuilder();
                sb.append(str4);
                sb.append("/i18n/");
                sb.append(str);
                sb.append("/");
                sb.append(str3);
                sb.append("/");
                sb.append(str2);
                sb.append(".json");
                String str5 = "";
                HttpRequest httpRequest = new HttpRequest(sb.toString(), HttpMethod.GET, str5);
                try {
                    com.iap.ac.android.d.b bVar2 = bVar.f11063a;
                    HttpResponse a3 = new f(bVar2, httpRequest, bVar2.c).a();
                    if (bVar.a(a3)) {
                        str5 = new String(a3.data);
                    }
                } catch (Throwable th) {
                    StringBuilder sb2 = new StringBuilder("getI18nScene  exception, scene=");
                    sb2.append(str);
                    sb2.append("version=");
                    sb2.append(str3);
                    sb2.append("locale=");
                    sb2.append(str2);
                    sb2.append(" errorCode is: ");
                    ACLog.e(Constants.TAG, sb2.toString(), th);
                    ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_multilanguage_query_bizscene_fail").addParams("resourcesName", str).addParams("version", str3).addParams("locale", str2).addParams("resultMessage", (Object) th).event();
                }
                hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, jSONObject.getString(next));
                    }
                } catch (Throwable th2) {
                    ACLog.e("MultiLanguageManager", "getI18nScene exception,  errorCode is: ", th2);
                    hashMap = new HashMap();
                }
            }
            MultiLanguageManager.a(this.c, hashMap);
        }
    }

    public static /* synthetic */ void a(MultiLanguageCallback multiLanguageCallback, Object obj) {
        WeakReference<Handler> weakReference = f11032a;
        if (weakReference == null || weakReference.get() == null) {
            f11032a = new WeakReference<>(new Handler(ACManager.getInstance().getContext().getMainLooper()));
        }
        f11032a.get().post(new com.iap.ac.android.o.a(multiLanguageCallback, obj));
    }

    public static void queryBizSceneMultiLanguage(@NonNull String str, @NonNull String str2, @NonNull MultiLanguageCallback<Map<String, String>> multiLanguageCallback) {
        IAPAsyncTask.asyncTask((Runnable) new c(str2, str, multiLanguageCallback));
    }

    public static void queryCity(@NonNull String str, @NonNull List<String> list, @NonNull MultiLanguageCallback<List<CountryRegion>> multiLanguageCallback) {
        IAPAsyncTask.asyncTask((Runnable) new a(str, list, multiLanguageCallback));
    }

    public static void queryRegionCode(@NonNull String str, @NonNull MultiLanguageCallback<List<RegionsGroupByInitial>> multiLanguageCallback) {
        IAPAsyncTask.asyncTask((Runnable) new b(str, multiLanguageCallback));
    }
}
