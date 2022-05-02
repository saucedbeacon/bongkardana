package o;

import id.dana.di.modules.IpgModule;
import o.GriverNetworkPermissionExtensionImpl;

public final class writeFieldName implements getAdapterPosition<GriverNetworkPermissionExtensionImpl.setMin> {
    private final IpgModule length;

    public static GriverNetworkPermissionExtensionImpl.setMin setMin(IpgModule ipgModule) {
        GriverNetworkPermissionExtensionImpl.setMin max = ipgModule.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        GriverNetworkPermissionExtensionImpl.setMin max = this.length.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
