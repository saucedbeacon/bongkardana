package o;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import o.SecureQwertyKeyboard;
import o.SecureTextView;
import org.mozilla.javascript.jdk15.VMBridge_jdk15$1;

public final class paintCircleShape extends INotProguard {
    private ThreadLocal<Object[]> length = new ThreadLocal<>();

    public paintCircleShape() throws SecurityException, InstantiationException {
        try {
            Method.class.getMethod("isVarArgs", (Class[]) null);
        } catch (NoSuchMethodException e) {
            throw new InstantiationException(e.getMessage());
        }
    }

    public final Object length() {
        Object[] objArr = this.length.get();
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[1];
        this.length.set(objArr2);
        return objArr2;
    }

    public final SecureQwertyKeyboard.AnonymousClass1 getMin(Object obj) {
        return (SecureQwertyKeyboard.AnonymousClass1) ((Object[]) obj)[0];
    }

    public final void length(Object obj, SecureQwertyKeyboard.AnonymousClass1 r3) {
        ((Object[]) obj)[0] = r3;
    }

    public final boolean getMax(AccessibleObject accessibleObject) {
        if (accessibleObject.isAccessible()) {
            return true;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception unused) {
        }
        return accessibleObject.isAccessible();
    }

    public final Object length(Class<?>[] clsArr) {
        try {
            return Proxy.getProxyClass(clsArr[0].getClassLoader(), clsArr).getConstructor(new Class[]{InvocationHandler.class});
        } catch (NoSuchMethodException e) {
            throw getStyleId.setMax((RuntimeException) new IllegalStateException(), (Throwable) e);
        }
    }

    public final Object getMin(Object obj, SecureTextView.SendAccessiBilityEventListener sendAccessiBilityEventListener, getAnimId getanimid, Object obj2, LogUtils logUtils) {
        try {
            return ((Constructor) obj).newInstance(new Object[]{new VMBridge_jdk15$1(this, obj2, getanimid, sendAccessiBilityEventListener, logUtils)});
        } catch (InvocationTargetException e) {
            throw SecureQwertyKeyboard.AnonymousClass1.getMax((Throwable) e);
        } catch (IllegalAccessException e2) {
            throw getStyleId.setMax((RuntimeException) new IllegalStateException(), (Throwable) e2);
        } catch (InstantiationException e3) {
            throw getStyleId.setMax((RuntimeException) new IllegalStateException(), (Throwable) e3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.util.Iterator<?>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Iterator<?> setMin(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof o.UniResultF2fpayOrderInfo
            r1 = 0
            if (r0 == 0) goto L_0x001c
            o.UniResultF2fpayOrderInfo r3 = (o.UniResultF2fpayOrderInfo) r3
            java.lang.Object r3 = r3.unwrap()
            boolean r0 = r3 instanceof java.util.Iterator
            if (r0 == 0) goto L_0x0012
            r1 = r3
            java.util.Iterator r1 = (java.util.Iterator) r1
        L_0x0012:
            boolean r0 = r3 instanceof java.lang.Iterable
            if (r0 == 0) goto L_0x001c
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r1 = r3.iterator()
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.paintCircleShape.setMin(java.lang.Object):java.util.Iterator");
    }
}
