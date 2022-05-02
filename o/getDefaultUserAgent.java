package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class getDefaultUserAgent extends parseFailed<Boolean, Void> {
    private setDefaultFontSize featureConfigRepository;

    @Inject
    public getDefaultUserAgent(appxLoadFailed appxloadfailed, getScheme getscheme, setDefaultFontSize setdefaultfontsize) {
        super(appxloadfailed, getscheme);
        this.featureConfigRepository = setdefaultfontsize;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(Void voidR) {
        return this.featureConfigRepository.isSendMoneyPeerToCashEnable();
    }
}
