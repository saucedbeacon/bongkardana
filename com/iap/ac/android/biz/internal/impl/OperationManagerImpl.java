package com.iap.ac.android.biz.internal.impl;

import com.iap.ac.android.acs.plugin.biz.region.RegionManager;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.FetchLaunchableGroupsCallback;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.outter.LaunchableGroup;
import com.iap.ac.android.biz.IAPConnect;
import com.iap.ac.android.biz.internal.ACFactory;
import com.iap.ac.android.biz.internal.IOperationManager;
import java.util.List;
import java.util.Map;

public class OperationManagerImpl implements IOperationManager {
    public static volatile IOperationManager sIAPOperationManagerImpl;

    public static IOperationManager getInstance() {
        if (sIAPOperationManagerImpl == null) {
            synchronized (IAPConnect.class) {
                if (sIAPOperationManagerImpl == null) {
                    sIAPOperationManagerImpl = ACFactory.createIAPOperationManager();
                }
            }
        }
        return sIAPOperationManagerImpl;
    }

    public void fetchLaunchableGroupsWithCodes(List<String> list, FetchLaunchableGroupsCallback<Map<String, LaunchableGroup>> fetchLaunchableGroupsCallback) {
        RegionManager.getInstance().fetchLaunchableGroupsWithCodes(list, fetchLaunchableGroupsCallback);
    }
}
