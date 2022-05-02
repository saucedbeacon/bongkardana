package com.alibaba.ariver.kernel.api.extension.registry;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.annotation.NativePermissionRequire;
import com.alibaba.ariver.kernel.api.annotation.ParamRequired;
import com.alibaba.ariver.kernel.api.annotation.UsePermission;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.api.extension.bridge.ActionMeta;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONArray;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class BridgeExtensionRegistry {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, ActionMeta> f9014a = new HashMap();
    private final Set<Class<? extends BridgeExtension>> b = new HashSet();
    private final Map<String, ExtensionMetaInfo> c = new HashMap();
    private Set<String> d = null;
    private PointToExtensionRegistry e = null;

    BridgeExtensionRegistry() {
    }

    public void setPointToExtensionRegistry(PointToExtensionRegistry pointToExtensionRegistry) {
        this.e = pointToExtensionRegistry;
    }

    /* access modifiers changed from: package-private */
    public void register(ExtensionMetaInfo extensionMetaInfo) {
        for (String next : extensionMetaInfo.filter) {
            if (this.c.containsKey(next)) {
                StringBuilder sb = new StringBuilder("register ");
                sb.append(next);
                sb.append(" override by ");
                sb.append(extensionMetaInfo);
                RVLogger.w("AriverKernel:BridgeExtensionRegistry", sb.toString());
            }
            this.c.put(next, extensionMetaInfo);
        }
    }

    public void unRegister(List<String> list) {
        if (list != null && list.size() != 0) {
            for (String next : list) {
                RVLogger.d("AriverKernel:BridgeExtensionRegistry", "unRegister \t".concat(String.valueOf(next)));
                this.f9014a.remove(next);
            }
        }
    }

    public void register(Class<? extends BridgeExtension> cls) {
        register(cls, false);
    }

    public void register(Class<? extends BridgeExtension> cls, boolean z) {
        PointToExtensionRegistry pointToExtensionRegistry;
        b(cls);
        List<ActionMeta> a2 = a(cls);
        if (a2 == null || a2.isEmpty()) {
            RVLogger.w("AriverKernel:BridgeExtensionRegistry", "action method not found in bridgeExtension: ".concat(String.valueOf(cls)));
            return;
        }
        for (ActionMeta next : a2) {
            RVLogger.d("AriverKernel:BridgeExtensionRegistry", "register ".concat(String.valueOf(next)));
            this.f9014a.put(next.actionName, next);
        }
        this.b.add(cls);
        if (z && (pointToExtensionRegistry = this.e) != null) {
            pointToExtensionRegistry.registerExtension(cls);
        }
    }

    /* access modifiers changed from: package-private */
    public ActionMeta findActionMeta(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f9014a.get(str) == null) {
            synchronized (this.f9014a) {
                if (this.f9014a.get(str) == null && this.c.containsKey(str)) {
                    RVLogger.d("AriverKernel:BridgeExtensionRegistry", "findActionMeta lazy init ".concat(String.valueOf(str)));
                    ExtensionMetaInfo extensionMetaInfo = this.c.get(str);
                    Class<? extends Extension> loadClass = ClassLoaderUtils.loadClass(extensionMetaInfo.bundleName, extensionMetaInfo.extensionClass);
                    if (loadClass == null) {
                        return null;
                    }
                    register(loadClass, true);
                    this.c.remove(str);
                }
            }
        }
        return this.f9014a.get(str);
    }

    private List<ActionMeta> a(Class<? extends BridgeExtension> cls) {
        Method[] methodArr;
        ArrayList arrayList = new ArrayList();
        if (!(cls == null || cls.getDeclaredMethods() == null)) {
            if (cls.getSuperclass() == null || !BridgeExtension.class.isAssignableFrom(cls.getSuperclass())) {
                methodArr = cls.getDeclaredMethods();
            } else {
                RVLogger.d("AriverKernel:BridgeExtensionRegistry", "initActionMeta found has super BridgeExtension, getAllMethods!");
                methodArr = cls.getMethods();
            }
            Set<String> a2 = a();
            for (Method method : methodArr) {
                try {
                    boolean z = true;
                    if (!method.isAccessible()) {
                        method.setAccessible(true);
                    }
                    ActionFilter actionFilter = (ActionFilter) method.getAnnotation(ActionFilter.class);
                    if (actionFilter != null) {
                        String value = actionFilter.value();
                        if (value == null || value.length() <= 0) {
                            value = method.getName();
                        }
                        if (a2 == null || !a2.contains(value)) {
                            ActionMeta actionMeta = new ActionMeta();
                            actionMeta.actionMethod = method;
                            actionMeta.paramRequired = method.getAnnotation(ParamRequired.class) != null;
                            actionMeta.bridgeExtensionClazz = cls;
                            if (method.getAnnotation(AutoCallback.class) == null) {
                                z = false;
                            }
                            actionMeta.autoCallback = z;
                            actionMeta.usePermission = (UsePermission) method.getAnnotation(UsePermission.class);
                            actionMeta.actionName = value;
                            actionMeta.paramTypes = method.getParameterTypes();
                            actionMeta.paramAnnotationArray = method.getParameterAnnotations();
                            NativePermissionRequire nativePermissionRequire = (NativePermissionRequire) method.getAnnotation(NativePermissionRequire.class);
                            if (nativePermissionRequire != null) {
                                actionMeta.nativePermissions = nativePermissionRequire.value();
                            }
                            if (this.f9014a.containsKey(value)) {
                                if (!actionFilter.canOverride()) {
                                    StringBuilder sb = new StringBuilder("BridgeExtension action [");
                                    sb.append(value);
                                    sb.append("] is not allow duplicate register");
                                    RVLogger.w("AriverKernel:BridgeExtensionRegistry", sb.toString());
                                } else {
                                    this.f9014a.remove(value);
                                    StringBuilder sb2 = new StringBuilder("initActionMeta BridgeExtension action [");
                                    sb2.append(value);
                                    sb2.append("] override by ");
                                    sb2.append(cls.getName());
                                    RVLogger.w("AriverKernel:BridgeExtensionRegistry", sb2.toString());
                                    RVProxy.Printer printer = RVProxy.getPrinter();
                                    StringBuilder sb3 = new StringBuilder("BridgeExtension action duplicate [");
                                    sb3.append(value);
                                    sb3.append("]");
                                    printer.print(sb3.toString());
                                }
                            }
                            arrayList.add(actionMeta);
                        } else {
                            RVLogger.d("AriverKernel:BridgeExtensionRegistry", "ignore action:\t".concat(String.valueOf(value)));
                        }
                    }
                } catch (Throwable th) {
                    StringBuilder sb4 = new StringBuilder("initActionMeta ");
                    sb4.append(method);
                    sb4.append(" exception!");
                    RVLogger.w("AriverKernel:BridgeExtensionRegistry", sb4.toString(), th);
                }
            }
        }
        return arrayList;
    }

    private Set<String> a() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d != null) {
                    RVConfigService rVConfigService = (RVConfigService) RVProxy.get(RVConfigService.class);
                    JSONArray jSONArray = null;
                    if (rVConfigService != null) {
                        jSONArray = JSONUtils.getJSONArray(rVConfigService.getConfigJSONObject("h5_jsapiandPluginsConfig"), "extensions", (JSONArray) null);
                    }
                    if (jSONArray != null) {
                        if (jSONArray.size() != 0) {
                            this.d = new HashSet();
                            int size = jSONArray.size();
                            for (int i = 0; i < size; i++) {
                                this.d.add(jSONArray.getString(i));
                            }
                        }
                    }
                    this.d = Collections.emptySet();
                }
            }
        }
        return this.d;
    }

    public int getRegisteredActionCount() {
        return this.f9014a.size() + this.c.size();
    }

    private void b(Class<? extends BridgeExtension> cls) {
        if (cls == null) {
            throw new IllegalArgumentException("extension is null");
        } else if (this.b.contains(cls)) {
            throw new IllegalArgumentException("extension has registered");
        }
    }
}
