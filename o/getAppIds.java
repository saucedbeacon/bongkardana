package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class getAppIds extends parseFailed<BaseGriverRpcResult, Void> {
    private final setFireMoment qrPayRepository;

    @Inject
    public getAppIds(appxLoadFailed appxloadfailed, getScheme getscheme, setFireMoment setfiremoment) {
        super(appxloadfailed, getscheme);
        this.qrPayRepository = setfiremoment;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<BaseGriverRpcResult> buildUseCaseObservable(Void voidR) {
        return this.qrPayRepository.getPaymentResult();
    }
}
