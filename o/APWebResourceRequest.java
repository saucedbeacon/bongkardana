package o;

import android.app.Activity;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class APWebResourceRequest extends parseFailed<getRequestHeaders, setMin> {
    private final setSupportZoom deepLinkRepository;

    @Inject
    public APWebResourceRequest(appxLoadFailed appxloadfailed, getScheme getscheme, setSupportZoom setsupportzoom) {
        super(appxloadfailed, getscheme);
        this.deepLinkRepository = setsupportzoom;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<getRequestHeaders> buildUseCaseObservable(setMin setmin) {
        return this.deepLinkRepository.initSession(setmin.activity);
    }

    public static class setMin {
        /* access modifiers changed from: private */
        public Activity activity;

        private setMin(Activity activity2) {
            this.activity = activity2;
        }

        public static setMin forInitSession(Activity activity2) {
            return new setMin(activity2);
        }
    }
}
