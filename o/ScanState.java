package o;

import o.b;

public final class ScanState implements getAdapterPosition<applySettingsToScheduledJob> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<getScanJobRuntimeMillis> splitBillRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public ScanState(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getScanJobRuntimeMillis> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.splitBillRepositoryProvider = bVar3;
    }

    public final applySettingsToScheduledJob get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.splitBillRepositoryProvider.get());
    }

    public static ScanState create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getScanJobRuntimeMillis> bVar3) {
        return new ScanState(bVar, bVar2, bVar3);
    }

    public static applySettingsToScheduledJob newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, getScanJobRuntimeMillis getscanjobruntimemillis) {
        return new applySettingsToScheduledJob(appxloadfailed, getscheme, getscanjobruntimemillis);
    }
}
