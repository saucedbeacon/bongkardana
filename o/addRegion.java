package o;

import o.b;

public final class addRegion implements getAdapterPosition<MonitoringStatus> {
    private final b.C0007b<getResponseString> socialPrivacyRepositoryProvider;

    public addRegion(b.C0007b<getResponseString> bVar) {
        this.socialPrivacyRepositoryProvider = bVar;
    }

    public final MonitoringStatus get() {
        return newInstance(this.socialPrivacyRepositoryProvider.get());
    }

    public static addRegion create(b.C0007b<getResponseString> bVar) {
        return new addRegion(bVar);
    }

    public static MonitoringStatus newInstance(getResponseString getresponsestring) {
        return new MonitoringStatus(getresponsestring);
    }
}
