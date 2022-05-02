package o;

import javax.inject.Inject;
import o.GriverAppXInterceptor;
import o.TitleBarRightButtonView;

public class isVerifFailed extends parseFailed<Boolean, getMin> {
    private final GriverAppXInterceptor.AnonymousClass1 promotionRepository;

    @Inject
    public isVerifFailed(appxLoadFailed appxloadfailed, getScheme getscheme, GriverAppXInterceptor.AnonymousClass1 r3) {
        super(appxloadfailed, getscheme);
        this.promotionRepository = r3;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(getMin getmin) {
        return this.promotionRepository.saveInterstitialBannerGapTime(Long.valueOf(getmin.gapTimeInUnix));
    }

    public static class getMin {
        /* access modifiers changed from: private */
        public long gapTimeInUnix;

        private getMin(long j) {
            this.gapTimeInUnix = j;
        }

        public static getMin forSaveInterstitialBannerGapTime(long j) {
            return new getMin(j);
        }
    }
}
