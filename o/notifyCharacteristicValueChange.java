package o;

import o.b;

public final class notifyCharacteristicValueChange implements getAdapterPosition<BetterBleServiceImpl> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;
    private final b.C0007b<disconnectBluetoothDevice> versionRepositoryProvider;

    public notifyCharacteristicValueChange(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<disconnectBluetoothDevice> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.versionRepositoryProvider = bVar3;
    }

    public final BetterBleServiceImpl get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.versionRepositoryProvider.get());
    }

    public static notifyCharacteristicValueChange create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<disconnectBluetoothDevice> bVar3) {
        return new notifyCharacteristicValueChange(bVar, bVar2, bVar3);
    }

    public static BetterBleServiceImpl newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, disconnectBluetoothDevice disconnectbluetoothdevice) {
        return new BetterBleServiceImpl(appxloadfailed, getscheme, disconnectbluetoothdevice);
    }
}
