package o;

import java.util.Objects;
import javax.inject.Inject;
import o.H5Event;
import o.TitleBarRightButtonView;

public class syncJsApi extends parseFailed<String, Void> {
    private static final int REFRESH_QR_IN_SECOND = 30;
    private final onWebViewDestory globalNetworkRepository;

    @Inject
    public syncJsApi(appxLoadFailed appxloadfailed, getScheme getscheme, onWebViewDestory onwebviewdestory) {
        super(appxloadfailed, getscheme);
        this.globalNetworkRepository = onwebviewdestory;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<String> buildUseCaseObservable(Void voidR) {
        TitleBarRightButtonView.AnonymousClass1<String> retryWhen = this.globalNetworkRepository.getGnPaymentCode().repeatWhen(H5Event.Error.length).retryWhen(H5ServiceWorkerPushProvider.setMin);
        onWebViewDestory onwebviewdestory = this.globalNetworkRepository;
        Objects.requireNonNull(onwebviewdestory);
        return retryWhen.doOnNext(new onReceiveJsapiResult(onwebviewdestory));
    }
}
