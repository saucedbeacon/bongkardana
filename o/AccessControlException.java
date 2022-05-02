package o;

import o.PackageDownloadRequest;

final class AccessControlException implements RedDotDrawable {
    private final PackageDownloadRequest.AnonymousClass1 length;

    public AccessControlException(PackageDownloadRequest.AnonymousClass1 r1) {
        this.length = r1;
    }

    public final Object apply(Object obj) {
        return this.length.saveMigrateRoomToUserConfig(((Boolean) obj).booleanValue());
    }
}
