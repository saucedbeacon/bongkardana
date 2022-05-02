package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import o.OrientationDetector;
import o.VideoUtils;

@Module
public class SocialShareModule {
    private OrientationDetector.MyTabOrientationListener.length length;

    @Provides
    public OrientationDetector.MyTabOrientationListener.setMin getMin(VideoUtils videoUtils) {
        return videoUtils;
    }

    public SocialShareModule(OrientationDetector.MyTabOrientationListener.length length2) {
        this.length = length2;
    }

    @Provides
    public OrientationDetector.MyTabOrientationListener.length getMax() {
        return this.length;
    }
}
