package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class setMaxTrackingAge extends parseFailed<getBeaconAdvertisementData, getMin> {
    private final fromInt sendMoneyRepository;

    @Inject
    public setMaxTrackingAge(appxLoadFailed appxloadfailed, getScheme getscheme, fromInt fromint) {
        super(appxloadfailed, getscheme);
        this.sendMoneyRepository = fromint;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<getBeaconAdvertisementData> buildUseCaseObservable(getMin getmin) {
        return this.sendMoneyRepository.transferOTCInit(getmin.amount, getmin.fundType);
    }

    public static class getMin {
        /* access modifiers changed from: private */
        public final String amount;
        /* access modifiers changed from: private */
        public final String fundType;

        private getMin(String str, String str2) {
            this.amount = str;
            this.fundType = str2;
        }

        public static getMin forTransferOTCInit(String str, String str2) {
            return new getMin(str, str2);
        }
    }
}
