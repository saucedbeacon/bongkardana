package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class getFavicon extends parseFailed<APWebSettings, getMax> {
    private final setMediaPlaybackRequiresUserGesture repository;

    @Inject
    public getFavicon(appxLoadFailed appxloadfailed, getScheme getscheme, setMediaPlaybackRequiresUserGesture setmediaplaybackrequiresusergesture) {
        super(appxloadfailed, getscheme);
        this.repository = setmediaplaybackrequiresusergesture;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<APWebSettings> buildUseCaseObservable(getMax getmax) {
        return this.repository.generateTransferQrDeepLink(getmax.transferQrUrl, getmax.deepLinkTitle, getmax.deepLinkDescription);
    }

    public static class getMax {
        /* access modifiers changed from: private */
        public final String deepLinkDescription;
        /* access modifiers changed from: private */
        public final String deepLinkTitle;
        /* access modifiers changed from: private */
        public final String transferQrUrl;

        private getMax(String str, String str2, String str3) {
            this.transferQrUrl = str;
            this.deepLinkTitle = str2;
            this.deepLinkDescription = str3;
        }

        public static getMax forParams(String str, String str2, String str3) {
            return new getMax(str, str2, str3);
        }
    }
}
