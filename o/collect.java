package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class collect extends parseFailed<Boolean, Void> {
    private final applyChanges sslPinningRepository;

    @Inject
    public collect(appxLoadFailed appxloadfailed, getScheme getscheme, applyChanges applychanges) {
        super(appxloadfailed, getscheme);
        this.sslPinningRepository = applychanges;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(Void voidR) {
        return this.sslPinningRepository.pinHotUpdate();
    }
}
