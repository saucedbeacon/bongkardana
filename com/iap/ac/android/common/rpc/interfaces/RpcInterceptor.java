package com.iap.ac.android.common.rpc.interfaces;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.rpc.RpcRequest;
import com.iap.ac.android.common.rpc.model.RpcExceptionInterceptResult;
import java.lang.reflect.Method;

public interface RpcInterceptor {
    @Nullable
    Object onAfterReceive(@NonNull RpcRequest rpcRequest, @Nullable Object obj, FacadeInvoker facadeInvoker, Method method);

    void onBeforeSend(@NonNull RpcRequest rpcRequest);

    RpcExceptionInterceptResult onExceptionOccurred(@NonNull RpcRequest rpcRequest, @NonNull Throwable th, FacadeInvoker facadeInvoker, Method method);
}
