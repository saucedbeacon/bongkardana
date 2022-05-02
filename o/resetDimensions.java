package o;

import o.b;

public final class resetDimensions implements getAdapterPosition<getScreenWidth> {
    private final b.C0007b<defaultPlatform> currencyAmountResultMapperProvider;
    private final b.C0007b<getProductId> payMethodResultMapperProvider;
    private final b.C0007b<getScreenHeight> withdrawMethodOptionsResultMapperProvider;

    public resetDimensions(b.C0007b<defaultPlatform> bVar, b.C0007b<getScreenHeight> bVar2, b.C0007b<getProductId> bVar3) {
        this.currencyAmountResultMapperProvider = bVar;
        this.withdrawMethodOptionsResultMapperProvider = bVar2;
        this.payMethodResultMapperProvider = bVar3;
    }

    public final getScreenWidth get() {
        return newInstance(this.currencyAmountResultMapperProvider.get(), this.withdrawMethodOptionsResultMapperProvider.get(), this.payMethodResultMapperProvider.get());
    }

    public static resetDimensions create(b.C0007b<defaultPlatform> bVar, b.C0007b<getScreenHeight> bVar2, b.C0007b<getProductId> bVar3) {
        return new resetDimensions(bVar, bVar2, bVar3);
    }

    public static getScreenWidth newInstance(defaultPlatform defaultplatform, getScreenHeight getscreenheight, getProductId getproductid) {
        return new getScreenWidth(defaultplatform, getscreenheight, getproductid);
    }
}
