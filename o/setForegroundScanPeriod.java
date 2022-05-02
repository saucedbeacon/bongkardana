package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class setForegroundScanPeriod extends parseFailed<getServiceUuidEndOffset, setMin> {
    private final fromInt sendMoneyRepository;

    @Inject
    setForegroundScanPeriod(appxLoadFailed appxloadfailed, getScheme getscheme, fromInt fromint) {
        super(appxloadfailed, getscheme);
        this.sendMoneyRepository = fromint;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<getServiceUuidEndOffset> buildUseCaseObservable(setMin setmin) {
        return this.sendMoneyRepository.confirmSendMoneyOTC(setmin.sendMoneyConfirmOTCParam);
    }

    public static class setMin {
        /* access modifiers changed from: private */
        public getMatchingBeaconTypeCodeEndOffset sendMoneyConfirmOTCParam;

        private setMin(getMatchingBeaconTypeCodeEndOffset getmatchingbeacontypecodeendoffset) {
            this.sendMoneyConfirmOTCParam = getmatchingbeacontypecodeendoffset;
        }

        public static setMin forConfirmSendMoneyOTC(getMatchingBeaconTypeCodeEndOffset getmatchingbeacontypecodeendoffset) {
            return new setMin(getmatchingbeacontypecodeendoffset);
        }
    }
}
