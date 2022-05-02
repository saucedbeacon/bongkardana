package o;

import o.b;

public final class isImage implements getAdapterPosition<checkBitmap> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;

    public isImage(b.C0007b<setDefaultFontSize> bVar) {
        this.featureConfigRepositoryProvider = bVar;
    }

    public final checkBitmap get() {
        return newInstance(this.featureConfigRepositoryProvider.get());
    }

    public static isImage create(b.C0007b<setDefaultFontSize> bVar) {
        return new isImage(bVar);
    }

    public static checkBitmap newInstance(setDefaultFontSize setdefaultfontsize) {
        return new checkBitmap(setdefaultfontsize);
    }
}
