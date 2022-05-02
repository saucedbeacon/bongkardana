package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class getDefaultTextEncodingName extends parseFailed<Boolean, Void> {
    private final setDefaultFontSize featureConfigRepository;

    @Inject
    public getDefaultTextEncodingName(appxLoadFailed appxloadfailed, getScheme getscheme, setDefaultFontSize setdefaultfontsize) {
        super(appxloadfailed, getscheme);
        this.featureConfigRepository = setdefaultfontsize;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(Void voidR) {
        return this.featureConfigRepository.isPushNotifDiagnosticEnable();
    }
}
