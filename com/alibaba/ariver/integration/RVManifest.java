package com.alibaba.ariver.integration;

import android.util.Log;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.api.classloader.RVClassLoaderFactory;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.extension.ExtensionType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeDSL;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.extension.registry.EmbedViewMetaInfo;
import com.alibaba.ariver.kernel.api.extension.registry.ExtensionMetaInfo;
import com.alibaba.ariver.kernel.api.node.Scope;
import com.alibaba.ariver.kernel.api.remote.RemoteController;
import com.alibaba.ariver.kernel.api.security.AccessController;
import com.alibaba.ariver.kernel.common.Proxiable;
import com.alibaba.ariver.kernel.common.RVProxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface RVManifest {

    public interface IProxyManifest {
    }

    @Nullable
    AccessController getAccessController();

    List<BridgeDSL> getBridgeDSLs();

    List<BridgeExtensionManifest> getBridgeExtensions();

    @Nullable
    Map<String, EmbedViewMetaInfo> getEmbedViews();

    List<ExtensionMetaInfo> getExtensions();

    List<IProxyManifest> getProxies();

    @Nullable
    RemoteController getRemoteController();

    List<ServiceBeanManifest> getServiceBeans(ExtensionManager extensionManager);

    @Deprecated
    public static class ProxyManifest implements IProxyManifest {
        Proxiable implObject;
        Class<? extends Proxiable> proxiableClass;

        public ProxyManifest(Class<? extends Proxiable> cls, Proxiable proxiable) {
            RVProxy.getPrinter().print("new ProxyManifest ".concat(String.valueOf(cls)));
            this.proxiableClass = cls;
            this.implObject = proxiable;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ProxyManifest{proxiableClass=");
            sb.append(this.proxiableClass);
            sb.append(", implObject=");
            sb.append(this.implObject);
            sb.append('}');
            return sb.toString();
        }
    }

    public static class LazyProxyManifest<T extends Proxiable> implements IProxyManifest {
        String implClass;
        String implClassBundle;
        RVProxy.LazyGetter<T> implObject;
        Class<T> proxiableClass;

        public LazyProxyManifest(Class<T> cls, RVProxy.LazyGetter<T> lazyGetter) {
            RVProxy.getPrinter().print("new LazyProxyManifest ".concat(String.valueOf(cls)));
            this.proxiableClass = cls;
            this.implObject = lazyGetter;
        }

        public LazyProxyManifest(final Class<T> cls, final String str, final String str2) {
            RVProxy.Printer printer = RVProxy.getPrinter();
            StringBuilder sb = new StringBuilder("new LazyProxyManifest ");
            sb.append(cls);
            sb.append(" with class: ");
            sb.append(str2);
            printer.print(sb.toString());
            this.proxiableClass = cls;
            this.implClassBundle = str;
            this.implClass = str2;
            this.implObject = new RVProxy.LazyGetter<T>() {
                public T get() {
                    try {
                        Class<?> loadClass = ((RVClassLoaderFactory) RVProxy.get(RVClassLoaderFactory.class)).getClassLoader(str).loadClass(str2);
                        if (cls.isAssignableFrom(loadClass)) {
                            return (Proxiable) loadClass.newInstance();
                        }
                        RVProxy.Printer printer = RVProxy.getPrinter();
                        StringBuilder sb = new StringBuilder();
                        sb.append(cls);
                        sb.append(" with implClassName: ");
                        sb.append(str2);
                        sb.append(" type error!!!");
                        printer.print(sb.toString());
                        return null;
                    } catch (Throwable th) {
                        RVProxy.Printer printer2 = RVProxy.getPrinter();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(cls);
                        sb2.append(" with implClassName: ");
                        sb2.append(str2);
                        sb2.append(" init failed!!! ");
                        sb2.append(Log.getStackTraceString(th));
                        printer2.print(sb2.toString());
                        return null;
                    }
                }
            };
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("LazyProxyManifest{proxiableClass=");
            sb.append(this.proxiableClass);
            sb.append(", implObject=");
            sb.append(this.implObject);
            sb.append('}');
            return sb.toString();
        }
    }

    public static class BridgeExtensionManifest {
        List<BridgeDSL> bridgeDSLs;
        ExtensionMetaInfo extensionMetaInfo;
        boolean isRawType;
        Class<? extends Scope> scope;
        Class<? extends BridgeExtension> target;

        public static BridgeExtensionManifest makeRaw(String str, String str2, List<String> list) {
            BridgeExtensionManifest bridgeExtensionManifest = new BridgeExtensionManifest();
            bridgeExtensionManifest.isRawType = true;
            bridgeExtensionManifest.extensionMetaInfo = new ExtensionMetaInfo(str, str2, list, (Class<? extends Scope>) null, ExtensionType.BRIDGE, true);
            return bridgeExtensionManifest;
        }

        public static BridgeExtensionManifest makeRaw(String str, String str2, List<String> list, Class<? extends Scope> cls) {
            BridgeExtensionManifest bridgeExtensionManifest = new BridgeExtensionManifest();
            bridgeExtensionManifest.isRawType = true;
            bridgeExtensionManifest.extensionMetaInfo = new ExtensionMetaInfo(str, str2, list, cls, ExtensionType.BRIDGE, true);
            return bridgeExtensionManifest;
        }

        public static BridgeExtensionManifest make(Class<? extends BridgeExtension> cls) {
            return make(cls, (Class<? extends Scope>) null);
        }

        public static BridgeExtensionManifest make(Class<? extends BridgeExtension> cls, Class<? extends Scope> cls2) {
            BridgeExtensionManifest bridgeExtensionManifest = new BridgeExtensionManifest();
            bridgeExtensionManifest.target = cls;
            bridgeExtensionManifest.scope = cls2;
            return bridgeExtensionManifest;
        }

        public void addBridgeExtensionDSL(BridgeDSL bridgeDSL) {
            if (this.bridgeDSLs == null) {
                this.bridgeDSLs = new ArrayList();
            }
            this.bridgeDSLs.add(bridgeDSL);
        }

        private BridgeExtensionManifest() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BridgeExtensionManifest{target=");
            sb.append(this.target);
            sb.append(", scope=");
            sb.append(this.scope);
            sb.append('}');
            return sb.toString();
        }
    }

    public static class ServiceBeanManifest<T> {
        Class<T> beanClass;
        RVProxy.LazyGetter<T> beanObject;

        public ServiceBeanManifest(Class<T> cls, RVProxy.LazyGetter<T> lazyGetter) {
            this.beanClass = cls;
            this.beanObject = lazyGetter;
        }
    }
}
