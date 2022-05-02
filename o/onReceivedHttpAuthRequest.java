package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class onReceivedHttpAuthRequest extends parseFailed<getEmbedView, length> {
    private doUpdateVisitedHistory feedsRepository;

    @Inject
    public onReceivedHttpAuthRequest(appxLoadFailed appxloadfailed, getScheme getscheme, doUpdateVisitedHistory doupdatevisitedhistory) {
        super(appxloadfailed, getscheme);
        this.feedsRepository = doupdatevisitedhistory;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<getEmbedView> buildUseCaseObservable(length length2) {
        return this.feedsRepository.deleteFeeds(length2.activityId);
    }

    public static class length {
        /* access modifiers changed from: private */
        public String activityId;

        private length(String str) {
            this.activityId = str;
        }

        public static length forDeleteFeeds(String str) {
            return new length(str);
        }
    }
}
