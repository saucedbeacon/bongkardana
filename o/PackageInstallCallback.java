package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import o.PackageDownloadRequest;

@Singleton
public class PackageInstallCallback extends uncheckItems<isInDownloadPath> {
    private final PackageDownloadRequest.AnonymousClass1 generalPreferences;

    @Inject
    public PackageInstallCallback(PackageDownloadRequest.AnonymousClass1 r1) {
        this.generalPreferences = r1;
    }

    public isInDownloadPath createData(String str) {
        return new getExtDirectory(this.generalPreferences);
    }
}
