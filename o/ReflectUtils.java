package o;

import java.util.Set;

final class ReflectUtils implements RedDotDrawable {
    private final invokeMethod length;

    public ReflectUtils(invokeMethod invokemethod) {
        this.length = invokemethod;
    }

    public final Object apply(Object obj) {
        return this.length.createMapIterable((Set) obj);
    }
}
