package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class GVSplashView extends parseFailed<Boolean, Void> {
    private final getCommonResources accountRepository;

    @Inject
    public GVSplashView(appxLoadFailed appxloadfailed, getScheme getscheme, getCommonResources getcommonresources) {
        super(appxloadfailed, getscheme);
        this.accountRepository = getcommonresources;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(Void voidR) {
        return this.accountRepository.finishFirstTime();
    }
}
