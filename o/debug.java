package o;

import o.b;

public final class debug implements getAdapterPosition<isReceivedRemoteReady> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<SinglePageAppContext> paymentAuthenticationDataFactoryProvider;
    private final b.C0007b<onError> settingsEntityDataFactoryProvider;
    private final b.C0007b<setStartParams> settingsMapperProvider;
    private final b.C0007b<getBluetoothState> verifyTokenRepositoryProvider;

    public debug(b.C0007b<onError> bVar, b.C0007b<SinglePageAppContext> bVar2, b.C0007b<DialogLayout> bVar3, b.C0007b<getBluetoothState> bVar4, b.C0007b<setStartParams> bVar5) {
        this.settingsEntityDataFactoryProvider = bVar;
        this.paymentAuthenticationDataFactoryProvider = bVar2;
        this.accountEntityDataFactoryProvider = bVar3;
        this.verifyTokenRepositoryProvider = bVar4;
        this.settingsMapperProvider = bVar5;
    }

    public final isReceivedRemoteReady get() {
        return newInstance(this.settingsEntityDataFactoryProvider.get(), this.paymentAuthenticationDataFactoryProvider.get(), this.accountEntityDataFactoryProvider.get(), this.verifyTokenRepositoryProvider.get(), this.settingsMapperProvider.get());
    }

    public static debug create(b.C0007b<onError> bVar, b.C0007b<SinglePageAppContext> bVar2, b.C0007b<DialogLayout> bVar3, b.C0007b<getBluetoothState> bVar4, b.C0007b<setStartParams> bVar5) {
        return new debug(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public static isReceivedRemoteReady newInstance(onError onerror, SinglePageAppContext singlePageAppContext, DialogLayout dialogLayout, getBluetoothState getbluetoothstate, setStartParams setstartparams) {
        return new isReceivedRemoteReady(onerror, singlePageAppContext, dialogLayout, getbluetoothstate, setstartparams);
    }
}
