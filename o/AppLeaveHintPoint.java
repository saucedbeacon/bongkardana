package o;

import o.PackageDownloadRequest;
import o.b;

public final class AppLeaveHintPoint implements getAdapterPosition<onAppExit> {
    private final b.C0007b<PackageDownloadRequest.AnonymousClass1> generalPreferencesProvider;

    public AppLeaveHintPoint(b.C0007b<PackageDownloadRequest.AnonymousClass1> bVar) {
        this.generalPreferencesProvider = bVar;
    }

    public final onAppExit get() {
        return newInstance(this.generalPreferencesProvider.get());
    }

    public static AppLeaveHintPoint create(b.C0007b<PackageDownloadRequest.AnonymousClass1> bVar) {
        return new AppLeaveHintPoint(bVar);
    }

    public static onAppExit newInstance(PackageDownloadRequest.AnonymousClass1 r1) {
        return new onAppExit(r1);
    }
}
