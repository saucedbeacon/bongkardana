package com.alibaba.ariver.engine.common.extension;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.alibaba.ariver.engine.api.bridge.BridgeResponseHelper;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingExecutor;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingId;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingRequest;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.proxy.RVBridgeInterceptProxy;
import com.alibaba.ariver.engine.common.bridge.DefaultApiContext;
import com.alibaba.ariver.engine.common.bridge.internal.DefaultBridgeCallback;
import com.alibaba.ariver.engine.common.extension.bind.ApiContextBinder;
import com.alibaba.ariver.engine.common.extension.bind.Binder;
import com.alibaba.ariver.engine.common.extension.bind.CallbackBinder;
import com.alibaba.ariver.engine.common.extension.bind.ExecutorBinder;
import com.alibaba.ariver.engine.common.extension.bind.IdBinder;
import com.alibaba.ariver.engine.common.extension.bind.NodeBinder;
import com.alibaba.ariver.engine.common.extension.bind.ParamBinder;
import com.alibaba.ariver.engine.common.extension.bind.RequestBinder;
import com.alibaba.ariver.engine.common.extension.bind.RequiredParamNotFoundException;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.api.extension.ExtensionOpt;
import com.alibaba.ariver.kernel.api.extension.bridge.ActionMeta;
import com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker;
import com.alibaba.ariver.kernel.api.invoke.InvokeException;
import com.alibaba.ariver.kernel.api.invoke.NodeAwareUtils;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.immutable.ImmutableList;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import o.IResultReceiver;

public class BindBridgeExtensionInvoker extends ExtensionInvoker {
    public static final String TAG = "AriverEngine:BridgeExtensionInvoker";

    /* renamed from: a  reason: collision with root package name */
    private static final Set<Class> f8981a;
    private final BridgeResponseHelper b;
    private JSONObject c;
    private ApiContext d;
    private NativeCallContext e;
    private ActionMeta f;
    private String g;

    static {
        HashSet hashSet = new HashSet();
        f8981a = hashSet;
        hashSet.add(BindingApiContext.class);
        f8981a.add(BindingCallback.class);
        f8981a.add(BindingExecutor.class);
        f8981a.add(BindingId.class);
        f8981a.add(BindingNode.class);
        f8981a.add(BindingParam.class);
        f8981a.add(BindingRequest.class);
    }

    public BindBridgeExtensionInvoker(Node node, NativeCallContext nativeCallContext, BridgeResponseHelper bridgeResponseHelper, ActionMeta actionMeta) {
        this(node, nativeCallContext, bridgeResponseHelper, actionMeta, (ApiContext) null, (Class<? extends Extension>) null);
    }

    public BindBridgeExtensionInvoker(Node node, NativeCallContext nativeCallContext, BridgeResponseHelper bridgeResponseHelper, ActionMeta actionMeta, @Nullable ApiContext apiContext, Class<? extends Extension> cls) {
        super(node, (ExtensionInvoker.InvokeCallback) null, cls);
        this.b = bridgeResponseHelper;
        this.c = nativeCallContext.getParams();
        this.e = nativeCallContext;
        this.f = actionMeta;
        this.g = nativeCallContext.getId();
        if (apiContext == null) {
            this.d = new DefaultApiContext(node, nativeCallContext.getPluginId());
        } else {
            this.d = apiContext;
        }
    }

    public ExtensionOpt.MethodInvokeOptimizer getMethodInvokeOptimizer(Class<? extends Extension> cls) {
        return ExtensionOpt.getMethodInvokeOptimizer(cls, true);
    }

