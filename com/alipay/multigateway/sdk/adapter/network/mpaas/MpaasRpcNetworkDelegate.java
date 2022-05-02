package com.alipay.multigateway.sdk.adapter.network.mpaas;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.common.rpc.RpcInterceptor;
import com.alipay.mobile.common.rpc.RpcInvokeContext;
import com.alipay.mobile.common.rpc.util.RpcInvokerUtil;
import com.alipay.multigateway.sdk.GatewayController;
import com.alipay.multigateway.sdk.GatewayInfo;
import com.alipay.multigateway.sdk.NetworkDelegate;
import com.alipay.multigateway.sdk.decision.condition.getter.impl.OperationTypeGetter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

public class MpaasRpcNetworkDelegate implements NetworkDelegate, RpcInterceptor {
    public boolean exceptionHandle(Object obj, ThreadLocal<Object> threadLocal, byte[] bArr, Class<?> cls, Method method, Object[] objArr, RpcException rpcException, Annotation annotation) throws RpcException {
        return true;
    }

    public boolean postHandle(Object obj, ThreadLocal<Object> threadLocal, byte[] bArr, Class<?> cls, Method method, Object[] objArr, Annotation annotation) throws RpcException {
        return true;
    }

    public boolean preHandle(Object obj, ThreadLocal<Object> threadLocal, byte[] bArr, Class<?> cls, Method method, Object[] objArr, Annotation annotation, ThreadLocal<Map<String, Object>> threadLocal2) throws RpcException {
        GatewayController controller = MpaasRpcGatewayControllerFactory.getController();
        if (controller == null) {
            return true;
        }
        RpcInvokeContext rpcInvokeContext = Proxy.getInvocationHandler(obj).getRpcInvokeContext();
        rpcInvokeContext.getExtParams().put(OperationTypeGetter.EXT_OPERATION_TYPE, RpcInvokerUtil.getOperationTypeValue(method, objArr));
        controller.processRequest(rpcInvokeContext);
        rpcInvokeContext.getExtParams().remove(OperationTypeGetter.EXT_OPERATION_TYPE);
        return true;
    }

    public void setGatewayInfo(@NonNull GatewayInfo gatewayInfo, @NonNull Object obj) {
        if (RpcInvokeContext.class.isInstance(obj)) {
            RpcInvokeContext rpcInvokeContext = (RpcInvokeContext) obj;
            String targetUrl = gatewayInfo.getTargetUrl();
            if (!TextUtils.isEmpty(targetUrl)) {
                rpcInvokeContext.setGwUrl(targetUrl);
            }
            if (gatewayInfo.headers != null) {
                for (Map.Entry next : gatewayInfo.headers.entrySet()) {
                    if (!TextUtils.isEmpty((CharSequence) next.getKey())) {
                        rpcInvokeContext.addRequestHeader((String) next.getKey(), (String) next.getValue());
                    }
                }
            }
        }
    }
}
