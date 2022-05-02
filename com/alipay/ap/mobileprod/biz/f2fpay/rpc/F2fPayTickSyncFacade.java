package com.alipay.ap.mobileprod.biz.f2fpay.rpc;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.alipayplus.mobile.component.common.facade.base.request.BaseServiceRequest;
import com.alipayplus.mobile.component.f2fpay.service.result.F2fPayTickSyncResult;

public interface F2fPayTickSyncFacade {
    @OperationType("alipayplus.mobileprod.f2fpay.tickSync")
    @SignCheck
    F2fPayTickSyncResult tick(BaseServiceRequest baseServiceRequest);
}
