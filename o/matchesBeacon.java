package o;

import o.b;

public final class matchesBeacon implements getAdapterPosition<hasSameIdentifiers> {
    private final b.C0007b<onWebViewDestory> globalNetworkRepositoryProvider;
    private final b.C0007b<toUuidString> servicesRepositoryProvider;

    public matchesBeacon(b.C0007b<toUuidString> bVar, b.C0007b<onWebViewDestory> bVar2) {
        this.servicesRepositoryProvider = bVar;
        this.globalNetworkRepositoryProvider = bVar2;
    }

    public final hasSameIdentifiers get() {
        return newInstance(this.servicesRepositoryProvider.get(), this.globalNetworkRepositoryProvider.get());
    }

    public static matchesBeacon create(b.C0007b<toUuidString> bVar, b.C0007b<onWebViewDestory> bVar2) {
        return new matchesBeacon(bVar, bVar2);
    }

    public static hasSameIdentifiers newInstance(toUuidString touuidstring, onWebViewDestory onwebviewdestory) {
        return new hasSameIdentifiers(touuidstring, onwebviewdestory);
    }
}
