package com.alipayplus.mobile.component.common.rpc.basic;

import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.alipayplus.mobile.component.common.rpc.basic.request.BasicTimeTickRpcRequest;
import com.alipayplus.mobile.component.common.rpc.basic.result.BasicTimeTickRpcResult;

public interface BasicTimeRpcFacade {
    @OperationType("ap.mobileprod.basic.time.tick")
    @SignCheck
    BasicTimeTickRpcResult tick(BasicTimeTickRpcRequest basicTimeTickRpcRequest) throws RpcException;
}
