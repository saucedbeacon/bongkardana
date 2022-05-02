package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class onGetBluetoothServices extends parseFailed<String, Void> {
    private final onDisconnectAllDevices userEmailAddressRepository;

    @Inject
    public onGetBluetoothServices(appxLoadFailed appxloadfailed, getScheme getscheme, onDisconnectAllDevices ondisconnectalldevices) {
        super(appxloadfailed, getscheme);
        this.userEmailAddressRepository = ondisconnectalldevices;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<String> buildUseCaseObservable(Void voidR) {
        return this.userEmailAddressRepository.getEmailAddress();
    }
}