    public ExtensionInvoker.InvokeResult onInvoke(ImmutableList<Extension> immutableList, Object obj, Method method, Object[] objArr) {
        JSONObject jSONObject;
        if (!this.f.paramRequired || ((jSONObject = this.c) != null && !jSONObject.isEmpty())) {
            int length = method.getParameterTypes().length;
            Object[] objArr2 = new Object[length];
            IResultReceiver.Stub<Annotation[]> a2 = a(method, this.f);
            int i = 0;
            while (i < length) {
                try {
                    objArr2[i] = a(this.f.paramTypes[i], a2.setMin(i));
                    i++;
                } catch (RequiredParamNotFoundException e2) {
                    new DefaultBridgeCallback(this.b, false).sendBridgeResponse(new BridgeResponse.Error(2, e2.getMessage()));
                    return ExtensionInvoker.InvokeResult.decide((Object) null);
                }
            }
            try {
                NodeAwareUtils.handleSetNode(this.targetNode, immutableList.get(0));
                this.b.setTargetExtension(immutableList.get(0));
                this.e.getStatData().executeTimeStamp = SystemClock.elapsedRealtime();
                if (((RVBridgeInterceptProxy) RVProxy.get(RVBridgeInterceptProxy.class)).preInvoke(this.targetNode, this.e, this.d, this.b)) {
                    StringBuilder sb = new StringBuilder("preInvoke handled!\nExtension: ");
                    sb.append(immutableList.get(0));
                    sb.append("\nMethod: ");
                    sb.append(method);
                    RVLogger.d(TAG, sb.toString());
                    return ExtensionInvoker.InvokeResult.decide((Object) null);
                }
                Object proceed = proceed(immutableList, obj, method, objArr2);
                if (((RVBridgeInterceptProxy) RVProxy.get(RVBridgeInterceptProxy.class)).postInvoke(this.targetNode, this.e, this.d, this.b)) {
                    StringBuilder sb2 = new StringBuilder("postInvoke handled!\nExtension: ");
                    sb2.append(immutableList.get(0));
                    sb2.append("\nMethod: ");
                    sb2.append(method);
                    RVLogger.d(TAG, sb2.toString());
                    return ExtensionInvoker.InvokeResult.decide(proceed);
                }
                if (this.f.autoCallback) {
                    if (proceed == null) {
                        StringBuilder sb3 = new StringBuilder("AutoCallback but got null!!! ");
                        sb3.append(immutableList.get(0));
                        sb3.append(" method: ");
                        sb3.append(method);
                        RVLogger.w(sb3.toString());
                        new DefaultBridgeCallback(this.b, false).sendBridgeResponse(BridgeResponse.SUCCESS);
                        return ExtensionInvoker.InvokeResult.decide((Object) null);
                    } else if (proceed instanceof BridgeResponse) {
                        new DefaultBridgeCallback(this.b, false).sendBridgeResponse((BridgeResponse) proceed);
                    } else if (proceed instanceof JSONObject) {
                        new DefaultBridgeCallback(this.b, false).sendJSONResponse((JSONObject) proceed);
                    } else {
                        StringBuilder sb4 = new StringBuilder("method ");
                        sb4.append(method.getName());
                        sb4.append(" return type not recognized ");
                        sb4.append(proceed.getClass().getName());
                        new DefaultBridgeCallback(this.b, false).sendBridgeResponse(new BridgeResponse.Error(2, sb4.toString()));
                    }
                }
                return ExtensionInvoker.InvokeResult.decide(proceed);
            } catch (InvokeException e3) {
                StringBuilder sb5 = new StringBuilder("Java exception happened!\nExtension: ");
                sb5.append(immutableList.get(0));
                sb5.append("\nMethod: ");
                sb5.append(method);
                RVLogger.e(TAG, sb5.toString(), e3);
                StringBuilder sb6 = new StringBuilder("Java exception happen in method: ");
                sb6.append(method);
                sb6.append(" message: ");
                sb6.append(e3.getMessage());
                new DefaultBridgeCallback(this.b, false).sendBridgeResponse(new BridgeResponse.Error(6, sb6.toString()));
                return ExtensionInvoker.InvokeResult.decide((Object) null);
            }
        } else {
            new DefaultBridgeCallback(this.b, false).sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            return ExtensionInvoker.InvokeResult.decide((Object) null);
        }
    }

    private IResultReceiver.Stub<Annotation[]> a(Method method, ActionMeta actionMeta) {
        IResultReceiver.Stub<Annotation[]> stub = new IResultReceiver.Stub<>();
        if (method == null) {
            return stub;
        }
        Class[] clsArr = actionMeta.paramTypes;
        Annotation[][] annotationArr = actionMeta.paramAnnotationArray;
        if (!(clsArr == null || clsArr.length == 0)) {
            for (int i = 0; i < clsArr.length; i++) {
                Annotation[] annotationArr2 = annotationArr[i];
                if (annotationArr2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Annotation annotation : annotationArr2) {
                        if (!(annotation == null || annotation.annotationType() == null || !f8981a.contains(annotation.annotationType()))) {
                            arrayList.add(annotation);
                        }
                    }
                    if (arrayList.size() > 0) {
                        stub.setMax(i, arrayList.toArray(new Annotation[arrayList.size()]));
                    }
                }
            }
        }
        return stub;
    }

    private Object a(Class cls, Annotation[] annotationArr) {
        Binder binder;
        Object obj = null;
        Annotation annotation = (annotationArr == null || annotationArr.length <= 0) ? null : annotationArr[0];
        if (annotation instanceof BindingParam) {
            binder = new ParamBinder(this.c);
        } else if (annotation instanceof BindingRequest) {
            binder = new RequestBinder(this.c);
        } else if (annotation instanceof BindingCallback) {
            binder = new CallbackBinder(this.b);
        } else if (annotation instanceof BindingExecutor) {
            binder = new ExecutorBinder();
        } else if (annotation instanceof BindingNode) {
            binder = new NodeBinder(this.targetNode);
        } else if (annotation instanceof BindingApiContext) {
            binder = new ApiContextBinder(this.d);
        } else {
            binder = annotation instanceof BindingId ? new IdBinder(this.g) : null;
        }
        if (binder != null) {
            obj = binder.bind(cls, annotation);
        }
        if (obj != null || !cls.isPrimitive()) {
            return obj;
        }
        return 0;
    }
}
