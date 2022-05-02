package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class getDefaultVideoPoster extends parseFailed<APWebSettings, getMin> {
    private final setMediaPlaybackRequiresUserGesture repository;

    @Inject
    public getDefaultVideoPoster(appxLoadFailed appxloadfailed, getScheme getscheme, setMediaPlaybackRequiresUserGesture setmediaplaybackrequiresusergesture) {
        super(appxloadfailed, getscheme);
        this.repository = setmediaplaybackrequiresusergesture;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<APWebSettings> buildUseCaseObservable(getMin getmin) {
        return this.repository.generateProfileQrDeepLink(getmin.profileQrUrl, getmin.deepLinkTitle, getmin.deepLinkDescription, getmin.checkReferral);
    }

    public static class getMin {
        /* access modifiers changed from: private */
        public final boolean checkReferral;
        /* access modifiers changed from: private */
        public final String deepLinkDescription;
        /* access modifiers changed from: private */
        public final String deepLinkTitle;
        /* access modifiers changed from: private */
        public final String profileQrUrl;

        private getMin(String str, String str2, String str3, boolean z) {
            this.profileQrUrl = str;
            this.deepLinkTitle = str2;
            this.deepLinkDescription = str3;
            this.checkReferral = z;
        }

        public static getMin forParams(String str, String str2, String str3, boolean z) {
            return new getMin(str, str2, str3, z);
        }
    }
}
