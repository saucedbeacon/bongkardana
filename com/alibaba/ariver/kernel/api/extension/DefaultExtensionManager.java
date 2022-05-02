package com.alibaba.ariver.kernel.api.extension;

import androidx.annotation.VisibleForTesting;
import com.alibaba.ariver.kernel.api.extension.bridge.ActionMeta;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeDSL;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.extension.registry.BridgeDSLRegistry;
import com.alibaba.ariver.kernel.api.extension.registry.ExtensionRegistry;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.api.node.Scope;
import com.alibaba.ariver.kernel.api.remote.RemoteControlManagement;
import com.alibaba.ariver.kernel.api.remote.RemoteController;
import com.alibaba.ariver.kernel.api.security.AccessControlManagement;
import com.alibaba.ariver.kernel.api.security.AccessController;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class DefaultExtensionManager implements ExtensionManager {

    /* renamed from: a  reason: collision with root package name */
    private static ExtensionCreator f9009a;
    private ExtensionRegistry b;
    private BridgeDSLRegistry c;
    private AccessController d;
    private RemoteController e;
    private final Map<Class<? extends Extension>, ExtensionFilter> f = new ConcurrentHashMap();
    private final Map<Class<? extends Extension>, Comparator> g = new ConcurrentHashMap();
    private final Map<String, Extension> h = new HashMap();
    private final Map<Node, Map<String, Extension>> i = new HashMap();
    private final Map<Node, Map<Class<? extends Extension>, List<Extension>>> j = new HashMap();

    public interface ExtensionCreator {
        Extension createExtensionInstance(Class<? extends Extension> cls);
    }

    public DefaultExtensionManager(AccessController accessController, RemoteController remoteController, ExtensionRegistry extensionRegistry) {
        this.d = accessController;
        this.e = remoteController;
        remoteController.bindExtensionManager(this);
        this.b = extensionRegistry;
    }

    public DefaultExtensionManager(AccessController accessController, RemoteController remoteController, ExtensionRegistry extensionRegistry, BridgeDSLRegistry bridgeDSLRegistry) {
        this.d = accessController;
        this.e = remoteController;
        remoteController.bindExtensionManager(this);
        this.b = extensionRegistry;
        this.c = bridgeDSLRegistry;
    }

    public List<Extension> getExtensionByPoint(Class<? extends Extension> cls) {
        return getExtensionByPoint((Node) null, cls);
    }

    public ExtensionRegistry getExtensionRegistry() {
        return this.b;
    }

    public List<BridgeDSL> getBridgeDSLs() {
        BridgeDSLRegistry bridgeDSLRegistry = this.c;
        if (bridgeDSLRegistry != null) {
            return bridgeDSLRegistry.getBridgeDSLs();
        }
        return new ArrayList();
    }

    public BridgeDSLRegistry getBridgeDSLRegistry() {
        return this.c;
    }

    public <T extends Extension> void registerExtensionByPoint(Node node, Class<T> cls, T t) {
        if (node != null) {
            Map map = this.j.get(node);
            if (map == null) {
                map = new ConcurrentHashMap();
                this.j.put(node, map);
            }
            List list = (List) map.get(cls);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                map.put(cls, list);
            }
            list.add(t);
            ExtensionPoint.invalidateExtensionCache(node, cls);
        }
    }

    public List<Extension> getExtensionByPoint(Node node, Class<? extends Extension> cls) {
        if (this.b != null) {
            StringBuilder sb = new StringBuilder("getExtensionsByPoint ");
            sb.append(cls.getName());
            RVLogger.d("AriverKernel:ExtensionManager", sb.toString());
            List<Extension> arrayList = new ArrayList<>();
            List<? extends Extension> b2 = b(node, cls);
            if (b2 != null) {
                arrayList.addAll(b2);
            }
            List<Extension> a2 = a(node, cls);
            if (a2 != null) {
                arrayList.addAll(a2);
            }
            if (arrayList.isEmpty()) {
                RVLogger.w("AriverKernel:ExtensionManager", "cannot find extension by point: ".concat(String.valueOf(cls)));
                return null;
            }
            ExtensionFilter extensionFilter = this.f.get(cls);
            if (extensionFilter != null) {
                arrayList = extensionFilter.filter(arrayList);
            }
            Comparator comparator = this.g.get(cls);
            if (comparator != null) {
                Collections.sort(arrayList, comparator);
            } else if (SimpleSorter.class.isAssignableFrom(cls)) {
                Collections.sort(arrayList, new Comparator<Extension>() {
                    public int compare(Extension extension, Extension extension2) {
                        int i = 0;
                        int priority = SimpleSortable.class.isAssignableFrom(extension.getClass()) ? ((SimpleSortable) extension).priority() : 0;
                        if (SimpleSortable.class.isAssignableFrom(extension2.getClass())) {
                            i = ((SimpleSortable) extension2).priority();
                        }
                        return i - priority;
                    }
                });
            }
            return arrayList;
        }
        throw new RuntimeException("ExtensionRegistry not setup");
    }

    private List<Extension> a(Node node, Class<? extends Extension> cls) {
        List list;
        ArrayList arrayList = new ArrayList();
        while (node != null) {
            if (!(this.j.get(node) == null || (list = (List) this.j.get(node).get(cls)) == null)) {
                arrayList.addAll(list);
            }
            node = node.getParentNode();
        }
        return arrayList;
    }

    public Extension getExtensionByName(Node node, String str) {
        Extension extension;
        ExtensionRegistry extensionRegistry = this.b;
        if (extensionRegistry != null) {
            try {
                Class<? extends Extension> extensionClass = extensionRegistry.getExtensionClass(str);
                Class<? extends Scope> scope = this.b.getScope(str);
                if (scope == null) {
                    extension = a(this.h, extensionClass);
                } else {
                    Node node2 = node;
                    while (node2 != null && !scope.isAssignableFrom(node2.getClass())) {
                        node2 = node2.getParentNode();
                    }
                    extension = node2 != null ? a(this.i.get(node2), extensionClass) : null;
                }
                if (extension == null) {
                    StringBuilder sb = new StringBuilder("getExtensionByName found null for extensionName: ");
                    sb.append(str);
                    sb.append(", node: ");
                    sb.append(node);
                    sb.append(", clazz: ");
                    sb.append(extensionClass);
                    sb.append(", scope: ");
                    sb.append(scope);
                    RVLogger.w("AriverKernel:ExtensionManager", sb.toString());
                }
                return extension;
            } catch (Throwable th) {
                RVLogger.w("AriverKernel:ExtensionManager", "getExtensionByName", th);
                return null;
            }
        } else {
            throw new RuntimeException("ExtensionRegistry not setup");
        }
    }

    public synchronized BridgeExtension getBridgeExtensionByAction(String str) {
        BridgeExtension bridgeExtension;
        ActionMeta findActionMeta = this.b.findActionMeta(str);
        if (findActionMeta == null) {
            return null;
        }
        BridgeExtension bridgeExtension2 = (BridgeExtension) this.h.get(findActionMeta.bridgeExtensionClazz.getName());
        if (bridgeExtension2 != null) {
            return bridgeExtension2;
        }
        try {
            bridgeExtension = (BridgeExtension) a(findActionMeta.bridgeExtensionClazz);
            try {
                this.h.put(findActionMeta.bridgeExtensionClazz.getName(), bridgeExtension);
            } catch (Throwable th) {
                th = th;
                bridgeExtension2 = bridgeExtension;
            }
        } catch (Throwable th2) {
            th = th2;
            RVLogger.e("AriverKernel:ExtensionManager", th);
            bridgeExtension = bridgeExtension2;
            return bridgeExtension;
        }
    }

    public synchronized BridgeExtension getBridgeExtensionByAction(Node node, String str) {
        if (node == null) {
            return getBridgeExtensionByAction(str);
        }
        ActionMeta findActionMeta = this.b.findActionMeta(str);
        if (findActionMeta != null) {
            Class<? extends Scope> scope = this.b.getScope((Class<? extends Extension>) findActionMeta.bridgeExtensionClazz);
            if (scope == null) {
                return getBridgeExtensionByAction(str);
            } else if (!scope.isAssignableFrom(node.getClass())) {
                return getBridgeExtensionByAction(node.getParentNode(), str);
            } else {
                Map map = this.i.get(node);
                if (map != null) {
                    if (map.get(findActionMeta.bridgeExtensionClazz.getName()) != null) {
                        return (BridgeExtension) map.get(findActionMeta.bridgeExtensionClazz.getName());
                    }
                    BridgeExtension bridgeExtension = (BridgeExtension) a(findActionMeta.bridgeExtensionClazz);
                    map.put(findActionMeta.bridgeExtensionClazz.getName(), bridgeExtension);
                    return bridgeExtension;
                }
            }
        }
        return null;
    }

    public ActionMeta findActionMeta(String str) {
        return this.b.findActionMeta(str);
    }

    public void setExtensionFilter(Class<? extends Extension> cls, ExtensionFilter extensionFilter) {
        this.f.put(cls, extensionFilter);
    }

    public <T extends Extension> void setExtensionSorter(Class<T> cls, Comparator<? super T> comparator) {
        this.g.put(cls, comparator);
    }

    public void setAccessControlManagement(AccessControlManagement accessControlManagement) {
        AccessController accessController = this.d;
        if (accessController != null) {
            accessController.setAccessControlManagement(accessControlManagement);
        }
    }

    public AccessController getAccessController() {
        return this.d;
    }

    public void setRemoteControlManagement(RemoteControlManagement remoteControlManagement) {
        RemoteController remoteController = this.e;
        if (remoteController != null) {
            remoteController.setRemoteControlManagement(remoteControlManagement);
        }
    }

    public RemoteController getRemoteController() {
        return this.e;
    }

    public synchronized void enterNode(Node node) {
        RVLogger.d("AriverKernel:ExtensionManager", "enterNode ".concat(String.valueOf(node)));
        this.i.put(node, new HashMap());
    }

    public synchronized void exitNode(Node node) {
        RVLogger.d("AriverKernel:ExtensionManager", "exitNode ".concat(String.valueOf(node)));
        ExtensionPoint.exitNode(node);
        Map remove = this.i.remove(node);
        if (remove != null) {
            for (Extension extension : remove.values()) {
                StringBuilder sb = new StringBuilder("finalize ");
                sb.append(extension);
                sb.append(" from exitNode");
                RVLogger.debug("AriverKernel:ExtensionManager", sb.toString());
                extension.onFinalized();
            }
            remove.clear();
        }
        Map remove2 = this.j.remove(node);
        if (remove2 != null) {
            for (List<Extension> it : remove2.values()) {
                HashSet hashSet = new HashSet();
                for (Extension extension2 : it) {
                    if (!hashSet.contains(extension2)) {
                        RVLogger.debug("AriverKernel:ExtensionManager", "exitNode finalize".concat(String.valueOf(extension2)));
                        extension2.onFinalized();
                        hashSet.add(extension2);
                    }
                }
            }
            remove2.clear();
        }
    }

    public Map<String, Extension> getSingletonExtensionMap() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    public Map<Node, Map<String, Extension>> getNodeExtensionMap() {
        return this.i;
    }

    private synchronized List<? extends Extension> b(Node node, Class<? extends Extension> cls) {
        Extension a2;
        Collection<Class<? extends Extension>> findExtensions = this.b.findExtensions(cls.getName());
        if (findExtensions == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (Class next : findExtensions) {
            Class<? extends Scope> scope = this.b.getScope((Class<? extends Extension>) next);
            if (scope == null) {
                Extension a3 = a(this.h, (Class<? extends Extension>) next);
                if (a3 != null) {
                    linkedList.add(a3);
                }
            } else {
                Node node2 = node;
                while (node2 != null && !scope.isAssignableFrom(node2.getClass())) {
                    node2 = node2.getParentNode();
                }
                if (!(node2 == null || (a2 = a(this.i.get(node2), (Class<? extends Extension>) next)) == null)) {
                    linkedList.add(a2);
                }
            }
        }
        return linkedList;
    }

    private static Extension a(Map<String, Extension> map, Class<? extends Extension> cls) {
        if (map == null || cls == null) {
            return null;
        }
        Extension extension = map.get(cls.getName());
        if (extension != null) {
            return extension;
        }
        try {
            extension = a(cls);
            map.put(cls.getName(), extension);
            return extension;
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append(cls);
            sb.append(" failed to initialize");
            RVLogger.e("AriverKernel:ExtensionManager", sb.toString(), th);
            return extension;
        }
    }

    @VisibleForTesting
    public static void setExtensionCreator(ExtensionCreator extensionCreator) {
        f9009a = extensionCreator;
    }

    private static Extension a(Class<? extends Extension> cls) {
        Extension extension;
        StringBuilder sb = new StringBuilder("createExtensionInstance ");
        sb.append(cls.getName());
        RVLogger.d("AriverKernel:ExtensionManager", sb.toString());
        ExtensionCreator extensionCreator = f9009a;
        if (extensionCreator != null) {
            extension = extensionCreator.createExtensionInstance(cls);
        } else {
            extension = (Extension) cls.newInstance();
        }
        extension.onInitialized();
        return extension;
    }
}
