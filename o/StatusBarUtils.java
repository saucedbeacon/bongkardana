package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.data.globalnetwork.source.GnPaymentDataFactory;
import o.b;

public final class StatusBarUtils implements getBindingAdapter<GnPaymentDataFactory> {
    private final b.C0007b<DefaultEmbedViewManager> remoteGnPaymentEntityDataProvider;

    public StatusBarUtils(b.C0007b<DefaultEmbedViewManager> bVar) {
        this.remoteGnPaymentEntityDataProvider = bVar;
    }

    public static getBindingAdapter<GnPaymentDataFactory> create(b.C0007b<DefaultEmbedViewManager> bVar) {
        return new StatusBarUtils(bVar);
    }

    public final void injectMembers(GnPaymentDataFactory gnPaymentDataFactory) {
        injectRemoteGnPaymentEntityData(gnPaymentDataFactory, this.remoteGnPaymentEntityDataProvider.get());
    }

    @InjectedFieldSignature("id.dana.data.globalnetwork.source.GnPaymentDataFactory.remoteGnPaymentEntityData")
    public static void injectRemoteGnPaymentEntityData(GnPaymentDataFactory gnPaymentDataFactory, DefaultEmbedViewManager defaultEmbedViewManager) {
        gnPaymentDataFactory.remoteGnPaymentEntityData = defaultEmbedViewManager;
    }
}
