package o;

import id.dana.di.modules.SocialShareModule;
import o.OrientationDetector;
import o.b;

public final class onStartUrlNavigation implements getAdapterPosition<OrientationDetector.MyTabOrientationListener.setMin> {
    private final b.C0007b<VideoUtils> getMin;
    private final SocialShareModule setMax;

    public static OrientationDetector.MyTabOrientationListener.setMin setMin(SocialShareModule socialShareModule, VideoUtils videoUtils) {
        OrientationDetector.MyTabOrientationListener.setMin min = socialShareModule.getMin(videoUtils);
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        OrientationDetector.MyTabOrientationListener.setMin min = this.setMax.getMin(this.getMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
