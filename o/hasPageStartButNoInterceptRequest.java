package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class hasPageStartButNoInterceptRequest extends parseFailed<Boolean, setMax> {
    private final onWebViewDestory globalNetworkRepository;

    @Inject
    public hasPageStartButNoInterceptRequest(appxLoadFailed appxloadfailed, getScheme getscheme, onWebViewDestory onwebviewdestory) {
        super(appxloadfailed, getscheme);
        this.globalNetworkRepository = onwebviewdestory;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(setMax setmax) {
        return this.globalNetworkRepository.saveSelectedCountryCode(setmax.countryCode);
    }

    public static class setMax {
        /* access modifiers changed from: private */
        public String countryCode;

        private setMax(String str) {
            this.countryCode = str;
        }

        public static setMax forSaveCountryCode(String str) {
            return new setMax(str);
        }
    }
}
