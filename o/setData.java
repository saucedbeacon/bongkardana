package o;

import o.b;

public final class setData implements getAdapterPosition<peekChild> {
    private final b.C0007b<assertOneSet> authEntityDataFactoryProvider;
    private final b.C0007b<getPageId> deepLinkEntityDataFactoryProvider;
    private final b.C0007b<waitOnFinalized> deepLinkPayloadManagerProvider;
    private final b.C0007b<pushChild> deepLinkPayloadMapperProvider;
    private final b.C0007b<getEmbedType> linkApiEntityDataFactoryProvider;
    private final b.C0007b<toUuidString> servicesRepositoryProvider;

    public setData(b.C0007b<getPageId> bVar, b.C0007b<getEmbedType> bVar2, b.C0007b<pushChild> bVar3, b.C0007b<waitOnFinalized> bVar4, b.C0007b<assertOneSet> bVar5, b.C0007b<toUuidString> bVar6) {
        this.deepLinkEntityDataFactoryProvider = bVar;
        this.linkApiEntityDataFactoryProvider = bVar2;
        this.deepLinkPayloadMapperProvider = bVar3;
        this.deepLinkPayloadManagerProvider = bVar4;
        this.authEntityDataFactoryProvider = bVar5;
        this.servicesRepositoryProvider = bVar6;
    }

    public final peekChild get() {
        return newInstance(this.deepLinkEntityDataFactoryProvider.get(), this.linkApiEntityDataFactoryProvider.get(), this.deepLinkPayloadMapperProvider.get(), this.deepLinkPayloadManagerProvider.get(), this.authEntityDataFactoryProvider.get(), this.servicesRepositoryProvider.get());
    }

    public static setData create(b.C0007b<getPageId> bVar, b.C0007b<getEmbedType> bVar2, b.C0007b<pushChild> bVar3, b.C0007b<waitOnFinalized> bVar4, b.C0007b<assertOneSet> bVar5, b.C0007b<toUuidString> bVar6) {
        return new setData(bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }

    public static peekChild newInstance(getPageId getpageid, getEmbedType getembedtype, pushChild pushchild, waitOnFinalized waitonfinalized, assertOneSet assertoneset, toUuidString touuidstring) {
        return new peekChild(getpageid, getembedtype, pushchild, waitonfinalized, assertoneset, touuidstring);
    }
}
