package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class BLETraceMonitor extends parseFailed<Boolean, setMin> {
    private final onDisconnect userEducationRepository;

    @Inject
    public BLETraceMonitor(appxLoadFailed appxloadfailed, getScheme getscheme, onDisconnect ondisconnect) {
        super(appxloadfailed, getscheme);
        this.userEducationRepository = ondisconnect;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(setMin setmin) {
        return this.userEducationRepository.isNeedToShowBottomSheetOnBoarding(setmin.scenario);
    }

    public static class setMin {
        /* access modifiers changed from: private */
        public String scenario;

        private setMin(String str) {
            this.scenario = str;
        }

        public static setMin forBottomSheetOnBoarding(String str) {
            return new setMin(str);
        }
    }
}
