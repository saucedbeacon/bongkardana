package o;

import javax.inject.Inject;
import o.GriverAppXInterceptor;
import o.TitleBarRightButtonView;

public class MainResourcePackageWithoutVerify extends parseFailed<Boolean, setMax> {
    private final GriverAppXInterceptor.AnonymousClass1 promotionRepository;

    @Inject
    public MainResourcePackageWithoutVerify(appxLoadFailed appxloadfailed, getScheme getscheme, GriverAppXInterceptor.AnonymousClass1 r3) {
        super(appxloadfailed, getscheme);
        this.promotionRepository = r3;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(setMax setmax) {
        return this.promotionRepository.saveInterstitialBannerResetTime(setmax.resetTimeInUnix);
    }

    public static class setMax {
        /* access modifiers changed from: private */
        public Long resetTimeInUnix;

        private setMax(Long l) {
            this.resetTimeInUnix = l;
        }

        public static setMax forSaveInterstitialBannerResetTime(Long l) {
            return new setMax(l);
        }
    }
}
