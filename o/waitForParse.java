package o;

import o.b;

public final class waitForParse implements getAdapterPosition<waitForSetup> {
    private final b.C0007b<isPrepareDone> unsafeDeviceWhitelistEntityDataFactoryProvider;

    public waitForParse(b.C0007b<isPrepareDone> bVar) {
        this.unsafeDeviceWhitelistEntityDataFactoryProvider = bVar;
    }

    public final waitForSetup get() {
        return newInstance(this.unsafeDeviceWhitelistEntityDataFactoryProvider.get());
    }

    public static waitForParse create(b.C0007b<isPrepareDone> bVar) {
        return new waitForParse(bVar);
    }

    public static waitForSetup newInstance(isPrepareDone ispreparedone) {
        return new waitForSetup(ispreparedone);
    }
}
