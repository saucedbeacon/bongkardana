package o;

import java.io.Serializable;
import o.SecureQwertyKeyboard;

public abstract class printException implements Serializable {
    static final long serialVersionUID = 4044540354730911424L;

    public boolean delete(SecureQwertyKeyboard.AnonymousClass1 r1) {
        return false;
    }

    public abstract Object get(SecureQwertyKeyboard.AnonymousClass1 r1);

    public boolean has(SecureQwertyKeyboard.AnonymousClass1 r1) {
        return true;
    }

    @Deprecated
    public abstract Object set(SecureQwertyKeyboard.AnonymousClass1 r1, Object obj);

    public Object set(SecureQwertyKeyboard.AnonymousClass1 r1, LogUtils logUtils, Object obj) {
        return set(r1, obj);
    }
}
