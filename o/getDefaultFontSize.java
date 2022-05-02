package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class getDefaultFontSize extends parseFailed<Boolean, Void> {
    private final setDefaultFontSize featureConfigRepository;

    @Inject
    public getDefaultFontSize(appxLoadFailed appxloadfailed, getScheme getscheme, setDefaultFontSize setdefaultfontsize) {
        super(appxloadfailed, getscheme);
        this.featureConfigRepository = setdefaultfontsize;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(Void voidR) {
        return this.featureConfigRepository.isContactSyncEnable();
    }
}
