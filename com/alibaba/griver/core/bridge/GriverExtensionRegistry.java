package com.alibaba.griver.core.bridge;

import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.api.extension.ExtensionType;
import com.alibaba.ariver.kernel.api.extension.bridge.ActionMeta;
import com.alibaba.ariver.kernel.api.extension.registry.ExtensionMetaInfo;
import com.alibaba.ariver.kernel.api.extension.registry.ExtensionRegistry;
import com.alibaba.ariver.kernel.api.extension.registry.Plugin;
import com.alibaba.ariver.kernel.api.node.Scope;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GriverExtensionRegistry implements ExtensionRegistry {

    /* renamed from: a  reason: collision with root package name */
    private GriverBridgeExtensionRegistry f9188a = new GriverBridgeExtensionRegistry();
    private final Set<Class<? extends Extension>> b = new HashSet();
    private final Map<String, List<ExtensionMetaInfo>> c = new HashMap();
    private final Map<String, List<Class<? extends Extension>>> d = new HashMap();
    private final Map<String, Class<? extends Scope>> e = new HashMap();
    private final List<ExtensionMetaInfo> f = new LinkedList();

    public synchronized void register(Class<? extends Extension> cls) {
        register(cls, (Class<? extends Scope>) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r0 = a(r5, (java.util.List<java.lang.Class<? extends com.alibaba.ariver.kernel.api.extension.Extension>>) null).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0078, code lost:
        if (r0.hasNext() == false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007a, code lost:
        r1 = r0.next();
        r2 = r4.d.get(r1.getName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008c, code lost:
        if (r2 != null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008e, code lost:
        r2 = new java.util.LinkedList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0093, code lost:
        r2.add(r5);
        r4.d.put(r1.getName(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a0, code lost:
        a(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void register(java.lang.Class<? extends com.alibaba.ariver.kernel.api.extension.Extension> r5, java.lang.Class<? extends com.alibaba.ariver.kernel.api.node.Scope> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.Class<com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension> r0 = com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension.class
            boolean r0 = r0.isAssignableFrom(r5)     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x001d
            com.alibaba.griver.core.bridge.GriverBridgeExtensionRegistry r0 = r4.f9188a     // Catch:{ all -> 0x0013 }
            r0.register((java.lang.Class<? extends com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension>) r5)     // Catch:{ all -> 0x0013 }
            r4.a((java.lang.Class<? extends com.alibaba.ariver.kernel.api.extension.Extension>) r5, (java.lang.Class<? extends com.alibaba.ariver.kernel.api.node.Scope>) r6)     // Catch:{ all -> 0x0013 }
            monitor-exit(r4)
            return
        L_0x0013:
            r0 = move-exception
            java.lang.String r1 = "AriverKernel:GriverExtensionRegistry"
            java.lang.String r2 = r5.getSimpleName()     // Catch:{ all -> 0x00a8 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r1, r2, r0)     // Catch:{ all -> 0x00a8 }
        L_0x001d:
            java.lang.Class<com.alibaba.ariver.kernel.api.extension.Extension> r0 = com.alibaba.ariver.kernel.api.extension.Extension.class
            boolean r0 = r0.isAssignableFrom(r5)     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x003f
            java.lang.String r6 = "AriverKernel:GriverExtensionRegistry"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a8 }
            java.lang.String r1 = "Class "
            r0.<init>(r1)     // Catch:{ all -> 0x00a8 }
            r0.append(r5)     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = " is not valid extension"
            r0.append(r5)     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x00a8 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r6, (java.lang.String) r5)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r4)
            return
        L_0x003f:
            java.util.Set<java.lang.Class<? extends com.alibaba.ariver.kernel.api.extension.Extension>> r0 = r4.b     // Catch:{ all -> 0x00a8 }
            monitor-enter(r0)     // Catch:{ all -> 0x00a8 }
            java.util.Set<java.lang.Class<? extends com.alibaba.ariver.kernel.api.extension.Extension>> r1 = r4.b     // Catch:{ all -> 0x00a5 }
            boolean r1 = r1.contains(r5)     // Catch:{ all -> 0x00a5 }
            if (r1 == 0) goto L_0x0065
            java.lang.String r6 = "AriverKernel:GriverExtensionRegistry"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            java.lang.String r2 = "Extension "
            r1.<init>(r2)     // Catch:{ all -> 0x00a5 }
            r1.append(r5)     // Catch:{ all -> 0x00a5 }
            java.lang.String r5 = " is already registered"
            r1.append(r5)     // Catch:{ all -> 0x00a5 }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x00a5 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r6, (java.lang.String) r5)     // Catch:{ all -> 0x00a5 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a5 }
            monitor-exit(r4)
            return
        L_0x0065:
            java.util.Set<java.lang.Class<? extends com.alibaba.ariver.kernel.api.extension.Extension>> r1 = r4.b     // Catch:{ all -> 0x00a5 }
            r1.add(r5)     // Catch:{ all -> 0x00a5 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a5 }
            r0 = 0
            java.util.List r0 = r4.a((java.lang.Class<? extends com.alibaba.ariver.kernel.api.extension.Extension>) r5, (java.util.List<java.lang.Class<? extends com.alibaba.ariver.kernel.api.extension.Extension>>) r0)     // Catch:{ all -> 0x00a8 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00a8 }
        L_0x0074:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00a8 }
            if (r1 == 0) goto L_0x00a0
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00a8 }
            java.lang.Class r1 = (java.lang.Class) r1     // Catch:{ all -> 0x00a8 }
            java.util.Map<java.lang.String, java.util.List<java.lang.Class<? extends com.alibaba.ariver.kernel.api.extension.Extension>>> r2 = r4.d     // Catch:{ all -> 0x00a8 }
            java.lang.String r3 = r1.getName()     // Catch:{ all -> 0x00a8 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x00a8 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x00a8 }
            if (r2 != 0) goto L_0x0093
            java.util.LinkedList r2 = new java.util.LinkedList     // Catch:{ all -> 0x00a8 }
            r2.<init>()     // Catch:{ all -> 0x00a8 }
        L_0x0093:
            r2.add(r5)     // Catch:{ all -> 0x00a8 }
            java.util.Map<java.lang.String, java.util.List<java.lang.Class<? extends com.alibaba.ariver.kernel.api.extension.Extension>>> r3 = r4.d     // Catch:{ all -> 0x00a8 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x00a8 }
            r3.put(r1, r2)     // Catch:{ all -> 0x00a8 }
            goto L_0x0074
        L_0x00a0:
            r4.a((java.lang.Class<? extends com.alibaba.ariver.kernel.api.extension.Extension>) r5, (java.lang.Class<? extends com.alibaba.ariver.kernel.api.node.Scope>) r6)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r4)
            return
        L_0x00a5:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            throw r5     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x00ac
        L_0x00ab:
            throw r5
        L_0x00ac:
            goto L_0x00ab
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.bridge.GriverExtensionRegistry.register(java.lang.Class, java.lang.Class):void");
    }

    private List<Class<? extends Extension>> a(Class<? extends Extension> cls, List<Class<? extends Extension>> list) {
        Class<? super Object> cls2;
        while (true) {
            if (list == null) {
                list = new LinkedList<>();
            }
            for (Class cls3 : cls2.getInterfaces()) {
                if (Extension.class.isAssignableFrom(cls3)) {
                    list.add(cls3);
                }
            }
            if (!Extension.class.isAssignableFrom(cls2.getSuperclass())) {
                return list;
            }
            Class<? super Object> superclass = cls2.getSuperclass();
            cls2 = cls;
            cls2 = superclass;
        }
    }

    @Nullable
    public List<Class<? extends Extension>> findExtensions(String str) {
        List<ExtensionMetaInfo> list = this.c.get(str);
        if (list != null) {
            for (ExtensionMetaInfo extensionMetaInfo : list) {
                Class<? extends Extension> loadClass = ClassLoaderUtils.loadClass(extensionMetaInfo.bundleName, extensionMetaInfo.extensionClass);
                if (loadClass == null) {
                    StringBuilder sb = new StringBuilder("load meta ");
                    sb.append(extensionMetaInfo.extensionClass);
                    sb.append(" error!");
                    RVLogger.e("AriverKernel:GriverExtensionRegistry", sb.toString());
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
        return this.d.get(str);
    }

    public ActionMeta findActionMeta(String str) {
        return this.f9188a.findActionMeta(str);
    }

    public int getActionCount() {
        return this.f9188a.getRegisteredActionCount();
    }

    public synchronized void register(ExtensionMetaInfo extensionMetaInfo) {
        if (extensionMetaInfo.type == ExtensionType.BRIDGE) {
            StringBuilder sb = new StringBuilder("register meta: ");
            sb.append(extensionMetaInfo.extensionClass);
            RVLogger.d("AriverKernel:GriverExtensionRegistry", sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder("register meta: ");
            sb2.append(extensionMetaInfo.extensionClass);
            RVLogger.debug("AriverKernel:GriverExtensionRegistry", sb2.toString());
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
            this.f9188a.register(extensionMetaInfo);
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
        this.f9188a.unRegister(list);
    }

    public Class<? extends Scope> getScope(String str) {
        return this.e.get(str);
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
        if (!this.e.containsKey(str)) {
            this.e.put(str, cls);
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
