package o;

import o.CycledLeScanner;
import o.TitleBarRightButtonView;
import o.b;

public final class CycledLeScannerForAndroidO implements getAdapterPosition<CycledLeScanner.AnonymousClass2> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<setDistinctPacketsDetectedPerScan> syncContactRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public CycledLeScannerForAndroidO(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setDistinctPacketsDetectedPerScan> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.syncContactRepositoryProvider = bVar3;
    }

    public final CycledLeScanner.AnonymousClass2 get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.syncContactRepositoryProvider.get());
    }

    public static CycledLeScannerForAndroidO create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setDistinctPacketsDetectedPerScan> bVar3) {
        return new CycledLeScannerForAndroidO(bVar, bVar2, bVar3);
    }

    public static CycledLeScanner.AnonymousClass2 newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, setDistinctPacketsDetectedPerScan setdistinctpacketsdetectedperscan) {
        return new parseFailed<Boolean, Void>(appxloadfailed, getscheme, setdistinctpacketsdetectedperscan) {
            private final setDistinctPacketsDetectedPerScan syncContactRepository;

            {
                this.syncContactRepository = r3;
            }

            /* access modifiers changed from: protected */
            public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(Void voidR) {
                return this.syncContactRepository.saveSyncProcessStatusComplete();
            }
        };
    }
}
