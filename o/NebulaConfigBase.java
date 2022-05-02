package o;

import o.b;

public final class NebulaConfigBase implements getAdapterPosition<getBundleName> {
    private final b.C0007b<Plugin> remoteQrPayEntityDataProvider;

    public NebulaConfigBase(b.C0007b<Plugin> bVar) {
        this.remoteQrPayEntityDataProvider = bVar;
    }

    public final getBundleName get() {
        return newInstance(this.remoteQrPayEntityDataProvider.get());
    }

    public static NebulaConfigBase create(b.C0007b<Plugin> bVar) {
        return new NebulaConfigBase(bVar);
    }

    public static getBundleName newInstance(Plugin plugin) {
        return new getBundleName(plugin);
    }
}
