package com.iap.ac.android.i;

import com.iap.ac.android.biz.common.base.BaseNetwork;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.rpc.facade.MobilePaymentConfigRpcFacade;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentFetchConfigsRequest;
import com.iap.ac.android.biz.common.rpc.result.MobilePaymentFetchConfigsResult;

public class a extends BaseNetwork<MobilePaymentConfigRpcFacade> {
    public MobilePaymentFetchConfigsResult a() {
        try {
            return ((MobilePaymentConfigRpcFacade) getFacade()).fetchConfigs(new MobilePaymentFetchConfigsRequest());
        } catch (Throwable th) {
            com.iap.ac.android.a.a.a("RemoteConfigProcessor, fetchConfig exception: ", th, Constants.TAG);
            return null;
        }
    }

    public Class<MobilePaymentConfigRpcFacade> getFacadeClass() {
        return MobilePaymentConfigRpcFacade.class;
    }
}
