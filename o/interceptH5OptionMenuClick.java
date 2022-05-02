package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class interceptH5OptionMenuClick extends parseFailed<Boolean, getMax> {
    private final getCommonResources accountRepository;

    @Inject
    public interceptH5OptionMenuClick(appxLoadFailed appxloadfailed, getScheme getscheme, getCommonResources getcommonresources) {
        super(appxloadfailed, getscheme);
        this.accountRepository = getcommonresources;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(getMax getmax) {
        return this.accountRepository.setBalanceVisibility(Boolean.valueOf(getmax.newState));
    }

    public static class getMax {
        /* access modifiers changed from: private */
        public boolean newState;

        private getMax(boolean z) {
            this.newState = z;
        }

        public static getMax forBalanceVisibility(boolean z) {
            return new getMax(z);
        }
    }
}
