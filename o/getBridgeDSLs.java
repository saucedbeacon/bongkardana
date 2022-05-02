package o;

import o.b;

public final class getBridgeDSLs implements getAdapterPosition<getEmbedViews> {
    private final b.C0007b<CreatePageCallback> networkPayAssetEntityDataProvider;

    public getBridgeDSLs(b.C0007b<CreatePageCallback> bVar) {
        this.networkPayAssetEntityDataProvider = bVar;
    }

    public final getEmbedViews get() {
        return newInstance(this.networkPayAssetEntityDataProvider.get());
    }

    public static getBridgeDSLs create(b.C0007b<CreatePageCallback> bVar) {
        return new getBridgeDSLs(bVar);
    }

    public static getEmbedViews newInstance(CreatePageCallback createPageCallback) {
        return new getEmbedViews(createPageCallback);
    }
}
