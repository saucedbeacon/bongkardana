package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class cannotInitUC extends getItemAtIndex<String, Void> {
    private final onWebViewDestory globalNetworkRepository;

    @Inject
    public cannotInitUC(appxLoadFailed appxloadfailed, getScheme getscheme, onWebViewDestory onwebviewdestory) {
        super(appxloadfailed, getscheme);
        this.globalNetworkRepository = onwebviewdestory;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<String> buildUseCaseObservable(Void voidR) {
        return this.globalNetworkRepository.getSelectedCountryCode();
    }
}
