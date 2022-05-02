package id.dana.contract.deeplink;

import android.app.Activity;
import dagger.Module;
import dagger.Provides;
import id.dana.base.BaseActivity;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.di.PerActivity;
import id.dana.di.modules.AnnouncementModule;
import id.dana.di.modules.OauthModule;
import o.ArcMotion;
import o.AutoTransition;
import o.Slide;
import o.autoGenerate;
import o.getDuration;
import o.getPath;
import o.setCancelOnTouchOutside$core;
import o.setStartDelay;

@Module(includes = {ScanQrModule.class, RestoreUrlModule.class, FeatureModule.class, OauthModule.class, ServicesModule.class, AnnouncementModule.class})
public class DeepLinkModule {
    private setMin getMax;

    @PerActivity
    @Provides
    public getDuration.length getMax(setStartDelay setstartdelay) {
        return setstartdelay;
    }

    @PerActivity
    @Provides
    public AutoTransition.length getMin(Slide.GravityFlag gravityFlag) {
        return gravityFlag;
    }

    public /* synthetic */ DeepLinkModule(setMin setmin, byte b) {
        this(setmin);
    }

    private DeepLinkModule(setMin setmin) {
        this.getMax = setmin;
    }

    public static setMin getMax() {
        return new setMin((byte) 0);
    }

    @PerActivity
    @Provides
    public AutoTransition.setMax getMin(getPath getpath) {
        if (this.getMax.setMax != null) {
            return this.getMax.setMax;
        }
        getpath.length = this.getMax.getMin;
        Activity activity = this.getMax.getMax;
        getpath.setMax = activity;
        if (activity instanceof BaseActivity) {
            getpath.getMin = (autoGenerate) activity;
        }
        getpath.setMin = this.getMax.setMin;
        getpath.getMax = this.getMax.length;
        return getpath;
    }

    public static class setMin {
        public Activity getMax;
        public setCancelOnTouchOutside$core getMin;
        public String length;
        AutoTransition.setMax setMax;
        public ArcMotion setMin;

        /* synthetic */ setMin(byte b) {
            this();
        }

        private setMin() {
        }
    }
}
