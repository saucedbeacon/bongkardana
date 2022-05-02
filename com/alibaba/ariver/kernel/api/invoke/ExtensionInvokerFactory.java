package com.alibaba.ariver.kernel.api.invoke;

import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.api.extension.bridge.ActionMeta;
import com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.api.security.AccessController;
import com.alibaba.ariver.kernel.common.Proxiable;

@DefaultImpl("com.alibaba.ariver.invoke.DefaultExtensionInvokerFactory")
public interface ExtensionInvokerFactory extends Proxiable {
    ExtensionInvoker createAwareExtensionInvoker(Node node, @Nullable ExtensionInvoker.InvokeCallback invokeCallback, Class<? extends Extension> cls);

    ExtensionInvoker createPermissionExtensionInvoker(ActionMeta actionMeta, AccessController accessController, ExtensionInvoker extensionInvoker);

    ExtensionInvoker createScheduleExtensionInvoker(ExtensionInvoker extensionInvoker);
}
