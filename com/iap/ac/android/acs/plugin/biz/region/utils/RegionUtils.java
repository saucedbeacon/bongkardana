package com.iap.ac.android.acs.plugin.biz.region.utils;

import com.iap.ac.android.acs.plugin.biz.region.config.RegionRPCConfigCenter;
import java.util.List;

public class RegionUtils {
    public static boolean isRegionMiniProgram(String str, String str2) {
        List regionMiniAppList = RegionRPCConfigCenter.INSTANCE.getRegionMiniAppList();
        return regionMiniAppList != null && regionMiniAppList.contains(str);
    }
}
