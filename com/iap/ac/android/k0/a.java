package com.iap.ac.android.k0;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVParams;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.model.remoteconfig.mpm.HookUrlConfig;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.container.IContainerPresenter;
import com.iap.ac.android.common.container.constant.ContainerEventAction;
import com.iap.ac.android.common.container.event.ContainerEvent;
import com.iap.ac.android.common.container.event.ContainerEventFilter;
import com.iap.ac.android.common.container.plugin.BaseContainerPlugin;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.task.async.IAPAsyncTask;
import com.iap.ac.android.mpm.base.model.interceptor.HookUrlMappingParams;
import com.iap.ac.android.mpm.biz.base.EntranceType;
import com.iap.ac.android.p0.e;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a extends BaseContainerPlugin {

    /* renamed from: a  reason: collision with root package name */
    public ContainerEvent f9723a;

    /* renamed from: com.iap.ac.android.k0.a$a  reason: collision with other inner class name */
    public class C0030a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.iap.ac.android.c0.a f9724a;
        public final /* synthetic */ e b;
        public final /* synthetic */ com.iap.ac.android.b0.a c;

        public C0030a(a aVar, com.iap.ac.android.c0.a aVar2, e eVar, com.iap.ac.android.b0.a aVar3) {
            this.f9724a = aVar2;
            this.b = eVar;
            this.c = aVar3;
        }

        public void run() {
            this.f9724a.a((com.iap.ac.android.m0.b) this.b, this.c);
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.iap.ac.android.c0.a f9725a;
        public final /* synthetic */ com.iap.ac.android.n0.b b;
        public final /* synthetic */ com.iap.ac.android.b0.a c;

        public b(a aVar, com.iap.ac.android.c0.a aVar2, com.iap.ac.android.n0.b bVar, com.iap.ac.android.b0.a aVar3) {
            this.f9725a = aVar2;
            this.b = bVar;
            this.c = aVar3;
        }

        public void run() {
            this.f9725a.a((com.iap.ac.android.m0.b) this.b, this.c);
        }
    }

    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.iap.ac.android.c0.a f9726a;
        public final /* synthetic */ com.iap.ac.android.o0.b b;
        public final /* synthetic */ com.iap.ac.android.b0.a c;

        public c(a aVar, com.iap.ac.android.c0.a aVar2, com.iap.ac.android.o0.b bVar, com.iap.ac.android.b0.a aVar3) {
            this.f9726a = aVar2;
            this.b = bVar;
            this.c = aVar3;
        }

        public void run() {
            this.f9726a.a((com.iap.ac.android.m0.b) this.b, this.c);
        }
    }

    public final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        List<HookUrlConfig> hookUrlConfig = ACManager.getInstance().getHookUrlConfig();
        ACLog.d("PageEventPlugin", "handleUrl url:".concat(String.valueOf(str)));
        if (hookUrlConfig != null && !hookUrlConfig.isEmpty()) {
            for (HookUrlConfig next : hookUrlConfig) {
                Pattern compile = Pattern.compile(next.matchRule);
                Matcher matcher = null;
                if (compile != null) {
                    matcher = compile.matcher(str);
                }
                ACLog.d("PageEventPlugin", String.format("handleUrl config.matchType = %s, config.matchRule = %s", new Object[]{next.matchType, next.matchRule}));
                if (("CONTAIN".equals(next.matchType) && str.contains(next.matchRule)) || ("REGEX".equals(next.matchType) && matcher != null && matcher.matches())) {
                    ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_interceptor_url").addParams("url", str).event();
                    try {
                        String stringExtra = this.f9723a.containerPresenter.getActivity().getIntent().getStringExtra("AcBizProcessorKey");
                        com.iap.ac.android.c0.a aVar = com.iap.ac.android.b0.b.f9676a.get(stringExtra);
                        if (aVar == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(stringExtra);
                            sb.append("  biz processor is not exist");
                            String obj = sb.toString();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(stringExtra);
                            sb2.append(obj);
                            ACLog.e("PageEventPlugin", sb2.toString());
                            ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_mpm_biz_not_found_error", obj);
                            return false;
                        }
                        try {
                            HookUrlMappingParams hookUrlMappingParams = (HookUrlMappingParams) JsonUtils.fromJson(next.mappingParams, HookUrlMappingParams.class);
                            if ("AUTH_URL".equals(next.hookType)) {
                                IContainerPresenter iContainerPresenter = this.f9723a.containerPresenter;
                                if (iContainerPresenter != null) {
                                    iContainerPresenter.loadUrl("https://render.alipay.com/p/w/ac-loading-page/");
                                }
                                IAPAsyncTask.asyncTask((Runnable) new C0030a(this, aVar, new e(str), new com.iap.ac.android.b0.a(EntranceType.PageEventPlugin, iContainerPresenter)));
                                return true;
                            } else if ("DECODE_URL".equals(next.hookType)) {
                                Uri parse = Uri.parse(str);
                                String queryParameter = parse.getQueryParameter(hookUrlMappingParams.codeParamKey);
                                if (!TextUtils.isEmpty(hookUrlMappingParams.loadingUrl)) {
                                    String queryParameter2 = parse.getQueryParameter(hookUrlMappingParams.loadingUrl);
                                    if (str.startsWith("https://render.alipay.com/p/w/ac-fe-adaptor") && !TextUtils.isEmpty(queryParameter2)) {
                                        this.f9723a.containerPresenter.loadUrl(queryParameter2);
                                    }
                                }
                                if (!TextUtils.isEmpty(queryParameter)) {
                                    IAPAsyncTask.asyncTask((Runnable) new b(this, aVar, new com.iap.ac.android.n0.b(queryParameter, false), new com.iap.ac.android.b0.a(EntranceType.PageEventPlugin, this.f9723a.containerPresenter)));
                                    return true;
                                }
                            } else {
                                IAPAsyncTask.asyncTask((Runnable) new c(this, aVar, new com.iap.ac.android.o0.b(str), new com.iap.ac.android.b0.a(EntranceType.PageEventPlugin, this.f9723a.containerPresenter)));
                                return true;
                            }
                        } catch (Exception e) {
                            ACLog.e("PageEventPlugin", "handleUrl error:".concat(String.valueOf(e)));
                            ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_interceptor_url_error", Utils.e(e));
                        }
                    } catch (Throwable th) {
                        String concat = "get biz key error :".concat(String.valueOf(th));
                        ACLog.e("PageEventPlugin", concat);
                        ACLogEvent.exceptionLog(concat);
                    }
                }
            }
        }
        return false;
    }

    public boolean interceptorEvent(ContainerEvent containerEvent) {
        boolean z;
        if (ContainerEventAction.ACTION_WEB_PAGE_SHOULD_OVERRIDE_URL.equals(containerEvent.action)) {
            try {
                z = "ACCode".equals(containerEvent.containerPresenter.getActivity().getIntent().getStringExtra(RVParams.LONG_BIZ_SCENARIO));
            } catch (Throwable unused) {
                z = false;
            }
            if (!z) {
                ACLog.d("PageEventPlugin", "PageEventPlugin, flag of bizScenario not match, should not intercept");
                return false;
            }
            this.f9723a = containerEvent;
            try {
                return a((String) containerEvent.params.get("url"));
            } catch (Throwable th) {
                ACLog.e("PageEventPlugin", "interceptorEvent error:".concat(String.valueOf(th)));
                ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_interceptor_url_error", Utils.e(th));
            }
        }
        return false;
    }

    public ContainerEventFilter onPrepare(ContainerEventFilter containerEventFilter) {
        containerEventFilter.addAction(ContainerEventAction.ACTION_WEB_PAGE_SHOULD_OVERRIDE_URL);
        return containerEventFilter;
    }
}
