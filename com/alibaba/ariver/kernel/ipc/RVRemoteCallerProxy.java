package com.alibaba.ariver.kernel.ipc;

import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.common.Proxiable;

@DefaultImpl("com.alibaba.ariver.ipc.RemoteCallerImpl")
public interface RVRemoteCallerProxy extends Proxiable {
    @Nullable
    <T> T getRemoteCaller(Class<T> cls);

    <T> void registerServiceBean(Class<T> cls, T t);
}
