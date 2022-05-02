package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class isInnerApp extends parseFailed<Boolean, Void> {
    private final onWebViewDestory globalNetworkRepository;
    private final GriverLogger loginRepository;

    @Inject
    public isInnerApp(appxLoadFailed appxloadfailed, getScheme getscheme, GriverLogger griverLogger, onWebViewDestory onwebviewdestory) {
        super(appxloadfailed, getscheme);
        this.loginRepository = griverLogger;
        this.globalNetworkRepository = onwebviewdestory;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(Void voidR) {
        return this.globalNetworkRepository.clearGlobalNetwork().flatMap(new setDiagnoseEnable(this));
    }

    /* access modifiers changed from: private */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> doForceLogout(boolean z) {
        return z ? this.loginRepository.forceLogout() : TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
    }
}
