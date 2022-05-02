package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class onOpenBluetoothAdapter extends parseFailed<onBluetoothAdapterStateChange, length> {
    private final onBluetoothDescriptorWrite userSecurityQuestionStateRepository;

    @Inject
    public onOpenBluetoothAdapter(appxLoadFailed appxloadfailed, getScheme getscheme, onBluetoothDescriptorWrite onbluetoothdescriptorwrite) {
        super(appxloadfailed, getscheme);
        this.userSecurityQuestionStateRepository = onbluetoothdescriptorwrite;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<onBluetoothAdapterStateChange> buildUseCaseObservable(length length2) {
        return this.userSecurityQuestionStateRepository.getSecurityQuestionState(length2.kbaVersion).map(onBluetoothDeviceFound.getMax);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ onBluetoothAdapterStateChange lambda$buildUseCaseObservable$0(onBluetoothCharacteristicWrite onbluetoothcharacteristicwrite) throws Exception {
        if (onbluetoothcharacteristicwrite != null) {
            return onbluetoothcharacteristicwrite.getData();
        }
        return null;
    }

    public static class length {
        /* access modifiers changed from: private */
        public final String kbaVersion;

        private length(String str) {
            this.kbaVersion = str;
        }

        public static length forSecurityQuestionState(String str) {
            return new length(str);
        }
    }
}
