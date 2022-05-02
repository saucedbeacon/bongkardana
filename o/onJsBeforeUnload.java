package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class onJsBeforeUnload extends parseFailed<APWebSettings, getMin> {
    private final setMediaPlaybackRequiresUserGesture repository;

    @Inject
    public onJsBeforeUnload(appxLoadFailed appxloadfailed, getScheme getscheme, setMediaPlaybackRequiresUserGesture setmediaplaybackrequiresusergesture) {
        super(appxloadfailed, getscheme);
        this.repository = setmediaplaybackrequiresusergesture;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<APWebSettings> buildUseCaseObservable(getMin getmin) {
        return this.repository.generateReferralDeepLink(getmin.referralCode);
    }

    public static final class getMin {
        /* access modifiers changed from: private */
        public final String referralCode;

        private getMin(String str) {
            this.referralCode = str;
        }

        public static getMin forParams(String str) {
            return new getMin(str);
        }
    }
}
