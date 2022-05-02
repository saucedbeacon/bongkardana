package o;

import javax.inject.Inject;

public final class RequestBridgeExtension extends setSpeed<GriverConfig, toggleSoftInput> {
    private NetworkBridgeExtension getMax;
    private notifyBLECharacteristicValueChange getMin;
    private getSharedPreferenceForApp length;
    private onProviderDisabled setMin;

    public final /* synthetic */ Object map(Object obj) {
        GriverConfig griverConfig = (GriverConfig) obj;
        if (griverConfig == null) {
            return null;
        }
        toggleSoftInput togglesoftinput = new toggleSoftInput();
        togglesoftinput.setMin = this.getMax.length(griverConfig.getHomeInfoResponse());
        togglesoftinput.length = getSharedPreferenceForApp.length(griverConfig.getSpace());
        togglesoftinput.getMin = notifyBLECharacteristicValueChange.getMax(griverConfig.getFeeds());
        togglesoftinput.setMax = (h5PageReload) this.setMin.apply(griverConfig.getHasNewResponse());
        return togglesoftinput;
    }

    @Inject
    public RequestBridgeExtension(NetworkBridgeExtension networkBridgeExtension, getSharedPreferenceForApp getsharedpreferenceforapp, notifyBLECharacteristicValueChange notifyblecharacteristicvaluechange, onProviderDisabled onproviderdisabled) {
        this.getMax = networkBridgeExtension;
        this.length = getsharedpreferenceforapp;
        this.getMin = notifyblecharacteristicvaluechange;
        this.setMin = onproviderdisabled;
    }
}
