package o;

import o.ScanFilterUtils;
import o.b;

public final class StaticBeaconSimulator implements getAdapterPosition<ScanFilterUtils.ScanFilterData> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;
    private final b.C0007b<clearDetections> twilioDialogRepositoryProvider;

    public StaticBeaconSimulator(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<clearDetections> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.twilioDialogRepositoryProvider = bVar3;
    }

    public final ScanFilterUtils.ScanFilterData get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.twilioDialogRepositoryProvider.get());
    }

    public static StaticBeaconSimulator create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<clearDetections> bVar3) {
        return new StaticBeaconSimulator(bVar, bVar2, bVar3);
    }

    public static ScanFilterUtils.ScanFilterData newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, clearDetections cleardetections) {
        return new ScanFilterUtils.ScanFilterData(appxloadfailed, getscheme, cleardetections);
    }
}
