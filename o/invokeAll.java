package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.danah5.sendevent.SendEventBridge;
import o.b;

public final class invokeAll implements getBindingAdapter<SendEventBridge> {
    private final b.C0007b<DefaultEmbedViewManager> remoteGnPaymentEntityDataProvider;
    private final b.C0007b<GriverOptionMenuEvent> saveLastTransactionProvider;
    private final b.C0007b<UpdateAppCallback> splitFacadeProvider;

    public invokeAll(b.C0007b<DefaultEmbedViewManager> bVar, b.C0007b<UpdateAppCallback> bVar2, b.C0007b<GriverOptionMenuEvent> bVar3) {
        this.remoteGnPaymentEntityDataProvider = bVar;
        this.splitFacadeProvider = bVar2;
        this.saveLastTransactionProvider = bVar3;
    }

    public static getBindingAdapter<SendEventBridge> create(b.C0007b<DefaultEmbedViewManager> bVar, b.C0007b<UpdateAppCallback> bVar2, b.C0007b<GriverOptionMenuEvent> bVar3) {
        return new invokeAll(bVar, bVar2, bVar3);
    }

    public final void injectMembers(SendEventBridge sendEventBridge) {
        injectRemoteGnPaymentEntityData(sendEventBridge, this.remoteGnPaymentEntityDataProvider.get());
        injectSplitFacade(sendEventBridge, this.splitFacadeProvider.get());
        injectSaveLastTransaction(sendEventBridge, this.saveLastTransactionProvider.get());
    }

    @InjectedFieldSignature("id.dana.danah5.sendevent.SendEventBridge.remoteGnPaymentEntityData")
    public static void injectRemoteGnPaymentEntityData(SendEventBridge sendEventBridge, DefaultEmbedViewManager defaultEmbedViewManager) {
        sendEventBridge.remoteGnPaymentEntityData = defaultEmbedViewManager;
    }

    @InjectedFieldSignature("id.dana.danah5.sendevent.SendEventBridge.splitFacade")
    public static void injectSplitFacade(SendEventBridge sendEventBridge, UpdateAppCallback updateAppCallback) {
        sendEventBridge.splitFacade = updateAppCallback;
    }

    @InjectedFieldSignature("id.dana.danah5.sendevent.SendEventBridge.saveLastTransaction")
    public static void injectSaveLastTransaction(SendEventBridge sendEventBridge, GriverOptionMenuEvent griverOptionMenuEvent) {
        sendEventBridge.saveLastTransaction = griverOptionMenuEvent;
    }
}
