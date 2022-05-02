package o;

import id.dana.di.modules.ApplicationModule;
import o.ByteArrayPools;
import o.b;

public final class checkTime implements getAdapterPosition<queryLastRefreshTimestamp> {
    private final ApplicationModule getMin;
    private final b.C0007b<ByteArrayPools.ByteArray4Pool> setMax;

    private checkTime(ApplicationModule applicationModule, b.C0007b<ByteArrayPools.ByteArray4Pool> bVar) {
        this.getMin = applicationModule;
        this.setMax = bVar;
    }

    public static checkTime length(ApplicationModule applicationModule, b.C0007b<ByteArrayPools.ByteArray4Pool> bVar) {
        return new checkTime(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        queryLastRefreshTimestamp length = this.getMin.length(this.setMax.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
