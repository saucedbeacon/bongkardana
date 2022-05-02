package o;

import o.b;

public final class getAppExternalStoragePath implements getAdapterPosition<getProductId> {
    private final b.C0007b<defaultPlatform> currencyAmountResultMapperProvider;
    private final b.C0007b<RVExtensionService> payMethodViewResultMapperProvider;

    public getAppExternalStoragePath(b.C0007b<defaultPlatform> bVar, b.C0007b<RVExtensionService> bVar2) {
        this.currencyAmountResultMapperProvider = bVar;
        this.payMethodViewResultMapperProvider = bVar2;
    }

    public final getProductId get() {
        return newInstance(this.currencyAmountResultMapperProvider.get(), this.payMethodViewResultMapperProvider.get());
    }

    public static getAppExternalStoragePath create(b.C0007b<defaultPlatform> bVar, b.C0007b<RVExtensionService> bVar2) {
        return new getAppExternalStoragePath(bVar, bVar2);
    }

    public static getProductId newInstance(defaultPlatform defaultplatform, RVExtensionService rVExtensionService) {
        return new getProductId(defaultplatform, rVExtensionService);
    }
}
