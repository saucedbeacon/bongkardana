package com.alibaba.ariver.app.extensions;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppRestartResult;
import com.alibaba.ariver.app.api.ParamUtils;
import com.alibaba.ariver.app.api.model.AppConfigModel;
import com.alibaba.ariver.app.api.point.app.AppRestartPoint;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.UrlUtils;
import com.alipay.iap.android.aplog.log.spm.SpmTrackIntegrator;

public class AppRestartExtension implements AppRestartPoint {

    /* renamed from: a  reason: collision with root package name */
    private String f9958a = null;
    private String b = null;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public AppRestartResult onAppRestart(App app, Bundle bundle, Bundle bundle2) {
        AppRestartResult appRestartResult = new AppRestartResult();
        if (this.b == null) {
            this.b = a(app.getStartParams(), app.getSceneParams());
        }
        appRestartResult.startParam = bundle;
        appRestartResult.closeAllWindow = true;
        appRestartResult.canRestart = true;
        if (!app.isTinyApp()) {
            ParamUtils.unify(bundle, "url", false);
            String string = BundleUtils.getString(bundle, "url");
            RVLogger.d("AriverApp:AppRestartExtension", "onAppRestart for h5 app , url = ".concat(String.valueOf(string)));
            appRestartResult.startUrl = string;
        } else {
            String purifyUrl = UrlUtils.purifyUrl(app.getStartUrl());
            if (purifyUrl == null || !a(app, bundle, bundle2)) {
                appRestartResult.canRestart = false;
            } else {
                bundle.putBoolean(RVConstants.EXTRA_START_FROM_RELAUNCH, true);
                StringBuilder sb = new StringBuilder();
                sb.append(purifyUrl);
                sb.append("#");
                sb.append(this.f9958a);
                appRestartResult.startUrl = sb.toString();
            }
        }
        return appRestartResult;
    }

    private boolean a(App app, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle.getBoolean("IS_LITE_MOVE_TASK", false) || RVConstants.CHINFO_NAVIGATE_BACK.equalsIgnoreCase(bundle.getString(RVStartParams.KEY_CHINFO)) || "YES".equalsIgnoreCase(bundle.getString(RVStartParams.KEY_DISABLE_RELAUNCH))) {
            return false;
        }
        String a2 = a(bundle, bundle2);
        String str = this.b;
        this.b = a2;
        String string = bundle.getString("page");
        if (!TextUtils.isEmpty(string)) {
            return false;
        }
        String a3 = a(app);
        if (TextUtils.isEmpty(a3)) {
            return false;
        }
        if (TextUtils.isEmpty(a2) && TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder("needRelaunch targetPage: ");
        sb.append(string);
        sb.append(" homePage: ");
        sb.append(a3);
        sb.append(" chInfo: ");
        sb.append(a2);
        sb.append(" lastChInfo: ");
        sb.append(str);
        RVLogger.d("AriverApp:AppRestartExtension", sb.toString());
        if (TextUtils.isEmpty(str) || !str.equals(a2)) {
            return true;
        }
        return false;
    }

    private String a(App app) {
        if (!TextUtils.isEmpty(this.f9958a)) {
            return this.f9958a;
        }
        AppConfigModel appConfigModel = (AppConfigModel) app.getData(AppConfigModel.class);
        if (appConfigModel == null) {
            return this.f9958a;
        }
        if (appConfigModel.getPages() != null && appConfigModel.getPages().size() > 0) {
            this.f9958a = appConfigModel.getPages().get(0);
        }
        return this.f9958a;
    }

    @Nullable
    private static String a(Bundle bundle, Bundle bundle2) {
        String string = bundle.getString(RVStartParams.KEY_CHINFO);
        if (TextUtils.isEmpty(string)) {
            string = BundleUtils.getString(bundle2, RVStartParams.KEY_CHINFO);
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        int indexOf = string.indexOf(SpmTrackIntegrator.SEPARATOR_CHAR);
        return indexOf > 0 ? string.substring(0, indexOf) : string;
    }
}
