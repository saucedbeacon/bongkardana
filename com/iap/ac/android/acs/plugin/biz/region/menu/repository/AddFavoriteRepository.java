package com.iap.ac.android.acs.plugin.biz.region.menu.repository;

import com.iap.ac.android.acs.plugin.biz.region.bean.AddFavoriteRequest;
import com.iap.ac.android.acs.plugin.biz.region.bean.AddFavoriteResult;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.RPCProxyHost;

public class AddFavoriteRepository {
    private static final String TAG = "AddFavoriteRepository";

    public AddFavoriteResult addFavorite(String str) {
        try {
            AddFavoriteRequest addFavoriteRequest = new AddFavoriteRequest();
            addFavoriteRequest.appId = str;
            return ((RegionMenuFacade) RPCProxyHost.getInterfaceProxy(RegionMenuFacade.class, "region_biz")).addFavorite(addFavoriteRequest);
        } catch (Throwable th) {
            ACLog.e(TAG, "AddFavorite error:".concat(String.valueOf(th)));
            return null;
        }
    }
}
