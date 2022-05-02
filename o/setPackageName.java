package o;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.ScriptableObject;

public final class setPackageName implements Serializable {
    private static final int STATE_BEFORE_INIT = 0;
    private static final int STATE_INITIALIZING = 1;
    private static final int STATE_WITH_VALUE = 2;
    private static final long serialVersionUID = 1;
    private final String className;
    private Object initializedValue;
    private final boolean privileged;
    private final String propertyName;
    private final ScriptableObject scope;
    private final boolean sealed;
    private int state;

    private Class<? extends LogUtils> cast(Class<?> cls) {
        return cls;
    }

    public setPackageName(ScriptableObject scriptableObject, String str, String str2, boolean z) {
        this(scriptableObject, str, str2, z, false);
    }

    setPackageName(ScriptableObject scriptableObject, String str, String str2, boolean z, boolean z2) {
        this.scope = scriptableObject;
        this.propertyName = str;
        this.className = str2;
        this.sealed = z;
        this.privileged = z2;
        this.state = 0;
        scriptableObject.addLazilyInitializedValue(str, 0, this, 2);
    }

    /* JADX INFO: finally extract failed */
    public final void init() {
        synchronized (this) {
            if (this.state == 1) {
                StringBuilder sb = new StringBuilder("Recursive initialization for ");
                sb.append(this.propertyName);
                throw new IllegalStateException(sb.toString());
            } else if (this.state == 0) {
                this.state = 1;
                Object obj = LogUtils.getMax;
                try {
                    this.initializedValue = buildValue();
                    this.state = 2;
                } catch (Throwable th) {
                    this.initializedValue = obj;
                    this.state = 2;
                    throw th;
                }
            }
        }
    }

    public final Object getValue() {
        if (this.state == 2) {
            return this.initializedValue;
        }
        throw new IllegalStateException(this.propertyName);
    }

    private Object buildValue() {
        if (this.privileged) {
            return AccessController.doPrivileged(new PrivilegedAction<Object>() {
                public final Object run() {
                    return setPackageName.this.buildValue0();
                }
            });
        }
        return buildValue0();
    }

    /* access modifiers changed from: private */
    public Object buildValue0() {
        Class<? extends LogUtils> cast = cast(getStyleId.getMax(this.className));
        if (cast != null) {
            try {
                onInit buildClassCtor = ScriptableObject.buildClassCtor(this.scope, cast, this.sealed, false);
                if (buildClassCtor != null) {
                    return buildClassCtor;
                }
                Object obj = this.scope.get(this.propertyName, (LogUtils) this.scope);
                if (obj != LogUtils.getMax) {
                    return obj;
                }
            } catch (InvocationTargetException e) {
                Throwable targetException = e.getTargetException();
                if (targetException instanceof RuntimeException) {
                    throw ((RuntimeException) targetException);
                }
            } catch (IllegalAccessException | InstantiationException | SecurityException | RhinoException unused) {
            }
        }
        return LogUtils.getMax;
    }
}
