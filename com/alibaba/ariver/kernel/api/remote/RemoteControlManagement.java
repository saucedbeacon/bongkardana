package com.alibaba.ariver.kernel.api.remote;

import com.alibaba.ariver.kernel.api.extension.Extension;
import java.lang.reflect.Method;

public interface RemoteControlManagement {
    IRemoteCaller getRemoteCallerProxy();

    boolean isRemoteExtension(Extension extension, Method method);
}
