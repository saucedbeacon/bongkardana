package o;

import java.io.Serializable;
import java.lang.reflect.Proxy;
import org.mozilla.javascript.Undefined$1;

public class checkOpen implements Serializable {
    public static final LogUtils SCRIPTABLE_UNDEFINED = ((LogUtils) Proxy.newProxyInstance(checkOpen.class.getClassLoader(), new Class[]{LogUtils.class}, new Undefined$1()));
    public static final Object instance = new checkOpen();
    static final long serialVersionUID = 9195680630202616767L;

    public int hashCode() {
        return 0;
    }

    private checkOpen() {
    }

    public Object readResolve() {
        return instance;
    }

    public boolean equals(Object obj) {
        return isUndefined(obj) || super.equals(obj);
    }

    public static boolean isUndefined(Object obj) {
        return instance == obj || SCRIPTABLE_UNDEFINED == obj;
    }
}
