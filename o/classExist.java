package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class classExist extends parseFailed<canSendRequest, length> {
    private final requestPermission otpRepository;

    @Inject
    public classExist(appxLoadFailed appxloadfailed, getScheme getscheme, requestPermission requestpermission) {
        super(appxloadfailed, getscheme);
        this.otpRepository = requestpermission;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<canSendRequest> buildUseCaseObservable(length length2) {
        return this.otpRepository.verifyOtp(length2.otpValue);
    }

    public static class length {
        /* access modifiers changed from: private */
        public String otpValue;

        private length(String str) {
            this.otpValue = str;
        }

        public static length forVerifyOtp(String str) {
            return new length(str);
        }
    }
}
