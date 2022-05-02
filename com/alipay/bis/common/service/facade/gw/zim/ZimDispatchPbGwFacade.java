package com.alipay.bis.common.service.facade.gw.zim;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

public interface ZimDispatchPbGwFacade {
    @OperationType("com.zoloz.zhub.zim.init.pb.v2")
    @SignCheck
    ZimInitGwResponsePB initStandard(ZimInitGwRequestPB zimInitGwRequestPB);

    @OperationType("com.zoloz.zhub.zim.verify.pb.v2")
    @SignCheck
    ZimValidateGwResponsePB validateStandard(ZimValidatePbGwRequestPB zimValidatePbGwRequestPB);
}
