package com.alipay.ap.mobileprod.biz.f2fpay.rpc;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.alipayplus.mobile.component.common.facade.base.result.BaseServiceResult;
import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import com.alipayplus.mobile.component.f2fpay.service.request.F2fpaySwitchOffRequest;
import com.alipayplus.mobile.component.f2fpay.service.request.F2fpaySwitchOnRequest;
import com.alipayplus.mobile.component.f2fpay.service.result.F2fpayCheckOpenResult;

public interface F2fpaySwitchFacade {
    @OperationType("alipayplus.mobileprod.f2fpay.checkopen")
    @SignCheck
    F2fpayCheckOpenResult checkOpen(BaseRpcRequest baseRpcRequest);

    @OperationType("alipayplus.mobileprod.f2fpay.switchoff")
    @SignCheck
    BaseServiceResult switchOff(F2fpaySwitchOffRequest f2fpaySwitchOffRequest);

    @OperationType("alipayplus.mobileprod.f2fpay.switchon")
    @SignCheck
    BaseServiceResult switchOn(F2fpaySwitchOnRequest f2fpaySwitchOnRequest);
}
