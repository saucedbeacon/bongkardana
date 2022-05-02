package o;

import o.GriverBottomPopupDialog;
import o.b;

public final class WalletAPIUtils implements getAdapterPosition<executeGetAuthCode> {
    private final b.C0007b<GriverBottomPopupDialog.AnonymousClass1> myReferralConsultRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public WalletAPIUtils(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverBottomPopupDialog.AnonymousClass1> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.myReferralConsultRepositoryProvider = bVar3;
    }

    public final executeGetAuthCode get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.myReferralConsultRepositoryProvider.get());
    }

    public static WalletAPIUtils create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverBottomPopupDialog.AnonymousClass1> bVar3) {
        return new WalletAPIUtils(bVar, bVar2, bVar3);
    }

    public static executeGetAuthCode newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, GriverBottomPopupDialog.AnonymousClass1 r3) {
        return new executeGetAuthCode(appxloadfailed, getscheme, r3);
    }
}
