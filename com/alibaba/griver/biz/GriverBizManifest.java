package com.alibaba.griver.biz;

import androidx.annotation.Nullable;
import com.alibaba.ariver.integration.RVManifest;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeDSL;
import com.alibaba.ariver.kernel.api.extension.registry.EmbedViewMetaInfo;
import com.alibaba.ariver.kernel.api.extension.registry.ExtensionMetaInfo;
import com.alibaba.ariver.kernel.api.remote.RemoteController;
import com.alibaba.ariver.kernel.api.security.AccessController;
import com.alibaba.griver.base.common.utils.ReflectUtils;
import com.alibaba.griver.biz.jsapi.open.OpenAPIBridgeExtension;
import com.alibaba.griver.biz.jsapi.scan.ScanBridgeExtension;
import com.iap.ac.android.acs.plugin.utils.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GriverBizManifest implements RVManifest {
    private static final String BUNDLE_NAME = "GriverBizManifest";
    private static final GriverBizManifest INSTANCE = new GriverBizManifest();

    @Nullable
    public AccessController getAccessController() {
        return null;
    }

    public List<BridgeDSL> getBridgeDSLs() {
        return null;
    }

    @Nullable
    public Map<String, EmbedViewMetaInfo> getEmbedViews() {
        return null;
    }

    public List<ExtensionMetaInfo> getExtensions() {
        return null;
    }

    public List<RVManifest.IProxyManifest> getProxies() {
        return null;
    }

    @Nullable
    public RemoteController getRemoteController() {
        return null;
    }

    public List<RVManifest.ServiceBeanManifest> getServiceBeans(ExtensionManager extensionManager) {
        return null;
    }

    public static RVManifest getInstance() {
        return INSTANCE;
    }

    public List<RVManifest.BridgeExtensionManifest> getBridgeExtensions() {
        ArrayList arrayList = new ArrayList();
        if (ReflectUtils.classExist("com.alipay.iap.android.wallet.acl.WalletServiceManager")) {
            arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, OpenAPIBridgeExtension.class.getName(), Arrays.asList(new String[]{Constants.JS_API_GET_AUTH_CODE, "tradePay", Constants.JS_API_GET_COMPONENT_AUTH, Constants.JS_API_APPX_RPC})));
            arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, ScanBridgeExtension.class.getName(), Collections.singletonList("scan")));
        }
        return arrayList;
    }
}
