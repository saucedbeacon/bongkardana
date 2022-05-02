package o;

import java.lang.reflect.Field;
import o.SecureQwertyKeyboard;
import org.mozilla.javascript.ScriptableObject;

final class encryptToByteArray extends setBizId {
    static final long serialVersionUID = -9222428244284796755L;
    Field field;
    Object javaObject;

    encryptToByteArray(LogUtils logUtils, getStyleableIds[] getstyleableidsArr, Field field2) {
        super(getstyleableidsArr);
        this.field = field2;
        setParentScope(logUtils);
        setPrototype(ScriptableObject.getFunctionPrototype(logUtils));
    }

    public final Object getDefaultValue(Class<?> cls) {
        if (cls == LogItem.invoke) {
            return this;
        }
        try {
            Object obj = this.field.get(this.javaObject);
            Class<?> type = this.field.getType();
            SecureQwertyKeyboard.AnonymousClass1 floatRange = SecureQwertyKeyboard.AnonymousClass1.toFloatRange();
            if (floatRange.Grayscale$Algorithm == null) {
                floatRange.Grayscale$Algorithm = new MoneyView();
            }
            Object max = floatRange.Grayscale$Algorithm.getMax(this, obj, type);
            return max instanceof LogUtils ? ((LogUtils) max).getDefaultValue(cls) : max;
        } catch (IllegalAccessException unused) {
            throw SecureQwertyKeyboard.AnonymousClass1.getMax("msg.java.internal.private", (Object) this.field.getName());
        }
    }
}
