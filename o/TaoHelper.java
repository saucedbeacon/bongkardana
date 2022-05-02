package o;

import o.SecureQwertyKeyboard;

public final class TaoHelper implements doCheck {
    protected LogUtils setMin = null;

    private TaoHelper getMax() {
        try {
            return (TaoHelper) getClass().newInstance();
        } catch (Exception e) {
            throw SecureQwertyKeyboard.AnonymousClass1.getMax((Throwable) e);
        }
    }

    public final LogUtils setMin() {
        return this.setMin;
    }

    public final String getClassName() {
        return this.setMin.getClassName();
    }

    public final Object get(String str, LogUtils logUtils) {
        return this.setMin.get(str, logUtils);
    }

    public final Object get(int i, LogUtils logUtils) {
        return this.setMin.get(i, logUtils);
    }

    public final boolean has(String str, LogUtils logUtils) {
        return this.setMin.has(str, logUtils);
    }

    public final boolean has(int i, LogUtils logUtils) {
        return this.setMin.has(i, logUtils);
    }

    public final void put(String str, LogUtils logUtils, Object obj) {
        this.setMin.put(str, logUtils, obj);
    }

    public final void put(int i, LogUtils logUtils, Object obj) {
        this.setMin.put(i, logUtils, obj);
    }

    public final void delete(String str) {
        this.setMin.delete(str);
    }

    public final void delete(int i) {
        this.setMin.delete(i);
    }

    public final LogUtils getPrototype() {
        return this.setMin.getPrototype();
    }

    public final void setPrototype(LogUtils logUtils) {
        this.setMin.setPrototype(logUtils);
    }

    public final LogUtils getParentScope() {
        return this.setMin.getParentScope();
    }

    public final void setParentScope(LogUtils logUtils) {
        this.setMin.setParentScope(logUtils);
    }

    public final Object[] getIds() {
        return this.setMin.getIds();
    }

    public final Object getDefaultValue(Class<?> cls) {
        return (cls == null || cls == LogItem.valueOf || cls == LogItem.invoke) ? this : this.setMin.getDefaultValue(cls);
    }

    public final boolean hasInstance(LogUtils logUtils) {
        return this.setMin.hasInstance(logUtils);
    }

    public final Object call(SecureQwertyKeyboard.AnonymousClass1 r2, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        return ((doCheck) this.setMin).call(r2, logUtils, logUtils2, objArr);
    }

    public final LogUtils construct(SecureQwertyKeyboard.AnonymousClass1 r3, LogUtils logUtils, Object[] objArr) {
        LogUtils logUtils2;
        LogUtils logUtils3 = this.setMin;
        if (logUtils3 != null) {
            return ((doCheck) logUtils3).construct(r3, logUtils, objArr);
        }
        TaoHelper max = getMax();
        if (objArr.length == 0) {
            logUtils2 = new setmSubmitInterface();
        } else {
            logUtils2 = LogItem.setMin(r3, logUtils, objArr[0]);
        }
        max.setMin = logUtils2;
        return max;
    }
}
