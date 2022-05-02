package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class clearCache extends parseFailed<Boolean, Void> {
    private final getCursiveFontFamily appGeneralRepository;

    @Inject
    public clearCache(appxLoadFailed appxloadfailed, getScheme getscheme, getCursiveFontFamily getcursivefontfamily) {
        super(appxloadfailed, getscheme);
        this.appGeneralRepository = getcursivefontfamily;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(Void voidR) {
        return this.appGeneralRepository.isAppFirstLaunch();
    }
}
