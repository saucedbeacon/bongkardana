package com.zoloz.rpc.encryption;

public interface BaseEncryptionFacade {
    EncryptionResponse execute(EncryptionRequest encryptionRequest);
}
