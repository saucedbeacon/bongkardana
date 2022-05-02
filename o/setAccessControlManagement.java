package o;

import o.b;

public final class setAccessControlManagement implements getAdapterPosition<setExtensionFilter> {
    private final b.C0007b<setRemoteControlManagement> promoPreferenceProvider;

    public setAccessControlManagement(b.C0007b<setRemoteControlManagement> bVar) {
        this.promoPreferenceProvider = bVar;
    }

    public final setExtensionFilter get() {
        return newInstance(this.promoPreferenceProvider.get());
    }

    public static setAccessControlManagement create(b.C0007b<setRemoteControlManagement> bVar) {
        return new setAccessControlManagement(bVar);
    }

    public static setExtensionFilter newInstance(setRemoteControlManagement setremotecontrolmanagement) {
        return new setExtensionFilter(setremotecontrolmanagement);
    }
}
