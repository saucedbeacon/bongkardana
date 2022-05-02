package com.alibaba.griver.h5;

import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.page.PageStartedPoint;
import com.alibaba.ariver.integration.RVManifest;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeDSL;
import com.alibaba.ariver.kernel.api.extension.registry.EmbedViewMetaInfo;
import com.alibaba.ariver.kernel.api.extension.registry.ExtensionMetaInfo;
import com.alibaba.ariver.kernel.api.node.Scope;
import com.alibaba.ariver.kernel.api.remote.RemoteController;
import com.alibaba.ariver.kernel.api.security.AccessController;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.griver.api.h5.file.GriverChooseFileExtension;
import com.alibaba.griver.api.h5.permission.GriverH5JSAPIPermissionExtension;
import com.alibaba.griver.api.h5.permission.GriverJSAPIPermissionProxy;
import com.alibaba.griver.api.h5.point.GriverOptionMenuClickPoint;
import com.alibaba.griver.base.api.PageProcessPoint;
import com.alibaba.griver.base.resource.point.BeforeGetMainPackageResourcePoint;
import com.alibaba.griver.h5.api.GriverDataCacheExtension;
import com.alibaba.griver.h5.extension.GriverChooseFileExtensionImpl;
import com.alibaba.griver.h5.extension.GriverDataCacheExtensionImpl;
import com.alibaba.griver.h5.extension.GriverOptionMenuClickExtension;
import com.alibaba.griver.h5.extension.GriverUpdateProgressExtension;
import com.alibaba.griver.h5.extension.PageStartedExtension;
import com.alibaba.griver.h5.extension.UrlMapExtension;
import com.alibaba.griver.h5.jsapi.DisplayBridgeExtension;
import com.alibaba.griver.h5.jsapi.ImageBridgeExtension;
import com.alibaba.griver.h5.jsapi.NotificationBridgeExtension;
import com.alibaba.griver.h5.jsapi.OpenInBrowserBridgeExtension;
import com.alibaba.griver.h5.jsapi.SessionBridgeExtension;
import com.alibaba.griver.h5.jsapi.SharedDataBridgeExtension;
import com.alibaba.griver.h5.jsapi.StartupParamsBridgeExtension;
import com.alibaba.griver.h5.jsapi.TitleBarBridgeExtension;
import com.alibaba.griver.h5.permission.GriverDefaultH5JSAPIPermission;
import com.alibaba.griver.h5.permission.GriverJSAPIPermission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GriverH5Manifest implements RVManifest {
    private static final String BUNDLE_NAME = "griver_h5";
    private static final GriverH5Manifest INSTANCE = new GriverH5Manifest();

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

    public static GriverH5Manifest getInstance() {
        return INSTANCE;
    }

    public List<RVManifest.IProxyManifest> getProxies() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RVManifest.LazyProxyManifest(GriverJSAPIPermissionProxy.class, new RVProxy.LazyGetter<GriverJSAPIPermissionProxy>() {
            public GriverJSAPIPermissionProxy get() {
                return new GriverJSAPIPermission();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(GriverH5JSAPIPermissionExtension.class, new RVProxy.LazyGetter<GriverH5JSAPIPermissionExtension>() {
            public GriverH5JSAPIPermissionExtension get() {
                return new GriverDefaultH5JSAPIPermission();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(GriverChooseFileExtension.class, new RVProxy.LazyGetter<GriverChooseFileExtension>() {
            public GriverChooseFileExtension get() {
                return new GriverChooseFileExtensionImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(GriverDataCacheExtension.class, new RVProxy.LazyGetter<GriverDataCacheExtension>() {
            @Nullable
            public GriverDataCacheExtension get() {
                return new GriverDataCacheExtensionImpl();
            }
        }));
        return arrayList;
    }

    public List<RVManifest.BridgeExtensionManifest> getBridgeExtensions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, DisplayBridgeExtension.class.getName(), Arrays.asList(new String[]{"setLandscape", "setPortrait"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, ImageBridgeExtension.class.getName(), Arrays.asList(new String[]{"loadLocalImage"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, NotificationBridgeExtension.class.getName(), Arrays.asList(new String[]{"postNotification", "addNotifyListener", "removeNotifyListener"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, OpenInBrowserBridgeExtension.class.getName(), Arrays.asList(new String[]{"openInBrowser"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, SessionBridgeExtension.class.getName(), Arrays.asList(new String[]{"exitSession", "getSessionData", "setSessionData"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, SharedDataBridgeExtension.class.getName(), Arrays.asList(new String[]{"getSharedData", "setSharedData", "removeSharedData"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, StartupParamsBridgeExtension.class.getName(), Arrays.asList(new String[]{"getStartupParams"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, TitleBarBridgeExtension.class.getName(), Arrays.asList(new String[]{"setBackButton", "setCloseButton", "setToolbarMenu"})));
        return arrayList;
    }

    public List<ExtensionMetaInfo> getExtensions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ExtensionMetaInfo(BUNDLE_NAME, GriverUpdateProgressExtension.class.getName(), (List<String>) Arrays.asList(new String[]{PageProcessPoint.class.getName()}), (Class<? extends Scope>) Page.class));
        arrayList.add(new ExtensionMetaInfo(BUNDLE_NAME, PageStartedExtension.class.getName(), (List<String>) Arrays.asList(new String[]{PageStartedPoint.class.getName()}), (Class<? extends Scope>) Page.class));
        arrayList.add(new ExtensionMetaInfo(BUNDLE_NAME, UrlMapExtension.class.getName(), (List<String>) Arrays.asList(new String[]{BeforeGetMainPackageResourcePoint.class.getName()}), (Class<? extends Scope>) App.class));
        arrayList.add(new ExtensionMetaInfo(BUNDLE_NAME, GriverOptionMenuClickExtension.class.getName(), (List<String>) Arrays.asList(new String[]{GriverOptionMenuClickPoint.class.getName()}), (Class<? extends Scope>) Page.class));
        return arrayList;
    }

    public List<BridgeDSL> getBridgeDSLs() {
        return new ArrayList();
    }

    public List<RVManifest.ServiceBeanManifest> getServiceBeans(ExtensionManager extensionManager) {
        return new ArrayList();
    }
}
