package com.iap.ac.android.acs.plugin.biz.region.menu.repository;

import com.iap.ac.android.acs.plugin.biz.region.bean.FetchMenuExtraInfoRequest;
import com.iap.ac.android.acs.plugin.biz.region.bean.FetchMenuExtraInfoResult;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.RPCProxyHost;

public class FetchMenuExtraInfoRepository {
    private static final String TAG = "FetchMenuExtraInfoRepository";

    public FetchMenuExtraInfoResult fetchMenuExtraInfo(String str) {
        try {
            FetchMenuExtraInfoRequest fetchMenuExtraInfoRequest = new FetchMenuExtraInfoRequest();
            fetchMenuExtraInfoRequest.appId = str;
            return ((RegionMenuFacade) RPCProxyHost.getInterfaceProxy(RegionMenuFacade.class, "region_biz")).fetchMenuExtraInfo(fetchMenuExtraInfoRequest);
        } catch (Throwable th) {
            ACLog.e(TAG, "fetchMenuExtraInfo error:".concat(String.valueOf(th)));
            return null;
        }
    }
}
