package com.alibaba.griver.image;

import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.integration.RVManifest;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeDSL;
import com.alibaba.ariver.kernel.api.extension.registry.EmbedViewMetaInfo;
import com.alibaba.ariver.kernel.api.extension.registry.ExtensionMetaInfo;
import com.alibaba.ariver.kernel.api.remote.RemoteController;
import com.alibaba.ariver.kernel.api.security.AccessController;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.utils.OuterFileUtils;
import com.alibaba.griver.image.photo.utils.PhotoUtil;
import com.alipay.multimedia.adjuster.api.APMSandboxProcessor;
import com.alipay.multimedia.adjuster.api.data.ICache;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ImageManifest implements RVManifest {
    private static final String BUNDLE_NAME = "com-alibaba-griver-image";
    private static final ImageManifest INSTANCE = new ImageManifest();

    public AccessController getAccessController() {
        return null;
    }

    @Nullable
    public Map<String, EmbedViewMetaInfo> getEmbedViews() {
        return null;
    }

    public RemoteController getRemoteController() {
        return null;
    }

    public static RVManifest getInstance() {
        if (PhotoUtil.isQCompact()) {
            APMSandboxProcessor.setApplicationContext(GriverEnv.getApplicationContext());
            APMSandboxProcessor.registerICache(new ICache() {
                public final String getCacheRootDir() {
                    return OuterFileUtils.getOuterRootFileDir(GriverEnv.getApplicationContext());
                }
            });
        }
        return INSTANCE;
    }

    public List<RVManifest.IProxyManifest> getProxies() {
        return new ArrayList();
    }

    public List<RVManifest.BridgeExtensionManifest> getBridgeExtensions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.image.jsapi.ChooseImageBridgeExtension", Arrays.asList(new String[]{"chooseImage"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.image.jsapi.ImageInfoBridgeExtension", Arrays.asList(new String[]{"getImageInfo"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.image.jsapi.CompressImageBridgeExtension", Arrays.asList(new String[]{"compressImage"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.image.jsapi.PreviewImageBridgeExtension", Arrays.asList(new String[]{"imageViewer", "mediaBrowser"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.image.jsapi.SaveImageToAlbumBridgeExtension", Arrays.asList(new String[]{"saveImage"}), App.class));
        return arrayList;
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
