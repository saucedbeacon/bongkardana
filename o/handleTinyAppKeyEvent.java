package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class handleTinyAppKeyEvent extends parseFailed<getUid, getMin> {
    private final H5Utils settingRepository;

    @Inject
    public handleTinyAppKeyEvent(appxLoadFailed appxloadfailed, getScheme getscheme, H5Utils h5Utils) {
        super(appxloadfailed, getscheme);
        this.settingRepository = h5Utils;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<getUid> buildUseCaseObservable(getMin getmin) {
        return this.settingRepository.getPaymentSecuritySwitch(getmin.authenticationStatus, getmin.authenticationType, getmin.securityId, getmin.pin, getmin.pubKey);
    }

    public static class getMin {
        boolean authenticationStatus;
        String authenticationType;
        String pin;
        String pubKey;
        String securityId;

        private getMin(boolean z, String str, String str2, String str3, String str4) {
            this.authenticationStatus = z;
            this.securityId = str2;
            this.authenticationType = str;
            this.pin = str3;
            this.pubKey = str4;
        }

        public static getMin forPaymentSecuritySwitchOn(boolean z, String str) {
            return new getMin(z, str, (String) null, "", "");
        }

        public static getMin forPaymentSecuritySwitchOff(boolean z, String str, String str2, String str3, String str4) {
            return new getMin(z, str2, str3, str, str4);
        }
    }
}
