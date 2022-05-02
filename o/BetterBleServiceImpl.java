package o;

import id.dana.domain.version.Version;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class BetterBleServiceImpl extends parseFailed<Version, Void> {
    private final disconnectBluetoothDevice versionRepository;

    @Inject
    public BetterBleServiceImpl(appxLoadFailed appxloadfailed, getScheme getscheme, disconnectBluetoothDevice disconnectbluetoothdevice) {
        super(appxloadfailed, getscheme);
        this.versionRepository = disconnectbluetoothdevice;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Version> buildUseCaseObservable(Void voidR) {
        return this.versionRepository.getAppVersion();
    }
}
