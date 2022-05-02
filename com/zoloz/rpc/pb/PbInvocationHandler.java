package com.zoloz.rpc.pb;

import android.text.TextUtils;
import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.security.bio.service.local.rpc.IRpcException;
import com.zoloz.rpc.NormalRequest;
import com.zoloz.rpc.RpcConfig;
import com.zoloz.rpc.ZolozRpcException;
import com.zoloz.rpccommon.InterceptorManager;
import com.zoloz.rpccommon.NetRequest;
import com.zoloz.rpccommon.NetResponse;
import com.zoloz.wire.Message;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import o.isRunning;

public class PbInvocationHandler implements InvocationHandler {
    private static String TAG = PbInvocationHandler.class.getSimpleName();
    private static AtomicInteger rpcSequence;

    public PbInvocationHandler() {
        rpcSequence = new AtomicInteger();
    }

    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (RpcConfig.needDebugRpc) {
            return performRequest(obj, method, objArr);
        }
        return performRequest(obj, method, objArr);
    }

    private Object performRequest(Object obj, Method method, Object[] objArr) {
        NetResponse netResponse;
        OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
        String remoteUrl = RpcConfig.getInstance().getRemoteUrl();
        if (operationType == null) {
            throw new ZolozRpcException(Integer.valueOf(IRpcException.ErrorCode.PRC_OPERATIONTYPE_EMPTY), "operation type is null");
        } else if (!TextUtils.isEmpty(remoteUrl)) {
            byte[] bArr = null;
            if (objArr.length <= 1) {
                Message message = objArr[0];
                if (message instanceof Message) {
                    bArr = message.toByteArray();
                }
            }
            int incrementAndGet = rpcSequence.incrementAndGet();
            String value = operationType.value();
            HashMap hashMap = new HashMap();
            hashMap.put("AppId", RpcConfig.getInstance().getAppId());
            hashMap.put(HeaderConstant.HEADER_KEY_WORKSPACE_ID, RpcConfig.getInstance().getWorkspaceId());
            hashMap.put("Content-Type", HeaderConstant.HEADER_VALUE_PB_TYPE);
            hashMap.put("Operation-Type", value);
            hashMap.put("id", String.valueOf(incrementAndGet));
            NetRequest build = NetRequest.build(incrementAndGet, remoteUrl, value, hashMap, bArr);
            if (RpcConfig.needCatchRpc) {
                InterceptorManager.get().onPreExecute(build);
            }
            if (RpcConfig.getInstance().getRpcProxyImpl() != null) {
                netResponse = RpcConfig.getInstance().getRpcProxyImpl().doRequest(build);
            } else {
                netResponse = NormalRequest.doRequest(remoteUrl, hashMap, build.requestBody);
            }
            if (RpcConfig.needCatchRpc) {
                InterceptorManager.get().onPostExecute(build, netResponse);
            }
            if (netResponse.rpcCode == 4001) {
                throw new ZolozRpcException((Integer) 4001, "time out of 10s");
            } else if (netResponse.responseBody != null) {
                try {
                    return new isRunning((Class<?>[]) new Class[0]).parseFrom(netResponse.responseBody, method.getReturnType());
                } catch (Exception unused) {
                    throw new ZolozRpcException((Integer) 3002, "pb object null");
                }
            } else {
                throw new ZolozRpcException((Integer) 5000, "null result error");
            }
        } else {
            throw new ZolozRpcException((Integer) 16, "host is null");
        }
    }

    private String getTimeTamp() {
        return String.valueOf(System.currentTimeMillis());
    }
}
