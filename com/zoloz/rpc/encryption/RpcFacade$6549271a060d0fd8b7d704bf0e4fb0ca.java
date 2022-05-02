package com.zoloz.rpc.encryption;

import com.alipay.mobile.framework.service.annotation.OperationType;

public interface RpcFacade$6549271a060d0fd8b7d704bf0e4fb0ca extends BaseEncryptionFacade {
    @OperationType("com.zoloz.zhub.zim.verify.pb.v2.sec")
    EncryptionResponse execute(EncryptionRequest encryptionRequest);
}
