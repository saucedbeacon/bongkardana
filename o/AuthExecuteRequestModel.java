package o;

import o.b;

public final class AuthExecuteRequestModel implements getAdapterPosition<getLink> {
    private final b.C0007b<getCurrentLongitudeAndLatitude> socialPreferencesProvider;

    public AuthExecuteRequestModel(b.C0007b<getCurrentLongitudeAndLatitude> bVar) {
        this.socialPreferencesProvider = bVar;
    }

    public final getLink get() {
        return newInstance(this.socialPreferencesProvider.get());
    }

    public static AuthExecuteRequestModel create(b.C0007b<getCurrentLongitudeAndLatitude> bVar) {
        return new AuthExecuteRequestModel(bVar);
    }

    public static getLink newInstance(getCurrentLongitudeAndLatitude getcurrentlongitudeandlatitude) {
        return new getLink(getcurrentlongitudeandlatitude);
    }
}
