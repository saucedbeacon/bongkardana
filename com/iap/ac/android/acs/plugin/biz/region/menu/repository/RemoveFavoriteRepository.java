package com.iap.ac.android.acs.plugin.biz.region.menu.repository;

import com.iap.ac.android.acs.plugin.biz.region.bean.RemoveFavoriteRequest;
import com.iap.ac.android.acs.plugin.biz.region.bean.RemoveFavoriteResult;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.RPCProxyHost;

public class RemoveFavoriteRepository {
    private static final String TAG = "FetchMenuExtraInfoRepository";

    public RemoveFavoriteResult removeFavorite(String str) {
        try {
            RemoveFavoriteRequest removeFavoriteRequest = new RemoveFavoriteRequest();
            removeFavoriteRequest.appId = str;
            return ((RegionMenuFacade) RPCProxyHost.getInterfaceProxy(RegionMenuFacade.class, "region_biz")).removeFavorite(removeFavoriteRequest);
        } catch (Throwable th) {
            ACLog.e(TAG, "fetchMenuExtraInfo error:".concat(String.valueOf(th)));
            return null;
        }
    }
}
