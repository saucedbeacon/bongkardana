package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class getVisitedHistory extends parseFailed<save, setMax> {
    private setMediaPlaybackRequiresUserGesture generateLinkRepository;

    @Inject
    public getVisitedHistory(appxLoadFailed appxloadfailed, getScheme getscheme, setMediaPlaybackRequiresUserGesture setmediaplaybackrequiresusergesture) {
        super(appxloadfailed, getscheme);
        this.generateLinkRepository = setmediaplaybackrequiresusergesture;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<save> buildUseCaseObservable(setMax setmax) {
        return this.generateLinkRepository.generateSplitBillQrDeepLink(setmax.splitBill, setmax.deepLinkTitle, setmax.deepLinkDescription);
    }

    public static final class setMax {
        /* access modifiers changed from: private */
        public final String deepLinkDescription;
        /* access modifiers changed from: private */
        public final String deepLinkTitle;
        /* access modifiers changed from: private */
        public final getExtraBeaconDataTracker splitBill;

        private setMax(getExtraBeaconDataTracker getextrabeacondatatracker, String str, String str2) {
            this.splitBill = getextrabeacondatatracker;
            this.deepLinkDescription = str;
            this.deepLinkTitle = str2;
        }

        public static setMax forParams(getExtraBeaconDataTracker getextrabeacondatatracker, String str, String str2) {
            return new setMax(getextrabeacondatatracker, str, str2);
        }
    }
}
