package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class writeKeyValue implements getAdapterPosition<onBluetoothDescriptorWrite> {
    private final b.C0007b<OnlineResourceFetcher> getMax;
    private final ApplicationModule setMin;

    private writeKeyValue(ApplicationModule applicationModule, b.C0007b<OnlineResourceFetcher> bVar) {
        this.setMin = applicationModule;
        this.getMax = bVar;
    }

    public static writeKeyValue getMin(ApplicationModule applicationModule, b.C0007b<OnlineResourceFetcher> bVar) {
        return new writeKeyValue(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        onBluetoothDescriptorWrite min = this.setMin.getMin(this.getMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
