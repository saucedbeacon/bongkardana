package com.iap.ac.android.acs.plugin.biz.region.config;

import android.text.TextUtils;
import com.iap.ac.android.acs.plugin.biz.region.RegionConstants;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum RegionRPCConfigCenter {
    INSTANCE;

    public final boolean isEnableReport() {
        return getRegionBizToggle() && getMiniProgramStartReportToggle();
    }

    public final boolean isEnableRetryReport() {
        return getRegionBizToggle() && getMiniProgramOpenRetryToggle();
    }

    public final boolean isAllowRegisterCommonNetwork() {
        return getRegionBizToggle() && getCommonNetworkProxyRegisterToggle();
    }

    public final boolean regionRPCEnable() {
        return getRegionBizToggle() && getMiniProgramRegionRPCToggle();
    }

    public final boolean isRegionNetworkProxyEnable() {
        return getRegionBizToggle() && getCommonNetworkProxyRegisterToggle();
    }

    public final boolean getRegionBizToggle() {
        return getRegionConfigToggle(RegionConstants.KEY_TOGGLE_REGION_BIZ);
    }

    public final boolean getMiniProgramStartReportToggle() {
        return getRegionConfigToggle(RegionConstants.KEY_TOGGLE_MINI_PROGRAM_START_REPORT);
    }

    public final boolean getMiniProgramOpenRetryToggle() {
        return getRegionConfigToggle(RegionConstants.KEY_TOGGLE_MINI_PROGRAM_START_REPORT_RETRY);
    }

    public final boolean getCommonNetworkProxyRegisterToggle() {
        return getRegionConfigToggle(RegionConstants.TOGGLE_COMMON_NETWORK_PROXY_REGISTER);
    }

    public final boolean getShowNotificationBoxItem() {
        return getRegionConfigToggle(RegionConstants.TOGGLE_SHOW_NOTIFICATION_BOX_ITEM);
    }

    public final boolean getShowFavoriteItem() {
        return getRegionConfigToggle(RegionConstants.TOGGLE_SHOW_FAVORITE_ITEM);
    }

    public final boolean getShowFeedBackItem() {
        return getRegionConfigToggle(RegionConstants.TOGGLE_SHOW_FEEDBACK_ITEM);
    }

    public final boolean getNotificationBoxRedDotEnabled() {
        return getRegionConfigToggle(RegionConstants.TOGGLE_NOTIFICATION_BOX_REDDOT_ENABLED);
    }

    public final String getNotificationBoxItemAppId() {
        return getStringValue(RegionConstants.KEY_NOTIFICATION_BOX_ITEM_APPID, "");
    }

    public final String getFeedbackItemAppId() {
        return getStringValue(RegionConstants.KEY_FEEDBACK_ITEM_APPID, "");
    }

    public final List getRegionMiniAppList() {
        Object obj = getRegionConfig().get(RegionConstants.KEY_TOGGLE_MINI_PROGRAM_REGION_RPC_WHITE_LIST);
        if (obj instanceof List) {
            return (List) obj;
        }
        return null;
    }

    public final boolean getMiniProgramRegionRPCToggle() {
        return getRegionConfigToggle(RegionConstants.TOGGLE_MINI_PROGRAM_REGION_RPC);
    }

    private boolean getRegionConfigToggle(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Object obj = getRegionConfig().get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    private String getStringValue(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        Object obj = getRegionConfig().get(str);
        return obj instanceof String ? (String) obj : str2;
    }

    private boolean getBooleanValue(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        Object obj = getRegionConfig().get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z;
    }

    private Map getRegionConfig() {
        return ConfigCenter.INSTANCE.getMap(RegionConstants.SECTION_REGION_CONFIG, new HashMap());
    }

    public final boolean fetchStageInfoEnabled() {
        return getRegionConfigToggle(RegionConstants.KEY_FETCH_STAGEINFO_ENABLED);
    }
}
