package com.zoloz.builder.service;

import android.os.Bundle;
import com.alibaba.ariver.app.api.App;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.core.Griver;
import com.alipay.mobile.security.bio.service.local.web.BioWebService;
import com.zoloz.builder.monitor.ZLZCrashHandler;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WebServiceProxy extends BioWebService {
    public static final String ADJUST_RESIZE = "h5_enableNewAdjustInput";
    public static final String EKYC_FALSE = "false";
    public static final String EKYC_NO = "no";
    public static final String EKYC_YES = "yes";
    public static final String LANDSCAPE = "landscape";
    public static final String SHOW_LOADING = "showLoading";
    public static final String SHOW_OPTION_MENU = "showOptionMenu";
    public static Set<String> mUrls = new HashSet();

    public void openPage(HashMap<String, Object> hashMap) {
        Bundle bundle = new Bundle();
        bundle.putString(ADJUST_RESIZE, "yes");
        bundle.putString("showOptionMenu", "no");
        bundle.putString("showLoading", "no");
        bundle.putString("landscape", (String) hashMap.get("landscape"));
        String valueOf = String.valueOf(hashMap.get("url"));
        mUrls.add(valueOf);
        Griver.openUrl(GriverEnv.getApplicationContext(), valueOf, bundle);
    }

    public boolean isPageAlreadyExisted(String str) {
        return GriverEnv.getAppByUrl(str) != null;
    }

    public void exitPage(String str) {
        App appByUrl = GriverEnv.getAppByUrl(str);
        if (appByUrl != null) {
            appByUrl.exit();
        }
    }

    public void exitSession() {
        for (String exitPage : mUrls) {
            exitPage(exitPage);
        }
        mUrls.clear();
    }

    public void onDestroy() {
        super.onDestroy();
        ZLZCrashHandler.getInstance().disable();
    }
}
