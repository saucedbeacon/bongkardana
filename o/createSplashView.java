package o;

import android.content.Context;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class createSplashView extends parseFailed<GriverCommonResourceProxy, getMax> {
    private final getCommonResources accountRepository;

    @Inject
    public createSplashView(appxLoadFailed appxloadfailed, getScheme getscheme, getCommonResources getcommonresources) {
        super(appxloadfailed, getscheme);
        this.accountRepository = getcommonresources;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<GriverCommonResourceProxy> buildUseCaseObservable(getMax getmax) {
        return this.accountRepository.getDrutherDataForUpdate(getmax.context);
    }

    public static class getMax {
        /* access modifiers changed from: private */
        public Context context;

        private getMax(Context context2) {
            this.context = context2;
        }

        public static getMax forContext(Context context2) {
            return new getMax(context2);
        }
    }
}
