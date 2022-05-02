package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class getForegroundScanPeriod extends parseFailed<getServiceUuidEndOffset, setMax> {
    private final fromInt sendMoneyRepository;

    @Inject
    getForegroundScanPeriod(appxLoadFailed appxloadfailed, getScheme getscheme, fromInt fromint) {
        super(appxloadfailed, getscheme);
        this.sendMoneyRepository = fromint;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<getServiceUuidEndOffset> buildUseCaseObservable(setMax setmax) {
        return this.sendMoneyRepository.confirmSendMoney(setmax.sendMoneyConfirmParam);
    }

    public static class setMax {
        /* access modifiers changed from: private */
        public getLayout sendMoneyConfirmParam;

        private setMax(getLayout getlayout) {
            this.sendMoneyConfirmParam = getlayout;
        }

        public static setMax forConfirmSendMoneyContact(getLayout getlayout) {
            return new setMax(getlayout);
        }
    }
}
