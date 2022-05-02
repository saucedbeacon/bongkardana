package o;

import o.b;

public final class GriverBackButtonStyleExtension implements getAdapterPosition<getIconDrawable> {
    private final b.C0007b<onGeolocationPermissionsHidePrompt> autoRouteRepositoryProvider;

    public GriverBackButtonStyleExtension(b.C0007b<onGeolocationPermissionsHidePrompt> bVar) {
        this.autoRouteRepositoryProvider = bVar;
    }

    public final getIconDrawable get() {
        return newInstance(this.autoRouteRepositoryProvider.get());
    }

    public static GriverBackButtonStyleExtension create(b.C0007b<onGeolocationPermissionsHidePrompt> bVar) {
        return new GriverBackButtonStyleExtension(bVar);
    }

    public static getIconDrawable newInstance(onGeolocationPermissionsHidePrompt ongeolocationpermissionshideprompt) {
        return new getIconDrawable(ongeolocationpermissionshideprompt);
    }
}
