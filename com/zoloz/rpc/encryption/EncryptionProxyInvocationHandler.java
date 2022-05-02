package com.zoloz.rpc.encryption;

import com.alibaba.fastjson.JSON;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.security.bio.security.AESEncrypt;
import com.alipay.mobile.security.bio.security.RSAEncrypt;
import com.alipay.mobile.security.bio.service.local.rpc.IRpcException;
import com.zoloz.rpc.ZolozRpcException;
import com.zoloz.wire.Message;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import o.isRunning;
import o.printConnMonitorLog;

public class EncryptionProxyInvocationHandler implements InvocationHandler {
    public static final String SUCCESS_RET_CODE = "100";
    private Class<?> mOriginalClass;
    private EncryptionProxyManager mProxyManager = new EncryptionProxyManager();
    private EncryptionRPCService mService;

    public EncryptionProxyInvocationHandler(EncryptionRPCService encryptionRPCService, Class<?> cls) {
        this.mService = encryptionRPCService;
        this.mOriginalClass = cls;
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
        if (operationType != null) {
            byte[] randomBytes = randomBytes(32);
            EncryptionRequest encryptRequest = encryptRequest(randomBytes, objArr[0]);
            encryptRequest.fillTagValue(3, this.mService.getMid());
            EncryptionResponse execute = ((BaseEncryptionFacade) this.mService.getEncryptionRpcProxy(this.mProxyManager.getFacade(this.mOriginalClass.getName(), method.getName(), operationType.value()))).execute(encryptRequest);
            if (SUCCESS_RET_CODE.equals(execute.retCode)) {
                return parseResultObj(AESEncrypt.decrypt(execute.content.toByteArray(), randomBytes), method.getReturnType());
            }
            StringBuilder sb = new StringBuilder("SERVER ILLEGALARGUMENT, retCode:");
            sb.append(execute.retCode);
            throw new ZolozRpcException((Integer) 6005, sb.toString());
        }
        throw new ZolozRpcException(Integer.valueOf(IRpcException.ErrorCode.PRC_OPERATIONTYPE_EMPTY), "operation type is null");
    }

    private byte[] randomBytes(int i) {
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    private Object parseResultObj(byte[] bArr, Class cls) throws ZolozRpcException {
        if (Message.class.isAssignableFrom(cls)) {
            try {
                return new isRunning((Class<?>[]) new Class[0]).parseFrom(bArr, cls);
            } catch (Exception unused) {
                throw new ZolozRpcException((Integer) 3002, "pb object is error");
            }
        } else {
            try {
                return JSON.parseObject(new String(bArr), cls);
            } catch (Exception unused2) {
                throw new ZolozRpcException((Integer) 3002, "json object is error.");
            }
        }
    }

    private EncryptionRequest encryptRequest(byte[] bArr, Object obj) {
        byte[] bArr2;
        if (obj instanceof Message) {
            bArr2 = AESEncrypt.encrypt(((Message) obj).toByteArray(), bArr);
        } else {
            bArr2 = AESEncrypt.encrypt(JSON.toJSONString(obj).getBytes(), bArr);
        }
        byte[] bArr3 = new byte[0];
        try {
            bArr3 = RSAEncrypt.encrypt(RSAEncrypt.loadPublicKeyByStr(this.mService.getPublicKey()), bArr);
        } catch (Exception unused) {
        }
        EncryptionRequest encryptionRequest = new EncryptionRequest();
        encryptionRequest.fillTagValue(1, printConnMonitorLog.of(bArr2));
        encryptionRequest.fillTagValue(2, printConnMonitorLog.of(bArr3));
        return encryptionRequest;
    }
}
