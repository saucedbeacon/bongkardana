package com.iap.ac.android.acs.plugin.biz.region;

import android.content.Context;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.FetchLaunchableGroupsCallback;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.outter.LaunchableGroup;
import com.iap.ac.android.biz.common.model.InitConfig;
import java.util.List;
import java.util.Map;

public interface IRegionManager {
    void fetchLaunchableGroupsWithCodes(List<String> list, FetchLaunchableGroupsCallback<Map<String, LaunchableGroup>> fetchLaunchableGroupsCallback);

    Context getContext();

    void initRegion(Context context, InitConfig initConfig);

    boolean isRegionMiniProgram(String str, String str2);
}
