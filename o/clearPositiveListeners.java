package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.danah5.deeplink.scanQr.OpenScanQrBridge;
import o.b;

public final class clearPositiveListeners implements getBindingAdapter<OpenScanQrBridge> {
    private final b.C0007b<isTransitionRequired> featureScanQRProvider;

    public clearPositiveListeners(b.C0007b<isTransitionRequired> bVar) {
        this.featureScanQRProvider = bVar;
    }

    public static getBindingAdapter<OpenScanQrBridge> create(b.C0007b<isTransitionRequired> bVar) {
        return new clearPositiveListeners(bVar);
    }

    public final void injectMembers(OpenScanQrBridge openScanQrBridge) {
        injectFeatureScanQR(openScanQrBridge, this.featureScanQRProvider.get());
    }

    @InjectedFieldSignature("id.dana.danah5.deeplink.scanQr.OpenScanQrBridge.featureScanQR")
    public static void injectFeatureScanQR(OpenScanQrBridge openScanQrBridge, isTransitionRequired istransitionrequired) {
        openScanQrBridge.featureScanQR = istransitionrequired;
    }
}
