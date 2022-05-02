package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class APJsResult extends parseFailed<String, Void> {
    private final confirm cardRepository;

    @Inject
    public APJsResult(appxLoadFailed appxloadfailed, getScheme getscheme, confirm confirm) {
        super(appxloadfailed, getscheme);
        this.cardRepository = confirm;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<String> buildUseCaseObservable(Void voidR) {
        return this.cardRepository.getDefaultCard();
    }
}
