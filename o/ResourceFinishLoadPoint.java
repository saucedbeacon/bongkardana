package o;

import o.b;

public final class ResourceFinishLoadPoint implements getAdapterPosition<PackageQueryPoint> {
    private final b.C0007b<defaultPlatform> currencyAmountResultMapperProvider;

    public ResourceFinishLoadPoint(b.C0007b<defaultPlatform> bVar) {
        this.currencyAmountResultMapperProvider = bVar;
    }

    public final PackageQueryPoint get() {
        return newInstance(this.currencyAmountResultMapperProvider.get());
    }

    public static ResourceFinishLoadPoint create(b.C0007b<defaultPlatform> bVar) {
        return new ResourceFinishLoadPoint(bVar);
    }

    public static PackageQueryPoint newInstance(defaultPlatform defaultplatform) {
        return new PackageQueryPoint(defaultplatform);
    }
}
