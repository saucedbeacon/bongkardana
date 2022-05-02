package com.iap.ac.android.acs.plugin.biz.region.menu.repository;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.acs.plugin.biz.region.bean.AddFavoriteRequest;
import com.iap.ac.android.acs.plugin.biz.region.bean.AddFavoriteResult;
import com.iap.ac.android.acs.plugin.biz.region.bean.FetchMenuExtraInfoRequest;
import com.iap.ac.android.acs.plugin.biz.region.bean.FetchMenuExtraInfoResult;
import com.iap.ac.android.acs.plugin.biz.region.bean.RemoveFavoriteRequest;
import com.iap.ac.android.acs.plugin.biz.region.bean.RemoveFavoriteResult;
import com.iap.ac.android.biz.common.rpc.annotation.ACRpcRequest;

public interface RegionMenuFacade {
    public static final String OPERATION_TYPE_ADD_FAVORITE = "eco.region.client.favorite.addFavorite";
    public static final String OPERATION_TYPE_FETCH_MENU = "eco.region.client.miniprogram.fetchMenuExtraInfo";
    public static final String OPERATION_TYPE_REMOVE_FAVORITE = "eco.region.client.favorite.removeFavorite";

    @OperationType("eco.region.client.favorite.addFavorite")
    @ACRpcRequest
    @SignCheck
    AddFavoriteResult addFavorite(AddFavoriteRequest addFavoriteRequest);

    @OperationType("eco.region.client.miniprogram.fetchMenuExtraInfo")
    @ACRpcRequest
    @SignCheck
    FetchMenuExtraInfoResult fetchMenuExtraInfo(FetchMenuExtraInfoRequest fetchMenuExtraInfoRequest);

    @OperationType("eco.region.client.favorite.removeFavorite")
    @ACRpcRequest
    @SignCheck
    RemoveFavoriteResult removeFavorite(RemoveFavoriteRequest removeFavoriteRequest);
}
