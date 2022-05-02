package com.iap.ac.android.acs.plugin.biz.region.bean;

import androidx.annotation.Keep;
import java.util.Map;

@Keep
public class MenuExtraInfo {
    public static final String CUSTOM_DATA_COLLECTED_STATUS = "collectedStatus";
    public static final String MENU_ID_COLLECT = "IAPMenuIdCollect";
    public static final String MENU_ID_NOTIFICATION = "IAPMenuIdNotificationBox";
    public Map<String, Object> customData;
    public String menuId;
    public boolean showRedDot;
}
