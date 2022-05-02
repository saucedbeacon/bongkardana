package com.iap.ac.android.rpc.http.proxy;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.http.HttpTransportFactory;
import com.iap.ac.android.common.rpc.interfaces.AbstractHttpTransport;
import com.iap.ac.android.common.rpc.model.HttpMethod;
import com.iap.ac.android.common.rpc.model.HttpRequest;
import com.iap.ac.android.common.rpc.model.HttpResponse;
import com.iap.ac.android.rpc.http.error.HttpError;
import com.iap.ac.android.rpc.http.utils.HttpTransportUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class HttpTransportProxy {
    /* access modifiers changed from: private */
    public static final String TAG = HttpTransportUtils.logTag("HttpTransportProxy");
    private static AbstractHttpTransport mDefaultHttpTransport;

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

    public HttpTransportProxy(@NonNull Context context) {
        try {
            mDefaultHttpTransport = HttpTransportFactory.createHttpTransport(context);
        } catch (Exception e) {
            ACLog.e(TAG, "", e);
        }
    }

    public static <T> T getInterfaceProxy(@NonNull Class<T> cls) {
        return getInterfaceProxy(cls, mDefaultHttpTransport);
    }

    public static <T> T getInterfaceProxy(@NonNull Class<T> cls, @NonNull AbstractHttpTransport abstractHttpTransport) {
        return getInterfaceProxy(cls, abstractHttpTransport, (Delegate) null);
    }

    public static <T> T getInterfaceProxy(@NonNull Class<T> cls, @NonNull AbstractHttpTransport abstractHttpTransport, @Nullable Delegate delegate) {
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new ProxyInvocationHandler(cls, abstractHttpTransport, delegate));
    }

    public static <T> T getInterfaceProxy(@NonNull Class<T> cls, @Nullable Delegate delegate) {
        return getInterfaceProxy(cls, mDefaultHttpTransport, delegate);
    }

    static class ProxyInvocationHandler<T> implements InvocationHandler {
        @Nullable
        private Delegate mDelegate;
        @NonNull
        private Class<T> mFacadeClass;
        @NonNull
        private AbstractHttpTransport mHttpTransport;

        public ProxyInvocationHandler(@NonNull Class<T> cls, @NonNull AbstractHttpTransport abstractHttpTransport, @Nullable Delegate delegate) {
            this.mFacadeClass = cls;
            this.mHttpTransport = abstractHttpTransport;
            this.mDelegate = delegate;
        }

        public Object invoke(@Nullable Object obj, @NonNull Method method, @Nullable Object[] objArr) throws Throwable {
            HashMap hashMap;
            Object obj2;
            String name = method.getName();
            if ("toString".equals(name)) {
                return String.format("%s-ProxyInstance", new Object[]{this.mFacadeClass.getSimpleName()});
            } else if ("hashCode".equals(name)) {
                return Integer.valueOf(this.mFacadeClass.getName().hashCode());
            } else {
                Thread currentThread = Thread.currentThread();
                ACLog.v(HttpTransportProxy.TAG, String.format("[%s : %s] Call Http transport proxy: %s.%s", new Object[]{currentThread.getName(), String.valueOf(currentThread.getId()), this.mFacadeClass.getSimpleName(), name}));
                if (method.isAnnotationPresent(HttpReqUrl.class)) {
                    String retrieveRequestUrl = retrieveRequestUrl(method);
                    ACLog.d(HttpTransportProxy.TAG, String.format("[%s] Request Url: %s", new Object[]{name, retrieveRequestUrl}));
                    HttpMethod retrieveRequestMethod = retrieveRequestMethod(method);
                    ACLog.d(HttpTransportProxy.TAG, String.format("[%s] Request Method: %s", new Object[]{name, retrieveRequestMethod.method}));
                    String str = null;
                    if (this.mDelegate != null) {
                        hashMap = new HashMap();
                        this.mDelegate.fillCustomizedHeaders(hashMap);
                    } else {
                        hashMap = null;
                    }
                    if (!(objArr == null || objArr.length <= 0 || (obj2 = objArr[0]) == null)) {
                        str = JsonUtils.toJson(obj2);
                    }
                    return performRequestInternal(method, new HttpRequest(retrieveRequestUrl, retrieveRequestMethod, hashMap, str));
                }
                throw HttpTransportUtils.createException(HttpError.NoHttpReqUrlAnnotation, "Facade need HttpReqUrl annotation! methodName = ".concat(String.valueOf(name)));
            }
        }

        @NonNull
        private String retrieveRequestUrl(@NonNull Method method) throws Exception {
            String value = ((HttpReqUrl) method.getAnnotation(HttpReqUrl.class)).value();
            Delegate delegate = this.mDelegate;
            if (delegate != null) {
                value = delegate.transformUrl(value);
            }
            if (!TextUtils.isEmpty(value)) {
                return value;
            }
            throw HttpTransportUtils.createException(HttpError.UrlIsEmpty, "Facade HttpReqUrl can not be empty!");
        }

        @NonNull
        private static HttpMethod retrieveRequestMethod(@NonNull Method method) {
            HttpReqMethod httpReqMethod = (HttpReqMethod) method.getAnnotation(HttpReqMethod.class);
            if (httpReqMethod != null) {
                return httpReqMethod.value();
            }
            return HttpMethod.GET;
        }

        @Nullable
        private Object performRequestInternal(@NonNull Method method, @NonNull HttpRequest httpRequest) throws Exception {
            String name = method.getName();
            ACLog.i(HttpTransportProxy.TAG, String.format("[%s] Request: %s", new Object[]{name, httpRequest.data}));
            HttpResponse performRequest = this.mHttpTransport.performRequest(httpRequest);
            if (performRequest == null) {
                throw HttpTransportUtils.createException(HttpError.ResponseIsNull, "Network response is null! methodName = ".concat(String.valueOf(name)));
            } else if (performRequest.statusCode == 200) {
                Class<?> returnType = method.getReturnType();
                if (returnType == Void.class || returnType == Void.TYPE) {
                    return null;
                }
                if (performRequest.data == null || performRequest.data.length <= 0) {
                    ACLog.e(HttpTransportProxy.TAG, String.format("Cannot parse response. url = %s, methodName  = %s, statusCode = %s, statusMessage = %s", new Object[]{httpRequest.url, name, String.valueOf(performRequest.statusCode), performRequest.statusMessage}));
                    throw HttpTransportUtils.createException(HttpError.ParseResponseFailed, String.format("statusCode = %s, statusMessage = %s", new Object[]{Integer.valueOf(performRequest.statusCode), performRequest.statusMessage}));
                }
                String str = new String(performRequest.data);
                ACLog.i(HttpTransportProxy.TAG, String.format("[%s] Response: %s", new Object[]{name, str}));
                if (returnType == String.class) {
                    return str;
                }
                try {
                    return JsonUtils.fromJson(str, returnType);
                } catch (Exception e) {
                    String access$000 = HttpTransportProxy.TAG;
                    StringBuilder sb = new StringBuilder("Parse response JSON failed, error = ");
                    sb.append(e.getMessage());
                    ACLog.e(access$000, sb.toString());
                    throw HttpTransportUtils.createException(HttpError.ParseResponseJsonFailed, e.getMessage());
                }
            } else {
                ACLog.e(HttpTransportProxy.TAG, String.format("Response error. url = %s, methodName = %s, statusCode = %s, statusMessage = %s", new Object[]{httpRequest.url, name, String.valueOf(performRequest.statusCode), performRequest.statusMessage}));
                throw HttpTransportUtils.createException(String.valueOf(performRequest.statusCode), performRequest.statusMessage);
            }
        }
    }
}
