package com.alipay.mobile.verifyidentity.framework.engine;

import com.alipay.mobileiclib.common.service.facade.solution.dto.MICRpcResponse;

public interface VerifyResponseCallBack {
    void verifyRequestFail();

    void verifyRequestSuccess(MICRpcResponse mICRpcResponse);
}
