package com.zoloz.rpc.encryption;

import com.alipay.mobile.framework.service.annotation.OperationType;

public interface RpcFacade$f60fd6a58d1add367082dd7569a2be55 extends BaseEncryptionFacade {
    @OperationType("com.zoloz.zhub.zim.init.pb.v2.sec")
    EncryptionResponse execute(EncryptionRequest encryptionRequest);
}
