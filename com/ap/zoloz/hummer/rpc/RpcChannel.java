package com.ap.zoloz.hummer.rpc;

import com.zoloz.zhub.common.factor.facade.HummerGWFacade;
import com.zoloz.zhub.common.factor.model.FactorNextRequest;
import com.zoloz.zhub.common.factor.model.FactorNextResponse;

public class RpcChannel {
    public FactorNextResponse next(FactorNextRequest factorNextRequest, HummerGWFacade hummerGWFacade) throws Exception {
        return hummerGWFacade.forward(factorNextRequest);
    }
}
