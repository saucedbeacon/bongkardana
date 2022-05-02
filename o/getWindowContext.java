package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.danah5.locationpicker.MapsUtilityBridge;
import o.b;

public final class getWindowContext implements getBindingAdapter<MapsUtilityBridge> {
    private final b.C0007b<UpdateAppCallback> splitFacadeProvider;

    public getWindowContext(b.C0007b<UpdateAppCallback> bVar) {
        this.splitFacadeProvider = bVar;
    }

    public static getBindingAdapter<MapsUtilityBridge> create(b.C0007b<UpdateAppCallback> bVar) {
        return new getWindowContext(bVar);
    }

    public final void injectMembers(MapsUtilityBridge mapsUtilityBridge) {
        injectSplitFacade(mapsUtilityBridge, this.splitFacadeProvider.get());
    }

    @InjectedFieldSignature("id.dana.danah5.locationpicker.MapsUtilityBridge.splitFacade")
    public static void injectSplitFacade(MapsUtilityBridge mapsUtilityBridge, UpdateAppCallback updateAppCallback) {
        mapsUtilityBridge.splitFacade = updateAppCallback;
    }
}
