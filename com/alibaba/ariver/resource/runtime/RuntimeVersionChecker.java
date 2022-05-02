package com.alibaba.ariver.resource.runtime;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.TypeUtils;
import com.alibaba.ariver.resource.api.content.ResourcePackage;
import com.alibaba.ariver.resource.api.models.AppInfoQuery;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.proxy.RVAppInfoManager;
import com.alibaba.ariver.resource.content.BaseResourcePackage;
import com.alibaba.ariver.resource.content.GlobalPackagePool;
import com.alibaba.fastjson.JSONObject;

@Keep
public abstract class RuntimeVersionChecker {
    private String mRuntimeAppId;

    public abstract String getRuntimeRequired();

    /* access modifiers changed from: protected */
    public abstract String getRuntimeSupportMax();

    /* access modifiers changed from: protected */
    public abstract String getRuntimeSupportMin();

    /* access modifiers changed from: protected */
    public abstract String getRuntimeVersion();

    /* access modifiers changed from: protected */
    public abstract String getTag();

    public RuntimeVersionChecker(String str) {
        this.mRuntimeAppId = str;
    }

    public String getRuntimeAppId() {
        return this.mRuntimeAppId;
    }

    /* access modifiers changed from: protected */
    public RuntimeCheckResult checkRuntimeMatched(String str, String str2, String str3) {
        String tag = getTag();
        StringBuilder sb = new StringBuilder("checkRuntimeByAppInfo runtimeRequired: ");
        sb.append(str3);
        sb.append(" runtimeVersion: ");
        sb.append(str2);
        RVLogger.d(tag, sb.toString());
        if (TextUtils.isEmpty(str3)) {
            return new RuntimeCheckResult(true);
        }
        if (TextUtils.isEmpty(str2) || "*".equals(str2)) {
            RVLogger.w(getTag(), "checkRuntimeByAppInfo runtimeVersion null!");
            return new RuntimeCheckResult(false, true, "1");
        }
        AppModel appModel = ((RVAppInfoManager) RVProxy.get(RVAppInfoManager.class)).getAppModel(AppInfoQuery.make(str).version(str2));
        if (appModel == null) {
            RVLogger.w(getTag(), "checkRuntimeByAppInfo cannot find installedInfo!");
            if (((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigBoolean("ta_runtimecheck_from_loaded", true)) {
                ResourcePackage resourcePackage = GlobalPackagePool.getInstance().getPackage(str);
                if (resourcePackage instanceof BaseResourcePackage) {
                    AppModel appModel2 = ((BaseResourcePackage) resourcePackage).getAppModel();
                    RVLogger.w(getTag(), "loaded info is\t ".concat(String.valueOf(appModel2)));
                    if (appModel2 != null && TextUtils.equals(str2, appModel2.getAppVersion())) {
                        appModel = appModel2;
                    }
                }
                if (appModel == null) {
                    return new RuntimeCheckResult(false, true, "7");
                }
            }
        }
        JSONObject jSONObject = JSONUtils.getJSONObject(appModel.getExtendInfos(), RVConstants.EXTRA_RES_LAUNCH_PARAMS, (JSONObject) null);
        String string = JSONUtils.getString(jSONObject, getRuntimeSupportMin());
        String string2 = JSONUtils.getString(jSONObject, getRuntimeSupportMax());
        String tag2 = getTag();
        StringBuilder sb2 = new StringBuilder("checkDegrade with runtimeSupportMin= ");
        sb2.append(string);
        sb2.append(", runtimeSupportMax = ");
        sb2.append(string2);
        RVLogger.w(tag2, sb2.toString());
        if (TextUtils.isEmpty(string2) || TextUtils.isEmpty(string)) {
            return new RuntimeCheckResult(false, true, "5");
        }
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
            int parseInt = TypeUtils.parseInt(str3);
            int parseInt2 = TypeUtils.parseInt(string);
            int parseInt3 = TypeUtils.parseInt(string2);
            if (parseInt < parseInt2 || parseInt > parseInt3) {
                RVLogger.w(getTag(), "checkRuntimeDegrade disable  by minsdk fail");
                return new RuntimeCheckResult(false, true, "5");
            }
        }
        return new RuntimeCheckResult(true);
    }

    public RuntimeCheckResult checkRuntimeVersion(AppModel appModel, Bundle bundle) {
        String runtimeVersion = getRuntimeVersion();
        if (TextUtils.isEmpty(runtimeVersion)) {
            String tag = getTag();
            StringBuilder sb = new StringBuilder("checkRuntimeVersion ,but runtimeVersion is empty\t ");
            sb.append(getRuntimeAppId());
            RVLogger.d(tag, sb.toString());
            return new RuntimeCheckResult(false, true, "1");
        }
        String str = null;
        if (BundleUtils.contains(bundle, getRuntimeRequired())) {
            str = BundleUtils.getString(bundle, getRuntimeRequired());
        }
        if (TextUtils.isEmpty(str) && appModel.getContainerInfo() != null) {
            str = JSONUtils.getString(appModel.getContainerInfo().getLaunchParams(), getRuntimeRequired());
        }
        RuntimeCheckResult checkRuntimeMatched = checkRuntimeMatched(this.mRuntimeAppId, runtimeVersion, str);
        if (!checkRuntimeMatched.isEnabled()) {
            RVLogger.d(getTag(), String.format("%s not match,update", new Object[]{this.mRuntimeAppId}));
        }
        return checkRuntimeMatched;
    }
}
