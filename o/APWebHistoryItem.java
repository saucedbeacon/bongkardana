package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class APWebHistoryItem extends parseFailed<getRequestHeaders, getMin> {
    private final setSupportZoom deepLinkRepository;

    @Inject
    public APWebHistoryItem(appxLoadFailed appxloadfailed, getScheme getscheme, setSupportZoom setsupportzoom) {
        super(appxloadfailed, getscheme);
        this.deepLinkRepository = setsupportzoom;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<getRequestHeaders> buildUseCaseObservable(getMin getmin) {
        return this.deepLinkRepository.getDeepLinkPayload(getmin.fromRoot);
    }

    public static class getMin {
        boolean fromRoot;

        private getMin(boolean z) {
            this.fromRoot = z;
        }

        public static getMin fromRoot(boolean z) {
            return new getMin(z);
        }
    }
}
