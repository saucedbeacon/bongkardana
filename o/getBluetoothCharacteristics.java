package o;

import o.b;

public final class getBluetoothCharacteristics implements getAdapterPosition<getBluetoothServices> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;
    private final b.C0007b<onDescriptorWrite> userRepositoryProvider;

    public getBluetoothCharacteristics(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onDescriptorWrite> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.userRepositoryProvider = bVar3;
    }

    public final getBluetoothServices get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.userRepositoryProvider.get());
    }

    public static getBluetoothCharacteristics create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onDescriptorWrite> bVar3) {
        return new getBluetoothCharacteristics(bVar, bVar2, bVar3);
    }

    public static getBluetoothServices newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, onDescriptorWrite ondescriptorwrite) {
        return new getBluetoothServices(appxloadfailed, getscheme, ondescriptorwrite);
    }
}
