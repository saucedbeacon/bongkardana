package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class setRetryCount extends parseFailed<GriverRpcExtension, Void> {
    private final setFireMoment qrPayRepository;

    @Inject
    public setRetryCount(appxLoadFailed appxloadfailed, getScheme getscheme, setFireMoment setfiremoment) {
        super(appxloadfailed, getscheme);
        this.qrPayRepository = setfiremoment;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<GriverRpcExtension> buildUseCaseObservable(Void voidR) {
        return this.qrPayRepository.getPaymentCode();
    }
}
