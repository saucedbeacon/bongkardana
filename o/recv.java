package o;

import o.RemoteDebugController;
import o.b;

public final class recv implements getAdapterPosition<onConnectError> {
    private final b.C0007b<RemoteDebugController.AnonymousClass2> networkSplitBillEntityDataProvider;
    private final b.C0007b<RemoteDebugViewBridgeExtension> persistenceSplitBillEntityDataProvider;

    public recv(b.C0007b<RemoteDebugViewBridgeExtension> bVar, b.C0007b<RemoteDebugController.AnonymousClass2> bVar2) {
        this.persistenceSplitBillEntityDataProvider = bVar;
        this.networkSplitBillEntityDataProvider = bVar2;
    }

    public final onConnectError get() {
        return newInstance(this.persistenceSplitBillEntityDataProvider.get(), this.networkSplitBillEntityDataProvider.get());
    }

    public static recv create(b.C0007b<RemoteDebugViewBridgeExtension> bVar, b.C0007b<RemoteDebugController.AnonymousClass2> bVar2) {
        return new recv(bVar, bVar2);
    }

    public static onConnectError newInstance(RemoteDebugViewBridgeExtension remoteDebugViewBridgeExtension, RemoteDebugController.AnonymousClass2 r2) {
        return new onConnectError(remoteDebugViewBridgeExtension, r2);
    }
}
