package o;

import java.lang.reflect.InvocationTargetException;

public final class registerOnLoadCanceledListener {
    private static isReset getMax;

    public static isReset setMin() {
        if (getMax == null) {
            try {
                getMax = (isReset) Class.forName("o.unregisterOnLoadCanceledListener").getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return getMax;
    }
}
