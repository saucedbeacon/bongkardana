package com.alibaba.griver.base;

import androidx.annotation.Nullable;
import com.alibaba.ariver.integration.RVManifest;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeDSL;
import com.alibaba.ariver.kernel.api.extension.registry.EmbedViewMetaInfo;
import com.alibaba.ariver.kernel.api.extension.registry.ExtensionMetaInfo;
import com.alibaba.ariver.kernel.api.remote.RemoteController;
import com.alibaba.ariver.kernel.api.security.AccessController;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.griver.api.common.account.GriverAccountExtension;
import com.alibaba.griver.api.common.network.GriverTransportExtension;
import com.alibaba.griver.base.common.account.DefaultAccoutExtension;
import com.alibaba.griver.base.common.network.GriverURLTransport;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GriverBaseManifest implements RVManifest {
    private static GriverBaseManifest INSTANCE = new GriverBaseManifest();

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

    public static GriverBaseManifest getInstance() {
        return INSTANCE;
    }

    public List<RVManifest.IProxyManifest> getProxies() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RVManifest.LazyProxyManifest(GriverTransportExtension.class, new RVProxy.LazyGetter<GriverTransportExtension>() {
            public GriverTransportExtension get() {
                return new GriverURLTransport();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(GriverAccountExtension.class, new RVProxy.LazyGetter<GriverAccountExtension>() {
            public GriverAccountExtension get() {
                return new DefaultAccoutExtension();
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
