package o;

import o.b;

public final class isSwitchUserLoginRpc implements getAdapterPosition<isBgRpc> {
    private final b.C0007b<isRpcLoggerLevel> defaultSavingWithdrawEntityDataProvider;
    private final b.C0007b<gwUrl> networkSavingWithdrawEntityDataProvider;

    public isSwitchUserLoginRpc(b.C0007b<gwUrl> bVar, b.C0007b<isRpcLoggerLevel> bVar2) {
        this.networkSavingWithdrawEntityDataProvider = bVar;
        this.defaultSavingWithdrawEntityDataProvider = bVar2;
    }

    public final isBgRpc get() {
        return newInstance(this.networkSavingWithdrawEntityDataProvider.get(), this.defaultSavingWithdrawEntityDataProvider.get());
    }

    public static isSwitchUserLoginRpc create(b.C0007b<gwUrl> bVar, b.C0007b<isRpcLoggerLevel> bVar2) {
        return new isSwitchUserLoginRpc(bVar, bVar2);
    }

    public static isBgRpc newInstance(gwUrl gwurl, isRpcLoggerLevel isrpcloggerlevel) {
        return new isBgRpc(gwurl, isrpcloggerlevel);
    }
}
