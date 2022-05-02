package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class getMonitoringNotifier extends parseFailed<getPowerCorrection, setMin> {
    private final fromInt sendMoneyRepository;

    @Inject
    public getMonitoringNotifier(appxLoadFailed appxloadfailed, getScheme getscheme, fromInt fromint) {
        super(appxloadfailed, getscheme);
        this.sendMoneyRepository = fromint;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<getPowerCorrection> buildUseCaseObservable(setMin setmin) {
        return this.sendMoneyRepository.sendMoneyInit(setmin.payeeLoginId, setmin.payeeUserId);
    }

    public static class setMin {
        /* access modifiers changed from: private */
        public String payeeLoginId;
        /* access modifiers changed from: private */
        public String payeeUserId;

        private setMin(String str, String str2) {
            this.payeeLoginId = str;
            this.payeeUserId = str2;
        }

        public static setMin forSendMoneyInit(String str, String str2) {
            return new setMin(str, str2);
        }
    }
}
