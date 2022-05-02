package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class setInitScenario extends parseFailed<Integer, getMax> {
    private final getCommonResources accountRepository;

    @Inject
    public setInitScenario(appxLoadFailed appxloadfailed, getScheme getscheme, getCommonResources getcommonresources) {
        super(appxloadfailed, getscheme);
        this.accountRepository = getcommonresources;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Integer> buildUseCaseObservable(getMax getmax) {
        return this.accountRepository.getPocketNumUpdated(getmax.key);
    }

    public static class getMax {
        /* access modifiers changed from: private */
        public String key;

        public getMax(String str) {
            this.key = str;
        }

        public static getMax forGetPocketNumberBasedOnKey(String str) {
            return new getMax(str);
        }
    }
}
