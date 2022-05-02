package o;

import o.GriverBottomPopupDialog;
import o.b;

public final class GriverCheckBox implements getAdapterPosition<GriverBottomPopupDialog> {
    private final b.C0007b<GriverBottomPopupDialog.AnonymousClass1> myReferralConsultRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public GriverCheckBox(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverBottomPopupDialog.AnonymousClass1> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.myReferralConsultRepositoryProvider = bVar3;
    }

    public final GriverBottomPopupDialog get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.myReferralConsultRepositoryProvider.get());
    }

    public static GriverCheckBox create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverBottomPopupDialog.AnonymousClass1> bVar3) {
        return new GriverCheckBox(bVar, bVar2, bVar3);
    }

    public static GriverBottomPopupDialog newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, GriverBottomPopupDialog.AnonymousClass1 r3) {
        return new GriverBottomPopupDialog(appxloadfailed, getscheme, r3);
    }
}
