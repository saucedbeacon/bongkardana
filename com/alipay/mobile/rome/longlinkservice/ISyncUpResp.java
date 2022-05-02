package com.alipay.mobile.rome.longlinkservice;

import com.alipay.mobile.rome.longlinkservice.syncmodel.SyncUpResp;

public interface ISyncUpResp<K> {
    void onUpResponse(SyncUpResp<K> syncUpResp);
}
