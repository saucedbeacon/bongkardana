package o;

import id.dana.di.modules.ApplicationModule;
import o.AltBeacon;
import o.b;

public final class ArraySerializer implements getAdapterPosition<AltBeacon.Builder> {
    private final ApplicationModule setMax;
    private final b.C0007b<onChannelCreated> setMin;

    private ArraySerializer(ApplicationModule applicationModule, b.C0007b<onChannelCreated> bVar) {
        this.setMax = applicationModule;
        this.setMin = bVar;
    }

    public static ArraySerializer getMax(ApplicationModule applicationModule, b.C0007b<onChannelCreated> bVar) {
        return new ArraySerializer(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        AltBeacon.Builder length = this.setMax.length(this.setMin.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
