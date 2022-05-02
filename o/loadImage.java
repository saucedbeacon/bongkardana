package o;

import o.b;

public final class loadImage implements getAdapterPosition<writeImage> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;

    public loadImage(b.C0007b<setDefaultFontSize> bVar) {
        this.featureConfigRepositoryProvider = bVar;
    }

    public final writeImage get() {
        return newInstance(this.featureConfigRepositoryProvider.get());
    }

    public static loadImage create(b.C0007b<setDefaultFontSize> bVar) {
        return new loadImage(bVar);
    }

    public static writeImage newInstance(setDefaultFontSize setdefaultfontsize) {
        return new writeImage(setdefaultfontsize);
    }
}
