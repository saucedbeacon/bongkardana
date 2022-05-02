package o;

import id.dana.di.modules.GlobalNetworkProxyModule;
import o.GriverDecodeUrl;

public final class SerializeFilter implements getAdapterPosition<GriverDecodeUrl.getMin> {
    private final GlobalNetworkProxyModule getMin;

    private SerializeFilter(GlobalNetworkProxyModule globalNetworkProxyModule) {
        this.getMin = globalNetworkProxyModule;
    }

    public static SerializeFilter setMin(GlobalNetworkProxyModule globalNetworkProxyModule) {
        return new SerializeFilter(globalNetworkProxyModule);
    }

    public final /* synthetic */ Object get() {
        GriverDecodeUrl.getMin length = this.getMin.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
