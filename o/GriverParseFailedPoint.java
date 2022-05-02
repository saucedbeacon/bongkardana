package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class GriverParseFailedPoint extends parseFailed<Boolean, Void> {
    private final getCommonResources accountRepository;

    @Inject
    public GriverParseFailedPoint(appxLoadFailed appxloadfailed, getScheme getscheme, getCommonResources getcommonresources) {
        super(appxloadfailed, getscheme);
        this.accountRepository = getcommonresources;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(Void voidR) {
        return this.accountRepository.isOverActiveTimestamp();
    }
}
