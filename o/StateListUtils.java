package o;

import id.dana.data.globalnetwork.source.GnPaymentDataFactory;
import o.b;

public final class StateListUtils implements getAdapterPosition<GnPaymentDataFactory> {
    private final b.C0007b<getWidthSpec> globalNetworkPreferenceProvider;
    private final b.C0007b<DefaultEmbedViewManager> remoteGnPaymentEntityDataProvider;

    public StateListUtils(b.C0007b<getWidthSpec> bVar, b.C0007b<DefaultEmbedViewManager> bVar2) {
        this.globalNetworkPreferenceProvider = bVar;
        this.remoteGnPaymentEntityDataProvider = bVar2;
    }

    public final GnPaymentDataFactory get() {
        GnPaymentDataFactory newInstance = newInstance(this.globalNetworkPreferenceProvider.get());
        StatusBarUtils.injectRemoteGnPaymentEntityData(newInstance, this.remoteGnPaymentEntityDataProvider.get());
        return newInstance;
    }

    public static StateListUtils create(b.C0007b<getWidthSpec> bVar, b.C0007b<DefaultEmbedViewManager> bVar2) {
        return new StateListUtils(bVar, bVar2);
    }

    public static GnPaymentDataFactory newInstance(getWidthSpec getwidthspec) {
        return new GnPaymentDataFactory(getwidthspec);
    }
}
