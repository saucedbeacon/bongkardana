package com.iap.ac.android.biz;

import com.iap.ac.android.acs.plugin.biz.region.stageinfo.FetchLaunchableGroupsCallback;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.outter.LaunchableGroup;
import com.iap.ac.android.biz.internal.impl.OperationManagerImpl;
import java.util.List;
import java.util.Map;

public class OperationManager {
    public static void fetchLaunchableGroupsWithCodes(List<String> list, FetchLaunchableGroupsCallback<Map<String, LaunchableGroup>> fetchLaunchableGroupsCallback) {
        OperationManagerImpl.getInstance().fetchLaunchableGroupsWithCodes(list, fetchLaunchableGroupsCallback);
    }
}
