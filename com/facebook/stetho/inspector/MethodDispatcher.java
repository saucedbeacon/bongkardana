package com.facebook.stetho.inspector;

import com.facebook.stetho.common.ExceptionUtil;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.jsonrpc.protocol.EmptyResult;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import com.facebook.stetho.json.ObjectMapper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;
import org.json.JSONException;
import org.json.JSONObject;

@ThreadSafe
public class MethodDispatcher {
    private final Iterable<ChromeDevtoolsDomain> mDomainHandlers;
    @GuardedBy("this")
    private Map<String, MethodDispatchHelper> mMethods;
    private final ObjectMapper mObjectMapper;

    public MethodDispatcher(ObjectMapper objectMapper, Iterable<ChromeDevtoolsDomain> iterable) {
        this.mObjectMapper = objectMapper;
        this.mDomainHandlers = iterable;
    }

    private synchronized MethodDispatchHelper findMethodDispatcher(String str) {
        if (this.mMethods == null) {
            this.mMethods = buildDispatchTable(this.mObjectMapper, this.mDomainHandlers);
        }
        return this.mMethods.get(str);
    }

    public JSONObject dispatch(JsonRpcPeer jsonRpcPeer, String str, @Nullable JSONObject jSONObject) throws JsonRpcException {
        MethodDispatchHelper findMethodDispatcher = findMethodDispatcher(str);
        if (findMethodDispatcher != null) {
            try {
                return findMethodDispatcher.invoke(jsonRpcPeer, jSONObject);
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                ExceptionUtil.propagateIfInstanceOf(cause, JsonRpcException.class);
                throw ExceptionUtil.propagate(cause);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (JSONException e3) {
                throw new JsonRpcException(new JsonRpcError(JsonRpcError.ErrorCode.INTERNAL_ERROR, e3.toString(), (JSONObject) null));
            }
        } else {
            throw new JsonRpcException(new JsonRpcError(JsonRpcError.ErrorCode.METHOD_NOT_FOUND, "Not implemented: ".concat(String.valueOf(str)), (JSONObject) null));
        }
    }

    static class MethodDispatchHelper {
        private final ChromeDevtoolsDomain mInstance;
        private final Method mMethod;
        private final ObjectMapper mObjectMapper;

        public MethodDispatchHelper(ObjectMapper objectMapper, ChromeDevtoolsDomain chromeDevtoolsDomain, Method method) {
            this.mObjectMapper = objectMapper;
            this.mInstance = chromeDevtoolsDomain;
            this.mMethod = method;
        }

        public JSONObject invoke(JsonRpcPeer jsonRpcPeer, @Nullable JSONObject jSONObject) throws InvocationTargetException, IllegalAccessException, JSONException, JsonRpcException {
            Object invoke = this.mMethod.invoke(this.mInstance, new Object[]{jsonRpcPeer, jSONObject});
            if (invoke == null || (invoke instanceof EmptyResult)) {
                return new JSONObject();
            }
            return (JSONObject) this.mObjectMapper.convertValue((JsonRpcResult) invoke, JSONObject.class);
        }
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Iterable<com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.Map<java.lang.String, com.facebook.stetho.inspector.MethodDispatcher.MethodDispatchHelper> buildDispatchTable(com.facebook.stetho.json.ObjectMapper r10, java.lang.Iterable<com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain> r11) {
        /*
            com.facebook.stetho.common.Util.throwIfNull(r10)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Object r11 = com.facebook.stetho.common.Util.throwIfNull(r11)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
        L_0x0012:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0059
            java.lang.Object r1 = r11.next()
            com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain r1 = (com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain) r1
            java.lang.Class r2 = r1.getClass()
            java.lang.String r3 = r2.getSimpleName()
            java.lang.reflect.Method[] r2 = r2.getDeclaredMethods()
            int r4 = r2.length
            r5 = 0
        L_0x002c:
            if (r5 >= r4) goto L_0x0012
            r6 = r2[r5]
            boolean r7 = isDevtoolsMethod(r6)
            if (r7 == 0) goto L_0x0056
            com.facebook.stetho.inspector.MethodDispatcher$MethodDispatchHelper r7 = new com.facebook.stetho.inspector.MethodDispatcher$MethodDispatchHelper
            r7.<init>(r10, r1, r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r3)
            java.lang.String r9 = "."
            r8.append(r9)
            java.lang.String r6 = r6.getName()
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r0.put(r6, r7)
        L_0x0056:
            int r5 = r5 + 1
            goto L_0x002c
        L_0x0059:
            java.util.Map r10 = java.util.Collections.unmodifiableMap(r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.inspector.MethodDispatcher.buildDispatchTable(com.facebook.stetho.json.ObjectMapper, java.lang.Iterable):java.util.Map");
    }

    private static boolean isDevtoolsMethod(Method method) throws IllegalArgumentException {
        if (!method.isAnnotationPresent(ChromeDevtoolsMethod.class)) {
            return false;
        }
        Class[] parameterTypes = method.getParameterTypes();
        StringBuilder sb = new StringBuilder();
        sb.append(method.getDeclaringClass().getSimpleName());
        sb.append(".");
        sb.append(method.getName());
        String obj = sb.toString();
        Util.throwIfNot(parameterTypes.length == 2, "%s: expected 2 args, got %s", obj, Integer.valueOf(parameterTypes.length));
        Util.throwIfNot(parameterTypes[0].equals(JsonRpcPeer.class), "%s: expected 1st arg of JsonRpcPeer, got %s", obj, parameterTypes[0].getName());
        Util.throwIfNot(parameterTypes[1].equals(JSONObject.class), "%s: expected 2nd arg of JSONObject, got %s", obj, parameterTypes[1].getName());
        Class<?> returnType = method.getReturnType();
        if (!returnType.equals(Void.TYPE)) {
            Util.throwIfNot(JsonRpcResult.class.isAssignableFrom(returnType), "%s: expected JsonRpcResult return type, got %s", obj, returnType.getName());
        }
        return true;
    }
}
