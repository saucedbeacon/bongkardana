package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.danah5.showagreement.ShowAgreementBridge;
import o.BLEManager;
import o.b;

public final class DialogActionButton implements getBindingAdapter<ShowAgreementBridge> {
    private final b.C0007b<BLEManager.AnonymousClass2.C00022> consultAgreementProvider;
    private final b.C0007b<access$1002> getEmptyUserInfoProvider;
    private final b.C0007b<RangeNotifier> getServiceProvider;
    private final b.C0007b<BLEManager.AnonymousClass2.AnonymousClass3> recordAgreementProvider;

    public DialogActionButton(b.C0007b<RangeNotifier> bVar, b.C0007b<BLEManager.AnonymousClass2.C00022> bVar2, b.C0007b<BLEManager.AnonymousClass2.AnonymousClass3> bVar3, b.C0007b<access$1002> bVar4) {
        this.getServiceProvider = bVar;
        this.consultAgreementProvider = bVar2;
        this.recordAgreementProvider = bVar3;
        this.getEmptyUserInfoProvider = bVar4;
    }

    public static getBindingAdapter<ShowAgreementBridge> create(b.C0007b<RangeNotifier> bVar, b.C0007b<BLEManager.AnonymousClass2.C00022> bVar2, b.C0007b<BLEManager.AnonymousClass2.AnonymousClass3> bVar3, b.C0007b<access$1002> bVar4) {
        return new DialogActionButton(bVar, bVar2, bVar3, bVar4);
    }

    public final void injectMembers(ShowAgreementBridge showAgreementBridge) {
        injectGetService(showAgreementBridge, this.getServiceProvider.get());
        injectConsultAgreement(showAgreementBridge, this.consultAgreementProvider.get());
        injectRecordAgreement(showAgreementBridge, this.recordAgreementProvider.get());
        injectGetEmptyUserInfo(showAgreementBridge, this.getEmptyUserInfoProvider.get());
    }

    @InjectedFieldSignature("id.dana.danah5.showagreement.ShowAgreementBridge.getService")
    public static void injectGetService(ShowAgreementBridge showAgreementBridge, RangeNotifier rangeNotifier) {
        showAgreementBridge.getService = rangeNotifier;
    }

    @InjectedFieldSignature("id.dana.danah5.showagreement.ShowAgreementBridge.consultAgreement")
    public static void injectConsultAgreement(ShowAgreementBridge showAgreementBridge, BLEManager.AnonymousClass2.C00022 r1) {
        showAgreementBridge.consultAgreement = r1;
    }

    @InjectedFieldSignature("id.dana.danah5.showagreement.ShowAgreementBridge.recordAgreement")
    public static void injectRecordAgreement(ShowAgreementBridge showAgreementBridge, BLEManager.AnonymousClass2.AnonymousClass3 r1) {
        showAgreementBridge.recordAgreement = r1;
    }

    @InjectedFieldSignature("id.dana.danah5.showagreement.ShowAgreementBridge.getEmptyUserInfo")
    public static void injectGetEmptyUserInfo(ShowAgreementBridge showAgreementBridge, access$1002 access_1002) {
        showAgreementBridge.getEmptyUserInfo = access_1002;
    }
}
