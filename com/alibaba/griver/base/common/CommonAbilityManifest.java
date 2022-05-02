package com.alibaba.griver.base.common;

import androidx.annotation.Nullable;
import com.alibaba.ariver.integration.RVManifest;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeDSL;
import com.alibaba.ariver.kernel.api.extension.registry.EmbedViewMetaInfo;
import com.alibaba.ariver.kernel.api.extension.registry.ExtensionMetaInfo;
import com.alibaba.ariver.kernel.api.remote.RemoteController;
import com.alibaba.ariver.kernel.api.security.AccessController;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.griver.base.common.proxy.GriverFileAbilityImpl;
import com.alibaba.griver.base.common.proxy.RVFileAbilityProxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CommonAbilityManifest implements RVManifest {
    private static final String BUNDLE_NAME = "CommonAbilityManifest";
    private static final CommonAbilityManifest INSTANCE = new CommonAbilityManifest();

    @Nullable
    public AccessController getAccessController() {
        return null;
    }

    @Nullable
    public Map<String, EmbedViewMetaInfo> getEmbedViews() {
        return null;
    }

    @Nullable
    public RemoteController getRemoteController() {
        return null;
    }

    public static RVManifest getInstance() {
        return INSTANCE;
    }

    public List<RVManifest.IProxyManifest> getProxies() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RVManifest.LazyProxyManifest(RVFileAbilityProxy.class, new RVProxy.LazyGetter<RVFileAbilityProxy>() {
            public RVFileAbilityProxy get() {
                return new GriverFileAbilityImpl();
            }
        }));
        return arrayList;
    }

    public List<RVManifest.BridgeExtensionManifest> getBridgeExtensions() {
        return new ArrayList();
    }

    public List<ExtensionMetaInfo> getExtensions() {
        return new ArrayList();
    }

    public List<BridgeDSL> getBridgeDSLs() {
        return new ArrayList();
    }

    public List<RVManifest.ServiceBeanManifest> getServiceBeans(ExtensionManager extensionManager) {
        return new ArrayList();
    }
}
