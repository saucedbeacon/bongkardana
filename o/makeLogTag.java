package o;

import o.RVLogger;
import o.b;

public final class makeLogTag implements getAdapterPosition<RVLogger.Proxy> {
    private final b.C0007b<getHash> sortingSendMoneyPreferenceProvider;

    public makeLogTag(b.C0007b<getHash> bVar) {
        this.sortingSendMoneyPreferenceProvider = bVar;
    }

    public final RVLogger.Proxy get() {
        return newInstance(this.sortingSendMoneyPreferenceProvider.get());
    }

    public static makeLogTag create(b.C0007b<getHash> bVar) {
        return new makeLogTag(bVar);
    }

    public static RVLogger.Proxy newInstance(getHash gethash) {
        return new RVLogger.Proxy(gethash);
    }
}
