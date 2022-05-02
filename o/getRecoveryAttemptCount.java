package o;

import o.b;

public final class getRecoveryAttemptCount implements getAdapterPosition<getDetectedCrashCount> {
    private final b.C0007b<onBatchScanResults> twilioRepositoryProvider;

    public getRecoveryAttemptCount(b.C0007b<onBatchScanResults> bVar) {
        this.twilioRepositoryProvider = bVar;
    }

    public final getDetectedCrashCount get() {
        return newInstance(this.twilioRepositoryProvider.get());
    }

    public static getRecoveryAttemptCount create(b.C0007b<onBatchScanResults> bVar) {
        return new getRecoveryAttemptCount(bVar);
    }

    public static getDetectedCrashCount newInstance(onBatchScanResults onbatchscanresults) {
        return new getDetectedCrashCount(onbatchscanresults);
    }
}
