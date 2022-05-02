package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class FieldTypeResolver implements getAdapterPosition<onDisconnectAllDevices> {
    private final b.C0007b<setExtendInfo> getMin;
    private final ApplicationModule setMax;

    private FieldTypeResolver(ApplicationModule applicationModule, b.C0007b<setExtendInfo> bVar) {
        this.setMax = applicationModule;
        this.getMin = bVar;
    }

    public static FieldTypeResolver getMin(ApplicationModule applicationModule, b.C0007b<setExtendInfo> bVar) {
        return new FieldTypeResolver(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        onDisconnectAllDevices length = this.setMax.length(this.getMin.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
