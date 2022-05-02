package o;

import o.b;

public final class isRecoveryInProgress implements getAdapterPosition<crashDetected> {
    private final b.C0007b<onBatchScanResults> twilioRepositoryProvider;

    public isRecoveryInProgress(b.C0007b<onBatchScanResults> bVar) {
        this.twilioRepositoryProvider = bVar;
    }

    public final crashDetected get() {
        return newInstance(this.twilioRepositoryProvider.get());
    }

    public static isRecoveryInProgress create(b.C0007b<onBatchScanResults> bVar) {
        return new isRecoveryInProgress(bVar);
    }

    public static crashDetected newInstance(onBatchScanResults onbatchscanresults) {
        return new crashDetected(onbatchscanresults);
    }
}
