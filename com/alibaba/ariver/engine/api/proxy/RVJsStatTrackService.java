package com.alibaba.ariver.engine.api.proxy;

import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.Proxiable;
import java.util.Map;

public interface RVJsStatTrackService extends Proxiable {
    void onCallDispatch(NativeCallContext nativeCallContext);

    void onInvoke(NativeCallContext nativeCallContext);

    void onSendBack(NativeCallContext nativeCallContext);

    void writeJsApiStatToMap(Node node, Map<String, String> map);
}
