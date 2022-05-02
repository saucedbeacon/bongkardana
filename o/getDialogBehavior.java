package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.danah5.location.GetLocationNameBridge;
import o.b;

public final class getDialogBehavior implements getBindingAdapter<GetLocationNameBridge> {
    private final b.C0007b<onEmbedViewParamChanged> getIndoSubdivisionsByLocationProvider;

    public getDialogBehavior(b.C0007b<onEmbedViewParamChanged> bVar) {
        this.getIndoSubdivisionsByLocationProvider = bVar;
    }

    public static getBindingAdapter<GetLocationNameBridge> create(b.C0007b<onEmbedViewParamChanged> bVar) {
        return new getDialogBehavior(bVar);
    }

    public final void injectMembers(GetLocationNameBridge getLocationNameBridge) {
        injectGetIndoSubdivisionsByLocation(getLocationNameBridge, this.getIndoSubdivisionsByLocationProvider.get());
    }

    @InjectedFieldSignature("id.dana.danah5.location.GetLocationNameBridge.getIndoSubdivisionsByLocation")
    public static void injectGetIndoSubdivisionsByLocation(GetLocationNameBridge getLocationNameBridge, onEmbedViewParamChanged onembedviewparamchanged) {
        getLocationNameBridge.getIndoSubdivisionsByLocation = onembedviewparamchanged;
    }
}
