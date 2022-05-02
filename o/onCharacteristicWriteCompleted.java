package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class onCharacteristicWriteCompleted extends parseFailed<Boolean, getMax> {
    private final onDisconnect userEducationRepository;

    @Inject
    public onCharacteristicWriteCompleted(appxLoadFailed appxloadfailed, getScheme getscheme, onDisconnect ondisconnect) {
        super(appxloadfailed, getscheme);
        this.userEducationRepository = ondisconnect;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(getMax getmax) {
        return this.userEducationRepository.isNeedToShowToolTip(getmax.scenario);
    }

    public static class getMax {
        /* access modifiers changed from: private */
        public String scenario;

        private getMax(String str) {
            this.scenario = str;
        }

        public static getMax forShowTooltip(String str) {
            return new getMax(str);
        }
    }
}
