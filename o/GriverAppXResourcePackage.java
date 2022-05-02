package o;

import javax.inject.Inject;
import o.GriverAppXInterceptor;
import o.TitleBarRightButtonView;

public class GriverAppXResourcePackage extends parseFailed<Boolean, length> {
    private final GriverAppXInterceptor.AnonymousClass1 promotionRepository;

    @Inject
    public GriverAppXResourcePackage(appxLoadFailed appxloadfailed, getScheme getscheme, GriverAppXInterceptor.AnonymousClass1 r3) {
        super(appxloadfailed, getscheme);
        this.promotionRepository = r3;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(length length2) {
        return this.promotionRepository.readInterstitialPromotionBanner(length2.contentId);
    }

    public static class length {
        /* access modifiers changed from: private */
        public String contentId;

        private length(String str) {
            this.contentId = str;
        }

        public static length forReadInterstitialPromotionBanner(String str) {
            return new length(str);
        }
    }
}
