package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class OptionMenu extends parseFailed<Long, setMin> {
    private final getCommonResources accountRepository;

    @Inject
    public OptionMenu(appxLoadFailed appxloadfailed, getScheme getscheme, getCommonResources getcommonresources) {
        super(appxloadfailed, getscheme);
        this.accountRepository = getcommonresources;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Long> buildUseCaseObservable(setMin setmin) {
        return this.accountRepository.setLastActiveTimestamp(setmin.activeTimestamp);
    }

    public static class setMin {
        /* access modifiers changed from: private */
        public Long activeTimestamp;

        private setMin(Long l) {
            this.activeTimestamp = l;
        }

        public static setMin forLastActiveTime(Long l) {
            return new setMin(l);
        }
    }
}
