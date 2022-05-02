package o;

import o.b;

public final class getFontSize implements getAdapterPosition<isValueEqule> {
    private final b.C0007b<toJSONObject> withdrawInitChannelOptionResultMapperProvider;
    private final b.C0007b<DomainUtil> withdrawSavedCardChannelViewResultMapperProvider;

    public getFontSize(b.C0007b<DomainUtil> bVar, b.C0007b<toJSONObject> bVar2) {
        this.withdrawSavedCardChannelViewResultMapperProvider = bVar;
        this.withdrawInitChannelOptionResultMapperProvider = bVar2;
    }

    public final isValueEqule get() {
        return newInstance(this.withdrawSavedCardChannelViewResultMapperProvider.get(), this.withdrawInitChannelOptionResultMapperProvider.get());
    }

    public static getFontSize create(b.C0007b<DomainUtil> bVar, b.C0007b<toJSONObject> bVar2) {
        return new getFontSize(bVar, bVar2);
    }

    public static isValueEqule newInstance(DomainUtil domainUtil, toJSONObject tojsonobject) {
        return new isValueEqule(domainUtil, tojsonobject);
    }
}
