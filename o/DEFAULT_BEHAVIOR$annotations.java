package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.danah5.nfcutility.NfcUtilityBridge;
import o.b;

public final class DEFAULT_BEHAVIOR$annotations implements getBindingAdapter<NfcUtilityBridge> {
    private final b.C0007b<setSaveFormData> confirmUpdateBalanceEmoneyProvider;
    private final b.C0007b<getLoadWithOverviewMode> doBrizziManualReversalProvider;
    private final b.C0007b<setAllowContentAccess> getBrizziAccessTokenProvider;
    private final b.C0007b<setLoadWithOverviewMode> getElectronicMoneyConfigProvider;
    private final b.C0007b<getTextZoom> getEmoneyReversalProvider;
    private final b.C0007b<getSaveFormData> getTransIdEmoneyProvider;
    private final b.C0007b<getSavePassword> inquireBalanceEmoneyProvider;
    private final b.C0007b<setSavePassword> topUpCommandEmoneyProvider;

    public DEFAULT_BEHAVIOR$annotations(b.C0007b<setAllowContentAccess> bVar, b.C0007b<setLoadWithOverviewMode> bVar2, b.C0007b<getLoadWithOverviewMode> bVar3, b.C0007b<setSaveFormData> bVar4, b.C0007b<setSavePassword> bVar5, b.C0007b<getSavePassword> bVar6, b.C0007b<getTextZoom> bVar7, b.C0007b<getSaveFormData> bVar8) {
        this.getBrizziAccessTokenProvider = bVar;
        this.getElectronicMoneyConfigProvider = bVar2;
        this.doBrizziManualReversalProvider = bVar3;
        this.confirmUpdateBalanceEmoneyProvider = bVar4;
        this.topUpCommandEmoneyProvider = bVar5;
        this.inquireBalanceEmoneyProvider = bVar6;
        this.getEmoneyReversalProvider = bVar7;
        this.getTransIdEmoneyProvider = bVar8;
    }

    public static getBindingAdapter<NfcUtilityBridge> create(b.C0007b<setAllowContentAccess> bVar, b.C0007b<setLoadWithOverviewMode> bVar2, b.C0007b<getLoadWithOverviewMode> bVar3, b.C0007b<setSaveFormData> bVar4, b.C0007b<setSavePassword> bVar5, b.C0007b<getSavePassword> bVar6, b.C0007b<getTextZoom> bVar7, b.C0007b<getSaveFormData> bVar8) {
        return new DEFAULT_BEHAVIOR$annotations(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8);
    }

    public final void injectMembers(NfcUtilityBridge nfcUtilityBridge) {
        injectGetBrizziAccessToken(nfcUtilityBridge, this.getBrizziAccessTokenProvider.get());
        injectGetElectronicMoneyConfig(nfcUtilityBridge, this.getElectronicMoneyConfigProvider.get());
        injectDoBrizziManualReversal(nfcUtilityBridge, this.doBrizziManualReversalProvider.get());
        injectConfirmUpdateBalanceEmoney(nfcUtilityBridge, this.confirmUpdateBalanceEmoneyProvider.get());
        injectTopUpCommandEmoney(nfcUtilityBridge, this.topUpCommandEmoneyProvider.get());
        injectInquireBalanceEmoney(nfcUtilityBridge, this.inquireBalanceEmoneyProvider.get());
        injectGetEmoneyReversal(nfcUtilityBridge, this.getEmoneyReversalProvider.get());
        injectGetTransIdEmoney(nfcUtilityBridge, this.getTransIdEmoneyProvider.get());
    }

    @InjectedFieldSignature("id.dana.danah5.nfcutility.NfcUtilityBridge.getBrizziAccessToken")
    public static void injectGetBrizziAccessToken(NfcUtilityBridge nfcUtilityBridge, setAllowContentAccess setallowcontentaccess) {
        nfcUtilityBridge.getBrizziAccessToken = setallowcontentaccess;
    }

    @InjectedFieldSignature("id.dana.danah5.nfcutility.NfcUtilityBridge.getElectronicMoneyConfig")
    public static void injectGetElectronicMoneyConfig(NfcUtilityBridge nfcUtilityBridge, setLoadWithOverviewMode setloadwithoverviewmode) {
        nfcUtilityBridge.getElectronicMoneyConfig = setloadwithoverviewmode;
    }

    @InjectedFieldSignature("id.dana.danah5.nfcutility.NfcUtilityBridge.doBrizziManualReversal")
    public static void injectDoBrizziManualReversal(NfcUtilityBridge nfcUtilityBridge, getLoadWithOverviewMode getloadwithoverviewmode) {
        nfcUtilityBridge.doBrizziManualReversal = getloadwithoverviewmode;
    }

    @InjectedFieldSignature("id.dana.danah5.nfcutility.NfcUtilityBridge.confirmUpdateBalanceEmoney")
    public static void injectConfirmUpdateBalanceEmoney(NfcUtilityBridge nfcUtilityBridge, setSaveFormData setsaveformdata) {
        nfcUtilityBridge.confirmUpdateBalanceEmoney = setsaveformdata;
    }

    @InjectedFieldSignature("id.dana.danah5.nfcutility.NfcUtilityBridge.topUpCommandEmoney")
    public static void injectTopUpCommandEmoney(NfcUtilityBridge nfcUtilityBridge, setSavePassword setsavepassword) {
        nfcUtilityBridge.topUpCommandEmoney = setsavepassword;
    }

    @InjectedFieldSignature("id.dana.danah5.nfcutility.NfcUtilityBridge.inquireBalanceEmoney")
    public static void injectInquireBalanceEmoney(NfcUtilityBridge nfcUtilityBridge, getSavePassword getsavepassword) {
        nfcUtilityBridge.inquireBalanceEmoney = getsavepassword;
    }

    @InjectedFieldSignature("id.dana.danah5.nfcutility.NfcUtilityBridge.getEmoneyReversal")
    public static void injectGetEmoneyReversal(NfcUtilityBridge nfcUtilityBridge, getTextZoom gettextzoom) {
        nfcUtilityBridge.getEmoneyReversal = gettextzoom;
    }

    @InjectedFieldSignature("id.dana.danah5.nfcutility.NfcUtilityBridge.getTransIdEmoney")
    public static void injectGetTransIdEmoney(NfcUtilityBridge nfcUtilityBridge, getSaveFormData getsaveformdata) {
        nfcUtilityBridge.getTransIdEmoney = getsaveformdata;
    }
}
