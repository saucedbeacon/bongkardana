package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class stopMonitoringBeaconsInRegion extends parseFailed<byteArrayToString, setMin> {
    private final fromInt sendMoneyRepository;

    @Inject
    public stopMonitoringBeaconsInRegion(appxLoadFailed appxloadfailed, getScheme getscheme, fromInt fromint) {
        super(appxloadfailed, getscheme);
        this.sendMoneyRepository = fromint;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<byteArrayToString> buildUseCaseObservable(setMin setmin) {
        return this.sendMoneyRepository.initPrePay(setmin.amount, setmin.transferMethod);
    }

    public static class setMin {
        /* access modifiers changed from: private */
        public String amount;
        /* access modifiers changed from: private */
        public String transferMethod;

        private setMin(String str, String str2) {
            this.amount = str;
            this.transferMethod = str2;
        }

        public static setMin forPrePay(String str, String str2) {
            return new setMin(str, str2);
        }
    }
}
