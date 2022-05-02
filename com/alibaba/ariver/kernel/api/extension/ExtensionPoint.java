package com.alibaba.ariver.kernel.api.extension;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.api.extension.resolver.ResultResolver;
import com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker;
import com.alibaba.ariver.kernel.api.invoke.ExtensionInvokerFactory;
import com.alibaba.ariver.kernel.api.invoke.InvocationHandlerWrapper;
import com.alibaba.ariver.kernel.api.invoke.RemoteNormalExtensionInvoker;
import com.alibaba.ariver.kernel.api.invoke.ResolveExtensionInvoker;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.api.node.ValueStore;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.kernel.common.utils.RVKernelUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.ReflectUtils;
import com.alibaba.ariver.kernel.common.utils.TypeUtils;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import o.PlaybackStateCompat;

public class ExtensionPoint<T extends Extension> {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ExtensionManager f9011a;
    private static AtomicBoolean b = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public static int c = 10;
    private static boolean d = false;
    private static final Map<Long, PlaybackStateCompat.ErrorCode<Class<? extends Extension>, Extension>> e = new ConcurrentHashMap();
    private static Map<Class, ProxyGenerator> q = new ConcurrentHashMap();
    private static Map<Class<? extends Extension>, Extension> r = new ConcurrentHashMap();
    private Node f;
    private Class<T> g;
    /* access modifiers changed from: private */
    public Object h;
    private ResultResolver i;
    private boolean j;
    private boolean k = true;
    private ExecutorType l = ExecutorType.SYNC;
    private ExtensionManager m;
    /* access modifiers changed from: private */
    public Map<Action, ExecutorType> n = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public Object f9012o = new Object();
    private InvocationHandler p = new InvocationHandler() {
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(ExtensionPoint.this.f9012o, objArr);
            }
            Object access$100 = ExtensionPoint.this.h;
            if (access$100 == null) {
                access$100 = ReflectUtils.getDefaultValue(method.getReturnType());
            }
            ActionCallback actionCallback = new ActionCallback(ExtensionPoint.this.n, access$100);
            actionCallback.onStart((List<Extension>) null);
            actionCallback.onComplete(null);
            return access$100;
        }
    };

    public interface ProxyGenerator<T> {
        T createProxyInstance(InvocationHandler invocationHandler);
    }

    public static <T extends Extension> ExtensionPoint<T> as(Class<T> cls) {
        return new ExtensionPoint<>(cls);
    }

    public static void bind(ExtensionManager extensionManager) {
        f9011a = extensionManager;
    }

    private ExtensionPoint(Class<T> cls) {
        this.g = cls;
    }

    public ExtensionPoint<T> defaultValue(Object obj) {
        this.h = obj;
        return this;
    }

    public ExtensionPoint<T> useCache(boolean z) {
        this.k = z;
        return this;
    }

    public ExtensionPoint<T> actionOn(ExecutorType executorType) {
        this.l = executorType;
        return this;
    }

    public ExtensionPoint<T> when(Action action) {
        this.n.put(action, this.l);
        return this;
    }

    public ExtensionPoint<T> node(Node node) {
        this.f = node;
        return this;
    }

    public ExtensionPoint<T> resolve(ResultResolver resultResolver) {
        this.i = resultResolver;
        return this;
    }

    public ExtensionPoint<T> extensionManager(ExtensionManager extensionManager) {
        this.m = extensionManager;
        return this;
    }

    public ExtensionPoint<T> nullable() {
        this.j = true;
        return this;
    }

    private void a() {
        if (!b.getAndSet(true)) {
            c = TypeUtils.parseInt(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfig("ariver_extensionPointCacheCount", MonitorUtil.ERROR_CODE_EMPTY, new RVConfigService.OnConfigChangeListener() {
                public void onChange(String str) {
                    int unused = ExtensionPoint.c = TypeUtils.parseInt(str);
                    StringBuilder sb = new StringBuilder("onChange sMasCacheCount: ");
                    sb.append(ExtensionPoint.c);
                    RVLogger.d("AriverKernel:ExtensionPoint", sb.toString());
                }
            }));
            d = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigBoolean("ariver_createExtWhenFinalized", true);
            StringBuilder sb = new StringBuilder("initConfig sMasCacheCount: ");
            sb.append(c);
            RVLogger.d("AriverKernel:ExtensionPoint", sb.toString());
        }
    }

    @VisibleForTesting
    protected static PlaybackStateCompat.ErrorCode<Class<? extends Extension>, Extension> getExtensionCache(Node node) {
        if (node == null) {
            return null;
        }
        return e.get(Long.valueOf(node.getNodeId()));
    }

    public static void invalidateExtensionCache() {
        RVLogger.d("AriverKernel:ExtensionPoint", "invalidateAllExtensionCache");
        e.clear();
    }

    public static void invalidateExtensionCache(@NonNull Class<? extends Extension> cls) {
        RVLogger.d("AriverKernel:ExtensionPoint", "invalidateExtensionCache ".concat(String.valueOf(cls)));
        for (PlaybackStateCompat.ErrorCode<Class<? extends Extension>, Extension> remove : e.values()) {
            remove.remove(cls);
        }
    }

    public static void invalidateExtensionCache(@NonNull Node node, @NonNull Class<? extends Extension> cls) {
        StringBuilder sb = new StringBuilder("invalidateExtensionCache node: ");
        sb.append(node);
        sb.append(" extension: ");
        sb.append(cls);
        RVLogger.d("AriverKernel:ExtensionPoint", sb.toString());
        PlaybackStateCompat.ErrorCode errorCode = e.get(Long.valueOf(node.getNodeId()));
        if (errorCode != null) {
            errorCode.remove(cls);
        }
    }

    public T create() {
        T t;
        Node node;
        PlaybackStateCompat.ErrorCode errorCode;
        T t2;
        a();
        if (this.n.size() > 0 || this.i != null) {
            this.k = false;
        }
        if (!this.k || (node = this.f) == null || c <= 0 || (errorCode = e.get(Long.valueOf(node.getNodeId()))) == null || (t2 = (Extension) errorCode.get(this.g)) == null) {
            InvocationHandler b2 = b();
            if (b2 == null) {
                return null;
            }
            ProxyGenerator proxyGenerator = q.get(this.g);
            if (proxyGenerator != null) {
                StringBuilder sb = new StringBuilder("use proxy generator for ");
                sb.append(this.g);
                RVLogger.d("AriverKernel:ExtensionPoint", sb.toString());
                t = (Extension) proxyGenerator.createProxyInstance(b2);
            } else {
                t = (Extension) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{this.g}, b2);
            }
            if (this.k && c > 0 && c()) {
                PlaybackStateCompat.ErrorCode errorCode2 = e.get(Long.valueOf(this.f.getNodeId()));
                if (errorCode2 == null) {
                    errorCode2 = new PlaybackStateCompat.ErrorCode(c);
                    e.put(Long.valueOf(this.f.getNodeId()), errorCode2);
                }
                errorCode2.put(this.g, t);
            }
            return t;
        }
        StringBuilder sb2 = new StringBuilder("find Extension ");
        sb2.append(this.g);
        sb2.append(" cache hit : ");
        sb2.append(t2);
        RVLogger.d("AriverKernel:ExtensionPoint", sb2.toString());
        return t2;
    }

    public static void registerProxyGenerator(Class cls, ProxyGenerator proxyGenerator) {
        q.put(cls, proxyGenerator);
    }

    public static void clearProxyGenerator() {
        q.clear();
    }

    public static void reportException(Throwable th) {
        if (!RVKernelUtils.isDebug()) {
            RVLogger.e("AriverKernel:ExtensionPoint", "reportException", th);
            return;
        }
        throw new RuntimeException(th);
    }

    private InvocationHandler b() {
        Extension d2;
        if (!c()) {
            StringBuilder sb = new StringBuilder("create extension: ");
            sb.append(this.g);
            sb.append(" when node isFinalized! can create? ");
            sb.append(d);
            RVLogger.w("AriverKernel:ExtensionPoint", sb.toString());
            if (!d) {
                if (this.j) {
                    return null;
                }
                return this.p;
            }
        }
        ExtensionManager extensionManager = this.m;
        if (extensionManager == null) {
            extensionManager = f9011a;
        }
        List<Extension> extensionByPoint = extensionManager.getExtensionByPoint(this.f, this.g);
        if ((extensionByPoint == null || extensionByPoint.size() == 0) && (d2 = d()) != null) {
            extensionByPoint = Collections.singletonList(d2);
        }
        if (extensionByPoint == null || extensionByPoint.isEmpty()) {
            StringBuilder sb2 = new StringBuilder("cannot find extension for ");
            sb2.append(this.g);
            RVLogger.w("AriverKernel", sb2.toString());
            if (this.j) {
                return null;
            }
            return this.p;
        }
        ExtensionInvoker a2 = a(extensionManager);
        a2.attacheTargetExtensions(extensionByPoint);
        return new InvocationHandlerWrapper(this.g, a2);
    }

    private boolean c() {
        Node node = this.f;
        if (node == null) {
            RVLogger.w("AriverKernel:ExtensionPoint", "validateNode but is null!");
            return false;
        } else if (!(node instanceof ValueStore) || !((ValueStore) node).getBooleanValue(Node.KEY_IS_FINALIZED)) {
            return true;
        } else {
            RVLogger.w("AriverKernel:ExtensionPoint", "validateNode but is finalized!");
            return false;
        }
    }

    private ExtensionInvoker a(ExtensionManager extensionManager) {
        ExtensionInvokerFactory extensionInvokerFactory = (ExtensionInvokerFactory) RVProxy.get(ExtensionInvokerFactory.class);
        ExtensionInvoker createAwareExtensionInvoker = extensionInvokerFactory.createAwareExtensionInvoker(this.f, new ActionCallback(this.n, this.h), this.g);
        if (!ProcessUtils.isMainProcess()) {
            createAwareExtensionInvoker = new RemoteNormalExtensionInvoker(extensionManager.getRemoteController(), createAwareExtensionInvoker);
        }
        return extensionInvokerFactory.createScheduleExtensionInvoker(new ResolveExtensionInvoker(this.i, createAwareExtensionInvoker));
    }

    private T d() {
        try {
            if (r.containsKey(this.g)) {
                return (Extension) r.get(this.g);
            }
            DefaultImpl defaultImpl = (DefaultImpl) this.g.getAnnotation(DefaultImpl.class);
            if (defaultImpl != null) {
                String value = defaultImpl.value();
                StringBuilder sb = new StringBuilder("newInstance for ");
                sb.append(this.g);
                sb.append(" to defaultImpl: ");
                sb.append(value);
                RVLogger.d("AriverKernel", sb.toString());
                Class<?> cls = Class.forName(value);
                T t = cls != null ? (Extension) cls.newInstance() : null;
                r.put(this.g, t);
                return t;
            }
            return null;
        } catch (Throwable th) {
            RVLogger.e("AriverKernel", "getDefaultImpl exception!", th);
        }
    }

    static void exitNode(Node node) {
        if (node != null) {
            e.remove(Long.valueOf(node.getNodeId()));
        }
    }
}
