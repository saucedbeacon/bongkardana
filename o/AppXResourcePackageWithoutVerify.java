package o;

import javax.inject.Inject;
import o.GriverAppXInterceptor;
import o.TitleBarRightButtonView;

public class AppXResourcePackageWithoutVerify extends parseFailed<GriverAMCSLiteAppUpdater, Void> {
    private final GriverAppXInterceptor.AnonymousClass1 promotionRepository;

    @Inject
    public AppXResourcePackageWithoutVerify(appxLoadFailed appxloadfailed, getScheme getscheme, GriverAppXInterceptor.AnonymousClass1 r3) {
        super(appxloadfailed, getscheme);
        this.promotionRepository = r3;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<GriverAMCSLiteAppUpdater> buildUseCaseObservable(Void voidR) {
        return this.promotionRepository.getLeaderboardEntryBanner();
    }
}
