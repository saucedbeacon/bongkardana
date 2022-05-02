package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class canGoBackOrForward extends parseFailed<onTooManyRedirects, Void> {
    private setDefaultFontSize featureConfigRepository;

    @Inject
    public canGoBackOrForward(appxLoadFailed appxloadfailed, getScheme getscheme, setDefaultFontSize setdefaultfontsize) {
        super(appxloadfailed, getscheme);
        this.featureConfigRepository = setdefaultfontsize;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<onTooManyRedirects> buildUseCaseObservable(Void voidR) {
        return this.featureConfigRepository.getSplitBillConfig();
    }
}
