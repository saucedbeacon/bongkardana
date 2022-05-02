package o;

import o.b;

public final class setResStream implements getAdapterPosition<requestData> {
    private final b.C0007b<isAllowNonNet> defaultSavingCategoryEntityDataDataProvider;
    private final b.C0007b<isNeedSignature> networkSavingCategoryEntityDataProvider;

    public setResStream(b.C0007b<isNeedSignature> bVar, b.C0007b<isAllowNonNet> bVar2) {
        this.networkSavingCategoryEntityDataProvider = bVar;
        this.defaultSavingCategoryEntityDataDataProvider = bVar2;
    }

    public final requestData get() {
        return newInstance(this.networkSavingCategoryEntityDataProvider.get(), this.defaultSavingCategoryEntityDataDataProvider.get());
    }

    public static setResStream create(b.C0007b<isNeedSignature> bVar, b.C0007b<isAllowNonNet> bVar2) {
        return new setResStream(bVar, bVar2);
    }

    public static requestData newInstance(isNeedSignature isneedsignature, isAllowNonNet isallownonnet) {
        return new requestData(isneedsignature, isallownonnet);
    }
}
