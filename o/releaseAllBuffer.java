package o;

import o.b;

public final class releaseAllBuffer implements getAdapterPosition<mutable> {
    private final b.C0007b<RVByteBufferPool> mockReferralTrackerEntityDataProvider;
    private final b.C0007b<ImmutableCollection> networkReferralTrackerEntityDataProvider;

    public releaseAllBuffer(b.C0007b<ImmutableCollection> bVar, b.C0007b<RVByteBufferPool> bVar2) {
        this.networkReferralTrackerEntityDataProvider = bVar;
        this.mockReferralTrackerEntityDataProvider = bVar2;
    }

    public final mutable get() {
        return newInstance(this.networkReferralTrackerEntityDataProvider.get(), this.mockReferralTrackerEntityDataProvider.get());
    }

    public static releaseAllBuffer create(b.C0007b<ImmutableCollection> bVar, b.C0007b<RVByteBufferPool> bVar2) {
        return new releaseAllBuffer(bVar, bVar2);
    }

    public static mutable newInstance(ImmutableCollection immutableCollection, RVByteBufferPool rVByteBufferPool) {
        return new mutable(immutableCollection, rVByteBufferPool);
    }
}
