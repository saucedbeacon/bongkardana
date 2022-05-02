package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class debugSwitch extends parseFailed<Long, setMax> {
    private final getCommonResources accountRepository;

    @Inject
    public debugSwitch(appxLoadFailed appxloadfailed, getScheme getscheme, getCommonResources getcommonresources) {
        super(appxloadfailed, getscheme);
        this.accountRepository = getcommonresources;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Long> buildUseCaseObservable(setMax setmax) {
        return this.accountRepository.setPocketLastTimestamp(setmax.lastTimestamp);
    }

    public static class setMax {
        long lastTimestamp;

        public setMax(long j) {
            this.lastTimestamp = j;
        }

        public static setMax forSavePocketLastTimestamp(long j) {
            return new setMax(j);
        }
    }
}
