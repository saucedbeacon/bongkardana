package com.alibaba.ariver.kernel.api.extension;

import com.alibaba.ariver.kernel.api.extension.bridge.ActionMeta;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeDSL;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.extension.registry.BridgeDSLRegistry;
import com.alibaba.ariver.kernel.api.extension.registry.ExtensionRegistry;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.api.remote.RemoteControlManagement;
import com.alibaba.ariver.kernel.api.remote.RemoteController;
import com.alibaba.ariver.kernel.api.security.AccessControlManagement;
import com.alibaba.ariver.kernel.api.security.AccessController;
import java.util.Comparator;
import java.util.List;

public interface ExtensionManager {
    void enterNode(Node node);

    void exitNode(Node node);

    ActionMeta findActionMeta(String str);

    AccessController getAccessController();

    BridgeDSLRegistry getBridgeDSLRegistry();

    List<BridgeDSL> getBridgeDSLs();

    BridgeExtension getBridgeExtensionByAction(Node node, String str);

    BridgeExtension getBridgeExtensionByAction(String str);

    Extension getExtensionByName(Node node, String str);

    List<Extension> getExtensionByPoint(Node node, Class<? extends Extension> cls);

    List<Extension> getExtensionByPoint(Class<? extends Extension> cls);

    ExtensionRegistry getExtensionRegistry();

    RemoteController getRemoteController();

    <T extends Extension> void registerExtensionByPoint(Node node, Class<T> cls, T t);

    void setAccessControlManagement(AccessControlManagement accessControlManagement);

    void setExtensionFilter(Class<? extends Extension> cls, ExtensionFilter extensionFilter);

    <T extends Extension> void setExtensionSorter(Class<T> cls, Comparator<? super T> comparator);

    void setRemoteControlManagement(RemoteControlManagement remoteControlManagement);
}
