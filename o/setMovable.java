package o;

import o.GriverBottomPopupDialog;
import o.b;

public final class setMovable implements getAdapterPosition<setFullScreen> {
    private final b.C0007b<setDefaultFontSize> configRepositoryProvider;
    private final b.C0007b<GriverBottomPopupDialog.AnonymousClass1> myReferralConsultRepositoryProvider;
    private final b.C0007b<GriverSwtich> referralRepositoryProvider;

    public setMovable(b.C0007b<GriverSwtich> bVar, b.C0007b<setDefaultFontSize> bVar2, b.C0007b<GriverBottomPopupDialog.AnonymousClass1> bVar3) {
        this.referralRepositoryProvider = bVar;
        this.configRepositoryProvider = bVar2;
        this.myReferralConsultRepositoryProvider = bVar3;
    }

    public final setFullScreen get() {
        return newInstance(this.referralRepositoryProvider.get(), this.configRepositoryProvider.get(), this.myReferralConsultRepositoryProvider.get());
    }

    public static setMovable create(b.C0007b<GriverSwtich> bVar, b.C0007b<setDefaultFontSize> bVar2, b.C0007b<GriverBottomPopupDialog.AnonymousClass1> bVar3) {
        return new setMovable(bVar, bVar2, bVar3);
    }

    public static setFullScreen newInstance(GriverSwtich griverSwtich, setDefaultFontSize setdefaultfontsize, GriverBottomPopupDialog.AnonymousClass1 r3) {
        return new setFullScreen(griverSwtich, setdefaultfontsize, r3);
    }
}
