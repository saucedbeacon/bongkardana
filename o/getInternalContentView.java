package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class getInternalContentView extends getItemAtIndex<Boolean, Boolean> {
    private final onWebViewDestory globalNetworkRepository;

    @Inject
    public getInternalContentView(appxLoadFailed appxloadfailed, getScheme getscheme, onWebViewDestory onwebviewdestory) {
        super(appxloadfailed, getscheme);
        this.globalNetworkRepository = onwebviewdestory;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(Boolean bool) {
        return this.globalNetworkRepository.saveGnFirstWelcoming(bool);
    }
}
