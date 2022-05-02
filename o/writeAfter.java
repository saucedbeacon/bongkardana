package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class writeAfter implements getAdapterPosition<disconnectBluetoothDevice> {
    private final b.C0007b<setDownloadEndTime> length;
    private final ApplicationModule setMin;

    private writeAfter(ApplicationModule applicationModule, b.C0007b<setDownloadEndTime> bVar) {
        this.setMin = applicationModule;
        this.length = bVar;
    }

    public static writeAfter setMax(ApplicationModule applicationModule, b.C0007b<setDownloadEndTime> bVar) {
        return new writeAfter(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        disconnectBluetoothDevice min = this.setMin.getMin(this.length.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
