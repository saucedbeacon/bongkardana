package o;

import o.b;

public final class notifyScannedDevice implements getAdapterPosition<disableDebug> {
    private final b.C0007b<onBatchScanResults> twilioRepositoryProvider;

    public notifyScannedDevice(b.C0007b<onBatchScanResults> bVar) {
        this.twilioRepositoryProvider = bVar;
    }

    public final disableDebug get() {
        return newInstance(this.twilioRepositoryProvider.get());
    }

    public static notifyScannedDevice create(b.C0007b<onBatchScanResults> bVar) {
        return new notifyScannedDevice(bVar);
    }

    public static disableDebug newInstance(onBatchScanResults onbatchscanresults) {
        return new disableDebug(onbatchscanresults);
    }
}
