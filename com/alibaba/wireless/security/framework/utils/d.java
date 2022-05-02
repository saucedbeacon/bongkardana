package com.alibaba.wireless.security.framework.utils;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f10635a;
    private final boolean b = false;

    static class a {
        private a() {
        }
    }

    private d(Object obj) {
        this.f10635a = obj;
    }

    public static d a(Object obj) {
        return new d(obj);
    }

    private static d a(Method method, Object obj, Object... objArr) throws e {
        try {
            a(method);
            if (method.getReturnType() != Void.TYPE) {
                return a(method.invoke(obj, objArr));
            }
            method.invoke(obj, objArr);
            return a(obj);
        } catch (Exception e) {
            throw new e(e);
        }
    }

    public static Class<?> a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return cls.isPrimitive() ? Boolean.TYPE == cls ? Boolean.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : Byte.TYPE == cls ? Byte.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Character.TYPE == cls ? Character.class : Void.TYPE == cls ? Void.class : cls : cls;
    }

    public static <T extends AccessibleObject> T a(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Member) {
            Member member = (Member) t;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t;
            }
        }
        if (!t.isAccessible()) {
            t.setAccessible(true);
        }
        return t;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        throw new java.lang.NoSuchMethodException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        return r0.getDeclaredMethod(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r0 = r0.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0 != null) goto L_0x0009;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0009 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.reflect.Method a(java.lang.String r2, java.lang.Class<?>[] r3) throws java.lang.NoSuchMethodException {
        /*
            r1 = this;
            java.lang.Class r0 = r1.b()
            java.lang.reflect.Method r2 = r0.getMethod(r2, r3)     // Catch:{ NoSuchMethodException -> 0x0009 }
            return r2
        L_0x0009:
            java.lang.reflect.Method r2 = r0.getDeclaredMethod(r2, r3)     // Catch:{ NoSuchMethodException -> 0x000e }
            return r2
        L_0x000e:
            java.lang.Class r0 = r0.getSuperclass()
            if (r0 == 0) goto L_0x0015
            goto L_0x0009
        L_0x0015:
            java.lang.NoSuchMethodException r2 = new java.lang.NoSuchMethodException
            r2.<init>()
            goto L_0x001c
        L_0x001b:
            throw r2
        L_0x001c:
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.utils.d.a(java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    private boolean a(Method method, String str, Class<?>[] clsArr) {
        return method.getName().equals(str) && a((Class<?>[]) method.getParameterTypes(), clsArr);
    }

    private boolean a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr2.length; i++) {
            if (clsArr2[i] != a.class && !a(clsArr[i]).isAssignableFrom(a(clsArr2[i]))) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Class<?>[] a(java.lang.Object... r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0006
            java.lang.Class[] r3 = new java.lang.Class[r0]
            return r3
        L_0x0006:
            int r1 = r3.length
            java.lang.Class[] r1 = new java.lang.Class[r1]
        L_0x0009:
            int r2 = r3.length
            if (r0 >= r2) goto L_0x001c
            r2 = r3[r0]
            if (r2 != 0) goto L_0x0013
            java.lang.Class<com.alibaba.wireless.security.framework.utils.d$a> r2 = com.alibaba.wireless.security.framework.utils.d.a.class
            goto L_0x0017
        L_0x0013:
            java.lang.Class r2 = r2.getClass()
        L_0x0017:
            r1[r0] = r2
            int r0 = r0 + 1
            goto L_0x0009
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.utils.d.a(java.lang.Object[]):java.lang.Class[]");
    }

    private Method b(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class b2 = b();
        for (Method method : b2.getMethods()) {
            if (a(method, str, clsArr)) {
                return method;
            }
        }
        do {
            for (Method method2 : b2.getDeclaredMethods()) {
                if (a(method2, str, clsArr)) {
                    return method2;
                }
            }
            b2 = b2.getSuperclass();
        } while (b2 != null);
        StringBuilder sb = new StringBuilder("No similar method ");
        sb.append(str);
        sb.append(" with params ");
        sb.append(Arrays.toString(clsArr));
        sb.append(" could be found on type ");
        sb.append(b());
        sb.append(".");
        throw new NoSuchMethodException(sb.toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        return a(b(r4, r0), r3.f10635a, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        throw new com.alibaba.wireless.security.framework.utils.e(r4);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.alibaba.wireless.security.framework.utils.d a(java.lang.String r4, java.lang.Object... r5) throws com.alibaba.wireless.security.framework.utils.e {
        /*
            r3 = this;
            java.lang.Class[] r0 = a((java.lang.Object[]) r5)
            java.lang.reflect.Method r1 = r3.a((java.lang.String) r4, (java.lang.Class<?>[]) r0)     // Catch:{ NoSuchMethodException -> 0x000f }
            java.lang.Object r2 = r3.f10635a     // Catch:{ NoSuchMethodException -> 0x000f }
            com.alibaba.wireless.security.framework.utils.d r4 = a((java.lang.reflect.Method) r1, (java.lang.Object) r2, (java.lang.Object[]) r5)     // Catch:{ NoSuchMethodException -> 0x000f }
            return r4
        L_0x000f:
            java.lang.reflect.Method r4 = r3.b(r4, r0)     // Catch:{ NoSuchMethodException -> 0x001a }
            java.lang.Object r0 = r3.f10635a     // Catch:{ NoSuchMethodException -> 0x001a }
            com.alibaba.wireless.security.framework.utils.d r4 = a((java.lang.reflect.Method) r4, (java.lang.Object) r0, (java.lang.Object[]) r5)     // Catch:{ NoSuchMethodException -> 0x001a }
            return r4
        L_0x001a:
            r4 = move-exception
            com.alibaba.wireless.security.framework.utils.e r5 = new com.alibaba.wireless.security.framework.utils.e
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.utils.d.a(java.lang.String, java.lang.Object[]):com.alibaba.wireless.security.framework.utils.d");
    }

    public <T> T a() {
        return this.f10635a;
    }

    public Class<?> b() {
        return this.b ? (Class) this.f10635a : this.f10635a.getClass();
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f10635a.equals(((d) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f10635a.hashCode();
    }

    public String toString() {
        return this.f10635a.toString();
    }
}
