package com.alibaba.ariver.resource.api.appxng;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.content.ResourcePackage;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.content.GlobalPackagePool;
import com.alibaba.ariver.resource.runtime.RuntimeCheckResult;
import com.alibaba.ariver.resource.runtime.RuntimeVersionChecker;

@Keep
public class AppxNgRuntimeChecker extends RuntimeVersionChecker {
    private static final String TAG = "AriverRes:AppxNgRuntimeChecker";

    public String getRuntimeRequired() {
        return "appxRuntimeRequired";
    }

    public String getRuntimeSupportMax() {
        return "webRuntimeSupportMax";
    }

    public String getRuntimeSupportMin() {
        return "webRuntimeSupportMin";
    }

    public String getTag() {
        return TAG;
    }

    public AppxNgRuntimeChecker(String str) {
        super(str);
    }

    public String getRuntimeVersion() {
        ResourcePackage resourcePackage = GlobalPackagePool.getInstance().getPackage(getRuntimeAppId());
        if (resourcePackage != null) {
            return resourcePackage.version();
        }
        return null;
    }

    public RuntimeCheckResult checkRuntimeVersion(AppModel appModel, Bundle bundle) {
        String runtimeAppId = getRuntimeAppId();
        String string = BundleUtils.contains(bundle, getRuntimeRequired()) ? BundleUtils.getString(bundle, getRuntimeRequired()) : null;
        if (TextUtils.isEmpty(string) && appModel.getContainerInfo() != null) {
            string = JSONUtils.getString(appModel.getContainerInfo().getLaunchParams(), getRuntimeRequired());
        }
        String runtimeVersion = getRuntimeVersion();
        if (TextUtils.isEmpty(runtimeVersion)) {
            StringBuilder sb = new StringBuilder();
            sb.append(runtimeAppId);
            sb.append("version is empty,appx-ng");
            RVLogger.d(TAG, sb.toString());
            return new RuntimeCheckResult(false, true, "1");
        }
        RuntimeCheckResult checkRuntimeMatched = checkRuntimeMatched(runtimeAppId, runtimeVersion, string);
        if (!checkRuntimeMatched.isEnabled()) {
            RVLogger.d(getTag(), String.format("%s not match,update", new Object[]{runtimeAppId}));
        }
        return checkRuntimeMatched;
    }
}
