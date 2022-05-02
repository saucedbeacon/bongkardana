package o;

import java.util.List;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class H5ServiceWorkerControllerProvider extends parseFailed<List<String>, Void> {
    private final onWebViewDestory globalNetworkRepository;

    @Inject
    H5ServiceWorkerControllerProvider(appxLoadFailed appxloadfailed, getScheme getscheme, onWebViewDestory onwebviewdestory) {
        super(appxloadfailed, getscheme);
        this.globalNetworkRepository = onwebviewdestory;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<List<String>> buildUseCaseObservable(Void voidR) {
        return this.globalNetworkRepository.getGnCountriesWhitelist();
    }
}
