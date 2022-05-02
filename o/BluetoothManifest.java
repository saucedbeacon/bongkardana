package o;

import javax.inject.Inject;
import o.OpenAPIBridgeExtension;
import o.TitleBarRightButtonView;

public class BluetoothManifest extends parseFailed<ScanBridgeExtension, Void> {
    private final OpenAPIBridgeExtension.AnonymousClass1.C00041 referralConfigRepository;

    @Inject
    public BluetoothManifest(appxLoadFailed appxloadfailed, getScheme getscheme, OpenAPIBridgeExtension.AnonymousClass1.C00041 r3) {
        super(appxloadfailed, getscheme);
        this.referralConfigRepository = r3;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<ScanBridgeExtension> buildUseCaseObservable(Void voidR) {
        return this.referralConfigRepository.getReferralSendMoneyConfig();
    }
}
