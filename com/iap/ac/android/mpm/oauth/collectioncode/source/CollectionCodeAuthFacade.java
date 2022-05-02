package com.iap.ac.android.mpm.oauth.collectioncode.source;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.biz.common.rpc.annotation.ACRpcRequest;
import com.iap.ac.android.mpm.base.model.oauth.request.PrepareCollectionCodeAuthRequest;
import com.iap.ac.android.mpm.base.model.oauth.result.PrepareCollectionCodeAuthResult;

public interface CollectionCodeAuthFacade {
    @OperationType("ac.mobilepayment.mpm.oauth.aggregatecode.prepare")
    @ACRpcRequest
    @SignCheck
    PrepareCollectionCodeAuthResult prepare(PrepareCollectionCodeAuthRequest prepareCollectionCodeAuthRequest);
}
