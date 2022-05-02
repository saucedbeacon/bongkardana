package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class BleDevice extends parseFailed<Integer, Void> {
    private disconnectBluetoothDevice versionRepository;

    @Inject
    public BleDevice(appxLoadFailed appxloadfailed, getScheme getscheme, disconnectBluetoothDevice disconnectbluetoothdevice) {
        super(appxloadfailed, getscheme);
        this.versionRepository = disconnectbluetoothdevice;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Integer> buildUseCaseObservable(Void voidR) {
        return this.versionRepository.getStorageVersion();
    }
}
