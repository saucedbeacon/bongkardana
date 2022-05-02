package com.alibaba.ariver.kernel.common.rpc;

import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.Proxiable;
import java.util.Map;

public interface RVRpcProxy extends Proxiable {
    <T> T getPBRpcProxy(Class<T> cls);

    <T> T getPBRpcProxy(Class<T> cls, RVRpcConfig rVRpcConfig);

    <T> T getRpcProxy(Class<T> cls);

    <T> T getRpcProxy(Class<T> cls, RVRpcConfig rVRpcConfig);

    RVRpcResponse sendSimpleRpc(@Nullable Node node, boolean z, String str, RVRpcConfig rVRpcConfig, Object obj, Map<String, String> map);

    RVRpcResponse sendSimpleRpcJsapi(@Nullable Node node, boolean z, String str, RVRpcConfig rVRpcConfig, Object obj, Map<String, String> map);
}
