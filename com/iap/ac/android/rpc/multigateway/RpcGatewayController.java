package com.iap.ac.android.rpc.multigateway;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.multigateway.sdk.GatewayController;
import com.alipay.multigateway.sdk.decision.condition.Condition;
import com.iap.ac.android.common.rpc.RpcRequest;
import com.iap.ac.android.common.rpc.interfaces.FacadeInvoker;
import com.iap.ac.android.common.rpc.interfaces.RpcInterceptor;
import com.iap.ac.android.common.rpc.model.RpcExceptionInterceptResult;
import com.iap.ac.android.rpc.RpcProxyImpl;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class RpcGatewayController {
    /* access modifiers changed from: private */
    public static final Map<String, GatewayController> CONTROLLER_MAP = new HashMap();

    @NonNull
    public static GatewayController getGatewayController() {
        return getGatewayController("");
    }

    @NonNull
    public static GatewayController getGatewayController(@NonNull String str) {
        GatewayController gatewayController = CONTROLLER_MAP.get(str);
        if (gatewayController != null) {
            return gatewayController;
        }
        GatewayController gatewayController2 = new GatewayController();
        CONTROLLER_MAP.put(str, gatewayController2);
        return gatewayController2;
    }

    public static void initGatewayController(@NonNull Context context) {
        initGatewayController(context, "");
    }

    public static void initGatewayController(@NonNull Context context, @NonNull final String str) {
        RpcProxyImpl rpcProxyImpl;
        GatewayController gatewayController = CONTROLLER_MAP.get(str);
        if (gatewayController == null) {
            gatewayController = new GatewayController();
            CONTROLLER_MAP.put(str, gatewayController);
        }
        gatewayController.init(context, new RpcGatewayDelegate());
        gatewayController.addValueGetter(Condition.TYPE_OPERATION_TYPE, new RpcOperationTypeGetter());
        if (TextUtils.isEmpty(str)) {
            rpcProxyImpl = RpcProxyImpl.getInstance();
        } else {
            rpcProxyImpl = RpcProxyImpl.getInstance(str);
        }
        rpcProxyImpl.addRpcInterceptor(new RpcInterceptor() {
            public final Object onAfterReceive(@NonNull RpcRequest rpcRequest, Object obj, FacadeInvoker facadeInvoker, Method method) {
                return null;
            }

            public final RpcExceptionInterceptResult onExceptionOccurred(@NonNull RpcRequest rpcRequest, @NonNull Throwable th, FacadeInvoker facadeInvoker, Method method) {
                return null;
            }

            public final void onBeforeSend(@NonNull RpcRequest rpcRequest) {
                GatewayController gatewayController = (GatewayController) RpcGatewayController.CONTROLLER_MAP.get(str);
                if (gatewayController != null) {
                    gatewayController.processRequest(rpcRequest);
                }
            }
        });
    }
}
