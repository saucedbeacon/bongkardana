package com.iap.ac.android.rpc;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.framework.service.ext.SimpleRpcService;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.RPCProxyHost;
import com.iap.ac.android.common.rpc.RpcRequest;
import com.iap.ac.android.common.rpc.interfaces.FacadeInvoker;
import com.iap.ac.android.common.rpc.interfaces.RpcInterceptor;
import com.iap.ac.android.common.rpc.model.RpcExceptionInterceptResult;
import com.iap.ac.android.rpc.utils.RpcUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Iterator;

public class RpcInvocationHandler implements InvocationHandler {
    private static final String TAG = "Rpc";
    private String bizCode = "";
    private RPCProxyHost.RpcInvocationHandlerListener handlerListener;

    public RpcInvocationHandler(@NonNull String str) {
        this.bizCode = str;
    }

    public RpcInvocationHandler(@NonNull String str, RPCProxyHost.RpcInvocationHandlerListener rpcInvocationHandlerListener) {
        this.bizCode = str;
        this.handlerListener = rpcInvocationHandlerListener;
    }

    public synchronized Object invoke(Object obj, Method method, Object[] objArr) throws RpcException {
        String name = method.getName();
        long id2 = Thread.currentThread().getId();
        StringBuilder sb = new StringBuilder("ThreadId=[");
        sb.append(id2);
        sb.append("] invoke.object=[");
        sb.append(method.getDeclaringClass().getName());
        sb.append("]  methodName=[");
        sb.append(name);
        sb.append("]");
        ACLog.d(TAG, sb.toString());
        if ("toString".equals(name)) {
            return "Rpc-proxy-facade";
        }
        return invokeRpc(method, objArr);
    }

    private Object invokeRpc(Method method, Object[] objArr) throws RpcException {
        Object obj;
        RpcExceptionInterceptResult rpcExceptionInterceptResult;
        String name = method.getName();
        if (RpcUtils.isMainThread()) {
            throw new IllegalThreadStateException("can't call Rpc in main thread. methodName = ".concat(String.valueOf(name)));
        } else if (objArr == null) {
            throw new RpcException((Integer) 9, "Rpc request args is null!");
        } else if (objArr.length != 0) {
            String rpcOperationType = RpcProxyImpl.getRpcOperationType(method);
            if (TextUtils.equals(SimpleRpcService.OPERATION_TYPE, rpcOperationType)) {
                rpcOperationType = objArr[0];
                obj = objArr[1];
            } else {
                obj = objArr[0];
            }
            if (!TextUtils.isEmpty(rpcOperationType)) {
                RpcRequest rpcRequest = new RpcRequest(rpcOperationType, obj);
                RPCProxyHost.RpcInvocationHandlerListener rpcInvocationHandlerListener = this.handlerListener;
                if (rpcInvocationHandlerListener != null) {
                    rpcInvocationHandlerListener.onBeforeSend(rpcRequest);
                }
                for (RpcInterceptor onBeforeSend : RpcProxyImpl.getInstance(this.bizCode).getRpcInterceptors()) {
                    onBeforeSend.onBeforeSend(rpcRequest);
                }
                FacadeInvoker rpcFacadeInvoker = RpcProxyImpl.getInstance(this.bizCode).getRpcFacadeInvoker(rpcOperationType);
                ACLog.i(TAG, String.format("\nWill invoke RPC:\n\toperationType = %s\n\trequest = %s\n", new Object[]{rpcOperationType, JsonUtils.toJson(obj)}));
                Class<?> returnType = method.getReturnType();
                Object obj2 = null;
                try {
                    obj2 = rpcFacadeInvoker.invokeMethod(method, rpcRequest);
                } catch (RpcException e) {
                    Iterator<RpcInterceptor> it = RpcProxyImpl.getInstance(this.bizCode).getRpcInterceptors().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            rpcExceptionInterceptResult = null;
                            break;
                        }
                        rpcExceptionInterceptResult = it.next().onExceptionOccurred(rpcRequest, e, rpcFacadeInvoker, method);
                        if (rpcExceptionInterceptResult != null && rpcExceptionInterceptResult.isHandled) {
                            break;
                        }
                    }
                    if (rpcExceptionInterceptResult == null) {
                        throw e;
                    } else if (returnType.isInstance(rpcExceptionInterceptResult.response)) {
                        obj2 = rpcExceptionInterceptResult.response;
                    }
                }
                for (RpcInterceptor onAfterReceive : RpcProxyImpl.getInstance(this.bizCode).getRpcInterceptors()) {
                    Object onAfterReceive2 = onAfterReceive.onAfterReceive(rpcRequest, obj2, rpcFacadeInvoker, method);
                    if (returnType.isInstance(onAfterReceive2)) {
                        obj2 = onAfterReceive2;
                    }
                }
                ACLog.i(TAG, String.format("\nRpc response:\n\toperationType = %s\n\tresponse = %s\n", new Object[]{rpcOperationType, JsonUtils.toJson(obj2)}));
                return obj2;
            }
            throw new RpcException((Integer) 3000, "Cannot find operationType for: ".concat(String.valueOf(name)));
        } else {
            throw new RpcException((Integer) 9, "Rpc request args.length == 0!");
        }
    }
}
