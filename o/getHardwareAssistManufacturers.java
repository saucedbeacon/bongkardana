package o;

import o.BeaconManager;
import o.b;

public final class getHardwareAssistManufacturers implements getAdapterPosition<BeaconManager.BeaconServiceConnection> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<fromInt> sendMoneyRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getHardwareAssistManufacturers(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<fromInt> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.sendMoneyRepositoryProvider = bVar3;
    }

    public final BeaconManager.BeaconServiceConnection get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.sendMoneyRepositoryProvider.get());
    }

    public static getHardwareAssistManufacturers create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<fromInt> bVar3) {
        return new getHardwareAssistManufacturers(bVar, bVar2, bVar3);
    }

    public static BeaconManager.BeaconServiceConnection newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, fromInt fromint) {
        return new BeaconManager.BeaconServiceConnection(appxloadfailed, getscheme, fromint);
    }
}
