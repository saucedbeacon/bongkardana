package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.danah5.faceverificationenablement.FaceVerificationEnablementBridge;
import o.b;
import o.negativeButton;

public final class clearNegativeListeners implements getBindingAdapter<FaceVerificationEnablementBridge> {
    private final b.C0007b<negativeButton.Cdefault> faceVerificationEnablementManagerProvider;

    public clearNegativeListeners(b.C0007b<negativeButton.Cdefault> bVar) {
        this.faceVerificationEnablementManagerProvider = bVar;
    }

    public static getBindingAdapter<FaceVerificationEnablementBridge> create(b.C0007b<negativeButton.Cdefault> bVar) {
        return new clearNegativeListeners(bVar);
    }

    public final void injectMembers(FaceVerificationEnablementBridge faceVerificationEnablementBridge) {
        injectFaceVerificationEnablementManager(faceVerificationEnablementBridge, this.faceVerificationEnablementManagerProvider.get());
    }

    @InjectedFieldSignature("id.dana.danah5.faceverificationenablement.FaceVerificationEnablementBridge.faceVerificationEnablementManager")
    public static void injectFaceVerificationEnablementManager(FaceVerificationEnablementBridge faceVerificationEnablementBridge, negativeButton.Cdefault defaultR) {
        faceVerificationEnablementBridge.faceVerificationEnablementManager = defaultR;
    }
}
