package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class getFieldValue extends parseFailed<filterBundle, length> {
    private final GriverBaseManifest bokuRepository;

    @Inject
    public getFieldValue(appxLoadFailed appxloadfailed, getScheme getscheme, GriverBaseManifest griverBaseManifest) {
        super(appxloadfailed, getscheme);
        this.bokuRepository = griverBaseManifest;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<filterBundle> buildUseCaseObservable(length length2) {
        return this.bokuRepository.verifyOtpToRisk(length2.otpValue, length2.securityId, length2.phoneNumber);
    }

    public static class length {
        /* access modifiers changed from: private */
        public String otpValue;
        /* access modifiers changed from: private */
        public String phoneNumber;
        /* access modifiers changed from: private */
        public String securityId;

        private length(String str, String str2, String str3) {
            this.otpValue = str;
            this.securityId = str2;
            this.phoneNumber = str3;
        }

        public static length forVerifyOtp(String str, String str2, String str3) {
            return new length(str, str2, str3);
        }
    }
}
