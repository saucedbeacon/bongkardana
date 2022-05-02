package com.alibaba.ariver.kernel.api.extension.registry;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.api.extension.ExtensionType;
import com.alibaba.ariver.kernel.api.extension.bridge.ActionMeta;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.node.Scope;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DefaultExtensionRegistry implements ExtensionRegistry {

    /* renamed from: a  reason: collision with root package name */
    private BridgeExtensionRegistry f9015a;
    private final Set<Class<? extends Extension>> b = new HashSet();
    private final Map<String, List<ExtensionMetaInfo>> c = new HashMap();
    private final Map<String, Class<? extends Scope>> d = new HashMap();
    private final PointToExtensionRegistry e = new PointToExtensionRegistry();
    private final List<ExtensionMetaInfo> f = new LinkedList();

    public DefaultExtensionRegistry() {
        BridgeExtensionRegistry bridgeExtensionRegistry = new BridgeExtensionRegistry();
        this.f9015a = bridgeExtensionRegistry;
        bridgeExtensionRegistry.setPointToExtensionRegistry(this.e);
    }

    @VisibleForTesting
    public PointToExtensionRegistry getPointToExtensionRegistry() {
        return this.e;
    }

    public synchronized void register(Class<? extends Extension> cls) {
        register(cls, (Class<? extends Scope>) null);
    }

    public synchronized void register(Class<? extends Extension> cls, Class<? extends Scope> cls2) {
        if (BridgeExtension.class.isAssignableFrom(cls)) {
            try {
                this.f9015a.register(cls, true);
                a(cls, cls2);
                return;
            } catch (Throwable th) {
                RVLogger.w("AriverKernel:DefaultExtensionRegistry", cls.getSimpleName(), th);
            }
        }
        if (!Extension.class.isAssignableFrom(cls)) {
            StringBuilder sb = new StringBuilder("Class ");
            sb.append(cls);
            sb.append(" is not valid extension");
            RVLogger.e("AriverKernel:DefaultExtensionRegistry", sb.toString());
            return;
        }
        synchronized (this.b) {
            if (this.b.contains(cls)) {
                StringBuilder sb2 = new StringBuilder("Extension ");
                sb2.append(cls);
                sb2.append(" is already registered");
                RVLogger.e("AriverKernel:DefaultExtensionRegistry", sb2.toString());
                return;
            }
            this.b.add(cls);
            a(cls, cls2);
            this.e.registerExtension(cls);
        }
    }

    @Nullable
    public Collection<Class<? extends Extension>> findExtensions(String str) {
        List<ExtensionMetaInfo> list = this.c.get(str);
        if (list != null) {
            for (ExtensionMetaInfo extensionMetaInfo : list) {
                Class<? extends Extension> loadClass = ClassLoaderUtils.loadClass(extensionMetaInfo.bundleName, extensionMetaInfo.extensionClass);
                if (loadClass == null) {
                    StringBuilder sb = new StringBuilder("load meta ");
                    sb.append(extensionMetaInfo.extensionClass);
                    sb.append(" error!");
                    RVLogger.e("AriverKernel:DefaultExtensionRegistry", sb.toString());
                } else {
                    synchronized (this.b) {
                        if (!this.b.contains(loadClass)) {
                            register(loadClass, extensionMetaInfo.scope);
                        }
                    }
                }
            }
            this.c.remove(str);
        }
        return this.e.getExtensionsByPoint(str);
    }

    public ActionMeta findActionMeta(String str) {
        return this.f9015a.findActionMeta(str);
    }

    public int getActionCount() {
        return this.f9015a.getRegisteredActionCount();
    }

    public synchronized void register(ExtensionMetaInfo extensionMetaInfo) {
        if (extensionMetaInfo.type == ExtensionType.BRIDGE) {
            StringBuilder sb = new StringBuilder("register meta: ");
            sb.append(extensionMetaInfo.extensionClass);
            RVLogger.d("AriverKernel:DefaultExtensionRegistry", sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder("register meta: ");
            sb2.append(extensionMetaInfo.extensionClass);
            RVLogger.debug("AriverKernel:DefaultExtensionRegistry", sb2.toString());
        }
        if (!extensionMetaInfo.isLazy) {
            ClassLoaderUtils.loadClass(extensionMetaInfo.bundleName, extensionMetaInfo.extensionClass);
        }
        if (ExtensionType.NORMAL == extensionMetaInfo.type) {
            if (extensionMetaInfo.filter != null && extensionMetaInfo.filter.size() > 0) {
                for (String next : extensionMetaInfo.filter) {
                    List list = this.c.get(next);
                    if (list == null) {
                        list = new LinkedList();
                    }
                    list.add(extensionMetaInfo);
                    this.c.put(next, list);
                }
            }
        } else if (ExtensionType.BRIDGE == extensionMetaInfo.type) {
            this.f9015a.register(extensionMetaInfo);
        }
        a(extensionMetaInfo.extensionClass, extensionMetaInfo.scope);
        this.f.add(extensionMetaInfo);
    }

    public synchronized void register(Plugin plugin) {
        for (ExtensionMetaInfo next : plugin.getExtensionMetaInfos()) {
            next.bundleName = plugin.getBundleName();
            register(next);
        }
    }

    public void unRegister(List<String> list) {
        this.f9015a.unRegister(list);
    }

    public Class<? extends Scope> getScope(String str) {
        return this.d.get(str);
    }

    public Class<? extends Scope> getScope(Class<? extends Extension> cls) {
        return getScope(cls.getName());
    }

    public Class<? extends Extension> getExtensionClass(String str) {
        for (Class<? extends Extension> next : this.b) {
            if (next.getName().equals(str)) {
                return next;
            }
        }
        for (ExtensionMetaInfo next2 : this.f) {
            if (str.equals(next2.extensionClass)) {
                return ClassLoaderUtils.loadClass(next2.bundleName, next2.extensionClass);
            }
        }
        return null;
    }

    private void a(String str, Class<? extends Scope> cls) {
        if (!this.d.containsKey(str)) {
            this.d.put(str, cls);
        }
    }

    private void a(Class<? extends Extension> cls, Class<? extends Scope> cls2) {
        a(cls.getName(), cls2);
    }

    /* access modifiers changed from: protected */
    public Extension createExtensionInstance(Class<? extends Extension> cls) {
        return (Extension) cls.newInstance();
    }
}
