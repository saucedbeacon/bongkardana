package o;

import o.b;

public final class RVKernelUtils implements getAdapterPosition<getClientVersion> {
    private final b.C0007b<getPathAndHash> mockSendMoneyEntityDataProvider;
    private final b.C0007b<isValidUrl> networkSendMoneyEntityDataProvider;

    public RVKernelUtils(b.C0007b<isValidUrl> bVar, b.C0007b<getPathAndHash> bVar2) {
        this.networkSendMoneyEntityDataProvider = bVar;
        this.mockSendMoneyEntityDataProvider = bVar2;
    }

    public final getClientVersion get() {
        return newInstance(this.networkSendMoneyEntityDataProvider.get(), this.mockSendMoneyEntityDataProvider.get());
    }

    public static RVKernelUtils create(b.C0007b<isValidUrl> bVar, b.C0007b<getPathAndHash> bVar2) {
        return new RVKernelUtils(bVar, bVar2);
    }

    public static getClientVersion newInstance(isValidUrl isvalidurl, getPathAndHash getpathandhash) {
        return new getClientVersion(isvalidurl, getpathandhash);
    }
}
