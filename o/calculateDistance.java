package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class calculateDistance extends parseFailed<setEncryptProxy, getMin> {
    private final setDistanceCalculator registrationRepository;

    @Inject
    public calculateDistance(appxLoadFailed appxloadfailed, getScheme getscheme, setDistanceCalculator setdistancecalculator) {
        super(appxloadfailed, getscheme);
        this.registrationRepository = setdistancecalculator;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<setEncryptProxy> buildUseCaseObservable(getMin getmin) {
        return this.registrationRepository.resendOtp(getmin.otpChannel);
    }

    public static class getMin {
        /* access modifiers changed from: private */
        public String otpChannel;

        private getMin(String str) {
            this.otpChannel = str;
        }

        public static getMin forResendOtp(String str) {
            return new getMin(str);
        }
    }
}
