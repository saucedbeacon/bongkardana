package o;

import o.b;

public final class getBizType implements getAdapterPosition<getChannelId> {
    private final b.C0007b<releaseBuffer> referralConfigEntityDataFactoryProvider;
    private final b.C0007b<setBizType> referralConfigEntityMapperProvider;

    public getBizType(b.C0007b<releaseBuffer> bVar, b.C0007b<setBizType> bVar2) {
        this.referralConfigEntityDataFactoryProvider = bVar;
        this.referralConfigEntityMapperProvider = bVar2;
    }

    public final getChannelId get() {
        return newInstance(this.referralConfigEntityDataFactoryProvider.get(), this.referralConfigEntityMapperProvider.get());
    }

    public static getBizType create(b.C0007b<releaseBuffer> bVar, b.C0007b<setBizType> bVar2) {
        return new getBizType(bVar, bVar2);
    }

    public static getChannelId newInstance(releaseBuffer releasebuffer, setBizType setbiztype) {
        return new getChannelId(releasebuffer, setbiztype);
    }
}
