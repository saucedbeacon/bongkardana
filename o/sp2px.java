package o;

import o.b;

public final class sp2px implements getAdapterPosition<getScreenHeight> {
    private final b.C0007b<DimensionUtil> withdrawChannelViewResultMapperProvider;
    private final b.C0007b<DomainUtil> withdrawSavedCardChannelViewResultMapperProvider;

    public sp2px(b.C0007b<DimensionUtil> bVar, b.C0007b<DomainUtil> bVar2) {
        this.withdrawChannelViewResultMapperProvider = bVar;
        this.withdrawSavedCardChannelViewResultMapperProvider = bVar2;
    }

    public final getScreenHeight get() {
        return newInstance(this.withdrawChannelViewResultMapperProvider.get(), this.withdrawSavedCardChannelViewResultMapperProvider.get());
    }

    public static sp2px create(b.C0007b<DimensionUtil> bVar, b.C0007b<DomainUtil> bVar2) {
        return new sp2px(bVar, bVar2);
    }

    public static getScreenHeight newInstance(DimensionUtil dimensionUtil, DomainUtil domainUtil) {
        return new getScreenHeight(dimensionUtil, domainUtil);
    }
}
