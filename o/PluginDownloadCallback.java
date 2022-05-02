package o;

import o.PackageDownloadRequest;
import o.b;

public final class PluginDownloadCallback implements getAdapterPosition<PackageInstallCallback> {
    private final b.C0007b<PackageDownloadRequest.AnonymousClass1> generalPreferencesProvider;

    public PluginDownloadCallback(b.C0007b<PackageDownloadRequest.AnonymousClass1> bVar) {
        this.generalPreferencesProvider = bVar;
    }

    public final PackageInstallCallback get() {
        return newInstance(this.generalPreferencesProvider.get());
    }

    public static PluginDownloadCallback create(b.C0007b<PackageDownloadRequest.AnonymousClass1> bVar) {
        return new PluginDownloadCallback(bVar);
    }

    public static PackageInstallCallback newInstance(PackageDownloadRequest.AnonymousClass1 r1) {
        return new PackageInstallCallback(r1);
    }
}
