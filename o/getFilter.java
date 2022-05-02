package o;

import o.b;

public final class getFilter implements getAdapterPosition<getBeacons> {
    private final b.C0007b<getResponseString> socialPrivacyRepositoryProvider;

    public getFilter(b.C0007b<getResponseString> bVar) {
        this.socialPrivacyRepositoryProvider = bVar;
    }

    public final getBeacons get() {
        return newInstance(this.socialPrivacyRepositoryProvider.get());
    }

    public static getFilter create(b.C0007b<getResponseString> bVar) {
        return new getFilter(bVar);
    }

    public static getBeacons newInstance(getResponseString getresponsestring) {
        return new getBeacons(getresponsestring);
    }
}
