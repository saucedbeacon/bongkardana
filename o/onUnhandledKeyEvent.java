package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;
import o.shouldOverrideKeyEvent;

public class onUnhandledKeyEvent extends shouldOverrideKeyEvent {
    private final doUpdateVisitedHistory feedsRepository;

    @Inject
    public onUnhandledKeyEvent(appxLoadFailed appxloadfailed, getScheme getscheme, doUpdateVisitedHistory doupdatevisitedhistory) {
        super(appxloadfailed, getscheme);
        this.feedsRepository = doupdatevisitedhistory;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<onEmbedViewDestory> buildUseCaseObservable(shouldOverrideKeyEvent.setMax setmax) {
        return this.feedsRepository.getGlobalFeeds(setmax.pageSize, setmax.maxId);
    }
}
