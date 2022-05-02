package com.alipay.plus.android.transport.proxy;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.plus.android.transport.sdk.AbstractHttpTransport;
import com.alipay.plus.android.transport.sdk.HttpError;
import com.alipay.plus.android.transport.sdk.HttpMethod;
import com.alipay.plus.android.transport.sdk.HttpRequest;
import com.alipay.plus.android.transport.sdk.HttpResponse;
import com.alipay.plus.android.transport.sdk.HttpTransportFactory;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class HttpTransportProxy {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f10770a = com.alipay.plus.android.transport.b.a.a("HttpTransportProxy");
    private static final AbstractHttpTransport b = HttpTransportFactory.createHttpTransport();

    public interface Delegate {
        void fillCustomizedHeaders(@NonNull Map<String, String> map);

        @NonNull
        String transformUrl(@NonNull String str);
    }

    public static class DelegateAdapter implements Delegate {
        public void fillCustomizedHeaders(@NonNull Map<String, String> map) {
        }

        @NonNull
        public String transformUrl(@NonNull String str) {
            return str;
        }
    }

    static class a<T> implements InvocationHandler {
        @NonNull

        /* renamed from: a  reason: collision with root package name */
        private Class<T> f10771a;
        @Nullable
        private Delegate b;
        @NonNull
        private AbstractHttpTransport c;

        public a(@NonNull Class<T> cls, @NonNull AbstractHttpTransport abstractHttpTransport, @Nullable Delegate delegate) {
            this.f10771a = cls;
            this.c = abstractHttpTransport;
            this.b = delegate;
        }

        @Nullable
        private Object a(@NonNull Method method, @NonNull HttpRequest httpRequest) throws Exception {
            String name = method.getName();
            LoggerWrapper.i(HttpTransportProxy.f10770a, String.format("[%s] Request: %s", new Object[]{name, httpRequest.data}));
            HttpResponse performRequest = this.c.performRequest(httpRequest);
            if (performRequest == null) {
                throw com.alipay.plus.android.transport.b.a.a(HttpError.ResponseIsNull, "Network response is null! methodName = ".concat(String.valueOf(name)));
            } else if (performRequest.statusCode == 200) {
                Class<?> returnType = method.getReturnType();
                if (returnType == Void.class || returnType == Void.TYPE) {
                    return null;
                }
                if (performRequest.data == null || performRequest.data.length <= 0) {
                    LoggerWrapper.e(HttpTransportProxy.f10770a, String.format("Cannot parse response. url = %s, methodName  = %s, statusCode = %s, statusMessage = %s", new Object[]{httpRequest.url, name, String.valueOf(performRequest.statusCode), performRequest.statusMessage}));
                    throw com.alipay.plus.android.transport.b.a.a(HttpError.ParseResponseFailed, String.format("statusCode = %s, statusMessage = %s", new Object[]{Integer.valueOf(performRequest.statusCode), performRequest.statusMessage}));
                }
                String str = new String(performRequest.data);
                LoggerWrapper.i(HttpTransportProxy.f10770a, String.format("[%s] Response: %s", new Object[]{name, str}));
                if (returnType == String.class) {
                    return str;
                }
                try {
                    return JSON.parseObject(str, returnType);
                } catch (Exception e) {
                    String access$000 = HttpTransportProxy.f10770a;
                    StringBuilder sb = new StringBuilder("Parse response JSON failed, error = ");
                    sb.append(e.getMessage());
                    LoggerWrapper.e(access$000, sb.toString());
                    throw com.alipay.plus.android.transport.b.a.a(HttpError.ParseResponseJsonFailed, e.getMessage());
                }
            } else {
                LoggerWrapper.e(HttpTransportProxy.f10770a, String.format("Response error. url = %s, methodName = %s, statusCode = %s, statusMessage = %s", new Object[]{httpRequest.url, name, String.valueOf(performRequest.statusCode), performRequest.statusMessage}));
                throw com.alipay.plus.android.transport.b.a.a(HttpError.StatusCodeNot200, String.format("statusCode = %s, statusMessage = %s", new Object[]{Integer.valueOf(performRequest.statusCode), performRequest.statusMessage}));
            }
        }

        @NonNull
        private String a(@NonNull Method method) throws Exception {
            String value = ((HttpReqUrl) method.getAnnotation(HttpReqUrl.class)).value();
            Delegate delegate = this.b;
            if (delegate != null) {
                value = delegate.transformUrl(value);
            }
            if (!TextUtils.isEmpty(value)) {
                return value;
            }
            throw com.alipay.plus.android.transport.b.a.a(HttpError.UrlIsEmpty, "Facade HttpReqUrl can not be empty!");
        }

        @NonNull
        private static HttpMethod b(@NonNull Method method) {
            HttpReqMethod httpReqMethod = (HttpReqMethod) method.getAnnotation(HttpReqMethod.class);
            return httpReqMethod != null ? httpReqMethod.value() : HttpMethod.GET;
        }

        public Object invoke(@Nullable Object obj, @NonNull Method method, @Nullable Object[] objArr) throws Throwable {
            HashMap hashMap;
            Object obj2;
            String name = method.getName();
            if ("toString".equals(name)) {
                return String.format("%s-ProxyInstance", new Object[]{this.f10771a.getSimpleName()});
            } else if ("hashCode".equals(name)) {
                return Integer.valueOf(this.f10771a.getName().hashCode());
            } else {
                Thread currentThread = Thread.currentThread();
                LoggerWrapper.v(HttpTransportProxy.f10770a, String.format("[%s : %s] Call Http transport proxy: %s.%s", new Object[]{currentThread.getName(), String.valueOf(currentThread.getId()), this.f10771a.getSimpleName(), name}));
                if (method.isAnnotationPresent(HttpReqUrl.class)) {
                    String a2 = a(method);
                    LoggerWrapper.d(HttpTransportProxy.f10770a, String.format("[%s] Request Url: %s", new Object[]{name, a2}));
                    HttpMethod b2 = b(method);
                    LoggerWrapper.d(HttpTransportProxy.f10770a, String.format("[%s] Request Method: %s", new Object[]{name, b2.method}));
                    String str = null;
                    if (this.b != null) {
                        hashMap = new HashMap();
                        this.b.fillCustomizedHeaders(hashMap);
                    } else {
                        hashMap = null;
                    }
                    if (!(objArr == null || objArr.length <= 0 || (obj2 = objArr[0]) == null)) {
                        str = JSON.toJSONString(obj2);
                    }
                    return a(method, new HttpRequest(a2, b2, hashMap, str));
                }
                throw com.alipay.plus.android.transport.b.a.a(HttpError.NoHttpReqUrlAnnotation, "Facade need HttpReqUrl annotation! methodName = ".concat(String.valueOf(name)));
            }
        }
    }

    public static <T> T getInterfaceProxy(@NonNull Class<T> cls) {
        return getInterfaceProxy(cls, b);
    }

    public static <T> T getInterfaceProxy(@NonNull Class<T> cls, @Nullable Delegate delegate) {
        return getInterfaceProxy(cls, b, delegate);
    }

    public static <T> T getInterfaceProxy(@NonNull Class<T> cls, @NonNull AbstractHttpTransport abstractHttpTransport) {
        return getInterfaceProxy(cls, abstractHttpTransport, (Delegate) null);
    }

    public static <T> T getInterfaceProxy(@NonNull Class<T> cls, @NonNull AbstractHttpTransport abstractHttpTransport, @Nullable Delegate delegate) {
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls, abstractHttpTransport, delegate));
    }
}
