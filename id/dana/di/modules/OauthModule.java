package id.dana.di.modules;

import android.app.Activity;
import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.getPlatformCallback;
import o.getStrokeAlpha;
import o.onAnimationEnd;

@Module
public class OauthModule {
    private getMax setMax;

    @PerActivity
    @Provides
    public onAnimationEnd.length getMax(getPlatformCallback getplatformcallback) {
        return getplatformcallback;
    }

    public /* synthetic */ OauthModule(getMax getmax, byte b) {
        this(getmax);
    }

    private OauthModule(getMax getmax) {
        this.setMax = getmax;
    }

    public static getMax setMin() {
        return new getMax((byte) 0);
    }

    @PerActivity
    @Provides
    public onAnimationEnd.getMin setMin(getStrokeAlpha getstrokealpha) {
        if (this.setMax.getMax != null) {
            return this.setMax.getMax;
        }
        getstrokealpha.setMin = this.setMax.setMin;
        return getstrokealpha;
    }

    public static class getMax {
        onAnimationEnd.getMin getMax;
        public Activity setMin;

        /* synthetic */ getMax(byte b) {
            this();
        }

        private getMax() {
        }
    }
}
