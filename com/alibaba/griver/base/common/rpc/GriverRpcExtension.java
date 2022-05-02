package com.alibaba.griver.base.common.rpc;

import com.alibaba.griver.api.common.GriverExtension;

public interface GriverRpcExtension extends GriverExtension {
    <T> T getFacade(Class<T> cls);
}
