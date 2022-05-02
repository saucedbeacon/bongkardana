package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class logFolderTree extends parseFailed<Long, Void> {
    private final getCommonResources accountRepository;

    @Inject
    public logFolderTree(appxLoadFailed appxloadfailed, getScheme getscheme, getCommonResources getcommonresources) {
        super(appxloadfailed, getscheme);
        this.accountRepository = getcommonresources;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Long> buildUseCaseObservable(Void voidR) {
        return this.accountRepository.getPocketLastTimestamp();
    }
}
