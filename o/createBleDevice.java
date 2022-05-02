package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class createBleDevice extends parseFailed<Boolean, setMax> {
    private disconnectBluetoothDevice versionRepository;

    @Inject
    public createBleDevice(appxLoadFailed appxloadfailed, getScheme getscheme, disconnectBluetoothDevice disconnectbluetoothdevice) {
        super(appxloadfailed, getscheme);
        this.versionRepository = disconnectbluetoothdevice;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(setMax setmax) {
        return this.versionRepository.setStorageVersion(setmax.version.intValue());
    }

    public static class setMax {
        /* access modifiers changed from: private */
        public Integer version;

        private setMax(Integer num) {
            this.version = num;
        }

        public static setMax forVersion(Integer num) {
            return new setMax(num);
        }
    }
}
