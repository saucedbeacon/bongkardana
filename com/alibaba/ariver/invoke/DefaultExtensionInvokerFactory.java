package com.alibaba.ariver.invoke;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.api.extension.bridge.ActionMeta;
import com.alibaba.ariver.kernel.api.invoke.AwareExtensionInvoker;
import com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker;
import com.alibaba.ariver.kernel.api.invoke.ExtensionInvokerFactory;
import com.alibaba.ariver.kernel.api.invoke.ScheduleExtensionInvoker;
import com.alibaba.ariver.kernel.api.invoke.SecurityExtensionInvoker;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.api.security.AccessController;

@Keep
public class DefaultExtensionInvokerFactory implements ExtensionInvokerFactory {
    public ExtensionInvoker createAwareExtensionInvoker(Node node, @Nullable ExtensionInvoker.InvokeCallback invokeCallback, Class<? extends Extension> cls) {
        return new AwareExtensionInvoker(node, invokeCallback, cls);
    }

    public ExtensionInvoker createPermissionExtensionInvoker(ActionMeta actionMeta, AccessController accessController, ExtensionInvoker extensionInvoker) {
        return new SecurityExtensionInvoker(actionMeta, accessController, extensionInvoker);
    }

    public ExtensionInvoker createScheduleExtensionInvoker(ExtensionInvoker extensionInvoker) {
        return new ScheduleExtensionInvoker(extensionInvoker);
    }
}
