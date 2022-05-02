package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class AppStatus extends parseFailed<GriverCommonResourceProxy, Void> {
    private getCommonResources accountRepository;

    @Inject
    public AppStatus(appxLoadFailed appxloadfailed, getScheme getscheme, getCommonResources getcommonresources) {
        super(appxloadfailed, getscheme);
        this.accountRepository = getcommonresources;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<GriverCommonResourceProxy> buildUseCaseObservable(Void voidR) {
        return this.accountRepository.getAccount();
    }
}
