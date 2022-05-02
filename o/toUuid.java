package o;

import o.b;

public final class toUuid implements getAdapterPosition<toByteArray> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;

    public toUuid(b.C0007b<setDefaultFontSize> bVar) {
        this.featureConfigRepositoryProvider = bVar;
    }

    public final toByteArray get() {
        return newInstance(this.featureConfigRepositoryProvider.get());
    }

    public static toUuid create(b.C0007b<setDefaultFontSize> bVar) {
        return new toUuid(bVar);
    }

    public static toByteArray newInstance(setDefaultFontSize setdefaultfontsize) {
        return new toByteArray(setdefaultfontsize);
    }
}
