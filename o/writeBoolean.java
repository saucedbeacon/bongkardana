package o;

import o.b;

public final class writeBoolean implements getAdapterPosition<readBytes> {
    private final b.C0007b<defaultPlatform> currencyAmountResultMapperProvider;

    public writeBoolean(b.C0007b<defaultPlatform> bVar) {
        this.currencyAmountResultMapperProvider = bVar;
    }

    public final readBytes get() {
        return newInstance(this.currencyAmountResultMapperProvider.get());
    }

    public static writeBoolean create(b.C0007b<defaultPlatform> bVar) {
        return new writeBoolean(bVar);
    }

    public static readBytes newInstance(defaultPlatform defaultplatform) {
        return new readBytes(defaultplatform);
    }
}
