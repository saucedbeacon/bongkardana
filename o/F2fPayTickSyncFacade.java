package o;

import o.SecureQwertyKeyboard;

final class F2fPayTickSyncFacade extends printException {
    private static final int SPECIAL_NONE = 0;
    private static final int SPECIAL_PARENT = 2;
    private static final int SPECIAL_PROTO = 1;
    static final long serialVersionUID = -7521596632456797847L;
    private String name;
    private LogUtils target;
    private int type;

    private F2fPayTickSyncFacade(LogUtils logUtils, int i, String str) {
        this.target = logUtils;
        this.type = i;
        this.name = str;
    }

    static printException createSpecial(SecureQwertyKeyboard.AnonymousClass1 r1, LogUtils logUtils, Object obj, String str) {
        int i;
        LogUtils length = LogItem.length(r1, obj, logUtils);
        if (length != null) {
            if (str.equals("__proto__")) {
                i = 1;
            } else if (str.equals("__parent__")) {
                i = 2;
            } else {
                throw new IllegalArgumentException(str);
            }
            if (!r1.getMax(5)) {
                i = 0;
            }
            return new F2fPayTickSyncFacade(length, i, str);
        }
        throw LogItem.IsOverlapping(obj, str);
    }

    public final Object get(SecureQwertyKeyboard.AnonymousClass1 r3) {
        int i = this.type;
        if (i == 0) {
            return LogItem.length(this.target, this.name, r3);
        }
        if (i == 1) {
            return this.target.getPrototype();
        }
        if (i == 2) {
            return this.target.getParentScope();
        }
        throw getStyleId.setMin();
    }

    @Deprecated
    public final Object set(SecureQwertyKeyboard.AnonymousClass1 r1, Object obj) {
        throw new IllegalStateException();
    }

    public final Object set(SecureQwertyKeyboard.AnonymousClass1 r4, LogUtils logUtils, Object obj) {
        int i = this.type;
        if (i == 0) {
            return LogItem.length(this.target, this.name, obj);
        }
        if (i == 1 || i == 2) {
            LogUtils length = LogItem.length(r4, obj, logUtils);
            if (length != null) {
                LogUtils logUtils2 = length;
                while (logUtils2 != this.target) {
                    if (this.type == 1) {
                        logUtils2 = logUtils2.getPrototype();
                        continue;
                    } else {
                        logUtils2 = logUtils2.getParentScope();
                        continue;
                    }
                    if (logUtils2 == null) {
                    }
                }
                throw SecureQwertyKeyboard.AnonymousClass1.getMax("msg.cyclic.value", (Object) this.name);
            }
            if (this.type == 1) {
                this.target.setPrototype(length);
            } else {
                this.target.setParentScope(length);
            }
            return length;
        }
        throw getStyleId.setMin();
    }

    public final boolean has(SecureQwertyKeyboard.AnonymousClass1 r3) {
        if (this.type == 0) {
            return LogItem.setMin(this.target, (Object) this.name, r3);
        }
        return true;
    }

    public final boolean delete(SecureQwertyKeyboard.AnonymousClass1 r3) {
        if (this.type == 0) {
            return LogItem.getMax(this.target, (Object) this.name, r3);
        }
        return false;
    }
}
