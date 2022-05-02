package o;

import o.b;

public final class isAllowBgLogin implements getAdapterPosition<getRequestHeader> {
    private final b.C0007b<isShortLinkOnly> mockSavingEntityDataProvider;
    private final b.C0007b<getBizLog> networkSavingEntityDataProvider;

    public isAllowBgLogin(b.C0007b<getBizLog> bVar, b.C0007b<isShortLinkOnly> bVar2) {
        this.networkSavingEntityDataProvider = bVar;
        this.mockSavingEntityDataProvider = bVar2;
    }

    public final getRequestHeader get() {
        return newInstance(this.networkSavingEntityDataProvider.get(), this.mockSavingEntityDataProvider.get());
    }

    public static isAllowBgLogin create(b.C0007b<getBizLog> bVar, b.C0007b<isShortLinkOnly> bVar2) {
        return new isAllowBgLogin(bVar, bVar2);
    }

    public static getRequestHeader newInstance(getBizLog getbizlog, isShortLinkOnly isshortlinkonly) {
        return new getRequestHeader(getbizlog, isshortlinkonly);
    }
}
