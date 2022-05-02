package com.alibaba.ariver.kernel.api.invoke;

import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.api.extension.ExtensionOpt;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.immutable.ImmutableList;
import com.alibaba.ariver.kernel.common.utils.RVKernelUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import com.alibaba.ariver.kernel.common.utils.ReflectUtils;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class ExtensionInvoker implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    private ImmutableList<Extension> f9017a;
    private AtomicBoolean b = new AtomicBoolean(false);
    protected final InvokeCallback invokeCallback;
    protected final ExtensionInvoker nextInvoker;
    protected Class<? extends Extension> targetExtensionClazz;
    protected final Node targetNode;

    public interface InvokeCallback<T> {
        void onComplete(T t);

        void onFail(Throwable th);
    }

    /* access modifiers changed from: protected */
    public abstract InvokeResult onInvoke(ImmutableList<Extension> immutableList, Object obj, Method method, Object[] objArr);

    public static class InvokeResult<T> {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public boolean f9018a;
        /* access modifiers changed from: private */
        public T b;

        public static InvokeResult proceed() {
            return null;
        }

        public static InvokeResult decide(Object obj) {
            return new InvokeResult(false, obj);
        }

        public static InvokeResult pending() {
            return new InvokeResult(true, (Object) null);
        }

        private InvokeResult(boolean z, T t) {
            this.f9018a = z;
            this.b = t;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean hasNext() {
        return this.nextInvoker != null;
    }

    public ExtensionInvoker(ExtensionInvoker extensionInvoker) {
        this.nextInvoker = extensionInvoker;
        if (extensionInvoker != null) {
            this.invokeCallback = extensionInvoker.invokeCallback;
            this.targetNode = extensionInvoker.targetNode;
            return;
        }
        this.invokeCallback = null;
        this.targetNode = null;
    }

    public ExtensionInvoker(Node node, InvokeCallback invokeCallback2, Class<? extends Extension> cls) {
        this.targetNode = node;
        this.invokeCallback = invokeCallback2;
        this.targetExtensionClazz = cls;
        this.nextInvoker = null;
    }

    public void attacheTargetExtensions(List<Extension> list) {
        this.f9017a = new ImmutableList<>(list);
        this.b.set(true);
    }

    public void attacheTargetExtensions(Extension extension) {
        this.f9017a = new ImmutableList<>(extension);
        this.b.set(true);
    }

    public final Object proceedSafe(ImmutableList<Extension> immutableList, Object obj, Method method, Object[] objArr) {
        try {
            return proceed(immutableList, obj, method, objArr);
        } catch (Throwable th) {
            RVLogger.e("AriverKernel:ExtensionInvoker", "extension invoke exception!", th);
            return ReflectUtils.getDefaultValue(method.getReturnType());
        }
    }

    /* access modifiers changed from: protected */
    public final Object proceed(ImmutableList<Extension> immutableList, Object obj, Method method, Object[] objArr) {
        if (hasNext()) {
            if (this.b.compareAndSet(true, false)) {
                this.nextInvoker.b.set(true);
            }
            try {
                return this.nextInvoker.invokeWithTargetExtensions(immutableList, obj, method, objArr);
            } catch (InvokeException e) {
                throw e;
            } catch (Throwable th) {
                throw new InvokeException(th);
            }
        } else if (immutableList.size() == 1) {
            Extension extension = immutableList.get(0);
            StringBuilder sb = new StringBuilder(RVTraceKey.RV_Extension_invoke_);
            sb.append(extension.getClass().getSimpleName());
            sb.append("_");
            sb.append(method.getName());
            String obj2 = sb.toString();
            RVTraceUtils.traceBeginSection(obj2);
            try {
                Object a2 = a(method, extension, objArr);
                RVTraceUtils.traceEndSection(obj2);
                return a2;
            } catch (InvokeException e2) {
                throw e2;
            } catch (InvocationTargetException e3) {
                throw new InvokeException(e3.getCause());
            } catch (Throwable th2) {
                RVTraceUtils.traceEndSection(obj2);
                throw th2;
            }
        } else {
            throw new IllegalStateException("only single extension is accepted in last invoker");
        }
    }

    /* access modifiers changed from: protected */
    public ExtensionOpt.MethodInvokeOptimizer getMethodInvokeOptimizer(Class<? extends Extension> cls) {
        return ExtensionOpt.getMethodInvokeOptimizer(cls, false);
    }

    private Object a(Method method, Extension extension, Object[] objArr) {
        String str;
        ExtensionOpt.MethodInvokeOptimizer methodInvokeOptimizer;
        Class cls = this.targetExtensionClazz;
        if (cls == null && method != null) {
            try {
                cls = method.getDeclaringClass();
            } catch (Throwable th) {
                RVLogger.w("AriverKernel:ExtensionInvoker", "getDeclaringClass error!", th);
            }
        }
        if (!(cls == null || method == null || extension == null || (methodInvokeOptimizer = getMethodInvokeOptimizer(cls)) == null)) {
            try {
                return methodInvokeOptimizer.doMethodInvoke(method.getName(), extension, objArr);
            } catch (ClassCastException e) {
                StringBuilder sb = new StringBuilder("optimizer.doMethodInvoke occur ClassCastException: ");
                sb.append(cls.getName());
                sb.append("#");
                sb.append(method.getName());
                sb.append(AUScreenAdaptTool.PREFIX_ID);
                sb.append(extension.getClass().getName());
                sb.append(", ");
                sb.append(e);
                String obj = sb.toString();
                RVLogger.e("AriverKernel:ExtensionInvoker", obj);
                ExtensionOpt.reportException(e, "BIZ_ARIVER", "doMethodInvoke", "ClassCast", (Map<String, String>) null);
                if (RVKernelUtils.isDebug()) {
                    throw new InvokeException(obj, e);
                } else if (ExtensionOpt.shouldThrowOut(e, "doMethodInvoke", "ClassCast")) {
                    throw new InvokeException(obj, e);
                }
            } catch (IndexOutOfBoundsException e2) {
                StringBuilder sb2 = new StringBuilder("optimizer.doMethodInvoke occur IndexOutOfBoundsException: ");
                sb2.append(cls.getName());
                sb2.append("#");
                sb2.append(method.getName());
                sb2.append(AUScreenAdaptTool.PREFIX_ID);
                sb2.append(extension.getClass().getName());
                sb2.append(", ");
                sb2.append(e2);
                String obj2 = sb2.toString();
                RVLogger.e("AriverKernel:ExtensionInvoker", obj2);
                ExtensionOpt.reportException(e2, "BIZ_ARIVER", "doMethodInvoke", "IndexOutOfBounds", (Map<String, String>) null);
                if (RVKernelUtils.isDebug()) {
                    throw new InvokeException(obj2, e2);
                } else if (ExtensionOpt.shouldThrowOut(e2, "doMethodInvoke", "IndexOutOfBounds")) {
                    throw new InvokeException(obj2, e2);
                }
            } catch (ExtensionOpt.MismatchMethodException e3) {
                StringBuilder sb3 = new StringBuilder("optimizer.doMethodInvoke occur MismatchMethodException: ");
                sb3.append(cls.getName());
                sb3.append("#");
                sb3.append(method.getName());
                sb3.append(AUScreenAdaptTool.PREFIX_ID);
                sb3.append(extension.getClass().getName());
                sb3.append(", ");
                sb3.append(e3);
                String obj3 = sb3.toString();
                RVLogger.e("AriverKernel:ExtensionInvoker", obj3);
                ExtensionOpt.reportException(e3, "BIZ_ARIVER", "doMethodInvoke", "MismatchMethod", (Map<String, String>) null);
                if (RVKernelUtils.isDebug()) {
                    throw new InvokeException(obj3, e3);
                } else if (ExtensionOpt.shouldThrowOut(e3, "doMethodInvoke", "MismatchMethod")) {
                    throw new InvokeException(obj3, e3);
                }
            } catch (Throwable th2) {
                StringBuilder sb4 = new StringBuilder("optimizer.doMethodInvoke occur existing Exception: ");
                sb4.append(cls.getName());
                sb4.append("#");
                sb4.append(method.getName());
                sb4.append(AUScreenAdaptTool.PREFIX_ID);
                sb4.append(extension.getClass().getName());
                sb4.append(", ");
                sb4.append(th2);
                String obj4 = sb4.toString();
                RVLogger.e("AriverKernel:ExtensionInvoker", obj4);
                ExtensionOpt.reportException(th2, "BIZ_ARIVER", "doMethodInvoke", "FinalCatch", (Map<String, String>) null);
                if (ExtensionOpt.shouldThrowOut(th2, "doMethodInvoke", "FinalCatch")) {
                    throw new InvokeException(obj4, th2);
                }
            }
        }
        if (RVKernelUtils.isDebug()) {
            if (cls == null) {
                str = "ClazzName";
            } else {
                str = cls.getName();
            }
            if (!(method == null || extension == null || cls == null)) {
                StringBuilder sb5 = new StringBuilder("optimizer.doMethodInvoke is not work, and actually do method.invoke: ");
                sb5.append(str);
                sb5.append("#");
                sb5.append(method.getName());
                sb5.append(AUScreenAdaptTool.PREFIX_ID);
                sb5.append(extension.getClass().getName());
                RVLogger.w("AriverKernel:ExtensionInvoker", sb5.toString());
            }
        }
        return method.invoke(extension, objArr);
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return invokeWithTargetExtensions(this.f9017a, obj, method, objArr);
    }

    public final Object invokeWithTargetExtensions(ImmutableList<Extension> immutableList, Object obj, Method method, Object[] objArr) {
        InvokeCallback invokeCallback2;
        try {
            InvokeResult onInvoke = onInvoke(immutableList, obj, method, objArr);
            if (onInvoke == null) {
                return proceed(immutableList, obj, method, objArr);
            }
            if (onInvoke.f9018a) {
                if (onInvoke.b == null) {
                    Object unused = onInvoke.b = ReflectUtils.getDefaultValue(method.getReturnType());
                }
                return onInvoke.b;
            }
            if (this.b.get() && this.invokeCallback != null) {
                this.invokeCallback.onComplete(onInvoke.b);
            }
            return onInvoke.b;
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Java exception happened!\nExtension: ");
            sb.append(immutableList.get(0));
            sb.append("\nMethod: ");
            sb.append(method);
            RVLogger.e("AriverKernel:ExtensionInvoker", sb.toString(), th);
            if (this.b.get() && (invokeCallback2 = this.invokeCallback) != null) {
                invokeCallback2.onFail(th);
            }
            throw th;
        }
    }
}
