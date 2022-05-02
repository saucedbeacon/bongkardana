package o;

import javax.inject.Inject;
import o.GriverBottomPopupDialog;
import o.TitleBarRightButtonView;
import o.b;

public class MovableFrameLayout extends parseFailed<appxrpc, Void> {
    private final GriverBottomPopupDialog.AnonymousClass1 myReferralConsultRepository;

    public final class Helper implements getAdapterPosition<AnonymousClass1> {
        private final b.C0007b<getScheme> postExecutionThreadProvider;
        private final b.C0007b<GriverSwtich> referralRepositoryProvider;
        private final b.C0007b<appxLoadFailed> threadExecutorProvider;

        public Helper(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverSwtich> bVar3) {
            this.threadExecutorProvider = bVar;
            this.postExecutionThreadProvider = bVar2;
            this.referralRepositoryProvider = bVar3;
        }

        public final AnonymousClass1 get() {
            return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.referralRepositoryProvider.get());
        }

        public static Helper create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverSwtich> bVar3) {
            return new Helper(bVar, bVar2, bVar3);
        }

        public static AnonymousClass1 newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, GriverSwtich griverSwtich) {
            return new parseFailed<result, Void>(appxloadfailed, getscheme, griverSwtich) {
                private final GriverSwtich referralRepository;

                {
                    this.referralRepository = r3;
                }

                /* access modifiers changed from: protected */
                public TitleBarRightButtonView.AnonymousClass1<result> buildUseCaseObservable(Void voidR) {
                    return this.referralRepository.statusConsult();
                }
            };
        }
    }

    @Inject
    public MovableFrameLayout(appxLoadFailed appxloadfailed, getScheme getscheme, GriverBottomPopupDialog.AnonymousClass1 r3) {
        super(appxloadfailed, getscheme);
        this.myReferralConsultRepository = r3;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<appxrpc> buildUseCaseObservable(Void voidR) {
        return this.myReferralConsultRepository.getReferralConsult();
    }
}
