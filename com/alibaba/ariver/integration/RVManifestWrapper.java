package com.alibaba.ariver.integration;

import android.util.Log;
import androidx.annotation.Nullable;
import com.alibaba.ariver.integration.RVManifest;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeDSL;
import com.alibaba.ariver.kernel.api.extension.registry.EmbedViewMetaInfo;
import com.alibaba.ariver.kernel.api.extension.registry.ExtensionMetaInfo;
import com.alibaba.ariver.kernel.api.remote.RemoteController;
import com.alibaba.ariver.kernel.api.security.AccessController;
import com.alibaba.ariver.kernel.common.RVProxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RVManifestWrapper implements RVManifest {
    private AccessController mAccessController;
    private final List<BridgeDSL> mBridgeDSLs = new ArrayList();
    private boolean mBridgeExtensionComposed = false;
    private final List<RVManifest.BridgeExtensionManifest> mBridgeExtensionManifests = new ArrayList();
    private boolean mEmbedViewMetaInfoComposed = false;
    private final Map<String, EmbedViewMetaInfo> mEmbedViewMetaInfoMap = new HashMap();
    private boolean mExtensionComposed = false;
    private final List<ExtensionMetaInfo> mExtensionMetaInfos = new ArrayList();
    private RVProxy.Printer mPrinter;
    private boolean mProxyComposed = false;
    private final List<RVManifest.IProxyManifest> mProxyManifests = new ArrayList();
    private List<RVManifest> mRVManifests;
    private RemoteController mRemoteController;
    private boolean mServiceBeanComposed = false;
    private final List<RVManifest.ServiceBeanManifest> mServiceBeanManifests = new ArrayList();

    RVManifestWrapper(List<RVManifest> list, RVProxy.Printer printer) {
        if (list != null && list.size() != 0) {
            this.mRVManifests = list;
            this.mPrinter = printer;
        }
    }

    public List<RVManifest.IProxyManifest> getProxies() {
        synchronized (this.mProxyManifests) {
            if (this.mProxyComposed) {
                List<RVManifest.IProxyManifest> list = this.mProxyManifests;
                return list;
            }
            this.mProxyComposed = true;
            for (RVManifest next : this.mRVManifests) {
                if (next != null) {
                    try {
                        List<RVManifest.IProxyManifest> proxies = next.getProxies();
                        if (proxies != null) {
                            this.mProxyManifests.addAll(proxies);
                        }
                    } catch (Throwable th) {
                        RVProxy.Printer printer = this.mPrinter;
                        StringBuilder sb = new StringBuilder("compose RVManifest ");
                        sb.append(next);
                        sb.append(" error! ");
                        sb.append(Log.getStackTraceString(th));
                        printer.print(sb.toString());
                    }
                }
            }
            List<RVManifest.IProxyManifest> list2 = this.mProxyManifests;
            return list2;
        }
    }

    @Nullable
    public AccessController getAccessController() {
        for (RVManifest next : this.mRVManifests) {
            if (next != null) {
                try {
                    AccessController accessController = next.getAccessController();
                    if (accessController != null) {
                        this.mAccessController = accessController;
                    }
                } catch (Throwable th) {
                    RVProxy.Printer printer = this.mPrinter;
                    StringBuilder sb = new StringBuilder("compose RVManifest ");
                    sb.append(next);
                    sb.append(" error! ");
                    sb.append(Log.getStackTraceString(th));
                    printer.print(sb.toString());
                }
            }
        }
        return this.mAccessController;
    }

    @Nullable
    public RemoteController getRemoteController() {
        for (RVManifest next : this.mRVManifests) {
            if (next != null) {
                try {
                    RemoteController remoteController = next.getRemoteController();
                    if (remoteController != null) {
                        this.mRemoteController = remoteController;
                    }
                } catch (Throwable th) {
                    RVProxy.Printer printer = this.mPrinter;
                    StringBuilder sb = new StringBuilder("compose RVManifest ");
                    sb.append(next);
                    sb.append(" error! ");
                    sb.append(Log.getStackTraceString(th));
                    printer.print(sb.toString());
                }
            }
        }
        return this.mRemoteController;
    }

    public List<RVManifest.BridgeExtensionManifest> getBridgeExtensions() {
        synchronized (this.mBridgeExtensionManifests) {
            if (this.mBridgeExtensionComposed) {
                List<RVManifest.BridgeExtensionManifest> list = this.mBridgeExtensionManifests;
                return list;
            }
            this.mBridgeExtensionComposed = true;
            for (RVManifest next : this.mRVManifests) {
                if (next != null) {
                    try {
                        List<RVManifest.BridgeExtensionManifest> bridgeExtensions = next.getBridgeExtensions();
                        if (bridgeExtensions != null) {
                            this.mBridgeExtensionManifests.addAll(bridgeExtensions);
                        }
                    } catch (Throwable th) {
                        RVProxy.Printer printer = this.mPrinter;
                        StringBuilder sb = new StringBuilder("compose RVManifest ");
                        sb.append(next);
                        sb.append(" error! ");
                        sb.append(Log.getStackTraceString(th));
                        printer.print(sb.toString());
                    }
                }
            }
            List<RVManifest.BridgeExtensionManifest> list2 = this.mBridgeExtensionManifests;
            return list2;
        }
    }

    public List<ExtensionMetaInfo> getExtensions() {
        synchronized (this.mExtensionMetaInfos) {
            if (this.mExtensionComposed) {
                List<ExtensionMetaInfo> list = this.mExtensionMetaInfos;
                return list;
            }
            this.mExtensionComposed = true;
            for (RVManifest next : this.mRVManifests) {
                if (next != null) {
                    try {
                        List<ExtensionMetaInfo> extensions = next.getExtensions();
                        if (extensions != null) {
                            this.mExtensionMetaInfos.addAll(extensions);
                        }
                    } catch (Throwable th) {
                        RVProxy.Printer printer = this.mPrinter;
                        StringBuilder sb = new StringBuilder("compose RVManifest ");
                        sb.append(next);
                        sb.append(" error! ");
                        sb.append(Log.getStackTraceString(th));
                        printer.print(sb.toString());
                    }
                }
            }
            List<ExtensionMetaInfo> list2 = this.mExtensionMetaInfos;
            return list2;
        }
    }

    public List<BridgeDSL> getBridgeDSLs() {
        for (RVManifest next : this.mRVManifests) {
            if (next != null) {
                try {
                    List<BridgeDSL> bridgeDSLs = next.getBridgeDSLs();
                    if (bridgeDSLs != null) {
                        this.mBridgeDSLs.addAll(bridgeDSLs);
                    }
                } catch (Throwable th) {
                    RVProxy.Printer printer = this.mPrinter;
                    StringBuilder sb = new StringBuilder("compose RVManifest ");
                    sb.append(next);
                    sb.append(" error! ");
                    sb.append(Log.getStackTraceString(th));
                    printer.print(sb.toString());
                }
            }
        }
        return this.mBridgeDSLs;
    }

    @Nullable
    public Map<String, EmbedViewMetaInfo> getEmbedViews() {
        synchronized (this.mEmbedViewMetaInfoMap) {
            if (this.mEmbedViewMetaInfoComposed) {
                Map<String, EmbedViewMetaInfo> map = this.mEmbedViewMetaInfoMap;
                return map;
            }
            this.mEmbedViewMetaInfoComposed = true;
            for (RVManifest next : this.mRVManifests) {
                if (next != null) {
                    try {
                        Map<String, EmbedViewMetaInfo> embedViews = next.getEmbedViews();
                        if (embedViews != null) {
                            this.mEmbedViewMetaInfoMap.putAll(embedViews);
                        }
                    } catch (Throwable th) {
                        RVProxy.Printer printer = this.mPrinter;
                        StringBuilder sb = new StringBuilder("compose RVManifest ");
                        sb.append(next);
                        sb.append(" error! ");
                        sb.append(Log.getStackTraceString(th));
                        printer.print(sb.toString());
                    }
                }
            }
            Map<String, EmbedViewMetaInfo> map2 = this.mEmbedViewMetaInfoMap;
            return map2;
        }
    }

    public List<RVManifest.ServiceBeanManifest> getServiceBeans(ExtensionManager extensionManager) {
        synchronized (this.mServiceBeanManifests) {
            if (this.mServiceBeanComposed) {
                List<RVManifest.ServiceBeanManifest> list = this.mServiceBeanManifests;
                return list;
            }
            this.mServiceBeanComposed = true;
            for (RVManifest next : this.mRVManifests) {
                if (next != null) {
                    try {
                        List<RVManifest.ServiceBeanManifest> serviceBeans = next.getServiceBeans(extensionManager);
                        if (serviceBeans != null) {
                            this.mServiceBeanManifests.addAll(serviceBeans);
                        }
                    } catch (Throwable th) {
                        RVProxy.Printer printer = this.mPrinter;
                        StringBuilder sb = new StringBuilder("compose RVManifest ");
                        sb.append(next);
                        sb.append(" error! ");
                        sb.append(Log.getStackTraceString(th));
                        printer.print(sb.toString());
                    }
                }
            }
            List<RVManifest.ServiceBeanManifest> list2 = this.mServiceBeanManifests;
            return list2;
        }
    }
}
