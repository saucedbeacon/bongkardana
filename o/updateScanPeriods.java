package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class updateScanPeriods extends parseFailed<getDataFieldCount, setMax> {
    private final fromInt sendMoneyRepository;

    @Inject
    updateScanPeriods(appxLoadFailed appxloadfailed, getScheme getscheme, fromInt fromint) {
        super(appxloadfailed, getscheme);
        this.sendMoneyRepository = fromint;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<getDataFieldCount> buildUseCaseObservable(setMax setmax) {
        return this.sendMoneyRepository.transferInit(setmax.transferInitParam);
    }

    public static class setMax {
        private static final String BALANCE = "BALANCE";
        /* access modifiers changed from: private */
        public getIdentifierCount transferInitParam;

        private setMax(getIdentifierCount getidentifiercount) {
            this.transferInitParam = getidentifiercount;
        }

        public static setMax forSendMoneyInit(getIdentifierCount getidentifiercount) {
            return new setMax(getidentifiercount);
        }

        public static setMax forTransferMethodOnly() {
            getIdentifierCount getidentifiercount = new getIdentifierCount();
            getidentifiercount.setTransferMethod("BALANCE");
            getidentifiercount.setNeedTransferMethod(true);
            return new setMax(getidentifiercount);
        }
    }
}
