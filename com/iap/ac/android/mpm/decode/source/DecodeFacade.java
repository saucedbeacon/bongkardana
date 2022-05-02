package com.iap.ac.android.mpm.decode.source;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.biz.common.rpc.annotation.ACRpcRequest;
import com.iap.ac.android.mpm.base.model.decode.request.DecodeRequest;
import com.iap.ac.android.mpm.base.model.decode.result.DecodeResult;

public interface DecodeFacade {
    @OperationType("ac.mobilepayment.mpm.code.scan")
    @ACRpcRequest
    @SignCheck
    DecodeResult decode(DecodeRequest decodeRequest);
}
