package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class JavaBeanInfo implements getAdapterPosition<applyChanges> {
    private final b.C0007b<getRemoteDebugUrlForDebug> length;
    private final ApplicationModule setMax;

    private JavaBeanInfo(ApplicationModule applicationModule, b.C0007b<getRemoteDebugUrlForDebug> bVar) {
        this.setMax = applicationModule;
        this.length = bVar;
    }

    public static JavaBeanInfo getMax(ApplicationModule applicationModule, b.C0007b<getRemoteDebugUrlForDebug> bVar) {
        return new JavaBeanInfo(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        applyChanges min = this.setMax.getMin(this.length.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
