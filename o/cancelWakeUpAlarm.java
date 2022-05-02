package o;

import java.util.List;
import o.CycledLeScanner;
import o.CycledLeScannerForJellyBeanMr2;
import o.TitleBarRightButtonView;
import o.b;

public final class cancelWakeUpAlarm implements getAdapterPosition<CycledLeScanner.AnonymousClass1> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<setDistinctPacketsDetectedPerScan> syncContactRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public cancelWakeUpAlarm(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setDistinctPacketsDetectedPerScan> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.syncContactRepositoryProvider = bVar3;
    }

    public final CycledLeScanner.AnonymousClass1 get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.syncContactRepositoryProvider.get());
    }

    public static cancelWakeUpAlarm create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setDistinctPacketsDetectedPerScan> bVar3) {
        return new cancelWakeUpAlarm(bVar, bVar2, bVar3);
    }

    public static CycledLeScanner.AnonymousClass1 newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, setDistinctPacketsDetectedPerScan setdistinctpacketsdetectedperscan) {
        return new parseFailed<Boolean, CycledLeScanner.AnonymousClass1.length>(appxloadfailed, getscheme, setdistinctpacketsdetectedperscan) {
            private final setDistinctPacketsDetectedPerScan syncContactRepository;

            {
                this.syncContactRepository = r3;
            }

            /* access modifiers changed from: protected */
            public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(length length2) {
                return this.syncContactRepository.syncContact(length2.phoneNumbers, length2.lastContact);
            }

            /* renamed from: o.CycledLeScanner$1$length */
            public static class length {
                /* access modifiers changed from: private */
                public CycledLeScannerForJellyBeanMr2.AnonymousClass2 lastContact;
                /* access modifiers changed from: private */
                public List<String> phoneNumbers;

                private length(List<String> list, CycledLeScannerForJellyBeanMr2.AnonymousClass2 r2) {
                    this.phoneNumbers = list;
                    this.lastContact = r2;
                }

                public static length forSyncContact(List<String> list, CycledLeScannerForJellyBeanMr2.AnonymousClass2 r2) {
                    return new length(list, r2);
                }
            }
        };
    }
}
