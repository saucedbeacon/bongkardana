package com.iap.ac.android.common.rpc.interfaces;

import androidx.annotation.NonNull;
import com.alipay.mobile.common.rpc.RpcException;
import com.iap.ac.android.common.rpc.RpcRequest;
import java.lang.reflect.Method;

public interface FacadeInvoker {
    Object invokeMethod(@NonNull Method method, @NonNull RpcRequest rpcRequest) throws RpcException;
}
