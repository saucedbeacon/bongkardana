package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class setDefaultFixedFontSize extends parseFailed<setWebChromeClient, Void> {
    private final setDefaultFontSize featureConfigRepository;

    @Inject
    public setDefaultFixedFontSize(appxLoadFailed appxloadfailed, getScheme getscheme, setDefaultFontSize setdefaultfontsize) {
        super(appxloadfailed, getscheme);
        this.featureConfigRepository = setdefaultfontsize;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<setWebChromeClient> buildUseCaseObservable(Void voidR) {
        return TitleBarRightButtonView.AnonymousClass1.zip(this.featureConfigRepository.checkDexguardRootCheckFeature(), this.featureConfigRepository.checkDexguardHookCheckFeature(), this.featureConfigRepository.checkDexguardTamperCheckFeature(), new getDefaultFixedFontSize(this));
    }

    /* access modifiers changed from: private */
    public setWebChromeClient zipDexguardConfig(boolean z, boolean z2, boolean z3) {
        return new setWebChromeClient(z, z2, z3);
    }
}
