package o;

import id.dana.di.modules.GlobalNetworkProxyModule;
import o.GriverDecodeUrl;
import o.b;

public final class getTypeKey implements getAdapterPosition<GriverDecodeUrl.length> {
    private final GlobalNetworkProxyModule length;
    private final b.C0007b<setPageConfiguration> setMax;

    private getTypeKey(GlobalNetworkProxyModule globalNetworkProxyModule, b.C0007b<setPageConfiguration> bVar) {
        this.length = globalNetworkProxyModule;
        this.setMax = bVar;
    }

    public static getTypeKey getMin(GlobalNetworkProxyModule globalNetworkProxyModule, b.C0007b<setPageConfiguration> bVar) {
        return new getTypeKey(globalNetworkProxyModule, bVar);
    }

    public final /* synthetic */ Object get() {
        GriverDecodeUrl.length length2 = this.length.length(this.setMax.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
