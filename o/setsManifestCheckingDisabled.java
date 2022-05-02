package o;

import o.b;

public final class setsManifestCheckingDisabled implements getAdapterPosition<setManifestCheckingDisabled> {
    private final b.C0007b<getBeaconSimulator> sendDigitalMoneyRepositoryProvider;

    public setsManifestCheckingDisabled(b.C0007b<getBeaconSimulator> bVar) {
        this.sendDigitalMoneyRepositoryProvider = bVar;
    }

    public final setManifestCheckingDisabled get() {
        return newInstance(this.sendDigitalMoneyRepositoryProvider.get());
    }

    public static setsManifestCheckingDisabled create(b.C0007b<getBeaconSimulator> bVar) {
        return new setsManifestCheckingDisabled(bVar);
    }

    public static setManifestCheckingDisabled newInstance(getBeaconSimulator getbeaconsimulator) {
        return new setManifestCheckingDisabled(getbeaconsimulator);
    }
}
