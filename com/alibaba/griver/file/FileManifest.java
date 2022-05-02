package com.alibaba.griver.file;

import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.point.activity.ActivityResultPoint;
import com.alibaba.ariver.integration.RVManifest;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeDSL;
import com.alibaba.ariver.kernel.api.extension.registry.EmbedViewMetaInfo;
import com.alibaba.ariver.kernel.api.extension.registry.ExtensionMetaInfo;
import com.alibaba.ariver.kernel.api.remote.RemoteController;
import com.alibaba.ariver.kernel.api.security.AccessController;
import com.alibaba.griver.file.extension.ChooseFileActivityResultExtensionImpl;
import com.alibaba.griver.file.jsapi.ChooseFileBridgeExtension;
import id.dana.lib.gcontainer.app.bridge.constant.H5ActionJSApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class FileManifest implements RVManifest {
    private static final String BUNDLE_NAME = "com-griver-file";
    private static final FileManifest INSTANCE = new FileManifest();

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
        return new ArrayList();
    }

    public List<RVManifest.BridgeExtensionManifest> getBridgeExtensions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.file.jsapi.FileBridgeExtension", Arrays.asList(new String[]{"getFileInfo", "getSavedFileInfo", "getSavedFileList", "removeSavedFile", "saveFile"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.file.jsapi.FileMangerBridgeExtension", Arrays.asList(new String[]{H5ActionJSApi.DOWNLOAD_FILE, "uploadFile"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.file.jsapi.OpenDocumentBridgeExtension", Arrays.asList(new String[]{"openDocument"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, ChooseFileBridgeExtension.class.getName(), Arrays.asList(new String[]{"chooseFileFromDisk"})));
        return arrayList;
    }

    public List<ExtensionMetaInfo> getExtensions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ExtensionMetaInfo(BUNDLE_NAME, ChooseFileActivityResultExtensionImpl.class.getName(), Arrays.asList(new String[]{ActivityResultPoint.class.getName()})));
        return arrayList;
    }

    public List<BridgeDSL> getBridgeDSLs() {
        return new ArrayList();
    }

    public List<RVManifest.ServiceBeanManifest> getServiceBeans(ExtensionManager extensionManager) {
        return new ArrayList();
    }
}
