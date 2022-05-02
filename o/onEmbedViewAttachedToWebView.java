package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class onEmbedViewAttachedToWebView extends parseFailed<onEmbedViewDestory, onReceivedIcon> {
    private doUpdateVisitedHistory feedsRepository;

    @Inject
    public onEmbedViewAttachedToWebView(appxLoadFailed appxloadfailed, getScheme getscheme, doUpdateVisitedHistory doupdatevisitedhistory) {
        super(appxloadfailed, getscheme);
        this.feedsRepository = doupdatevisitedhistory;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<onEmbedViewDestory> buildUseCaseObservable(onReceivedIcon onreceivedicon) {
        return this.feedsRepository.getDefaultFeedFromConfig();
    }
}
