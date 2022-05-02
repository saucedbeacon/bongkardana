package com.iap.ac.android.biz.internal;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.model.CommonConfig;

public class IAPConnectRoute {

    public enum ScenarioType {
        AC,
        PA
    }

    public static ScenarioType getScenarioTypeByRegion(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return ScenarioType.PA;
        }
        ScenarioType scenarioType = ScenarioType.PA;
        CommonConfig commonConfig = ACManager.getInstance().getCommonConfig();
        return (commonConfig == null || TextUtils.equals(commonConfig.defaultRegion, str)) ? scenarioType : ScenarioType.AC;
    }
}
