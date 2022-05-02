package o;

import o.PackageDownloadRequest;
import o.TitleBarRightButtonView;

public final class getExtDirectory implements isInDownloadPath {
    private final PackageDownloadRequest.AnonymousClass1 generalPreferences;

    public getExtDirectory(PackageDownloadRequest.AnonymousClass1 r1) {
        this.generalPreferences = r1;
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveTokenRegistrationStatus(boolean z) {
        return TitleBarRightButtonView.AnonymousClass1.just(this.generalPreferences.saveNotificationRegistrationToken(Boolean.valueOf(z)));
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getRegistrationTokenStatus() {
        return TitleBarRightButtonView.AnonymousClass1.just(this.generalPreferences.getNotificationRegistrationToken());
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isLocationPermissionDenied() {
        return TitleBarRightButtonView.AnonymousClass1.just(this.generalPreferences.isLocationPermissionDenied());
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> setLocationPermissionDenied(boolean z) {
        return TitleBarRightButtonView.AnonymousClass1.just(this.generalPreferences.setLocationPermissionDenied(Boolean.valueOf(z)));
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isAppFirstLaunch() {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.generalPreferences.isAppFirstLaunch()));
    }
}
