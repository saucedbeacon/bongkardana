package o;

import id.dana.di.modules.SwitchAutoRouteModule;
import o.MediaInfo;

public final class GriverH5JSAPIPermissionExtension implements getAdapterPosition<MediaInfo.getMin> {
    private final SwitchAutoRouteModule setMax;

    private GriverH5JSAPIPermissionExtension(SwitchAutoRouteModule switchAutoRouteModule) {
        this.setMax = switchAutoRouteModule;
    }

    public static GriverH5JSAPIPermissionExtension setMax(SwitchAutoRouteModule switchAutoRouteModule) {
        return new GriverH5JSAPIPermissionExtension(switchAutoRouteModule);
    }

    public final /* synthetic */ Object get() {
        MediaInfo.getMin min = this.setMax.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
