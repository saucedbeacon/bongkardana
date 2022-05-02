package o;

import o.b;

public final class handleStartParams implements getAdapterPosition<handleStartClientBundleNull> {
    private final b.C0007b<onRequestPermissionResult> deepLinkPreferencesProvider;

    public handleStartParams(b.C0007b<onRequestPermissionResult> bVar) {
        this.deepLinkPreferencesProvider = bVar;
    }

    public final handleStartClientBundleNull get() {
        return newInstance(this.deepLinkPreferencesProvider.get());
    }

    public static handleStartParams create(b.C0007b<onRequestPermissionResult> bVar) {
        return new handleStartParams(bVar);
    }

    public static handleStartClientBundleNull newInstance(onRequestPermissionResult onrequestpermissionresult) {
        return new handleStartClientBundleNull(onrequestpermissionresult);
    }
}
