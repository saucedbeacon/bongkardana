package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class onConnect extends parseFailed<Boolean, getMax> {
    private final onDisconnect userEducationRepository;

    @Inject
    public onConnect(appxLoadFailed appxloadfailed, getScheme getscheme, onDisconnect ondisconnect) {
        super(appxloadfailed, getscheme);
        this.userEducationRepository = ondisconnect;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(getMax getmax) {
        return this.userEducationRepository.saveShowToolTip(getmax.hasShown, getmax.scenario);
    }

    public static class getMax {
        /* access modifiers changed from: private */
        public boolean hasShown;
        /* access modifiers changed from: private */
        public String scenario;

        private getMax(boolean z, String str) {
            this.hasShown = z;
            this.scenario = str;
        }

        public static getMax forSaveShowToolTip(boolean z, String str) {
            return new getMax(z, str);
        }
    }
}
