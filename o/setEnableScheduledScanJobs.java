package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class setEnableScheduledScanJobs extends parseFailed<getServiceUuidEndOffset, setMax> {
    private final fromInt repository;

    @Inject
    public setEnableScheduledScanJobs(appxLoadFailed appxloadfailed, getScheme getscheme, fromInt fromint) {
        super(appxloadfailed, getscheme);
        this.repository = fromint;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<getServiceUuidEndOffset> buildUseCaseObservable(setMax setmax) {
        return this.repository.confirmSendMoney(setmax.sendMoneyConfirmParam);
    }

    public static class setMax {
        /* access modifiers changed from: private */
        public getLayout sendMoneyConfirmParam;

        private setMax(getLayout getlayout) {
            this.sendMoneyConfirmParam = getlayout;
        }

        public static setMax forConfirmSendMoneyBank(getLayout getlayout) {
            return new setMax(getlayout);
        }
    }
}
