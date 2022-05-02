package o;

import o.b;

public final class IPCRetryHandler implements getAdapterPosition<IPCException> {
    private final b.C0007b<IPCResultDesc> amcsServicesEntityDataProvider;
    private final b.C0007b<LocalCallManager> defaultServicesEntityDataProvider;
    private final b.C0007b<isNoPermissionConfigAndAllow> splitServicesEntityDataProvider;

    public IPCRetryHandler(b.C0007b<IPCResultDesc> bVar, b.C0007b<isNoPermissionConfigAndAllow> bVar2, b.C0007b<LocalCallManager> bVar3) {
        this.amcsServicesEntityDataProvider = bVar;
        this.splitServicesEntityDataProvider = bVar2;
        this.defaultServicesEntityDataProvider = bVar3;
    }

    public final IPCException get() {
        return newInstance(this.amcsServicesEntityDataProvider.get(), this.splitServicesEntityDataProvider.get(), this.defaultServicesEntityDataProvider.get());
    }

    public static IPCRetryHandler create(b.C0007b<IPCResultDesc> bVar, b.C0007b<isNoPermissionConfigAndAllow> bVar2, b.C0007b<LocalCallManager> bVar3) {
        return new IPCRetryHandler(bVar, bVar2, bVar3);
    }

    public static IPCException newInstance(IPCResultDesc iPCResultDesc, isNoPermissionConfigAndAllow isnopermissionconfigandallow, LocalCallManager localCallManager) {
        return new IPCException(iPCResultDesc, isnopermissionconfigandallow, localCallManager);
    }
}
