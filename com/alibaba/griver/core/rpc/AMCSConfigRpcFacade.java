package com.alibaba.griver.core.rpc;

import com.alibaba.griver.core.model.amcs.AMCSConfigByKeysRpcRequest;
import com.alibaba.griver.core.model.amcs.AMCSConfigRpcResult;
import com.alipay.mobile.framework.service.annotation.OperationType;

public interface AMCSConfigRpcFacade {
    @OperationType("ap.mobileamcs.cloud.fetch.config.by.keys")
    AMCSConfigRpcResult fetchConfigListByKeys(AMCSConfigByKeysRpcRequest aMCSConfigByKeysRpcRequest);
}
