package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class NXH5WebViewClientAdapter extends getItemAtIndex<Boolean, Boolean> {
    private final onWebViewDestory globalNetworkRepository;

    @Inject
    public NXH5WebViewClientAdapter(appxLoadFailed appxloadfailed, getScheme getscheme, onWebViewDestory onwebviewdestory) {
        super(appxloadfailed, getscheme);
        this.globalNetworkRepository = onwebviewdestory;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(Boolean bool) {
        return this.globalNetworkRepository.saveGnPayQrTooltip(bool);
    }
}
