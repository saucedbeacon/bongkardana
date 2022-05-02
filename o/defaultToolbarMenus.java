package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class defaultToolbarMenus extends parseFailed<Boolean, getMin> {
    private final getCommonResources accountRepository;

    @Inject
    public defaultToolbarMenus(appxLoadFailed appxloadfailed, getScheme getscheme, getCommonResources getcommonresources) {
        super(appxloadfailed, getscheme);
        this.accountRepository = getcommonresources;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(getMin getmin) {
        return this.accountRepository.saveAccount(getmin.accountEntity);
    }

    public static class getMin {
        /* access modifiers changed from: private */
        public GriverCommonResourceProxy accountEntity;

        private getMin(GriverCommonResourceProxy griverCommonResourceProxy) {
            this.accountEntity = griverCommonResourceProxy;
        }

        public static getMin forAccount(GriverCommonResourceProxy griverCommonResourceProxy) {
            return new getMin(griverCommonResourceProxy);
        }
    }
}
