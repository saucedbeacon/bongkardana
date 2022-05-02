package com.zoloz.rpc.encryption;

import com.alipay.mobile.security.bio.service.local.rpc.BioRPCService;
import java.lang.reflect.Proxy;

public abstract class EncryptionRPCService extends BioRPCService {
    public abstract <T> T getEncryptionRpcProxy(Class<T> cls);

    /* access modifiers changed from: protected */
    public String getMid() {
        return "";
    }

    /* access modifiers changed from: protected */
    public abstract String getPublicKey();

    /* access modifiers changed from: protected */
    public boolean isUseEncryption() {
        return true;
    }

    /* access modifiers changed from: protected */
    public EncryptionRequest modifyRequest(EncryptionRequest encryptionRequest) {
        return encryptionRequest;
    }

    public <T> T getRpcProxy(Class<T> cls) {
        if (!isUseEncryption()) {
            return getEncryptionRpcProxy(cls);
        }
        EncryptionProxyInvocationHandler encryptionProxyInvocationHandler = new EncryptionProxyInvocationHandler(this, cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, encryptionProxyInvocationHandler);
    }
}
