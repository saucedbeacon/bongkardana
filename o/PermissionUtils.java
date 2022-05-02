package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class PermissionUtils extends parseFailed<String, Void> {
    private final requestPermission otpRepository;

    @Inject
    public PermissionUtils(appxLoadFailed appxloadfailed, getScheme getscheme, requestPermission requestpermission) {
        super(appxloadfailed, getscheme);
        this.otpRepository = requestpermission;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<String> buildUseCaseObservable(Void voidR) {
        return this.otpRepository.receiveOtp();
    }
}
