package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class onStopBleScan extends parseFailed<Boolean, setMax> {
    private final onDisconnect userEducationRepository;

    @Inject
    public onStopBleScan(appxLoadFailed appxloadfailed, getScheme getscheme, onDisconnect ondisconnect) {
        super(appxloadfailed, getscheme);
        this.userEducationRepository = ondisconnect;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(setMax setmax) {
        return this.userEducationRepository.saveDisplayedBottomSheetOnBoarding(setmax.scenario);
    }

    public static class setMax {
        /* access modifiers changed from: private */
        public String scenario;

        private setMax(String str) {
            this.scenario = str;
        }

        public static setMax forDisplayBottomSheetOnBoarding(String str) {
            return new setMax(str);
        }
    }
}
