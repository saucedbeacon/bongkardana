package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class releaseView extends getItemAtIndex<String, setMax> {
    private final onWebViewDestory globalNetworkRepository;

    @Inject
    releaseView(appxLoadFailed appxloadfailed, getScheme getscheme, onWebViewDestory onwebviewdestory) {
        super(appxloadfailed, getscheme);
        this.globalNetworkRepository = onwebviewdestory;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<String> buildUseCaseObservable(setMax setmax) {
        return this.globalNetworkRepository.isGlobalNetworkEnabled().flatMap(new getEmbedViewWrapperById(this, setmax));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$buildUseCaseObservable$0(setMax setmax, Boolean bool) throws Exception {
        if (Boolean.TRUE.equals(bool)) {
            return getCountryCodeByLocation(setmax.apiKey);
        }
        return TitleBarRightButtonView.AnonymousClass1.just("");
    }

    private TitleBarRightButtonView.AnonymousClass1<String> getCountryCodeByLocation(String str) {
        return this.globalNetworkRepository.getCountryCodeByLocation(str);
    }

    public static class setMax {
        /* access modifiers changed from: private */
        public final String apiKey;

        private setMax(String str) {
            this.apiKey = str;
        }

        public static setMax forApiKeyAndTracker(String str) {
            return new setMax(str);
        }
    }
}
