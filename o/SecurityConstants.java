package o;

import o.b;

public final class SecurityConstants implements getAdapterPosition<AMCSConstants> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;

    public SecurityConstants(b.C0007b<setDefaultFontSize> bVar) {
        this.featureConfigRepositoryProvider = bVar;
    }

    public final AMCSConstants get() {
        return newInstance(this.featureConfigRepositoryProvider.get());
    }

    public static SecurityConstants create(b.C0007b<setDefaultFontSize> bVar) {
        return new SecurityConstants(bVar);
    }

    public static AMCSConstants newInstance(setDefaultFontSize setdefaultfontsize) {
        return new AMCSConstants(setdefaultfontsize);
    }
}
