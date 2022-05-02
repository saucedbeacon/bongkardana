package id.dana.data.globalnetwork.source;

import javax.inject.Inject;
import javax.inject.Singleton;
import o.DefaultEmbedViewManager;
import o.getStateColor;
import o.getWidthSpec;
import o.setLight;
import o.specToLayoutParam;
import o.uncheckItems;

@Singleton
public class GnPaymentDataFactory extends uncheckItems<getStateColor> {
    private final getWidthSpec globalNetworkPreference;
    @Inject
    public DefaultEmbedViewManager remoteGnPaymentEntityData;

    @Inject
    public GnPaymentDataFactory(getWidthSpec getwidthspec) {
        this.globalNetworkPreference = getwidthspec;
    }

    public getStateColor createData(String str) {
        if ("mock".equals(str)) {
            return new setLight();
        }
        if ("local".equals(str)) {
            return new specToLayoutParam(this.globalNetworkPreference);
        }
        return this.remoteGnPaymentEntityData;
    }
}
