package o;

import id.dana.di.modules.SocialShareModule;
import o.OrientationDetector;

public final class PermissionConstants implements getAdapterPosition<OrientationDetector.MyTabOrientationListener.length> {
    private final SocialShareModule setMin;

    public static OrientationDetector.MyTabOrientationListener.length getMin(SocialShareModule socialShareModule) {
        OrientationDetector.MyTabOrientationListener.length max = socialShareModule.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        OrientationDetector.MyTabOrientationListener.length max = this.setMin.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
