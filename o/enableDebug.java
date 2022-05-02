package o;

import o.b;

public final class enableDebug implements getAdapterPosition<getPdus> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;
    private final b.C0007b<onBatchScanResults> twilioRepositoryProvider;

    public enableDebug(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onBatchScanResults> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.twilioRepositoryProvider = bVar3;
    }

    public final getPdus get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.twilioRepositoryProvider.get());
    }

    public static enableDebug create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onBatchScanResults> bVar3) {
        return new enableDebug(bVar, bVar2, bVar3);
    }

    public static getPdus newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, onBatchScanResults onbatchscanresults) {
        return new getPdus(appxloadfailed, getscheme, onbatchscanresults);
    }
}
