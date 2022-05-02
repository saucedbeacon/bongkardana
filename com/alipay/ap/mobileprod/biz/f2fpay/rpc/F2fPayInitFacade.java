package com.alipay.ap.mobileprod.biz.f2fpay.rpc;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.alipayplus.mobile.component.f2fpay.service.request.F2fPayInitRequest;
import com.alipayplus.mobile.component.f2fpay.service.result.F2fPayInitResult;

public interface F2fPayInitFacade {
    @OperationType("alipayplus.mobileprod.f2fpay.init")
    @SignCheck
    F2fPayInitResult init(F2fPayInitRequest f2fPayInitRequest);
}
