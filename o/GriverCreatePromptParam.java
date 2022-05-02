package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class GriverCreatePromptParam extends parseFailed<String, Void> {
    private final getCommonResources accountRepository;

    @Inject
    public GriverCreatePromptParam(appxLoadFailed appxloadfailed, getScheme getscheme, getCommonResources getcommonresources) {
        super(appxloadfailed, getscheme);
        this.accountRepository = getcommonresources;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<String> buildUseCaseObservable(Void voidR) {
        return this.accountRepository.getNickname();
    }
}
