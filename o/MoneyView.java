package o;

import o.SafeInputWidget;

public final class MoneyView {
    private boolean getMin = true;

    public final Object getMax(LogUtils logUtils, Object obj, Class<?> cls) {
        if (obj == null || obj == checkOpen.instance || (obj instanceof LogUtils)) {
            return obj;
        }
        if (cls == null || !cls.isPrimitive()) {
            if (!getMax()) {
                if ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double)) {
                    return obj;
                }
                if (obj instanceof Character) {
                    return String.valueOf(((Character) obj).charValue());
                }
            }
            if (obj.getClass().isArray()) {
                return SafeInputWidget.AnonymousClass1.wrap(logUtils, obj);
            }
            return new SimplePassword(logUtils, obj, cls);
        } else if (cls == Void.TYPE) {
            return checkOpen.instance;
        } else {
            return cls == Character.TYPE ? Integer.valueOf(((Character) obj).charValue()) : obj;
        }
    }

    private boolean getMax() {
        return this.getMin;
    }
}
