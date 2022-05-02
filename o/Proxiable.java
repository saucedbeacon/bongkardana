package o;

import o.b;

public final class Proxiable implements getAdapterPosition<setLazyInitializer> {
    private final b.C0007b<isKeyJsApi> referralPreferencesProvider;

    public Proxiable(b.C0007b<isKeyJsApi> bVar) {
        this.referralPreferencesProvider = bVar;
    }

    public final setLazyInitializer get() {
        return newInstance(this.referralPreferencesProvider.get());
    }

    public static Proxiable create(b.C0007b<isKeyJsApi> bVar) {
        return new Proxiable(bVar);
    }

    public static setLazyInitializer newInstance(isKeyJsApi iskeyjsapi) {
        return new setLazyInitializer(iskeyjsapi);
    }
}
