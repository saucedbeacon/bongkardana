package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class setOutFilePathProxy extends parseFailed<positivePermissionsResult, getMax> {
    private final requestPermission otpRepository;

    @Inject
    public setOutFilePathProxy(appxLoadFailed appxloadfailed, getScheme getscheme, requestPermission requestpermission) {
        super(appxloadfailed, getscheme);
        this.otpRepository = requestpermission;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<positivePermissionsResult> buildUseCaseObservable(getMax getmax) {
        return this.otpRepository.sendOtp(getmax.sendStrategy, getmax.serviceCode);
    }

    public static class getMax {
        /* access modifiers changed from: private */
        public final String sendStrategy;
        /* access modifiers changed from: private */
        public final String serviceCode;

        private getMax(String str, String str2) {
            this.sendStrategy = str;
            this.serviceCode = str2;
        }

        public static getMax forSendOtp(String str, String str2) {
            return new getMax(str, str2);
        }
    }
}
