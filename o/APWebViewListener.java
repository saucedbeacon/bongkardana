package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;
import o.shouldOverrideKeyEvent;

public class APWebViewListener extends shouldOverrideKeyEvent {
    private final doUpdateVisitedHistory feedsRepository;

    @Inject
    public APWebViewListener(appxLoadFailed appxloadfailed, getScheme getscheme, doUpdateVisitedHistory doupdatevisitedhistory) {
        super(appxloadfailed, getscheme);
        this.feedsRepository = doupdatevisitedhistory;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<onEmbedViewDestory> buildUseCaseObservable(shouldOverrideKeyEvent.setMax setmax) {
        return this.feedsRepository.getUserFeeds(setmax.pageSize, setmax.maxId);
    }
}
