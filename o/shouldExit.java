package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class shouldExit extends getItemAtIndex<Boolean, Void> {
    private final onWebViewDestory globalNetworkRepository;

    @Inject
    public shouldExit(appxLoadFailed appxloadfailed, getScheme getscheme, onWebViewDestory onwebviewdestory) {
        super(appxloadfailed, getscheme);
        this.globalNetworkRepository = onwebviewdestory;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(Void voidR) {
        return this.globalNetworkRepository.getGnPayQrTooltip();
    }
}
